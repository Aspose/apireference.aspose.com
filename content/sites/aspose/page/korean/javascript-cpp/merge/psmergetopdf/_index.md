---
title: "AsposePSMergeToPdf"
second_title: "Aspose.Page JavaScript용 C++를 통해"
description: "Postscript 파일을 PDF로 병합합니다"
type: docs
weight: 10
url: /ko/javascript-cpp/merge/psmergetopdf/
---
## AsposePSMergeToPdf function

Postscript 파일을 PDF로 병합합니다.

```js
function AsposePSMergePdf(
    fileNames, 
    fileNameResult, 
    supressErrors
)
```

| 매개변수 | 유형 | 설명 |
| --------- | ---- | ----------- |
| fileNames | string | 병합할 파일들의 이름. |
| fileNameResult | string | 결과 PDF 파일의 이름. |
| supressErrors | bool | 오류를 억제할지 여부를 지정합니다. |

### 반환 값

JSON 객체
| 필드 | 설명 |
| ----- | ----------- |
|  | errorCode | 코드 오류 (0 오류 없음) |
|  | errorText | 텍스트 오류 (\"\" 오류 없음) |
|  | fileNameResult | 결과 파일 이름 |

### 예제

```js
  var fPsAsPdf = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposePSMergeToPdf(event.target.result, e.target.files[0].name, true);
      if (json.errorCode == 0) {
        DownloadFile(json.fileNameResult, "image/pdf");
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
      /*Merge a Postscript to PDF - Ask Web Worker*/
      AsposePageWebWorker.postMessage({ "operation": 'AsposePSMergeToPdf', "params": [event.target.result, e.target.files[0].name, true] }, [event.target.result]);
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

* function [PSSaveAsImage](../pssaveasimage/)
