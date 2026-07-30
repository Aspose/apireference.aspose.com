---
title: "FontGetFontMetrics"
second_title: "Aspose.Font для JavaScript через C++"
description: "Получить информацию (метаданные) из файла шрифта."
type: docs
url: /ru/javascript-cpp/glyph/asposefontgetmetrics/
---
## FontGetFontMetrics function

_Получить количество глифов шрифта._

```js
function FontGetFontMetrics(
    fileBlob,
    fileName
)
```

| Параметр | Тип | Описание |
| --------- | ---- | ----------- |
| fileBlob | Объект Blob | Содержимое исходного шрифта для конвертации. |
| fileName | string | Имя файла. |

### Возвращаемое значение

Объект JSON
| Поле | Описание |
| ----- | ----------- |
|  | errorCode | код ошибки (0 — нет ошибки) |
|  | errorText | текст ошибки ("" — нет ошибки) |
|  | метрики | Объект JSON |
| * восхождение |
| * спуск |
| * lineGap |
| * advanceWidthMax |
| * minLeftSideBearing |
| * minRightSideBearing |
| * xMaxExtent |

### Примеры

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = (evt) => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = (evt) => document.getElementById("output").textContent =
    evt.data == "ready"
      ? "loaded!"
      : evt.data.json.errorCode == 0
      ? JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')
      : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const ffileFontGetMetrics = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Get metrics of font - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontGetMetrics', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```

**Simple example**:
```js
  var ffileFontGetGlyphCount = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = FontGetFontMetrics(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Glyph count: " + json.glyphCount;
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```
