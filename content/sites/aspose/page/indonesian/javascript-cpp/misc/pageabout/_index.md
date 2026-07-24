---
title: "AsposePageAbout"
second_title: "Aspose.Page untuk JavaScript via C++"
description: "Dapatkan info tentang Produk."
type: docs
url: /id/javascript-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

Dapatkan info tentang Produk.

```js
function AsposePageAbout()
```

### Nilai kembali

objek JSON
| Bidang | Deskripsi |
| ----- | ----------- |
| errorCode | kode error (0 tidak ada error) |
| errorText | teks error ("" tidak ada error) |
| produk | Nama produk |
| versi | Versi produk |
| islicensed | Produk berlisensi |


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
