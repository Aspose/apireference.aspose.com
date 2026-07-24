---
title: "AsposeEPSGetXmp"
second_title: "Aspose.Page для JavaScript через C++"
description: "Получить XMP-метаданные"
type: docs
weight: 10
url: /ru/javascript-cpp/xmp/epsgetxmp/
---
## AsposeEPSGetXmp function

Читает файл PS/EPS и извлекает XmpMetdata, если он уже существует.
Если файл EPS не содержит XMP‑метаданных, мы получаем новые, заполненные значениями из комментариев метаданных PS (%%Creator, %%CreateDate, %%Title и т.д.).
Файл EPS с заполненными XMP‑метаданными будет сохранён в fileNameResult.

```js
function AsposeEPSGetXmp(
    fileBlob, 
    fileName, 
    fileNameResult
)
```

| Параметр | Тип | Описание |
| --------- | ---- | ----------- |
| fileBlob | Объект Blob | Содержимое исходного файла. |
| fileName | строка | Имя исходного файла. |
| fileNameResult | строка | Имя результирующего файла. |


### Возвращаемое значение

JSON-объект
| Поле | Описание |
| ----- | ----------- |
|  | errorCode | код ошибки (0 — нет ошибки) |
|  | errorText | текст ошибки (\"\" — нет ошибки) |
|  | XMP | массив значений метаданных |
|  | fileNameResult | имя результирующего файла |

### Примеры

```js
  var fGetXmpMetadata = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeEPSGetXMP(event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps");
      if (json.errorCode == 0) {
          document.getElementById('output').textContent = json.XMP;
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
  const fPsAsPdf = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeEPSGetXMP', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps"] }, [event.target.result]);
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

* function [XPSSaveAsImage](../xpssaveasimage/)
