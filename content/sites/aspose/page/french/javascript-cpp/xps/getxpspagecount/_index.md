---
title: "AsposeGetXpsPageCount"
second_title: "Aspose.Page pour JavaScript via C++"
description: "Obtenir le nombre de pages dans le fichier XPS"
type: docs
weight: 10
url: /fr/javascript-cpp/xps/getxpspagecount/
---
## AsposeGetXpsPageCount function

Obtenir le nombre de pages du document xps.

```js
function AsposeGetXpsPageCount(
    fileBlob,
    fileName
)
```

| Paramètre | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Objet Blob | Contenu du fichier source. |
| fileName | string | Nom du fichier source. |

### Valeur de retour

Objet JSON
| Champ | Description |
| ----- | ----------- |
|  | errorCode | code d'erreur (0 aucune erreur) |
|  | errorText | texte d'erreur (\"\" aucune erreur) |
|  | pageCount | nombre de pages |

### Exemples

```js
  var fGetPageCount = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeGetXpsPageCount(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Pages count: " + json.pageCount.toString();
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
      (evt.data.json.errorCode == 0) ? `Number of pages      : ${evt.data.json.pageCount}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fGetPagesCount = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeGetXpsPageCount', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

```

