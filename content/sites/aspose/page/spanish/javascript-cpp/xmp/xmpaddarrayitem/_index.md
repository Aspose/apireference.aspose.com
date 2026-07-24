---
title: "AsposeXMPAddArrayItem"
second_title: "Aspose.Page para JavaScript vía C++"
description: "Obtener metadatos XMP"
type: docs
weight: 20
url: /es/javascript-cpp/xmp/xmpaddarrayitem/
---
## AsposeXMPAddArrayItem function

Agrega un valor a una matriz. El valor se añadirá al final de la matriz.

```js
function AsposeXMPAddArrayItem(
    fileBlob, 
    fileName, 
    fileNameResult
)
```

| Parámetro | Tipo | Descripción |
| --------- | ---- | ----------- |
| fileBlob | Objeto Blob | Contenido del archivo fuente. |
| fileName | cadena | Nombre del archivo fuente. |
| fileNameResult | cadena | Nombre del archivo resultante. |


### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
|  | errorCode | código de error (0 sin error) |
|  | errorText | texto de error ("" sin error) |
|  | XMP | matriz de valores de metadatos |
|  | fileNameResult | nombre del archivo de resultado |

### Ejemplos

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

### Ver también

* function [AsposeXMPAddNamespace](../xmpaddarrayitem/)
* function [AsposeXMPAddNamedValue](../xmpaddnamedvalue/)
