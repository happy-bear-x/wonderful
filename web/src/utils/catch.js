import axios from "axios";
export function getHttpDom(url){
    return new Promise((resolve => {
        axios.get(url).then((res)=>{
            resolve(document.createElement(res.data))
        })
    }))
     
}
