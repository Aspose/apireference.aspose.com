---
title: "AsposeXMPAddSimpleProperties"
second_title: "Aspose.Page per JavaScript via C++"
description: "Ottieni i metadati XMP"
type: docs
weight: 40
url: /it/javascript-cpp/xmp/xmpaddsimpleproperties/
---
## AsposeXMPAddSimpleProperties function

Aggiunge un valore nominato in una struttura.

```js
function AsposeXMPAddSimpleProperties(
    fileBlob, 
    fileName, 
    fileNameResult
)
```

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileBlob | Oggetto Blob | Contenuto del file di origine. |
| fileName | string | Nome del file di origine. |
| fileNameResult | string | Nome del file risultato. |


### Valore di ritorno

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | errore di codice (0 nessun errore) |
|  | errorText | errore di testo (\"\" nessun errore) |
|  | XMP | array di valori dei metadati |
|  | fileNameResult | nome file risultato |

### Esempi

```js
  var fGetXmpMetadata = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const key = "tmp:newKey";
      const value = "NewValue";
      const json = AsposeXMPAddSimpleProperties(event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", key, value);
      if (json.errorCode == 0) {
          document.getElementById('output').textContent = json.XMP;
          DownloadFile(json.fileNameResult, "image/eps");
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
      (evt.data.json.errorCode == 0) ? `Result:\n${DownloadFile(evt.data.json.fileNameResult, "application/image", evt.data.params[0])}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fPsAsPdf = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      const key = "tmp:newKey";
      const value = "NewValue";
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXMPAddSimpleProperties', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", key, value] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

  /*Make a link to download the result file*/
  const DownloadFile = function (filename, mime, content) {
      mime = mime || "application/octet-stream";
      var link = document.createElement("a"); 
      link.href = URL.createObjectURL(new Blob([content], {type: mime}));
      link.download = filename;
      link.textContent = filename;
      link.title = "Click here to download the file";
      document.getElementById('fileDownload').appendChild(link);
      document.getElementById('fileDownload').appendChild(document.createElement("br"));
  }

```

### Vedi anche

* function [AsposeXMPAddArrayItem](../xmpaddarrayitem/)
* function [AsposeXMPNamedValue](../xmpaddnamedvalue/)
* function [AsposeXMPNamespace](../xmpaddnamespace/)
