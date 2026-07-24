---
title: "AsposePageAbout"
second_title: "C++ 経由で JavaScript 用 Aspose.Page"
description: "製品に関する情報を取得する。"
type: docs
url: /ja/javascript-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

製品に関する情報を取得する。

```js
function AsposePageAbout()
```

### 戻り値

JSON オブジェクト
| フィールド | 説明 |
| ----- | ----------- |
| errorCode | コードエラー (0 エラーなし) |
| errorText | テキストエラー ("" エラーなし) |
| 製品 | 製品名 |
| バージョン | 製品バージョン |
| islicensed | 製品はライセンスされています |


**Web Worker example**:
```js
  /*Create Web Worker*/
  const AsposePageWebWorker = new Worker("AsposePageforJS.js");
  AsposePageWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposePageWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'loaded!' :
      (evt.data.json.errorCode !== 0) ? `Error: ${evt.data.json.errorText}` :
                        "Product      : " + evt.data.json.product
                    + "\nVersion      : " + evt.data.json.version
                    + "\nIs licensed  : " + evt.data.json.islicensed;

  /*Event handler*/
  const onAsposePageAbout = e => {
    /*Get info about Product - Ask Web Worker*/
    AsposePageWebWorker.postMessage({ "operation": 'AsposePageAbout', "params": [] }, []);
  };
```
**Simple example**:
```js
  var onAsposePageAbout = function () {
    /*Get info about Product*/
    const json = AsposePageAbout();
    if (json.errorCode == 0) document.getElementById('output').textContent = "Product      : " + json.product
                                                                         + "\nVersion      : " + json.version
                                                                         + "\nIs licensed  : " + json.islicensed;
    else document.getElementById('output').textContent = json.errorText;
  }
```
