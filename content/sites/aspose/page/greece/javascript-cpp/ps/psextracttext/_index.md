---
title: "AsposePSExtractText"
second_title: "Aspose.Page για JavaScript μέσω C++"
description: "Εξαγωγή κειμένου από αρχείο PS"
type: docs
weight: 10
url: /el/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

Εξαγωγή κειμένου από αρχείο PS. Το κείμενο μπορεί να εξαχθεί μόνο εάν είναι γραμμένο με γραμματοσειρά Type 42 (TrueType) ή γραμματοσειρά Type 0 με γραμματοσειρές Type 42 στον Vector Map της.

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --------- | ---- | ----------- |
| fileBlob | Αντικείμενο Blob | Περιεχόμενο του αρχικού αρχείου. |
| fileName | string | Όνομα αρχείου προέλευσης. |
| έναρξη | int | Καθορίζει τη σελίδα από την οποία θα ξεκινήσει η εξαγωγή κειμένου. Αυτή η παράμετρος είναι χρήσιμη για έγγραφα πολλαπλών σελίδων. |
| τέλος | int | Καθορίζει τη σελίδα μέχρι την οποία θα ολοκληρωθεί η εξαγωγή κειμένου. Αυτή η παράμετρος είναι χρήσιμη για έγγραφα πολλαπλών σελίδων. |

### Τιμή Επιστροφής

Αντικείμενο JSON
| Πεδίο | Περιγραφή |
| ----- | ----------- |
|  | errorCode | σφάλμα κώδικα (0 χωρίς σφάλμα) |
|  | errorText | σφάλμα κειμένου ("" χωρίς σφάλμα) |
|  | κείμενο | το εξαγόμενο κείμενο |

### Παραδείγματα

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

### Δείτε επίσης

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
