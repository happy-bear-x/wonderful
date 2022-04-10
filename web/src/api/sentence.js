/*
   句子相关
 */
import request from '@/utils/request'

export function getDisSentence() {
  return request('/sentence/dis')
}
