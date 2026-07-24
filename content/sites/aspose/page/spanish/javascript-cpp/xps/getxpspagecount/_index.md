---
title: "AsposeGetXpsPageCount"
second_title: "Aspose.Page para JavaScript vía C++"
description: "Obtener el número de páginas en el archivo XPS"
type: docs
weight: 10
url: /es/javascript-cpp/xps/getxpspagecount/
---
## AsposeGetXpsPageCount function

Obtener el número de páginas en el xps-documento.

```js
function AsposeGetXpsPageCount(
    fileBlob,
    fileName
)
```

| Parámetro | Tipo | Descripción |
| --------- | ---- | ----------- |
| fileBlob | Objeto Blob | Contenido del archivo fuente. |
| fileName | cadena | Nombre del archivo fuente. |

### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
|  | errorCode | código de error (0 sin error) |
|  | errorText | texto de error ("" sin error) |
|  | pageCount | número de páginas |

### Ejemplos

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

