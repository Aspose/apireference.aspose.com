---
title: "AsposeFontAbout"
second_title: "Aspose.Font 用于 JavaScript，通过 C++"
description: "获取关于产品的信息。"
type: docs
url: /zh/javascript-cpp/misc/asposefontabout/
---

## AsposeFontAbout function

获取关于产品的信息。

```js
function AsposeFontAbout()
```

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
| errorCode | 错误代码（0 表示无错误） |
| errorText | 错误文本（"" 表示无错误） |
| 产品 | 产品名称 |
| 版本 | 产品版本 |
| 已授权 | 产品已授权 |


**Web Worker example**:
```js
  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'loaded!' :
      (evt.data.json.errorCode !== 0) ? `Error: ${evt.data.json.errorText}` :
                        "Product      : " + evt.data.json.product
                    + "\nVersion      : " + evt.data.json.version
                    + "\nIs licensed  : " + evt.data.json.islicensed;

  /*Event handler*/
  const onAsposeFontAbout = e => {
    /*Get info about Product - Ask Web Worker*/
    AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontAbout', "params": [] }, []);
  };
```
**Simple example**:
```js
  var onAsposeFontAbout = function () {
    /*Get info about Product*/
    const json = AsposeFontAbout();
    if (json.errorCode == 0) document.getElementById('output').textContent = "Product      : " + json.product
                                                                         + "\nVersion      : " + json.version
                                                                         + "\nIs licensed  : " + json.islicensed;
    else document.getElementById('output').textContent = json.errorText;
  }
```
