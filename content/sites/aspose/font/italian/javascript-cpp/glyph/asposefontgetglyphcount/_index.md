---
title: "AsposeFontGetGlyphCount"
second_title: "Aspose.Font per JavaScript via C++"
description: "Ottieni informazioni (metadati) da un file Font."
type: docs
url: /it/javascript-cpp/glyph/asposefontgetglyphcount/
---
## AsposeFontGetGlyphCount function

_Ottieni il conteggio dei glifi del font._

```js
function AsposeFontGetGlyphCount(
    fileBlob,
    fileName
)
```

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileBlob | Oggetto Blob | Contenuto del font sorgente per la conversione. |
| fileName | stringa | Nome file. |

### Valore di ritorno

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | codice errore (0 nessun errore) |
|  | errorText | testo errore (\"\" nessun errore) |
|  | glyphCount | conteggio dei glifi |

### Esempi

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
