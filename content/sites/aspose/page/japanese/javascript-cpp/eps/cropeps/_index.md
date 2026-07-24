---
title: "AsposeCropEPS"
second_title: "C++ 経由で JavaScript 用 Aspose.Page"
description: "EPS をトリミング"
type: docs
weight: 10
url: /ja/javascript-cpp/eps/cropeps/
---
## AsposeCropEPS function

EPS ファイルをトリミングします。更新された既存の %%BoundingBox を使用して元の EPS ファイルを保存するか、新しいものが作成されます。

```js
function AsposeCropEPS(
    fileBlob,
    fileName, 
    fileNameResult, 
    left,
    top,
    right,
    bottom
)
```

| パラメーター | タイプ | 説明 |
| --------- | ---- | ----------- |
| fileBlob | Blob オブジェクト | ソースファイルの内容。 |
| fileName | 文字列 | ソースファイル名。 |
| fileNameResult | 文字列 | 結果ファイル名。 |
| 左 | 浮動小数点数 | トリミングボックスの左境界を指定します。 |
| 上 | 浮動小数点数 | トリミングボックスの上境界を指定します。 |
| 右 | 浮動小数点数 | トリミングボックスの右境界を指定します。 |
| 下 | 浮動小数点数 | トリミングボックスの下境界を指定します。 |

### 戻り値

JSON オブジェクト
| フィールド | 説明 |
| ----- | ----------- |
|  | errorCode | コードエラー (0 エラーなし) |
|  | errorText | テキストエラー ("" エラーなし) |
|  | fileNameResult | 結果ファイル名 |

### 例

```js
  var fCropEPS = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeCropEPS(event.target.result, e.target.files[0].name,  e.target.files[0].name + "_crop.eps", 30, 5, 240, 36);
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
  const fCropEps = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeCropEPS', "params": [event.target.result, e.target.files[0].name, 30, 5, 240, 36] }, [event.target.result]);
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

* function [AsposeResizeEps](../resizeeps/)
