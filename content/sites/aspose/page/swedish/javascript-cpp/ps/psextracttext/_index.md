---
title: "AsposePSExtractText"
second_title: "Aspose.Page för JavaScript via C++"
description: "Extrahera text från PS-fil"
type: docs
weight: 10
url: /sv/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

Extrahera text från PS-fil. Texten kan endast extraheras om den är skriven med Type 42 (TrueType)-teckensnitt eller Type 0-teckensnitt med Type 42-teckensnitt i dess vektorkarta.

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| Parameter | Typ | Beskrivning |
| --------- | ---- | ----------- |
| fileBlob | Blob-objekt | Innehåll i källfilen. |
| fileName | sträng | Källfilens namn. |
| start | int | Anger sidan från vilken texten ska börja extraheras. Denna parameter är användbar för flersidiga dokument. |
| slut | int | Anger sidan till vilken texten ska avslutas. Denna parameter är användbar för flersidiga dokument. |

### Returvärde

JSON-objekt
| Fält | Beskrivning |
| ----- | ----------- |
|  | errorCode | kodfel (0 inget fel) |
|  | errorText | textfel ("" inget fel) |
|  | text | den extraherade texten |

### Exempel

```js
  var fPSExtractText = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposePSExtractText(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Text:" + json.text;
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
      (evt.data.json.errorCode == 0) ? 
        ((evt.data.operation == 'AsposePSExtractText') ? `Text: ${evt.data.json.text}` : `` ) : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fPSExtractText = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposePSExtractText', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

```

### Se även

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
