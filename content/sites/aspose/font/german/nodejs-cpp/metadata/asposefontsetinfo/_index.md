---
title: "AsposeFontSetInfo"
second_title: "Aspose.Font für Node.js via C++"
description: "Setze Informationen (Metadaten) in eine Font-Datei."
type: docs
url: /de/nodejs-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_Setze Informationen (Metadaten) in eine Font-Datei._

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

| Parameter | Typ | Beschreibung |
| --------- | ---- | ----------- |
| fileName | string | Dateiname. |
| nameId | TtfNameTableNameId | Namensidentifikator, logische Zeichenkettenkategorie, angegeben durch die Aufzählung [`NameId`](../../enumerations/ttfnametablenameid/) |
|  | platformId | TtfNameTablePlatformId | Plattform‑Identifikator |
| platformSpecificId | int | Plattform-spezifischer Codierungsidentifikator. Bitte verwenden Sie einen Wert aus einer der folgenden Aufzählungen – [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/), [`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/), [`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/). Welche Aufzählung zu verwenden ist, wird durch den Kontext (*platformId*‑Parameter) bestimmt. |
| languageId | int | Sprachidentifikator. Bitte verwenden Sie einen Wert aus der Aufzählung [`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/) oder [`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/), abhängig vom Kontext, definiert durch den *platformId*‑Parameter. |
|  | Text | string | Tatsächliche Zeichenkettendaten |

### Rückgabewert

JSON-Objekt
| Feld | Beschreibung |
| ----- | ----------- |
|  | errorCode | Fehlercode (0 kein Fehler) |
|  | errorText | Textfehler ("" kein Fehler) |
|  | fileNameResult | Ergebnisdateiname |

### Beispiele

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

### Siehe auch

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
