<template>
    <v-data-table
        disable-pagination
        hide-default-footer
        :headers="headers"
        :items="contents"
    >
    </v-data-table>
</template>

<script>
export default {
  name: "trainMessage",
  data: () => ({
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
    }
  },
  mounted() {
    this.data()
  }
}
</script>
