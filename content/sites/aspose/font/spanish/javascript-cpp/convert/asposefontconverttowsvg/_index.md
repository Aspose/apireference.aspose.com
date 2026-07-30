---
title: "AsposeFontConvertToSVG"
second_title: "Aspose.Font para JavaScript vía C++"
description: "Convierte la fuente al formato svg"
type: docs
weight: 10
url: /es/javascript-cpp/convert/asposefontconverttosvg/
---
## AsposeFontConvertToSVG function

Convierte la fuente al formato SVG.

```js
function AsposeFontConvertToSVG(
    fileBlob,
    fileName,
    fontType
)
```

| Parámetro | Tipo | Descripción |
| --------- | ---- | ----------- |
| fileBlob | Objeto Blob | Contenido de la fuente de origen para convertir. |
| fileName | string | Nombre de archivo. |
| fontType | FontType | Tipo de fuente a convertir. |

### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
|  | errorCode | código de error (0 sin error) |
|  | errorText | texto de error ("" sin error) |
|  | fileNameResult | nombre de archivo resultante |

### Ejemplos

```js
  var fEOT2SVG = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontConvertToSVG(event.target.result, e.target.files[0].name, Module.FontType.OTF);
      if (json.errorCode == 0) document.getElementById('output').textContent = json.fileNameResult;
      else document.getElementById('output').textContent = json.errorText;
      DownloadFile(json.fileNameResult, "font/ttf");
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'library loaded!' :
      (evt.data.json.errorCode == 0) ? `Result:\n${DownloadFile(evt.data.json.fileNameResult, "font/ttf", evt.data.params[0])}` : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const fOTFtoSVG = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Convert a OTF fonts to SVG and save - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontConvertToSVG', "params": [event.target.result, e.target.files[0].name, 'Module.FontType.OTF'] }, [event.target.result]);
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

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
