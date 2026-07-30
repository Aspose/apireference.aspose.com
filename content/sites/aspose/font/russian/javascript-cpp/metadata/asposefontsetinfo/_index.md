---
title: "AsposeFontSetInfo"
second_title: "Aspose.Font для JavaScript через C++"
description: "Установить информацию (метаданные) в файл шрифта."
type: docs
url: /ru/javascript-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_Установить информацию (метаданные) в файл шрифта._

```js
function AsposeFontSetInfo(
    fileBlob,
    fileName,
    nameId, 
    platformId, 
    platformSpecificId, 
    languageId, 
    text
)
```

| Параметр | Тип | Описание |
| --------- | ---- | ----------- |
| fileBlob | Объект Blob | Содержимое исходного шрифта для конвертации. |
| fileName | string | Имя файла. |
| nameId | TtfNameTableNameId | Идентификатор имени, логическая категория строки, указанная перечислением [`NameId`](../../enumerations/ttfnametablenameid/). |
|  | platformId | TtfNameTablePlatformId | Идентификатор платформы |
| platformSpecificId | int | Идентификатор кодировки, специфичной для платформы. Пожалуйста, используйте значение из одного из следующих перечислений — [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/), [`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/), [`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/). Какое перечисление использовать, определяется контекстом (параметр *platformId*). |
| languageId | int | Идентификатор языка. Пожалуйста, используйте значение из перечислений [`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/) или [`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/), зависящее от контекста, определяемого параметром *platformId*. |
|  | text | string | Фактические строковые данные |

### Возвращаемое значение

Объект JSON
| Поле | Описание |
| ----- | ----------- |
|  | errorCode | код ошибки (0 — нет ошибки) |
|  | errorText | текст ошибки ("" — нет ошибки) |
|  | fileNameResult | имя результирующего файла |

### Примеры

**Web Worker example**:
```js
  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = (evt) => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = (evt) => document.getElementById("output").textContent =
    (evt.data == 'ready') ? 'library loaded!' :
    (evt.data.json.errorCode == 0) ? `Result:\n${DownloadFile(evt.data.json.fileNameResult, "font/ttf", evt.data.params[0])}` : `Error: ${evt.data.json.errorText}`;
 
 /*Event handler*/
  const ffileFontSetInfo = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
          const nameId = 'Module.TtfNameTableNameId.' + document.getElementById("NameId").value;
          //Value will be changed for PlatformId = PlatformId.Microsoft, PlatformSpecificId = MSPlatformSpecificId.Unicode_BMP_UCS2 (1) and languageID = 1033 (English_United_States = 0x0409)
          const platformId = 'Module.TtfNameTablePlatformId.Microsoft';
          const platformSpecificId = 'Module.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2';
          const langID = 'Module.TtfNameTableMSLanguageId.English_United_States';
          const text = document.getElementById("textValue").value;
          transfer = [event.target.result];
          params = [event.target.result, e.target.files[0].name, nameId, platformId, platformSpecificId, langID, text];
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontSetInfo', "params": params }, transfer);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```
**Simple example**:
```js
  var fFontSetInfo = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {

      const nameId = new Function("return Module.TtfNameTableNameId." + document.getElementById("NameId").value)();
      const platformId = Module.TtfNameTablePlatformId.Microsoft;
      const platformSpecificId = Module.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2.value;
      const text = document.getElementById("textValue").value;
      const langID = 1033;

      const json = AsposeFontSetInfo(blob, file.name, nameId, platformId, platformSpecificId, langID, text);
      if (json.errorCode == 0) {
        DownloadFile(json.fileNameResult);
        //DownloadFile(file.name);
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(file);
  }
```

### См. также

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
