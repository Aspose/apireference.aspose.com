---
title: "AsposePSGetBoundingBox"
second_title: "Aspose.Page per JavaScript via C++"
description: "Ottieni il riquadro di delimitazione"
type: docs
weight: 10
url: /it/javascript-cpp/ps/psgetboundingbox/
---
## AsposePSGetBoundingBox function

Legge il file EPS ed estrae il riquadro di delimitazione dell'immagine EPS dal commento %%BoundingBox o i limiti per la dimensione predefinita della pagina (0, 0, 595, 842) se non esiste.

```js
function AsposePSGetBoundingBox(
    fileBlob,
    fileName
)
```

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileBlob | Oggetto Blob | Contenuto del file di origine. |
| fileName | string | Nome del file di origine. |

### Valore di ritorno

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | errore di codice (0 nessun errore) |
|  | errorText | errore di testo (\"\" nessun errore) |
|  | bbox | il riquadro di delimitazione dell'immagine EPS. |

### Esempi

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

### Vedi anche

* function [AsposePSExtractText](../psextracttext/)
