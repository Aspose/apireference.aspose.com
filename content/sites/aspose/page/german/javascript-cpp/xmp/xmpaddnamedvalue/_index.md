---
title: "AsposeXMPAddNamedValue"
second_title: "Aspose.Page für JavaScript über C++"
description: "XMP-Metadaten abrufen"
type: docs
weight: 30
url: /de/javascript-cpp/xmp/xmpaddnamedvalue/
---
## AsposeXMPAddNamedValue function

Fügt einen benannten Wert in eine Struktur ein.

```js
function AsposeXMPAddNamedValue(
    fileBlob, 
    fileName, 
    fileNameResult
)
```

| Parameter | Typ | Beschreibung |
| --------- | ---- | ----------- |
| fileBlob | Blob-Objekt | Inhalt der Quelldatei. |
| fileName | string | Name der Quelldatei. |
| fileNameResult | string | Name der Zieldatei. |


### Rückgabewert

JSON-Objekt
| Feld | Beschreibung |
| ----- | ----------- |
|  | errorCode | Fehlercode (0 kein Fehler) |
|  | errorText | Fehlertext ("" kein Fehler) |
|  | XMP | Array von Metadatenwerten |
|  | fileNameResult | Ergebnisdateiname |

### Beispiele

```js
  var fGetXmpMetadata = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const namedValues = [
        ["xmpTPg:MaxPageSize", [["stDim:newKey", "NewValue"],["stDim:newKey2", "NewValue2"]] ],
        ["xmpTPg:SwatchGroups", [["xmpG:newKey", "NewValue"]] ]
      ];
      const json = AsposeXMPAddNamedValue(event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", namedValues);
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
      const namedValues = [
        ["xmpTPg:MaxPageSize", [["stDim:newKey", "NewValue"],["stDim:newKey2", "NewValue2"]] ],
        ["xmpTPg:SwatchGroups", [["xmpG:newKey", "NewValue"]] ]
      ];
      AsposePageWebWorker.postMessage({ "operation": 'AsposeXMPAddNamedValue', "params": [event.target.result, e.target.files[0].name, e.target.files[0].name + "_out.eps", namedValues] }, [event.target.result]);
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

### Siehe auch

* function [AsposeXMPAddArrayItem](../xmpaddarrayitem/)
