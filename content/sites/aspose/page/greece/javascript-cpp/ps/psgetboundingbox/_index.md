---
title: "AsposePSGetBoundingBox"
second_title: "Aspose.Page για JavaScript μέσω C++"
description: "Λάβετε το πλαίσιο οριοθέτησης"
type: docs
weight: 10
url: /el/javascript-cpp/ps/psgetboundingbox/
---
## AsposePSGetBoundingBox function

Διαβάζει το αρχείο EPS και εξάγει το πλαίσιο οριοθέτησης της εικόνας EPS από το σχόλιο %%BoundingBox ή τα όρια για το προεπιλεγμένο μέγεθος σελίδας (0, 0, 595, 842) εάν δεν υπάρχει.

```js
function AsposePSGetBoundingBox(
    fileBlob,
    fileName
)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --------- | ---- | ----------- |
| fileBlob | Αντικείμενο Blob | Περιεχόμενο του αρχικού αρχείου. |
| fileName | string | Όνομα αρχείου προέλευσης. |

### Τιμή Επιστροφής

Αντικείμενο JSON
| Πεδίο | Περιγραφή |
| ----- | ----------- |
|  | errorCode | σφάλμα κώδικα (0 χωρίς σφάλμα) |
|  | errorText | σφάλμα κειμένου ("" χωρίς σφάλμα) |
|  | bbox | το πλαίσιο οριοθέτησης της εικόνας EPS. |

### Παραδείγματα

```js
  var fPSGetBoundingBox = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposePSGetBoundingBox(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Bounds: " + json.bbox.toString();
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
      (evt.data.json.errorCode == 0) ? `Boundibg box: ${evt.data.json.bbox}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fPSGetBoundingBox = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposePSGetBoundingBox', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

  }

```

### Δείτε επίσης

* function [AsposePSExtractText](../psextracttext/)
