---
title: "AsposeXMPAddArrayItem"
second_title: "Aspose.Page JavaScript용 C++를 통해"
description: "XMP 메타데이터 가져오기"
type: docs
weight: 20
url: /ko/javascript-cpp/xmp/xmpaddarrayitem/
---
## AsposeXMPAddArrayItem function

값을 배열에 추가합니다. 해당 값은 배열의 끝에 추가됩니다.

```js
function AsposeXMPAddArrayItem(
    fileBlob, 
    fileName, 
    fileNameResult
)
```

| 매개변수 | 유형 | 설명 |
| --------- | ---- | ----------- |
| fileBlob | Blob 객체 | 소스 파일의 내용. |
| fileName | string | 소스 파일 이름. |
| fileNameResult | string | 결과 파일 이름. |


### 반환 값

JSON 객체
| 필드 | 설명 |
| ----- | ----------- |
|  | errorCode | 코드 오류 (0 오류 없음) |
|  | errorText | 텍스트 오류 (\"\" 오류 없음) |
|  | XMP | 메타데이터 값 배열 |
|  | fileNameResult | 결과 파일 이름 |

### 예제

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

### 참조

* function [AsposeXMPAddNamespace](../xmpaddarrayitem/)
* function [AsposeXMPAddNamedValue](../xmpaddnamedvalue/)
