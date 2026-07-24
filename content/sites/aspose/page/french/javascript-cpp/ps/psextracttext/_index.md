---
title: "AsposePSExtractText"
second_title: "Aspose.Page pour JavaScript via C++"
description: "Extraire le texte du fichier PS"
type: docs
weight: 10
url: /fr/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

Extraire le texte du fichier PS. Le texte ne peut être extrait que s'il est écrit avec une police Type 42 (TrueType) ou une police Type 0 contenant des polices Type 42 dans sa carte vectorielle.

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| Paramètre | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Objet Blob | Contenu du fichier source. |
| fileName | string | Nom du fichier source. |
| début | int | Spécifie la page à partir de laquelle commencer l'extraction du texte. Ce paramètre est utile pour les documents multi-pages. |
| fin | int | Spécifie la page jusqu'à laquelle terminer l'extraction du texte. Ce paramètre est utile pour les documents multi-pages. |

### Valeur de retour

Objet JSON
| Champ | Description |
| ----- | ----------- |
|  | errorCode | code d'erreur (0 aucune erreur) |
|  | errorText | texte d'erreur (\"\" aucune erreur) |
|  | texte | le texte extrait |

### Exemples

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

### Voir aussi

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
