---
title: "AsposeFontConvert"
second_title: "Aspose.Font для JavaScript через C++"
description: "Преобразует шрифт в другой формат"
type: docs
weight: 10
url: /ru/javascript-cpp/convert/asposefontconvert/
---
## AsposeFontConvert function

Преобразует шрифт в другой формат.

```js
function AsposeFontConvert(
    fileBlob,
    fileName,
    fontType,
    fontSavingFormat
)
```

| Параметр | Тип | Описание |
| --------- | ---- | ----------- |
| fileBlob | Объект Blob | Содержимое исходного шрифта для конвертации. |
| fileName | string | Имя файла. |
| fontType | FontType | Тип шрифта для преобразования. |
| fontSavingFormat | FontSavingFormats | Формат шрифта для преобразования. |

### Возвращаемое значение

Объект JSON
| Поле | Описание |
| ----- | ----------- |
|  | errorCode | код ошибки (0 — нет ошибки) |
|  | errorText | текст ошибки ("" — нет ошибки) |
|  | fileNameResult | имя результирующего файла |

### Примечания

Примечание: тип шрифта TTF теперь поддерживается только.

### Примеры

```js
  var fTTF2WOFF = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontConvert(event.target.result, e.target.files[0].name, Module.FontType.TTF, Module.FontSavingFormats.WOFF);
      if (json.errorCode == 0) document.getElementById('output').textContent = json.fileNameResult;
      else document.getElementById('output').textContent = json.errorText;
      DownloadFile(json.fileNameResult, "woff");
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'library loaded!' :
      (evt.data.json.errorCode == 0) ? `Result:\n${DownloadFile(evt.data.json.fileNameResult, "font/ttf", evt.data.params[0])}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fOTFtoTTF = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Convert a OTF fonts to TTF and save - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontConvert', "params": [event.target.result, e.target.files[0].name, 'Module.FontType.OTF', 'Module.FontSavingFormats.TTF'] }, [event.target.result]);
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

* enum [FontType](../../enumerations/fonttype/)
* enum [FontSavingFormats](../../enumerations/fontsavingformats/)
