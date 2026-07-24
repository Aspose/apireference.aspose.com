---
title: "AsposeXMPAddArrayItem"
second_title: "C++ 経由で JavaScript 用 Aspose.Page"
description: "XMPメタデータを取得"
type: docs
weight: 20
url: /ja/javascript-cpp/xmp/xmpaddarrayitem/
---
## AsposeXMPAddArrayItem function

配列に値を追加します。値は配列の末尾に追加されます。

```js
function AsposeXMPAddArrayItem(
    fileBlob, 
    fileName, 
    fileNameResult
)
```

| パラメーター | タイプ | 説明 |
| --------- | ---- | ----------- |
| fileBlob | Blob オブジェクト | ソースファイルの内容。 |
| fileName | 文字列 | ソースファイル名。 |
| fileNameResult | 文字列 | 結果ファイル名。 |


### 戻り値

JSON オブジェクト
| フィールド | 説明 |
| ----- | ----------- |
|  | errorCode | コードエラー (0 エラーなし) |
|  | errorText | テキストエラー ("" エラーなし) |
|  | XMP | メタデータ値の配列 |
|  | fileNameResult | 結果ファイル名 |

### 例

```js
  var fGetXmpMetadata = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const input = [
        ["dc:title", "NewTitle"],
        ["dc:creator", "NewCreator"]
      ];
      const json = AsposeXMPAddArrayItem(event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", input);
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
      const input = [
        ["dc:title", "NewTitle"],
        ["dc:creator", "NewCreator"]
      ];
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXMPAddArrayItem', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", input] }, [event.target.result]);
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

### 参照

* function [AsposeXMPAddNamespace](../xmpaddarrayitem/)
* function [AsposeXMPAddNamedValue](../xmpaddnamedvalue/)
