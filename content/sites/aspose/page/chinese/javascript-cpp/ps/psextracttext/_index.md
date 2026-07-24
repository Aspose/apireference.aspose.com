---
title: "AsposePSExtractText"
second_title: "Aspose.Page 用于 JavaScript via C++"
description: "从 PS 文件中提取文本"
type: docs
weight: 10
url: /zh/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

从 PS 文件中提取文本。仅当文本使用 Type 42（TrueType）字体或在其向量映射中包含 Type 42 字体的 Type 0 字体编写时，才可以提取。

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| 参数 | 类型 | 描述 |
| --------- | ---- | ----------- |
| fileBlob | Blob 对象 | 源文件的内容。 |
| fileName | string | 源文件名。 |
| 开始 | int | 指定开始提取文本的页码。此参数在多页文档中非常有用。 |
| 结束 | int | 指定提取文本结束的页码。此参数在多页文档中非常有用。 |

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
|  | errorCode | 错误代码（0 表示无错误） |
|  | errorText | 错误文本（"" 表示无错误） |
|  | 文本 | 提取的文本 |

### 示例

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

### 另见

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
