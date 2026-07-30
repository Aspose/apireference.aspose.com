---
title: "AsposeFontAbout"
second_title: "Aspose.Font för JavaScript via C++"
description: "Hämta information om produkten."
type: docs
url: /sv/javascript-cpp/misc/asposefontabout/
---

## AsposeFontAbout function

Hämta information om produkten.

```js
function AsposeFontAbout()
```

### Returvärde

JSON‑objekt
| Fält | Beskrivning |
| ----- | ----------- |
| errorCode | kodfel (0 inget fel) |
| errorText | textfel (\"\" inget fel) |
| produkt | Produktnamn |
| version | Produktversion |
| islicensed | Produkten är licensierad |


**Web Worker example**:
```js
  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'loaded!' :
      (evt.data.json.errorCode !== 0) ? `Error: ${evt.data.json.errorText}` :
                        "Product      : " + evt.data.json.product
                    + "\nVersion      : " + evt.data.json.version
                    + "\nIs licensed  : " + evt.data.json.islicensed;

  /*Event handler*/
  const onAsposeFontAbout = e => {
    /*Get info about Product - Ask Web Worker*/
    AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontAbout', "params": [] }, []);
  };
```
**Simple example**:
```js
  var onAsposeFontAbout = function () {
    /*Get info about Product*/
    const json = AsposeFontAbout();
    if (json.errorCode == 0) document.getElementById('output').textContent = "Product      : " + json.product
                                                                         + "\nVersion      : " + json.version
                                                                         + "\nIs licensed  : " + json.islicensed;
    else document.getElementById('output').textContent = json.errorText;
  }
```
