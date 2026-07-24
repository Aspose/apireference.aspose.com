---
title: "AsposePageAbout"
second_title: "Aspose.Page per JavaScript via C++"
description: "Ottieni informazioni sul prodotto."
type: docs
url: /it/javascript-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

Ottieni informazioni sul prodotto.

```js
function AsposePageAbout()
```

### Valore di ritorno

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
| errorCode | errore di codice (0 nessun errore) |
| errorText | errore di testo (\"\" nessun errore) |
| prodotto | Nome prodotto |
| versione | Versione prodotto |
| islicensed | Il prodotto è licenziato |


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
