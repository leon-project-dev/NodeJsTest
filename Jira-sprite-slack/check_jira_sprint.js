// 1.读取 CHANGELOG.md 文件，获取最新的 commit list 记录
// 2.通过 http 请求获取 jira 上 sprint all issue 信息
// 3.比对数据，发现 issue 没有处理完，通过 slack 通知
// 4.修改 sprint all issue 状态，将 issue 转给 QA

// import {createReadStream, isFile} from 'fs';
// var fs = require('fs');
//     , es = require('event-stream');

//var lineNr = 0;
const fs = require('fs');
const readline = require('readline');


// path = ./CHANGELOG.md
function ParseMdFile(input) {    
    return new Promise((resolve, reject)=>{
        if(input === undefined || input === ""){
            reject('input not set undefined');
            return;
        }
    
         fs.access(input, fs.constants.R_OK, (err) => {
            if (err) {
                reject(`${input}读取的文件不存在`);
                return;
            }
    
            const rl = readline.createInterface({
                input: fs.createReadStream(input),
            });
    
            let currentVersion, preVersion;
            let sprint = [];
    
            function listener(data){
                const line = data.toString().trim();
                if (line === undefined || line === '') return;
    
                const verisonReg = /v[0-9]+.[0-9]+.[0-9]+/g;
                if (verisonReg.test(line)) {                
                    var datas = line.match(verisonReg);
                    if(datas.length === 1)
                        return;
                    if(preVersion === data[1]){
                        rl.off('line', listener);
                        resolve(sprint);
                        return;
                    }
                    if(currentVersion === undefined && preVersion === undefined){
                        preVersion = data[0];
                        currentVersion = datas[1];
                    }                    
                }
    
                const jiarSpritReg = /#ET-\d+/g;
                // 解析
                if(jiarSpritReg.test(line))
                    sprint.push(...line.match(jiarSpritReg));                
            }
    
            rl.on('line', listener);
        });
    });     
}

function GetJiraSprits(){
    return new Promise((resolve, reject)=>{
        const express = require("express");
        const app = express();
        app.get('https://timmilk299.atlassian.net/rest/agile/1.0/sprint/1/issue',)
    });
}

function NotifySlack(){

}

const promise = ParseMdFile('./CHANGELOG.md');
promise.then((sprints)=>{
    console.log(sprints);
});

