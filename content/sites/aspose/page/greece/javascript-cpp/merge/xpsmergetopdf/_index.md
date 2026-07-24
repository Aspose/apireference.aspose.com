---
title: "AsposeXPSMergeToPdf"
second_title: "Aspose.Page για JavaScript μέσω C++"
description: "Συγχώνευση των αρχείων XPS σε PDF"
type: docs
weight: 10
url: /el/javascript-cpp/merge/xpsmergetopdf/
---
## AsposeXPSMergeToPdf function

Συγχώνευση των αρχείων XPS σε PDF.

```js
function AsposeXPSMergePdf(
    fileNames, 
    fileNameResult, 
    supressErrors
)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --------- | ---- | ----------- |
| fileNames | string | Τα ονόματα των αρχείων για συγχώνευση. |
| fileNameResult | string | Το όνομα του τελικού αρχείου pdf. |
| supressErrors | bool | Καθορίζει εάν τα σφάλματα πρέπει να καταστέλλονται ή όχι. |

### Τιμή Επιστροφής

Αντικείμενο JSON
| Πεδίο | Περιγραφή |
| ----- | ----------- |
|  | errorCode | σφάλμα κώδικα (0 χωρίς σφάλμα) |
|  | errorText | σφάλμα κειμένου ("" χωρίς σφάλμα) |
|  | fileNameResult | όνομα αρχείου αποτελέσματος |

### Παραδείγματα

```js
  var fPsAsPdf = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeXPSMergeToPdf(event.target.result, e.target.files[0].name, true);
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
      /*Merge a XPS to PDF - Ask Web Worker*/
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXPSMergeToPdf', "params": [event.target.result, e.target.files[0].name, true] }, [event.target.result]);
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

### Δείτε επίσης

* function [PSSaveAsImage](../pssaveasimage/)
