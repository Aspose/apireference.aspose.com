---
title: "AsposeCropEPS"
second_title: "Aspose.Page untuk JavaScript via C++"
description: "Potong EPS"
type: docs
weight: 10
url: /id/javascript-cpp/eps/cropeps/
---
## AsposeCropEPS function

Memotong file EPS. Ini menyimpan file EPS awal dengan %%BoundingBox yang ada diperbarui atau yang baru akan dibuat.

```js
function AsposeCropEPS(
    fileBlob,
    fileName, 
    fileNameResult, 
    left,
    top,
    right,
    bottom
)
```

| Parameter | Tipe | Deskripsi |
| --------- | ---- | ----------- |
| fileBlob | Objek Blob | Konten file sumber. |
| fileName | string | Nama file sumber. |
| fileNameResult | string | Nama file hasil. |
| kiri | float | Menentukan batas kiri kotak pemotongan. |
| atas | float | Menentukan batas atas kotak pemotongan. |
| kanan | float | Menentukan batas kanan kotak pemotongan. |
| bawah | float | Menentukan batas bawah kotak pemotongan. |

### Nilai Kembali

objek JSON
| Bidang | Deskripsi |
| ----- | ----------- |
|  | errorCode | kode error (0 tidak ada error) |
|  | errorText | teks error ("" tidak ada error) |
|  | fileNameResult | nama file hasil |

### Contoh

```js
  var fCropEPS = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeCropEPS(event.target.result, e.target.files[0].name,  e.target.files[0].name + "_crop.eps", 30, 5, 240, 36);
      if (json.errorCode == 0) {
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
  const fCropEps = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeCropEPS', "params": [event.target.result, e.target.files[0].name, 30, 5, 240, 36] }, [event.target.result]);
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

### Lihat Juga

* function [AsposeResizeEps](../resizeeps/)
