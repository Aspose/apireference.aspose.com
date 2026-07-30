---
title: "FontGetFontMetrics"
second_title: "Aspose.Font för JavaScript via C++"
description: "Hämta information (metadata) från en teckensnittsfil."
type: docs
url: /sv/javascript-cpp/glyph/asposefontgetmetrics/
---
## FontGetFontMetrics function

_Hämta teckenantal för teckensnitt._

```js
function FontGetFontMetrics(
    fileBlob,
    fileName
)
```

| Parameter | Typ | Beskrivning |
| --------- | ---- | ----------- |
| fileBlob | Blob-objekt | Innehåll i källfont för konvertering. |
| fileName | string | Filnamn. |

### Returvärde

JSON‑objekt
| Fält | Beskrivning |
| ----- | ----------- |
|  | errorCode | kodfel (0 inget fel) |
|  | errorText | textfel (\"\" inget fel) |
|  | mått | JSON‑objekt |
| * höjd |
| * nedstigning |
| * radavstånd |
| * maximal framstegsbredd |
| * minsta vänstra sidobäring |
| * minsta högra sidobäring |
| * maximal x-utsträckning |

### Exempel

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
