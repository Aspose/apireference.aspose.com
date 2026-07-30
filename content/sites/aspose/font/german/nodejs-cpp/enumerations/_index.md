---
title: "Aufzählungen"
second_title: "Aspose.Font für Node.js via C++"
description: "Funktionen zum Konvertieren von Schriftarten in True‑Type‑Formate."
type: docs
url: /de/nodejs-cpp/enumerations/
---

## Aufzählungen

| Aufzählung | Beschreibung |
| ----------- | ----------- |
| [FontSavingFormats](./fontsavingformats/) | Gibt den Schriftarttyp an. |
| [FontType](./fonttype/) | Gibt den Schriftarttyp an. |
| [TtfNameTableNameId](./ttfnametablenameid/) | Gibt die NameId an. |
| [TtfNameTablePlatformId](./ttfnametableplatformid/) | Stellt die PlatformId-Aufzählung dar. |
| [TtfNameTableMSPlatformSpecificId](./ttfnametableMSPlatformSpecificId/) | Stellt die Aufzählung MSPlatformSpecificId dar. |
| [TtfNameTableMacPlatformSpecificId](./ttfnametableMacPlatformSpecificId/) | Stellt die Aufzählung MacPlatformSpecificId dar. |
| [TtfNameTableUnicodePlatformSpecificId](./ttfnametableUnicodePlatformSpecificId/) | Stellt die Aufzählung UnicodePlatformSpecificId dar. |
| [TtfNameTableMacLanguageId](./ttfnametablemaclanguageid/) | Macintosh-Plattform-Sprach‑ID‑Aufzählung. |
| [TtfNameTableMSLanguageId](./ttfnametablemslanguageid/) | Microsoft-Plattform-Sprach‑ID‑Aufzählung. |

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