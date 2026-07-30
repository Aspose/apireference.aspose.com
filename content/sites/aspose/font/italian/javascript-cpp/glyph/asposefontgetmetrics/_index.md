---
title: "FontGetFontMetrics"
second_title: "Aspose.Font per JavaScript via C++"
description: "Ottieni informazioni (metadati) da un file Font."
type: docs
url: /it/javascript-cpp/glyph/asposefontgetmetrics/
---
## FontGetFontMetrics function

_Ottieni il conteggio dei glifi del font._

```js
function FontGetFontMetrics(
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
|  | metriche | oggetto JSON |
| * ascesa |
| * discesa |
| * lineGap |
| * advanceWidthMax |
| * minLeftSideBearing |
| * minRightSideBearing |
| * xMaxExtent |

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
      ? JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')
      : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const ffileFontGetMetrics = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Get metrics of font - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontGetMetrics', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```

**Simple example**:
```js
  var ffileFontGetGlyphCount = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = FontGetFontMetrics(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Glyph count: " + json.glyphCount;
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```
