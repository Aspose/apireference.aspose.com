---
title: "AsposeFontGetInfo"
second_title: "Aspose.Font para Node.js mediante C++"
description: "Obtener información (metadatos) de un archivo de fuente."
type: docs
url: /es/nodejs-cpp/metadata/asposefontgetinfo/
---
## AsposeFontGetInfo function

_Obtener información (metadatos) de un archivo de fuente._

```js
function AsposeFontGetInfo(
    fileName
)
```

| Parámetro | Tipo | Descripción |
| --------- | ---- | ----------- |
| fileName | string | Nombre de archivo. |

### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
|  | errorCode | error de código (0 sin error) |
|  | errorText | error de texto (\"\" sin error) |
|  | registros | Matriz de objetos JSON : |
|  | * NameId | identificador de nombre |
|  | * PlatformId | identificador de plataforma |
|  | * PlatformSpecificId | identificador específico de plataforma |
|  | * LanguageId | identificador de idioma |
|  | * Información | contenido del registro de nombre |

### Ejemplos

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
