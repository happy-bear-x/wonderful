<template>
  <div class="w f11em fb c-white howLong">
    <div class="bg w"></div>
    <div class="title w">距离第一次相识</div>
    <div class="time w">{{ showDate }}</div>
    <audio ref="music" src="@/assets/mp3/qifengle.mp3"/>
  </div>
</template>

<script>
export default {
  name: 'HowLongToKnow',
  data() {
    return {
      beginTime: new Date('2022-01-30 10:08:00'),
      showDate: undefined
    }
  },
  mounted() {
    setInterval(() => {
      const subTimes = new Date((Date.now() - this.beginTime))
      const day = Number.parseInt(subTimes.getTime() / 1000 / 60 / 60 / 24)
      const hours = subTimes.getHours()
      const minutes = subTimes.getMinutes()
      const seconds = subTimes.getSeconds()
      this.showDate = `${day}天${hours}小时${minutes < 10 ? '0' + minutes : minutes}分${seconds < 10 ? '0' + seconds : seconds}秒`
    }, 1000)
    const music = this.$refs.music
    music.play()
  }
}
</script>

<style lang="scss" scoped>
.howLong {
  position: absolute;
  height: 100%;
  text-align: center;

  .bg {
    top: 0;
    height: 100%;
    width: 100%;
    background: url('../../assets/img/yourName.jpg') center no-repeat;
    background-size: cover;
    /*opacity: 0.5;*/
  }

  .title, .time {
    position: absolute;
    top: 20%;
  }

  .time {
    margin-top: 2em;
    font-size: 2em;
  }
}

</style>
