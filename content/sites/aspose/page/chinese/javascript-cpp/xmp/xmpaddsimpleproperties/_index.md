---
title: "AsposeXMPAddSimpleProperties"
second_title: "Aspose.Page 用于 JavaScript via C++"
description: "获取 XMP 元数据"
type: docs
weight: 40
url: /zh/javascript-cpp/xmp/xmpaddsimpleproperties/
---
## AsposeXMPAddSimpleProperties function

向结构体中添加具名值。

```js
function AsposeXMPAddSimpleProperties(
    fileBlob, 
    fileName, 
    fileNameResult
)
```

| 参数 | 类型 | 描述 |
| --------- | ---- | ----------- |
| fileBlob | Blob 对象 | 源文件的内容。 |
| fileName | string | 源文件名。 |
| fileNameResult | string | 结果文件名。 |


### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
|  | errorCode | 错误代码（0 表示无错误） |
|  | errorText | 错误文本（"" 表示无错误） |
|  | XMP | 元数据值数组 |
|  | fileNameResult | 结果文件名 |

### 示例

```js
  var fGetXmpMetadata = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const key = "tmp:newKey";
      const value = "NewValue";
      const json = AsposeXMPAddSimpleProperties(event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", key, value);
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
      const key = "tmp:newKey";
      const value = "NewValue";
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXMPAddSimpleProperties', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", key, value] }, [event.target.result]);
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

* function [AsposeXMPAddArrayItem](../xmpaddarrayitem/)
* function [AsposeXMPNamedValue](../xmpaddnamedvalue/)
* function [AsposeXMPNamespace](../xmpaddnamespace/)
