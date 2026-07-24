---
title: "AsposePSMergeToPdf"
second_title: "Aspose.Page voor JavaScript via C++"
description: "Combineer de Postscript-bestanden naar PDF"
type: docs
weight: 10
url: /nl/javascript-cpp/merge/psmergetopdf/
---
## AsposePSMergeToPdf function

Combineer de Postscript-bestanden naar PDF.

```js
function AsposePSMergePdf(
    fileNames, 
    fileNameResult, 
    supressErrors
)
```

| Parameter | Type | Beschrijving |
| --------- | ---- | ----------- |
| fileNames | string | De namen van bestanden voor samenvoegen. |
| fileNameResult | string | De naam van het resulterende pdf-bestand. |
| supressErrors | bool | Specificeert of fouten onderdrukt moeten worden of niet. |

### Retourwaarde

JSON-object
| Veld | Beschrijving |
| ----- | ----------- |
|  | errorCode | codefout (0 geen fout) |
|  | errorText | tekstfout ("" geen fout) |
|  | fileNameResult | resultaat bestandsnaam |

### Voorbeelden

```js
  var fPsAsPdf = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposePSMergeToPdf(event.target.result, e.target.files[0].name, true);
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
      /*Merge a Postscript to PDF - Ask Web Worker*/
      AsposePageWebWorker.postMessage({ "operation": 'AsposePSMergeToPdf', "params": [event.target.result, e.target.files[0].name, true] }, [event.target.result]);
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

### Zie ook

* function [PSSaveAsImage](../pssaveasimage/)
