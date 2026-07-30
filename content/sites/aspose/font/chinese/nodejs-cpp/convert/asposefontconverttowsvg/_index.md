---
title: "AsposeFontConvertToSVG"
second_title: "Aspose.Font 用于 Node.js，通过 C++"
description: "将字体转换为 svg 格式"
type: docs
weight: 10
url: /zh/nodejs-cpp/convert/asposefontconverttosvg/
---
## AsposeFontConvertToSVG function

将字体转换为 SVG 格式。

```js
function AsposeFontConvertToSVG(
    fileName,
    fontType
)
```

| 参数 | 类型 | 描述 |
| --------- | ---- | ----------- |
| fileName | string | 文件名。 |
| fontType | FontType | 要转换的字体类型。 |

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
|  | errorCode | 代码错误 (0 无错误) |
|  | errorText | 文本错误 (\"\" 无错误) |
|  | fileNameResult | 结果文件名 |

### 示例

**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log('Aspose.Font for Node.js via C++ example');

AsposeFont().then(AsposeFontModule => {
    //call AsposeFontConvertToSVG to convert font
    const json = AsposeFontModule.AsposeFontConvertToSVG(font_file,AsposeFontModule.FontType.TTF);
    console.log("AsposeFontConvert : %O",  json.errorCode == 0 ? font_file + ' => ' + json.fileNameResult : json.errorText);
});
```
**ECMAScript\ES6 js modules**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

const json = AsposeFontModule.AsposeFontConvertToSVG(font_file,AsposeFontModule.FontType.TTF);
console.log("AsposeFontConvert => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### 另请参见

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
