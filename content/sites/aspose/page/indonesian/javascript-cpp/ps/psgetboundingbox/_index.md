---
title: "AsposePSGetBoundingBox"
second_title: "Aspose.Page untuk JavaScript via C++"
description: "Dapatkan kotak pembatas"
type: docs
weight: 10
url: /id/javascript-cpp/ps/psgetboundingbox/
---
## AsposePSGetBoundingBox function

Membaca file EPS dan mengekstrak kotak pembatas gambar EPS dari komentar %%BoundingBox atau batas untuk ukuran halaman default (0, 0, 595, 842) jika tidak ada.

```js
function AsposePSGetBoundingBox(
    fileBlob,
    fileName
)
```

| Parameter | Tipe | Deskripsi |
| --------- | ---- | ----------- |
| fileBlob | Objek Blob | Konten file sumber. |
| fileName | string | Nama file sumber. |

### Nilai Kembali

objek JSON
| Bidang | Deskripsi |
| ----- | ----------- |
|  | errorCode | kode error (0 tidak ada error) |
|  | errorText | teks error ("" tidak ada error) |
|  | bbox | kotak pembatas gambar EPS. |

### Contoh

```js
  var fPSGetBoundingBox = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposePSGetBoundingBox(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Bounds: " + json.bbox.toString();
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
      (evt.data.json.errorCode == 0) ? `Boundibg box: ${evt.data.json.bbox}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fPSGetBoundingBox = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposePSGetBoundingBox', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

  }

```

### Lihat Juga

* function [AsposePSExtractText](../psextracttext/)
