---
title: "XPSSaveAsImage"
second_title: "Aspose.Page voor JavaScript via C++"
description: "Converteert de XPS naar afbeelding"
type: docs
weight: 10
url: /nl/javascript-cpp/convert/xpssaveasimage/
---
## PSSaveAsImage function

Converteert de Postscript naar afbeelding.

```js
function AsposeXPSSaveAsImage(
    fileBlob, 
    fileName, 
    imageFormat, 
    supressErrors
)
```

| Parameter | Type | Beschrijving |
| --------- | ---- | ----------- |
| fileBlob | Blob-object | Inhoud van het bronlettertype voor conversie. |
| fileName | string | Bestandsnaam. |
| imageFormat | ImageFormat | afbeeldingsformaat om naar te converteren. |
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
  var fXpsAsPng = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = XPSSaveAsImage(event.target.result, e.target.files[0].name, Module.ImageFormat.Png, true);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Files(pages) count: " + json.filesCount.toString();
        for (let fileIndex = 0; fileIndex < json.filesCount; fileIndex++) DownloadFile(json.filesNameResult[fileIndex], "image/png");
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
  const fXpsAsPng = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Convert a XPS to PNG and save - Ask Web Worker*/
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXPSSaveAsImage', "params": [event.target.result, e.target.files[0].name, 'Module.ImageFormat.Png'] }, [event.target.result]);
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

* function [XPSSaveAsPdf](../xpssaveaspdf/)
* enum [ImageFormat](../../enumerations/imageformat/)
