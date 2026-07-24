---
title: "AsposePageAbout"
second_title: "Aspose.Page JavaScript용 C++를 통해"
description: "제품에 대한 정보를 가져옵니다."
type: docs
url: /ko/javascript-cpp/misc/asposepageabout/
---

## AsposeFontAbout function

제품에 대한 정보를 가져옵니다.

```js
function AsposePageAbout()
```

### 반환 값

JSON 객체
| 필드 | 설명 |
| ----- | ----------- |
| errorCode | 코드 오류 (0 오류 없음) |
| errorText | 텍스트 오류 (\"\" 오류 없음) |
| 제품 | 제품 이름 |
| 버전 | 제품 버전 |
| islicensed | 제품이 라이선스되었습니다 |


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
