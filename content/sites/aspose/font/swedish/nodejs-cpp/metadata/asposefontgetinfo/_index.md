---
title: "AsposeFontGetInfo"
second_title: "Aspose.Font för Node.js via C++"
description: "Hämta information (metadata) från en teckensnittsfil."
type: docs
url: /sv/nodejs-cpp/metadata/asposefontgetinfo/
---
## AsposeFontGetInfo function

_Hämta information (metadata) från en Font-fil._

```js
function AsposeFontGetInfo(
    fileName
)
```

| Parameter | Typ | Beskrivning |
| --------- | ---- | ----------- |
| fileName | string | Filnamn. |

### Returvärde

JSON-objekt
| Fält | Beskrivning |
| ----- | ----------- |
|  | errorCode | felkod (0 inget fel) |
|  | errorText | textfel ("" inget fel) |
|  | poster | Array av JSON-objekt : |
|  | * NameId | namnidentifierare |
|  | * PlatformId | plattformidentifierare |
|  | * PlatformSpecificId | plattformsspecifik identifierare |
|  | * LanguageId | språkidentifierare |
|  | * Info | innehåll i namnpost |

### Exempel

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
