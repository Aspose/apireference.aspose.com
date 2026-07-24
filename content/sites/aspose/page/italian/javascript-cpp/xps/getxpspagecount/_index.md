---
title: "AsposeGetXpsPageCount"
second_title: "Aspose.Page per JavaScript via C++"
description: "Ottieni il numero di pagine nel file XPS"
type: docs
weight: 10
url: /it/javascript-cpp/xps/getxpspagecount/
---
## AsposeGetXpsPageCount function

Ottieni il numero di pagine nel documento xps.

```js
function AsposeGetXpsPageCount(
    fileBlob,
    fileName
)
```

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileBlob | Oggetto Blob | Contenuto del file di origine. |
| fileName | string | Nome del file di origine. |

### Valore di ritorno

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | errore di codice (0 nessun errore) |
|  | errorText | errore di testo (\"\" nessun errore) |
|  | pageCount | numero di pagine |

### Esempi

```js
  var fGetPageCount = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeGetXpsPageCount(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Pages count: " + json.pageCount.toString();
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
      (evt.data.json.errorCode == 0) ? `Number of pages      : ${evt.data.json.pageCount}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fGetPagesCount = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      AsposePageWebWorker.postMessage({ "operation": 'AsposeGetXpsPageCount', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };

```

