---
title: "AsposePSExtractText"
second_title: "Aspose.Page voor JavaScript via C++"
description: "Extraheer tekst uit PS-bestand"
type: docs
weight: 10
url: /nl/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

Extraheer tekst uit PS-bestand. De tekst kan alleen worden geëxtraheerd als deze is geschreven met Type 42 (TrueType)-lettertype of Type 0-lettertype met Type 42-lettertypen in de Vector Map.

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| Parameter | Type | Beschrijving |
| --------- | ---- | ----------- |
| fileBlob | Blob-object | Inhoud van bronbestand. |
| fileName | string | Naam van bronbestand. |
| start | int | Specificeert de pagina waarvan de tekst moet worden geëxtraheerd. Deze parameter is handig voor documenten met meerdere pagina's. |
| einde | int | Specificeert de pagina tot waar de tekst moet worden geëxtraheerd. Deze parameter is handig voor documenten met meerdere pagina's. |

### Retourwaarde

JSON-object
| Veld | Beschrijving |
| ----- | ----------- |
|  | errorCode | codefout (0 geen fout) |
|  | errorText | tekstfout ("" geen fout) |
|  | tekst | de geëxtraheerde tekst |

### Voorbeelden

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

### Zie ook

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
