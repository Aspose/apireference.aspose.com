---
title: "AsposePSExtractText"
second_title: "Aspose.Page untuk JavaScript via C++"
description: "Ekstrak teks dari file PS"
type: docs
weight: 10
url: /id/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

Ekstrak teks dari file PS. Teks dapat diekstrak hanya jika ditulis dengan font Type 42 (TrueType) atau font Type 0 dengan font Type 42 dalam Vector Map-nya.

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| Parameter | Tipe | Deskripsi |
| --------- | ---- | ----------- |
| fileBlob | Objek Blob | Konten file sumber. |
| fileName | string | Nama file sumber. |
| mulai | int | Menentukan halaman dari mana untuk memulai mengekstrak teks. Parameter ini berguna untuk dokumen multi-halaman. |
| akhir | int | Menentukan halaman sampai mana untuk menyelesaikan mengekstrak teks. Parameter ini berguna untuk dokumen multi-halaman. |

### Nilai Kembali

objek JSON
| Bidang | Deskripsi |
| ----- | ----------- |
|  | errorCode | kode error (0 tidak ada error) |
|  | errorText | teks error ("" tidak ada error) |
|  | teks | teks yang diekstrak |

### Contoh

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

### Lihat Juga

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
