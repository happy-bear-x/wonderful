/*
   句子相关
 */
import request from "@/utils/request";

function getDisSentence(){
    return request('/sentence/dis')
}
