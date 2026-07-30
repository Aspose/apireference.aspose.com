---
title: "AsposeFontGetGlyphCount"
second_title: "Aspose.Font para JavaScript vía C++"
description: "Obtener información (metadatos) de un archivo de fuente."
type: docs
url: /es/javascript-cpp/glyph/asposefontgetglyphcount/
---
## AsposeFontGetGlyphCount function

_Obtener el recuento de glifos de la fuente._

```js
function AsposeFontGetGlyphCount(
    fileBlob,
    fileName
)
```

| Parámetro | Tipo | Descripción |
| --------- | ---- | ----------- |
| fileBlob | Objeto Blob | Contenido de la fuente de origen para convertir. |
| fileName | string | Nombre de archivo. |

### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
|  | errorCode | código de error (0 sin error) |
|  | errorText | texto de error ("" sin error) |
|  | glyphCount | recuento de glifos |

### Ejemplos

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = (evt) => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = (evt) => document.getElementById("output").textContent =
    evt.data == "ready"
      ? "loaded!"
      : evt.data.json.errorCode == 0
      ? "Glyph count: " + evt.data.json.glyphCount
      : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const ffileFontGetGlyphCount = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Get glyph count of font - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontGetGlyphCount', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```

**Simple example**:
```js
  var ffileFontGetGlyphCount = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontGetGlyphCount(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Glyph count: " + json.glyphCount;
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```
