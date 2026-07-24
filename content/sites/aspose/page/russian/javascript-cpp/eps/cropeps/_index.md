---
title: "AsposeCropEPS"
second_title: "Aspose.Page для JavaScript через C++"
description: "Обрезать EPS"
type: docs
weight: 10
url: /ru/javascript-cpp/eps/cropeps/
---
## AsposeCropEPS function

Обрезает EPS‑файл. Сохраняет исходный EPS‑файл с обновлённым существующим %%BoundingBox или создаёт новый.

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

| Параметр | Тип | Описание |
| --------- | ---- | ----------- |
| fileBlob | Объект Blob | Содержимое исходного файла. |
| fileName | строка | Имя исходного файла. |
| fileNameResult | строка | Имя результирующего файла. |
| лево | float | Указывает левую границу области обрезки. |
| верх | float | Указывает верхнюю границу области обрезки. |
| право | float | Указывает правую границу области обрезки. |
| низ | float | Указывает нижнюю границу области обрезки. |

### Возвращаемое значение

JSON-объект
| Поле | Описание |
| ----- | ----------- |
|  | errorCode | код ошибки (0 — нет ошибки) |
|  | errorText | текст ошибки (\"\" — нет ошибки) |
|  | fileNameResult | имя результирующего файла |

### Примеры

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

### См. также

* function [AsposeResizeEps](../resizeeps/)
