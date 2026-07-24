---
title: "AsposeXMPAddNamespace"
second_title: "Aspose.Page pour JavaScript via C++"
description: "Obtenir les métadonnées XMP"
type: docs
weight: 40
url: /fr/javascript-cpp/xmp/xmpaddnamespace/
---
## AsposeXMPAddNamespace function

Enregistre l'URI de l'espace de noms et ajoute une valeur.

```js
function AsposeXMPAddNamespace(
    fileBlob, 
    fileName, 
    fileNameResult
)
```

| Paramètre | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Objet Blob | Contenu du fichier source. |
| fileName | string | Nom du fichier source. |
| fileNameResult | string | Nom du fichier résultat. |


### Valeur de retour

Objet JSON
| Champ | Description |
| ----- | ----------- |
|  | errorCode | code d'erreur (0 aucune erreur) |
|  | errorText | texte d'erreur (\"\" aucune erreur) |
|  | XMP | tableau de valeurs de métadonnées |
|  | fileNameResult | nom du fichier résultat |

### Exemples

```js
  var fGetXmpMetadata = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const prefix = "tmp";
      const url = "http://www.some.org/schema/tmp#";
      const nsValues = [
        ["tmp:newKey", "NewValue"]
      ];
      const json = AsposeXMPAddNamespace(event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", prefix, url, nsValues);
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
      const prefix = "tmp";
      const url = "http://www.some.org/schema/tmp#";
      const nsValues = [
        ["tmp:newKey", "NewValue"]
      ];
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXMPAddNamespace', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", prefix, url, nsValues] }, [event.target.result]);
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

* function [AsposeXMPAddArrayItem](../xmpaddarrayitem/)
* function [AsposeXMPAddNamedValue](../xmpaddnamedvalue/)
