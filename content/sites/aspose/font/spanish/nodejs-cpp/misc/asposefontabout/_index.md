---
title: "AsposeFontAbout"
second_title: "Aspose.Font para Node.js mediante C++"
description: "Obtener información sobre el producto."
type: docs
url: /es/nodejs-cpp/misc/AsposeFontAbout/
---

## AsposeFontAbout function

Obtener información sobre el producto.

```js
function AsposeFontAbout()
```

### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
| errorCode | error de código (0 sin error) |
| errorText | error de texto (\"\" sin error) |
| producto | Nombre del producto |
| versión | Versión del producto |
| Está licenciado | El producto está licenciado |


## Ejemplo
**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    json = AsposeFontModule.AsposeFontAbout();
    console.log("AsposeFontAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
});
```
**ECMAScript\ES6 js modules:**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

//AsposeFontAbout - Get info about Product
const json = AsposeFontModule.AsposeFontAbout();
console.log("AsposeFontAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
```
