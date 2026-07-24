---
title: "AsposePSExtractText"
second_title: "Aspose.Page JavaScript용 C++를 통해"
description: "PS 파일에서 텍스트를 추출합니다."
type: docs
weight: 10
url: /ko/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

PS 파일에서 텍스트를 추출합니다. 텍스트는 Type 42 (TrueType) 글꼴이나 Type 0 글꼴에 Type 42 글꼴이 포함된 Vector Map으로 작성된 경우에만 추출할 수 있습니다.

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| 매개변수 | 유형 | 설명 |
| --------- | ---- | ----------- |
| fileBlob | Blob 객체 | 소스 파일의 내용. |
| fileName | string | 소스 파일 이름. |
| 시작 | int | 텍스트 추출을 시작할 페이지를 지정합니다. 이 매개변수는 다중 페이지 문서에 유용합니다. |
| 끝 | int | 텍스트 추출을 마칠 페이지를 지정합니다. 이 매개변수는 다중 페이지 문서에 유용합니다. |

### 반환 값

JSON 객체
| 필드 | 설명 |
| ----- | ----------- |
|  | errorCode | 코드 오류 (0 오류 없음) |
|  | errorText | 텍스트 오류 (\"\" 오류 없음) |
|  | 텍스트 | 추출된 텍스트 |

### 예제

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

### 참조

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
