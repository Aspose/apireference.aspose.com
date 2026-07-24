---
title: "AsposePSExtractText"
second_title: "Aspose.Page per JavaScript via C++"
description: "Estrai il testo dal file PS"
type: docs
weight: 10
url: /it/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

Estrai il testo dal file PS. Il testo può essere estratto solo se è scritto con font Type 42 (TrueType) o font Type 0 con font Type 42 nella sua Mappa Vettoriale.

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileBlob | Oggetto Blob | Contenuto del file di origine. |
| fileName | string | Nome del file di origine. |
| inizio | int | Specifica la pagina da cui iniziare l'estrazione del testo. Questo parametro è utile per documenti multipagina. |
| fine | int | Specifica la pagina fino a cui terminare l'estrazione del testo. Questo parametro è utile per documenti multipagina. |

### Valore di ritorno

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | errore di codice (0 nessun errore) |
|  | errorText | errore di testo (\"\" nessun errore) |
|  | testo | il testo estratto |

### Esempi

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

### Vedi anche

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
