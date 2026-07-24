---
title: "AsposeEPSGetXmp"
second_title: "C++ 経由で JavaScript 用 Aspose.Page"
description: "XMPメタデータを取得"
type: docs
weight: 10
url: /ja/javascript-cpp/xmp/epsgetxmp/
---
## AsposeEPSGetXmp function

PS/EPS ファイルを読み取り、既に存在する場合は XmpMetdata を抽出します。
EPS ファイルに XMP メタデータが含まれていない場合、PS メタデータコメント (%%Creator、%%CreateDate、%%Title など) の値で埋められた新しいメタデータを取得します。
XMP メタデータが埋め込まれた EPS ファイルは fileNameResult に保存されます。

```js
function AsposeEPSGetXmp(
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
      const json = AsposeEPSGetXMP(event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps");
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
      AsposePageWebWorker.postMessage({ "operation": 'AsposeEPSGetXMP', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps"] }, [event.target.result]);
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

* function [XPSSaveAsImage](../xpssaveasimage/)
