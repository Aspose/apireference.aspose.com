---
title: "AsposePSExtractText"
second_title: "C++ 経由で JavaScript 用 Aspose.Page"
description: "PS ファイルからテキストを抽出"
type: docs
weight: 10
url: /ja/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

PS ファイルからテキストを抽出します。テキストは、Type 42（TrueType）フォントで記述されているか、またはベクターマップ内に Type 42 フォントを含む Type 0 フォントで記述されている場合にのみ抽出できます。

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| パラメーター | タイプ | 説明 |
| --------- | ---- | ----------- |
| fileBlob | Blob オブジェクト | ソースファイルの内容。 |
| fileName | 文字列 | ソースファイル名。 |
| 開始 | int | テキスト抽出を開始するページを指定します。このパラメーターは複数ページのドキュメントで有用です。 |
| 終了 | int | テキスト抽出を終了するページを指定します。このパラメーターは複数ページのドキュメントで有用です。 |

### 戻り値

JSON オブジェクト
| フィールド | 説明 |
| ----- | ----------- |
|  | errorCode | コードエラー (0 エラーなし) |
|  | errorText | テキストエラー ("" エラーなし) |
|  | テキスト | 抽出されたテキスト |

### 例

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

### 参照

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
