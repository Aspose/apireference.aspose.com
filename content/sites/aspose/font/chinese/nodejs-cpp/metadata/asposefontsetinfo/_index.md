---
title: "AsposeFontSetInfo"
second_title: "Aspose.Font 用于 Node.js，通过 C++"
description: "将信息（元数据）写入字体文件。"
type: docs
url: /zh/nodejs-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_将信息（元数据）写入字体文件。_

```js
function AsposeFontSetInfo(
    fileName,
    nameId, 
    platformId, 
    platformSpecificId, 
    languageId, 
    text
)
```

| 参数 | 类型 | 描述 |
| --------- | ---- | ----------- |
| fileName | string | 文件名。 |
| nameId | TtfNameTableNameId | 名称标识符，逻辑字符串类别，由[`NameId`](../../enumerations/ttfnametablenameid/) 枚举指定 |
|  | platformId | TtfNameTablePlatformId | 平台标识符 |
| platformSpecificId | int | 平台特定的编码标识符。请使用以下枚举之一的值 - [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/)、[`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/)、[`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/)。使用哪种枚举取决于上下文（*platformId* 参数）。 |
| languageId | int | 语言标识符。请根据上下文使用 [`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/) 或 [`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/) 枚举的值，*platformId* 参数定义了上下文。 |
|  | 文本 | string | 实际字符串数据 |

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

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    //AsposeSetInfo - set metadata info into font
    const nameId = AsposeFontModule.TtfNameTableNameId.Description;
    const platformId = AsposeFontModule.TtfNameTablePlatformId.Microsoft;
    const platformSpecificId = AsposeFontModule.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2.value;
    const langID = Module.TtfNameTableMSLanguageId.English_United_States.value;
    const text = "Updated description";
    
    const json = AsposeFontSetInfo(font_file, nameId, platformId, platformSpecificId, langID, text);
    console.log("AsposeFontSetInfo => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
});
```
**ECMAScript\ES6 js modules:**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

//AsposeSetInfo - set metadata info into font
const nameId = AsposeFontModule.TtfNameTableNameId.Description;
const platformId = AsposeFontModule.TtfNameTablePlatformId.Microsoft;
const platformSpecificId = AsposeFontModule.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2.value;
const langID = Module.TtfNameTableMSLanguageId.English_United_States.value;
const text = "Updated description";

const json = AsposeFontModule.AsposeFontSetInfo(font_file, nameId, platformId, platformSpecificId, langID, text);
console.log("AsposeFontSetInfo => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```

### 另请参见

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
