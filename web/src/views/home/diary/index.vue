<template>
  <div class="note" @click="showEdit">
    <van-row>
      <van-col :span="8" align="center">
        <van-button type="primary" block>
          <van-icon name="arrow-left"/>
          上一条
        </van-button>
      </van-col>
      <van-col :span="8" align="center">
        <van-button type="info" block @click="showCalender=true" @dblclick="editShow=true" class="centerBtn">
          <div>{{dairy.sDate}}</div>
          {{dairy.title}}
        </van-button>
        <van-col :span="24" align="center" class="title fb"></van-col>
      </van-col>
      <van-col :span="8" align="center">
        <van-button type="warning" block>
          下一条
          <van-icon name="arrow"/>
        </van-button>
      </van-col>
    </van-row>
    <van-row>
      <van-col :span="24" class="mt5 p5 content">
        {{dairy.content}}
      </van-col>
    </van-row>
    <van-calendar v-model="showCalender" :show-confirm="false"/>
    <van-popup
      v-model="editShow"
      position="bottom"
      round
      close-on-popstate
      :style="{ height: '80%' }"
    >
      <div v-if="token">
        <van-col :span="12" align="center">
          <van-button type="danger" block>
            <van-icon name="revoke"/>
            还原
          </van-button>
        </van-col>
        <van-col :span="12" align="center">
          <van-button type="primary" block>
            <van-icon name="passed"/>
            保存
          </van-button>
        </van-col>
        <van-field v-model="dairyTemp.title" placeholder="标题"/>
        <textarea class="w" style="height: 60vh" v-model="dairyTemp.content"></textarea>
      </div>
      <login v-else/>
    </van-popup>
  </div>
</template>

<script>
import { getToken } from '@/utils/auth'
import Login from '@/views/home/login'

export default {
  name: 'Diary',
  components: { Login },
  data() {
    return {
      dairy: {
        title: '美丽的忧虑',
        sDate: '2022-03-01',
        content: '今晚的月亮不亮，今晚的饭菜不香。'
      },
      sDateList: [],
      showCalender: false,
      editShow: false,
      clickCount: 0,
      dairyTemp: {},
      token: getToken()
    }
  },
  created() {
  },
  methods: {
    showEdit() {
      if (++this.clickCount > 2) {
        this.editShow = true
        this.clickCount = 0
        if (!this.dairyTemp) {
          Object.assign(this.dairyTemp, this.dairy)
        }
        return
      }
      setTimeout(() => {
        this.clickCount = 0
      }, 500)
    },
    revert() {
      Object.assign(this.dairyTemp, this.dairy)
    },
    save() {

    }
  }
}
</script>
<style scoped lang="scss">
  .note {
    height: 100vh;
    background: url('../../../assets/img/noteBg.jpg') no-repeat;
    background-size: cover;
    font-size: 1.1em;

    .content {
      color: #d1ee50;

    }

    .van-button {
      border-radius: 0;
    }
  }

  .centerBtn {
    padding: 0;
  }
</style>
