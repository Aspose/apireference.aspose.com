---
title: "AsposeXPSMergeToPdf"
second_title: "Aspose.Page per JavaScript via C++"
description: "Unisci i file XPS in PDF"
type: docs
weight: 10
url: /it/javascript-cpp/merge/xpsmergetopdf/
---
## AsposeXPSMergeToPdf function

Unisci i file XPS in PDF.

```js
function AsposeXPSMergePdf(
    fileNames, 
    fileNameResult, 
    supressErrors
)
```

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileNames | string | I nomi dei file da unire. |
| fileNameResult | string | Il nome del file PDF risultante. |
| supressErrors | bool | Specifica se gli errori devono essere soppressi o meno. |

### Valore di ritorno

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | errore di codice (0 nessun errore) |
|  | errorText | errore di testo (\"\" nessun errore) |
|  | fileNameResult | nome file risultato |

### Esempi

```js
  var fPsAsPdf = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeXPSMergeToPdf(event.target.result, e.target.files[0].name, true);
      if (json.errorCode == 0) {
        DownloadFile(json.fileNameResult, "image/pdf");
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
      /*Merge a XPS to PDF - Ask Web Worker*/
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXPSMergeToPdf', "params": [event.target.result, e.target.files[0].name, true] }, [event.target.result]);
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

* function [PSSaveAsImage](../pssaveasimage/)
