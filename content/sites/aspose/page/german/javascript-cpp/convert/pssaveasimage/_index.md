---
title: "PSSaveAsImage"
second_title: "Aspose.Page für JavaScript über C++"
description: "Konvertiert das Postscript in ein Bild"
type: docs
weight: 10
url: /de/javascript-cpp/convert/pssaveasimage/
---
## PSSaveAsImage function

Konvertiert das Postscript in ein Bild.

```js
function AsposePSSaveAsImage(
    fileBlob, 
    fileName, 
    imageFormat, 
    supressErrors
)
```

| Parameter | Typ | Beschreibung |
| --------- | ---- | ----------- |
| fileBlob | Blob-Objekt | Inhalt der Quellschriftart für die Konvertierung. |
| fileName | string | Dateiname. |
| imageFormat | ImageFormat | Bildformat, in das konvertiert werden soll. |
| supressErrors | bool | Gibt an, ob Fehler unterdrückt werden sollen oder nicht. |

### Rückgabewert

JSON-Objekt
| Feld | Beschreibung |
| ----- | ----------- |
|  | errorCode | Fehlercode (0 kein Fehler) |
|  | errorText | Fehlertext ("" kein Fehler) |
|  | fileNameResult | Ergebnisdateiname |

### Beispiele

```js
  var fPsAsPng = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = PSSaveAsImage(event.target.result, e.target.files[0].name, Module.ImageFormat.Png, true);
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
  const fPsAsPng = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Convert a Postscript to PNG and save - Ask Web Worker*/
      AsposePageWebWorker.postMessage({ "operation": 'AsposePSSaveAsImage', "params": [event.target.result, e.target.files[0].name, 'Module.ImageFormat.Png'] }, [event.target.result]);
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

### Siehe auch

* function [PSSaveAsPdf](../pssaveaspdf/)
* enum [ImageFormat](../../enumerations/imageformat/)
