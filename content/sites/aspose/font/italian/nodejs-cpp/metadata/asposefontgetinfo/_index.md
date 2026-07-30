---
title: "AsposeFontGetInfo"
second_title: "Aspose.Font per Node.js via C++"
description: "Ottieni informazioni (metadati) da un file Font."
type: docs
url: /it/nodejs-cpp/metadata/asposefontgetinfo/
---
## AsposeFontGetInfo function

_Ottieni informazioni (metadata) da un file Font._

```js
function AsposeFontGetInfo(
    fileName
)
```

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileName | string | Nome file. |

### Valore restituito

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | codice errore (0 nessun errore) |
|  | errorText | errore di testo ("" nessun errore) |
|  | record | Array di oggetti JSON : |
|  | * NameId | identificatore del nome |
|  | * PlatformId | identificatore della piattaforma |
|  | * PlatformSpecificId | identificatore specifico della piattaforma |
|  | * LanguageId | identificatore della lingua |
|  | * Informazioni | contenuto del record del nome |

### Esempi

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
