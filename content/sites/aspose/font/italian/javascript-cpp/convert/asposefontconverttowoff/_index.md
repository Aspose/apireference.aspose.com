---
title: "AsposeFontConvertToWOFF"
second_title: "Aspose.Font per JavaScript via C++"
description: "Converte il Font nel formato woff"
type: docs
weight: 10
url: /it/javascript-cpp/convert/asposefontconverttowoff/
---
## AsposeFontConvertToWOFF function

Converte il Font nel formato WOFF.

```js
function AsposeFontConvertToWOFF(
    fileBlob,
    fileName,
    fontType
)
```

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileBlob | Oggetto Blob | Contenuto del font sorgente per la conversione. |
| fileName | stringa | Nome file. |
| fontType | FontType | Tipo di Font da convertire. |

### Valore di ritorno

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | codice errore (0 nessun errore) |
|  | errorText | testo errore (\"\" nessun errore) |
|  | fileNameResult | nome file risultato |

### Esempi

```js
  var fEOT2WOFF = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontConvertToWOFF(event.target.result, e.target.files[0].name, Module.FontType.OTF);
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
  const fOTFtoWOFF = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Convert a OTF fonts to WOFF and save - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontConvertToWOFF', "params": [event.target.result, e.target.files[0].name, 'Module.FontType.OTF'] }, [event.target.result]);
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

### Vedi anche

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
