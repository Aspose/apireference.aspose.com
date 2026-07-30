---
title: "AsposeFontGetInfo"
second_title: "Aspose.Font 用于 Node.js，通过 C++"
description: "从字体文件获取信息（元数据）。"
type: docs
url: /zh/nodejs-cpp/metadata/asposefontgetinfo/
---
## AsposeFontGetInfo function

_获取信息（元数据）自字体文件._

```js
function AsposeFontGetInfo(
    fileName
)
```

| 参数 | 类型 | 描述 |
| --------- | ---- | ----------- |
| fileName | string | 文件名。 |

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
|  | errorCode | 代码错误 (0 无错误) |
|  | errorText | 文本错误 (\"\" 无错误) |
|  | 记录 | JSON 对象数组 : |
|  | * NameId | 名称标识符 |
|  | * PlatformId | 平台标识符 |
|  | * PlatformSpecificId | 平台特定标识符 |
|  | * LanguageId | 语言标识符 |
|  | * 信息 | 名称记录的内容 |

### 示例

**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    //AsposeFontGetInfo - get metadata information
    const json = AsposeFontModule.AsposeFontGetInfo(font_file);
    console.log("AsposeFontGetInfo => %O",  json.errorCode == 0 ? json.records.reduce((ret, a) => ret +
        "\nNameId : " + a.NameId
        + "; PlatformId : " + a.PlatformId
        + "; PlatformSpecificId : " + a.PlatformSpecificId
        + "; LanguageId : " + a.LanguageId
        + "; Info : " + a.Info,"") : json.errorText);

});
```
**ECMAScript\ES6 js modules:**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

//AsposeFontGetInfo - get metadata font information
json = AsposeFontModule.AsposeFontGetInfo(font_file);
console.log("AsposeFontGetInfo => %O",  json.errorCode == 0 ? json.records.reduce((ret, a) => ret +
    "\nNameId : " + a.NameId
  + "; PlatformId : " + a.PlatformId
  + "; PlatformSpecificId : " + a.PlatformSpecificId
  + "; LanguageId : " + a.LanguageId
  + "; Info : " + a.Info,"") : json.errorText);
```
