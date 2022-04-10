<template>
  <div class="index-container">
    <div class="warpper">
      <img class="fl" src="~/assets/icon/loveBird.svg"/>
      <div class="f07r fl ml02r"> 瑾言</div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'TitleBar'
}
</script>

<style lang="scss" scoped>
  .index-container {
    .warpper {
      background: #eee;
      height: 1.2rem;
      line-height: 1.2rem;
      .img,
      .title {
        display: inline-block;
        vertical-align: middle;
      }
      img {
        width: 1.2rem
      }
    }
  }

</style>
