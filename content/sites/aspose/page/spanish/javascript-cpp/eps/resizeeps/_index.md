---
title: "AsposeResizeEPS"
second_title: "Aspose.Page para JavaScript vía C++"
description: "Redimensionar EPS"
type: docs
weight: 10
url: /es/javascript-cpp/eps/resizeeps/
---
## AsposeResizeEPS function

Redimensiona el archivo EPS. Guarda el archivo EPS inicial con el %%BoundingBox existente actualizado o se creará uno nuevo.

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

| Parámetro | Tipo | Descripción |
| --------- | ---- | ----------- |
| fileBlob | Objeto Blob | Contenido del archivo fuente. |
| fileName | cadena | Nombre del archivo fuente. |
| fileNameResult | cadena | Nombre del archivo resultante. |
| ancho | flotante | Especifica el ancho del nuevo cuadro delimitador. |
| alto | flotante | Especifica el alto del nuevo cuadro delimitador. |
| unidad | Module.Units | Especifica el tipo de nuevo tamaño. |

### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
|  | errorCode | código de error (0 sin error) |
|  | errorText | texto de error ("" sin error) |
|  | fileNameResult | nombre del archivo de resultado |

### Ejemplos

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

### Ver también

* function [Module.Units](../../enumerations/units/)
* function [AsposeCropEps](../cropeps/)
