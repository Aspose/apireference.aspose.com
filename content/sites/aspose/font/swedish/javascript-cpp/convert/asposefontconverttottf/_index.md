---
title: "AsposeFontConvertToTTF"
second_title: "Aspose.Font för JavaScript via C++"
description: "Konverterar teckensnittet till ttf-format"
type: docs
weight: 10
url: /sv/javascript-cpp/convert/asposefontconverttottf/
---
## AsposeFontConvertToTTF function

Konverterar teckensnittet till TTF-format.

```js
function AsposeFontConvertToTTF(
    fileBlob,
    fileName,
    fontType
)
```

| Parameter | Typ | Beskrivning |
| --------- | ---- | ----------- |
| fileBlob | Blob-objekt | Innehåll i källfont för konvertering. |
| fileName | string | Filnamn. |
| fontType | FontType | Teckensnittstyp att konvertera. |

### Returvärde

JSON‑objekt
| Fält | Beskrivning |
| ----- | ----------- |
|  | errorCode | kodfel (0 inget fel) |
|  | errorText | textfel (\"\" inget fel) |
|  | fileNameResult | resultatfilnamn |

### Exempel

```js
  var fEOT2TTF = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontConvertToTTF(event.target.result, e.target.files[0].name, Module.FontType.OTF);
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
  const fOTFtoTTF = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Convert a OTF fonts to TTF and save - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontConvertToTTF', "params": [event.target.result, e.target.files[0].name, 'Module.FontType.OTF'] }, [event.target.result]);
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

### Se även

* function [AsposeFontConvert](../asposefontconvert/)
* enum [FontType](../../enumerations/fonttype/)
