// 按需全局引入 vant组件
import Vue from 'vue'
import {
  Button,
  List,
  Cell,
  Tabbar,
  TabbarItem,
  Icon,
  Col,
  Row,
  Calendar,
  Popup,
  Field,
  Grid,
  GridItem,
  Image, ImagePreview
} from 'vant'
Vue.use(Button)
Vue.use(Cell)
Vue.use(List)
Vue.use(Tabbar).use(TabbarItem)
Vue.use(Icon)
Vue.use(Col, Row)
Vue.use(Calendar)
Vue.use(Popup)
Vue.use(Field)
Vue.use(Grid).use(GridItem)
Vue.use(Image).use(ImagePreview)
