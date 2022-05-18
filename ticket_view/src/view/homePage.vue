<template>
  <v-app>
    <ToolBar></ToolBar>
    <train-message/>
  </v-app>
</template>

<script>
import TrainMessage from "@/components/trainMessage";
import ToolBar from "@/components/ToolBar";
export default {
  name: "homePage",
  components: {ToolBar, TrainMessage}
}
</script>

<style scoped>

</style>