<template>
  <div id="app">
    <router-view/>
  </div>
</template>
<script>

export default {
  name: 'App',
  created() {
    this.$flower.init()
    this.$flower.start()
    window.addEventListener('resize', () => {
      this.$flower.reSize()
    })
  }
}
</script>
<style lang="scss"></style>
