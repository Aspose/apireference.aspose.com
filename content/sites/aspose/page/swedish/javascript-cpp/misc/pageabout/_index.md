---
title: "AsposePageAbout"
second_title: "Aspose.Page för JavaScript via C++"
description: "Hämta information om produkten."
type: docs
url: /sv/javascript-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

Hämta information om produkten.

```js
function AsposePageAbout()
```

### Returvärde

JSON-objekt
| Fält | Beskrivning |
| ----- | ----------- |
| errorCode | kodfel (0 inget fel) |
| errorText | textfel ("" inget fel) |
| produkt | Produktnamn |
| version | Produktversion |
| islicensed | Produkten är licensierad |


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
