---
title: "التعدادات"
second_title: "Aspose.Font لـ Node.js عبر C++"
description: "دوال لتحويل الخط إلى صيغ TrueType."
type: docs
url: /ar/nodejs-cpp/enumerations/
---

## التعدادات

| تعداد | الوصف |
| ----------- | ----------- |
| [FontSavingFormats](./fontsavingformats/) | يحدد نوع الخط. |
| [FontType](./fonttype/) | يحدد نوع الخط. |
| [TtfNameTableNameId](./ttfnametablenameid/) | يحدد NameId. |
| [TtfNameTablePlatformId](./ttfnametableplatformid/) | يمثل تعداد PlatformId. |
| [TtfNameTableMSPlatformSpecificId](./ttfnametableMSPlatformSpecificId/) | يمثل تعداد MSPlatformSpecificId. |
| [TtfNameTableMacPlatformSpecificId](./ttfnametableMacPlatformSpecificId/) | يمثل تعداد MacPlatformSpecificId. |
| [TtfNameTableUnicodePlatformSpecificId](./ttfnametableUnicodePlatformSpecificId/) | يمثل تعداد UnicodePlatformSpecificId. |
| [TtfNameTableMacLanguageId](./ttfnametablemaclanguageid/) | تعداد معرف لغة منصة Macintosh. |
| [TtfNameTableMSLanguageId](./ttfnametablemslanguageid/) | تعداد معرف لغة منصة Microsoft. |

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