---
title: "AsposeFontConvertToWOFF"
second_title: "Aspose.Font 用于 JavaScript，通过 C++"
description: "将字体转换为 woff 格式"
type: docs
weight: 10
url: /zh/javascript-cpp/convert/asposefontconverttowoff/
---
## AsposeFontConvertToWOFF function

将字体转换为 WOFF 格式。

```js
function AsposeFontConvertToWOFF(
    fileBlob,
    fileName,
    fontType
)
```

| 参数 | 类型 | 描述 |
| --------- | ---- | ----------- |
| fileBlob | Blob 对象 | 用于转换的源字体内容。 |
| fileName | 字符串 | 文件名。 |
| fontType | FontType | 要转换的字体类型。 |

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
|  | errorCode | 错误代码（0 表示无错误） |
|  | errorText | 错误文本（"" 表示无错误） |
|  | fileNameResult | 结果文件名 |

### 示例

```js
  var fEOT2WOFF = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontConvertToWOFF(event.target.result, e.target.files[0].name, Module.FontType.OTF);
      if (json.errorCode == 0) document.getElementById('output').textContent = json.fileNameResult;
      else document.getElementById('output').textContent = json.errorText;
      DownloadFile(json.fileNameResult, "font/ttf");
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
  const fOTFtoWOFF = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Convert a OTF fonts to WOFF and save - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontConvertToWOFF', "params": [event.target.result, e.target.files[0].name, 'Module.FontType.OTF'] }, [event.target.result]);
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

### 另请参阅

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
