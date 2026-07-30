---
title: "枚举"
second_title: "Aspose.Font 用于 Node.js，通过 C++"
description: "将字体转换为 TrueType 格式的函数。"
type: docs
url: /zh/nodejs-cpp/enumerations/
---

## 枚举

| 枚举 | 描述 |
| ----------- | ----------- |
| [FontSavingFormats](./fontsavingformats/) | 指定字体类型。 |
| [FontType](./fonttype/) | 指定字体类型。 |
| [TtfNameTableNameId](./ttfnametablenameid/) | 指定 NameId。 |
| [TtfNameTablePlatformId](./ttfnametableplatformid/) | 表示 PlatformId 枚举。 |
| [TtfNameTableMSPlatformSpecificId](./ttfnametableMSPlatformSpecificId/) | 表示 MSPlatformSpecificId 枚举。 |
| [TtfNameTableMacPlatformSpecificId](./ttfnametableMacPlatformSpecificId/) | 表示 MacPlatformSpecificId 枚举。 |
| [TtfNameTableUnicodePlatformSpecificId](./ttfnametableUnicodePlatformSpecificId/) | 表示 UnicodePlatformSpecificId 枚举。 |
| [TtfNameTableMacLanguageId](./ttfnametablemaclanguageid/) | Macintosh 平台语言 ID 枚举。 |
| [TtfNameTableMSLanguageId](./ttfnametablemslanguageid/) | Microsoft 平台语言 ID 枚举。 |

### Example of using enumarations
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    //define parameters for AsposeFontSetInfo
    const nameId = AsposeFontModule.TtfNameTableNameId.Description;
    const platformId = AsposeFontModule.TtfNameTablePlatformId.Microsoft;
    const platformSpecificId = AsposeFontModule.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2.value;
    const langID = Module.TtfNameTableMSLanguageId.English_United_States.value;
    const text = "Updated description";
    
    const json = AsposeFontSetInfo(font_file, nameId, platformId, platformSpecificId, langID, text);
    console.log("AsposeFontSetInfo => %O",  json.errorCode == 0 ? json.fileNameResult : json.errorText);
```