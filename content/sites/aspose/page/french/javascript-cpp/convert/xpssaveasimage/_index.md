---
title: "XPSSaveAsImage"
second_title: "Aspose.Page pour JavaScript via C++"
description: "Convertit le XPS en image"
type: docs
weight: 10
url: /fr/javascript-cpp/convert/xpssaveasimage/
---
## PSSaveAsImage function

Convertit le Postscript en image.

```js
function AsposeXPSSaveAsImage(
    fileBlob, 
    fileName, 
    imageFormat, 
    supressErrors
)
```

| Paramètre | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Objet Blob | Contenu de la police source pour la conversion. |
| fileName | string | Nom de fichier. |
| imageFormat | ImageFormat | format d'image dans lequel convertir. |
| supressErrors | bool | Spécifie si les erreurs doivent être supprimées ou non. |

### Valeur de retour

Objet JSON
| Champ | Description |
| ----- | ----------- |
|  | errorCode | code d'erreur (0 aucune erreur) |
|  | errorText | texte d'erreur (\"\" aucune erreur) |
|  | fileNameResult | nom du fichier résultat |

### Exemples

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

### Voir aussi

* function [XPSSaveAsPdf](../xpssaveaspdf/)
* enum [ImageFormat](../../enumerations/imageformat/)
