---
title: "AsposeResizeEPS"
second_title: "Aspose.Page 用于 JavaScript via C++"
description: "调整 EPS 大小"
type: docs
weight: 10
url: /zh/javascript-cpp/eps/resizeeps/
---
## AsposeResizeEPS function

调整 EPS 文件。它会保存初始 EPS 文件，使用更新的现有 %%BoundingBox，或者创建新的。

```js
function AsposeResizeEPS(
    fileBlob,
    fileName, 
    fileNameResult, 
    width,
    height,
    units
)
```

| 参数 | 类型 | 描述 |
| --------- | ---- | ----------- |
| fileBlob | Blob 对象 | 源文件的内容。 |
| fileName | string | 源文件名。 |
| fileNameResult | string | 结果文件名。 |
| width | float | 指定新边界框的 width。 |
| height | float | 指定新边界框的 height。 |
| unit | Module.Units | 指定新尺寸的类型。 |

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
|  | errorCode | 错误代码（0 表示无错误） |
|  | errorText | 错误文本（"" 表示无错误） |
|  | fileNameResult | 结果文件名 |

### 示例

```js
  var fResizeEPS = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeResizeEPS(event.target.result, e.target.files[0].name,  e.target.files[0].name + "_resized.eps", 200, 100, Module.Units.Points);
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
  const fResizeEps = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeResizeEPS', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_resized.eps", 200, 100, 'Module.Units.Points'] }, [event.target.result]);
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

### 另见

* function [Module.Units](../../enumerations/units/)
* function [AsposeCropEps](../cropeps/)
