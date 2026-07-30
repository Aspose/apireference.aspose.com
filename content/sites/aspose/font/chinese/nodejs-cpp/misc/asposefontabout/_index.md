---
title: "AsposeFontAbout"
second_title: "Aspose.Font 用于 Node.js，通过 C++"
description: "获取关于产品的信息。"
type: docs
url: /zh/nodejs-cpp/misc/AsposeFontAbout/
---

## AsposeFontAbout function

获取关于产品的信息。

```js
function AsposeFontAbout()
```

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
| errorCode | 代码错误 (0 无错误) |
| errorText | 文本错误 (\"\" 无错误) |
| 产品 | 产品名称 |
| 版本 | 产品版本 |
| islicensed | 产品已授权 |


## 示例
**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    json = AsposeFontModule.AsposeFontAbout();
    console.log("AsposeFontAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
});
```
**ECMAScript\ES6 js modules:**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

//AsposeFontAbout - Get info about Product
const json = AsposeFontModule.AsposeFontAbout();
console.log("AsposeFontAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
```
