<template>
  <div class="index-container">
    <div class="warpper">
      <h1 class="demo-home__title"><img src="~/assets/logo.jpg"/><span> 瑾言</span></h1>
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
      padding: 12px;
      background: #eee;

      .demo-home__title {
        margin: 0 0 6px;
        font-size: 1rem;

        .demo-home__title img
        .demo-home__title span {
          display: inline-block;
          //vertical-align: middle;
        }

        img {
          width: 1.2rem
        }

        span {
          margin-left: 16px;
          font-weight: 500;
        }
      }

      .demo-home__desc {
        margin: 0 0 20px;
        color: rgba(69, 90, 100, 0.6);
        font-size: 14px;
      }
    }
  }

</style>
