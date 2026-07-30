---
title: "AsposeFontGetInfo"
second_title: "Aspose.Font für Node.js via C++"
description: "Lese Informationen (Metadaten) aus einer Schriftdatei."
type: docs
url: /de/nodejs-cpp/metadata/asposefontgetinfo/
---
## AsposeFontGetInfo function

_Informationen (Metadaten) aus einer Schriftdatei erhalten._

```js
function AsposeFontGetInfo(
    fileName
)
```

| Parameter | Typ | Beschreibung |
| --------- | ---- | ----------- |
| fileName | string | Dateiname. |

### Rückgabewert

JSON-Objekt
| Feld | Beschreibung |
| ----- | ----------- |
|  | errorCode | Fehlercode (0 kein Fehler) |
|  | errorText | Textfehler ("" kein Fehler) |
|  | Datensätze | Array von JSON-Objekten : |
|  | * NameId | Namensbezeichner |
|  | * PlatformId | Plattformbezeichner |
|  | * PlatformSpecificId | plattform-spezifischer Bezeichner |
|  | * LanguageId | Sprachbezeichner |
|  | * Info | Inhalt des Namensdatensatzes |

### Beispiele

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
