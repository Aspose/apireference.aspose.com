---
title: "AsposePageAbout"
second_title: "Aspose.Page pour JavaScript via C++"
description: "Obtenir des informations sur le produit."
type: docs
url: /fr/javascript-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

Obtenir des informations sur le produit.

```js
function AsposePageAbout()
```

### Valeur de retour

Objet JSON
| Champ | Description |
| ----- | ----------- |
| errorCode | code d'erreur (0 aucune erreur) |
| errorText | texte d'erreur (\"\" aucune erreur) |
| produit | Nom du produit |
| version | Version du produit |
| islicensed | Le produit est licencié |


**Web Worker example**:
```js
  /*Create Web Worker*/
  const AsposePageWebWorker = new Worker("AsposePageforJS.js");
  AsposePageWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposePageWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'loaded!' :
      (evt.data.json.errorCode !== 0) ? `Error: ${evt.data.json.errorText}` :
                        "Product      : " + evt.data.json.product
                    + "\nVersion      : " + evt.data.json.version
                    + "\nIs licensed  : " + evt.data.json.islicensed;

  /*Event handler*/
  const onAsposePageAbout = e => {
    /*Get info about Product - Ask Web Worker*/
    AsposePageWebWorker.postMessage({ "operation": 'AsposePageAbout', "params": [] }, []);
  };
```
**Simple example**:
```js
  var onAsposePageAbout = function () {
    /*Get info about Product*/
    const json = AsposePageAbout();
    if (json.errorCode == 0) document.getElementById('output').textContent = "Product      : " + json.product
                                                                         + "\nVersion      : " + json.version
                                                                         + "\nIs licensed  : " + json.islicensed;
    else document.getElementById('output').textContent = json.errorText;
  }
```
