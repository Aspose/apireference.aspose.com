---
title: "AsposePageAbout"
second_title: "Aspose.Page voor JavaScript via C++"
description: "Haal informatie op over Product."
type: docs
url: /nl/javascript-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

Haal informatie op over Product.

```js
function AsposePageAbout()
```

### Retourwaarde

JSON-object
| Veld | Beschrijving |
| ----- | ----------- |
| errorCode | codefout (0 geen fout) |
| errorText | tekstfout ("" geen fout) |
| product | Productnaam |
| versie | Productversie |
| islicensed | Product is gelicentieerd |


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
