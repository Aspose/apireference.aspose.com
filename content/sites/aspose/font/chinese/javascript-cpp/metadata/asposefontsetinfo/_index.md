---
title: "AsposeFontSetInfo"
second_title: "Aspose.Font 用于 JavaScript，通过 C++"
description: "将信息（元数据）设置到 Font-file 中。"
type: docs
url: /zh/javascript-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_将信息（元数据）写入字体文件。_

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

| 参数 | 类型 | 描述 |
| --------- | ---- | ----------- |
| fileBlob | Blob 对象 | 用于转换的源字体内容。 |
| fileName | 字符串 | 文件名。 |
| nameId | TtfNameTableNameId | 名称标识符，逻辑字符串类别，由[`NameId`](../../enumerations/ttfnametablenameid/)枚举指定 |
|  | platformId | TtfNameTablePlatformId | 平台标识符 |
| platformSpecificId | int | 平台特定编码标识符。请使用以下枚举之一的值 - [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/)、[`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/)、[`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/)。使用哪个枚举由上下文（*platformId* 参数）决定 |
| languageId | int | 语言标识符。请根据上下文使用[`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/)或[`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/)枚举的值，上下文由 *platformId* 参数定义。 |
|  | 文本 | 字符串 | 实际字符串数据 |

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
|  | errorCode | 错误代码（0 表示无错误） |
|  | errorText | 错误文本（"" 表示无错误） |
|  | fileNameResult | 结果文件名 |

### 示例

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

### 另请参阅

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
