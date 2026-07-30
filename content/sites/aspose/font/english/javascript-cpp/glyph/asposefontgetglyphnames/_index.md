---
title: "AsposeFontGetGlyphNames"
second_title: Aspose.Font for JavaScript via C++
description: "Get info (metadata) from a Font-file."
type: docs
url: /javascript-cpp/glyph/asposefontgetglyphnames/
---
## AsposeFontGetGlyphNames function

_Get glyph names of font._

```js
function AsposeFontGetGlyphNames(
    fileBlob,
    fileName
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Blob object | Content of source font for convert. |
| fileName | string | File name. |

### Return Value

JSON object 
| Field | Description |
| ----- | ----------- |
| errorCode | code error (0 no error)
| errorText | text error ("" no error)
| glyphNames | names of glyphs

### Examples

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = (evt) => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = (evt) => document.getElementById("output").textContent =
    evt.data == "ready"
      ? "loaded!"
      : evt.data.json.errorCode == 0
      ? "Glyph names: " + evt.data.json.glyphNames
      : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const ffileFontGetGlyphNames = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Get glyph names of font - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontGetGlyphNames', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```

**Simple example**:
```js
  var ffileFontGetGlyphNames = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontGetGlyphNames(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Glyph names: " + json.glyphNames.join(";");
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```
