<template>
  <v-card>
    <v-card-text>
      <v-row>
          <v-text-field
              v-model="beginStation"
              label="起始站">

          </v-text-field>
          <v-text-field
              label="终点站"
              v-model="endStation"
              class="pr-10"
          >
          <v-icon
            slot="prepend"
            color="green">
          mdi-minus
          </v-icon>
          </v-text-field>

        <v-btn
            color="blue"
            large
            @click="searchTrain()"
        >
          搜索
        </v-btn>
    </v-row>
    </v-card-text>
  </v-card>
</template>

<script>
export default {
  name: "searchStation",
  data: () => ({
    beginStation: '',
    endStation: '',
  }),

  methods: {
    searchTrain() {

    }
  }
}
</script>

<style scoped>

</style>