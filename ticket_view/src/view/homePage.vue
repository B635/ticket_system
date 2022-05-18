<template>
  <v-app>
    <ToolBar></ToolBar>
    <v-container>
      <search-station></search-station>
      <train-message class="pa-10"></train-message>
    </v-container>
  </v-app>
</template>

<script>
import TrainMessage from "@/components/trainMessage";
import ToolBar from "@/components/ToolBar";
import SearchStation from "@/components/searchStation";
export default {
  name: "homePage",
  components: {SearchStation, ToolBar, TrainMessage}
}
</script>

<style scoped>

</style>