---
title: "AsposePageAbout"
second_title: "Aspose.Page 用于 JavaScript via C++"
description: "获取关于产品的信息。"
type: docs
url: /zh/javascript-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

获取关于产品的信息。

```js
function AsposePageAbout()
```

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
| errorCode | 错误代码（0 表示无错误） |
| errorText | 错误文本（"" 表示无错误） |
| 产品 | 产品名称 |
| 版本 | 产品版本 |
| islicensed | 产品已授权 |


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
