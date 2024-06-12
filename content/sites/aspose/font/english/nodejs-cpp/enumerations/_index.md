---
title: "Enumerations"
second_title: Aspose.Font for Node.js via C++
description:  "Functions for font converting to true type formats."
type: docs
url: /nodejs-cpp/enumerations/
---

## Enumerations

| Enumeration | Description |
| ----------- | ----------- |
| [FontSavingFormats](./fontsavingformats/) | Specifies Font type. |
| [FontType](./fonttype/) | Specifies Font type. |
| [TtfNameTableNameId](./ttfnametablenameid/) | Specifies NameId. |
| [TtfNameTablePlatformId](./ttfnametableplatformid/) | Represents PlatformId enumeration. |
| [TtfNameTableMSPlatformSpecificId](./ttfnametableMSPlatformSpecificId/) | Represents MSPlatformSpecificId enumeration. |
| [TtfNameTableMacPlatformSpecificId](./ttfnametableMacPlatformSpecificId/) | Represents MacPlatformSpecificId enumeration. |
| [TtfNameTableUnicodePlatformSpecificId](./ttfnametableUnicodePlatformSpecificId/) | Represents UnicodePlatformSpecificId enumeration. |
| [TtfNameTableMacLanguageId](./ttfnametablemaclanguageid/) | Macintosh platform language id enumeration. |
| [TtfNameTableMSLanguageId](./ttfnametablemslanguageid/) | Microsoft platform language id enumeration. |

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