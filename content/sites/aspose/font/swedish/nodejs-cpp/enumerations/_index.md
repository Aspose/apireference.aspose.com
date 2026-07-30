---
title: "Enumerationer"
second_title: "Aspose.Font för Node.js via C++"
description: "Funktioner för att konvertera fonter till TrueType-format."
type: docs
url: /sv/nodejs-cpp/enumerations/
---

## Enumerationer

| Uppräkning | Beskrivning |
| ----------- | ----------- |
| [FontSavingFormats](./fontsavingformats/) | Anger teckensnittstyp. |
| [FontType](./fonttype/) | Anger teckensnittstyp. |
| [TtfNameTableNameId](./ttfnametablenameid/) | Anger NameId. |
| [TtfNameTablePlatformId](./ttfnametableplatformid/) | Representerar PlatformId-enumeration. |
| [TtfNameTableMSPlatformSpecificId](./ttfnametableMSPlatformSpecificId/) | Representerar MSPlatformSpecificId‑enumerationen. |
| [TtfNameTableMacPlatformSpecificId](./ttfnametableMacPlatformSpecificId/) | Representerar MacPlatformSpecificId‑enumerationen. |
| [TtfNameTableUnicodePlatformSpecificId](./ttfnametableUnicodePlatformSpecificId/) | Representerar UnicodePlatformSpecificId‑enumerationen. |
| [TtfNameTableMacLanguageId](./ttfnametablemaclanguageid/) | Macintosh-plattformens språk‑id‑enumeration. |
| [TtfNameTableMSLanguageId](./ttfnametablemslanguageid/) | Microsoft-plattformens språk‑id‑enumeration. |

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