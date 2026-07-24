---
title: "AsposePSGetBoundingBox"
second_title: "Aspose.Page för JavaScript via C++"
description: "Hämta begränsningsruta"
type: docs
weight: 10
url: /sv/javascript-cpp/ps/psgetboundingbox/
---
## AsposePSGetBoundingBox function

Läser EPS-fil och extraherar begränsningsrutan för EPS-bilden från %%BoundingBox-kommentaren eller gränserna för standard sidstorlek (0, 0, 595, 842) om den inte finns.

```js
function AsposePSGetBoundingBox(
    fileBlob,
    fileName
)
```

| Parameter | Typ | Beskrivning |
| --------- | ---- | ----------- |
| fileBlob | Blob-objekt | Innehåll i källfilen. |
| fileName | sträng | Källfilens namn. |

### Returvärde

JSON-objekt
| Fält | Beskrivning |
| ----- | ----------- |
|  | errorCode | kodfel (0 inget fel) |
|  | errorText | textfel ("" inget fel) |
|  | bbox | begränsningsrutan för EPS-bilden. |

### Exempel

```js
  var fPSGetBoundingBox = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposePSGetBoundingBox(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Bounds: " + json.bbox.toString();
      }
      else 
        document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposePageWebWorker = new Worker("AsposePageforJS.js");
  AsposePageWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposePageWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'library loaded!' :
      (evt.data.json.errorCode == 0) ? `Boundibg box: ${evt.data.json.bbox}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fPSGetBoundingBox = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposePSGetBoundingBox', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

  }

```

### Se även

* function [AsposePSExtractText](../psextracttext/)
