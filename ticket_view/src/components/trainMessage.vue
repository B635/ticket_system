<template>
  <v-data-table
      disable-pagination
      hide-default-footer
      :headers="headers"
      :items="contents"
  >
    <template v-slot:top>
      <v-dialog
          v-model="dialog"
          max-width="500px"
      >
        <v-card>
          <v-card-title>
            <span class="text-h5">预约表单</span>
          </v-card-title>

          <v-card-text>
            <v-container>
              <v-row>
                <v-col
                    cols="12"
                    sm="6"
                    md="4"
                >
                  <v-text-field
                      disabled
                      v-model="train.trainNo"
                      label="车次"
                  ></v-text-field>
                </v-col>
                <v-col
                    cols="12"
                    sm="6"
                    md="4"
                >
                  <v-text-field
                      disabled
                      v-model="train.beginStation"
                      label="起始站"
                  ></v-text-field>
                </v-col>
                <v-col
                    cols="12"
                    sm="6"
                    md="4"
                >
                  <v-text-field
                      disabled
                      v-model="train.endStation"
                      label="终点站"
                  ></v-text-field>
                </v-col>
                <v-col
                    cols="12"
                    sm="6"
                    md="4"
                >
                  <v-text-field
                      disabled
                      v-model="train.startTime"
                      label="出发时间"
                  ></v-text-field>
                </v-col>
                <v-col
                    cols="12"
                    sm="6"
                    md="4"
                >
                  <v-text-field
                      disabled
                      v-model="train.finishTime"
                      label="到达时间"
                  ></v-text-field>
                </v-col>
                <v-col
                    cols="12"
                    sm="6"
                    md="4"
                >
                  <v-select
                      v-model="select"
                      :items="seats"
                      :rules="[v => !!v || 'Item is required']"
                      label="座位"
                      @change="showPrice(select, train.trainNo)"
                  ></v-select>
                </v-col>
                <v-col
                    cols="12"
                    sm="12"
                    md="12"
                >
                  <v-text-field
                      disabled
                      v-model="priceSet"
                      label="价格"
                  ></v-text-field>
                </v-col>
              </v-row>
            </v-container>
          </v-card-text>

          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                color="blue darken-1"
                text
                @click="close()"
            >
              Cancel
            </v-btn>
            <v-btn
                color="blue darken-1"
                text
                @click="save"
            >
              Buy
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog>
    </template>
    <template v-slot:item.actions="{ item }">
      <v-btn
          color="orange"
          small
          @click="bookTicket(item)"
      >
        预约
      </v-btn>
    </template>
  </v-data-table>
</template>

<script>
export default {
  name: "trainMessage",
  data: () => ({
    dialog: false,
    select: '',
    priceSet: '',
    train: {
      trainNo: '',
      beginStation: '',
      endStation: '',
      startTime: '',
      finishTime: '',
      seat: '',
      money: 0,
    },
    headers: [
      {
        text: '车次',
        value: 'trainNo'
      },
      {
        text: '起始站',
        value: 'beginStation'
      },
      {
        text: '终点站',
        value: 'endStation'
      },
      {
        text: '出发时间',
        value: 'startTime'
      },
      {
        text: '到达时间',
        value: 'finishTime'
      },
      {
        text: '硬座',
        value: 'hardSeat'
      },
      {
        text: '软卧',
        value: 'softSleeper'
      },
      {
        text: '无座',
        value: 'notSeat'
      },
      {
        text: '备注',
        value: 'actions'
      }
    ],
    seats:[
      {
        text: '硬座',
        value: 'hardSeat'
      },
      {
        text: '软卧',
        value: 'softSleeper'
      },
      {
        text: '无座',
        value: 'notSeat'
      },
    ],
    contents: []
  }),
  methods: {
    data() {
      fetch("http://127.0.0.1:8080/showTrain", {credentials: 'include'})
          .then(r => r.json()
          )
          .then(data => this.contents = data)
          .catch(err => console.log(err))
    },
    bookTicket(item) {
      this.train = Object.assign({}, item)
      this.dialog=true
    },
    close() {
      this.dialog = false
    },
    save() {
      let ls = window.localStorage;
      let user_account = ls.getItem('account');
      fetch("http://127.0.0.1:8080/addTicket", {
        method: 'post',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify({
          account: user_account,
          trainNo: this.train.trainNo,
          seatClass: this.select,
        })
      }).then()
          .catch(err => console.log(err))
      this.dialog = false
    },
    showPrice(seat, trainNo) {
      fetch("http://127.0.0.1:8080/searchPrice", {
        method: 'post',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify({
          trainNo: trainNo,
          seatClass: seat,
        })
      }).then(r => r.text())
          .then(data => this.priceSet = data)
          .catch(err => console.log(err))
    }
  },
  mounted() {
    this.data()
  }
}
</script>
