---
title: "AsposePSExtractText"
second_title: "Aspose.Page para JavaScript vía C++"
description: "Extraer texto del archivo PS"
type: docs
weight: 10
url: /es/javascript-cpp/ps/psextracttext/
---
## AsposePSExtractText function

Extraer texto del archivo PS. El texto solo puede extraerse si está escrito con una fuente Type 42 (TrueType) o una fuente Type 0 con fuentes Type 42 en su Vector Map.

```js
function AsposePSExtractText(
    fileBlob,
    fileName, 
    start,
    end
)
```

| Parámetro | Tipo | Descripción |
| --------- | ---- | ----------- |
| fileBlob | Objeto Blob | Contenido del archivo fuente. |
| fileName | cadena | Nombre del archivo fuente. |
| inicio | int | Especifica la página desde la cual comenzar a extraer texto. Este parámetro es útil para documentos multipágina. |
| fin | int | Especifica la página hasta la cual terminar de extraer texto. Este parámetro es útil para documentos multipágina. |

### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
|  | errorCode | código de error (0 sin error) |
|  | errorText | texto de error ("" sin error) |
|  | texto | el texto extraído |

### Ejemplos

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

### Ver también

* function [AsposePSGetBoundingBox](../psgetboundingbox/)
