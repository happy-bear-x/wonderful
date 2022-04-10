<template>
  <div class="p5">
    <div class="fb f06r tc">心灵毒鸡汤</div>
    <span class="f07r c-orange">{{sentence.sentence}}</span>
    <van-image :src="sentence.url">
      <template v-slot:loading>
        <van-image :src="require('@/assets/img/loading1.gif')"></van-image>
      </template>
    </van-image>
    <div class="mt02r" v-show="showBtn">
      <van-col :span="12">
        <van-button type="primary" block @click="getDisSentence">
          <van-icon name="replay"/>
          再来一碗
        </van-button>
      </van-col>
      <van-col :span="12">
        <van-button type="info" block @click="getImg">
          <van-icon name="down"/>
          获取图片
        </van-button>
      </van-col>
    </div>
  </div>
</template>

<script>
import { getDisSentence } from '@/api/sentence'

export default {
  name: 'Sentence',
  data() {
    return {
      sentence: {
        sentence: '',
        url: ''
      },
      showBtn: false
    }
  },
  created() {
    this.getDisSentence()
  },
  methods: {
    getDisSentence() {
      this.showBtn = false
      getDisSentence().then(r => {
        this.sentence.sentence = r.msg
        this.sentence.url = r.other
      }).finally(() => {
        this.showBtn = true
      })
    },
    getImg() {
      window.open(this.sentence.url)
    }
  }

}
</script>

<style scoped>

</style>
