---
title: "AsposeResizeEPS"
second_title: "Aspose.Page JavaScript용 C++를 통해"
description: "EPS 크기 조정"
type: docs
weight: 10
url: /ko/javascript-cpp/eps/resizeeps/
---
## AsposeResizeEPS function

EPS 파일의 크기를 조정합니다. 기존 %%BoundingBox를 업데이트한 초기 EPS 파일을 저장하거나 새로운 %%BoundingBox가 생성됩니다.

```js
function AsposeResizeEPS(
    fileBlob,
    fileName, 
    fileNameResult, 
    width,
    height,
    units
)
```

| 매개변수 | 유형 | 설명 |
| --------- | ---- | ----------- |
| fileBlob | Blob 객체 | 소스 파일의 내용. |
| fileName | string | 소스 파일 이름. |
| fileNameResult | string | 결과 파일 이름. |
| width | float | 새 경계 상자의 너비를 지정합니다. |
| height | float | 새 경계 상자의 높이를 지정합니다. |
| unit | Module.Units | 새 크기의 유형을 지정합니다. |

### 반환 값

JSON 객체
| 필드 | 설명 |
| ----- | ----------- |
|  | errorCode | 코드 오류 (0 오류 없음) |
|  | errorText | 텍스트 오류 (\"\" 오류 없음) |
|  | fileNameResult | 결과 파일 이름 |

### 예제

```js
  var fResizeEPS = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeResizeEPS(event.target.result, e.target.files[0].name,  e.target.files[0].name + "_resized.eps", 200, 100, Module.Units.Points);
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
  const fResizeEps = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeResizeEPS', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_resized.eps", 200, 100, 'Module.Units.Points'] }, [event.target.result]);
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

### 참조

* function [Module.Units](../../enumerations/units/)
* function [AsposeCropEps](../cropeps/)
