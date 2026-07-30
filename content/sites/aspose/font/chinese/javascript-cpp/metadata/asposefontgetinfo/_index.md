---
title: "AsposeFontGetInfo"
second_title: "Aspose.Font 用于 JavaScript，通过 C++"
description: "从字体文件获取信息（元数据）。"
type: docs
url: /zh/javascript-cpp/metadata/asposefontgetinfo/
---
## AsposeFontGetInfo function

_获取来自字体文件的元数据信息._

```js
function AsposeFontGetInfo(
    fileBlob,
    fileName
)
```

| 参数 | 类型 | 描述 |
| --------- | ---- | ----------- |
| fileBlob | Blob 对象 | 用于转换的源字体内容。 |
| fileName | 字符串 | 文件名。 |

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
|  | errorCode | 错误代码（0 表示无错误） |
|  | errorText | 错误文本（"" 表示无错误） |
|  | 记录 | JSON 对象数组： |
|  | * NameId | 名称标识符 |
|  | * PlatformId | 平台标识符 |
|  | * PlatformSpecificId | 平台特定标识符 |
|  | * LanguageId | 语言标识符 |
|  | * Info | 名称记录的内容 |

### 示例

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = (evt) => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = (evt) => document.getElementById("output").textContent =
    evt.data == "ready"
      ? "loaded!"
      : evt.data.json.errorCode == 0
      ? "Name records count: " + evt.data.json.records.length + 
                                            evt.data.json.records.reduce((ret, a) => ret +
                                            "\nNameId : " + a.NameId
                                          + "; PlatformId : " + a.PlatformId
                                          + "; PlatformSpecificId : " + a.PlatformSpecificId
                                          + "; LanguageId : " + a.LanguageId
                                          + "; Info : " + a.Info,"")
      : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const ffileFontGetInfo = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Get info (metadata) from a Font-file - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontGetInfo', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```
**Simple example**:
```js
  var ffileFontGetInfo = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontGetInfo(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Name records count: " + json.records.length;
        for (let recordIndex = 0; recordIndex < json.records.length; recordIndex++) 
			document.getElementById('output').textContent += " " + "\n"
                                                         + "NameId : " + json.records[recordIndex].NameId
                                                         + ";  PlatformId : " + json.records[recordIndex].PlatformId
                                                         + ";  PlatformSpecificId : " + json.records[recordIndex].PlatformSpecificId
                                                         + ";  LanguageId : " + json.records[recordIndex].LanguageId
                                                         + ";  Info : " + json.records[recordIndex].Info;
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```
