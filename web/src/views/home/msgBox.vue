<template>
  <div class="msgBox">
    <div class="msg" v-for="msg of msgList" :key="msg.id">
      <van-image :src="msg.avatar" round/>
      <span class="text">{{msg.context}}</span>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MsgBox',
  data() {
    return {
      msgList: [{
        id: 0,
        avatar: '@/assets/logo.jpg',
        context: '如果时间会倒流，你会再来一次吗？'
      }]
    }
  }
}
</script>

<style scoped>

</style>
