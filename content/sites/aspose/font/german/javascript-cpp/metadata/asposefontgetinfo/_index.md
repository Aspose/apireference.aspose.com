---
title: "AsposeFontGetInfo"
second_title: "Aspose.Font für JavaScript über C++"
description: "Lese Informationen (Metadaten) aus einer Schriftdatei."
type: docs
url: /de/javascript-cpp/metadata/asposefontgetinfo/
---
## AsposeFontGetInfo function

_Informationen (Metadaten) aus einer Schriftdatei abrufen._

```js
function AsposeFontGetInfo(
    fileBlob,
    fileName
)
```

| Parameter | Typ | Beschreibung |
| --------- | ---- | ----------- |
| fileBlob | Blob-Objekt | Inhalt der Quellschrift für die Konvertierung. |
| fileName | string | Dateiname. |

### Rückgabewert

JSON-Objekt
| Feld | Beschreibung |
| ----- | ----------- |
|  | errorCode | Fehlercode (0 kein Fehler) |
|  | errorText | Fehlertext ("" kein Fehler) |
|  | Datensätze | Array von JSON-Objekten : |
|  | * NameId | Namensbezeichner |
|  | * PlatformId | Plattformbezeichner |
|  | * PlatformSpecificId | plattform-spezifischer Bezeichner |
|  | * LanguageId | Sprachbezeichner |
|  | * Info | Inhalt des Namensdatensatzes |

### Beispiele

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = (evt) => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = (evt) => document.getElementById("output").textContent =
    evt.data == "ready"
      ? "loaded!"
      : evt.data.json.errorCode == 0
      ? "Name records count: " + evt.data.json.records.length + 
                                            evt.data.json.records.reduce((ret, a) => ret +
                                            "\nNameId : " + a.NameId
                                          + "; PlatformId : " + a.PlatformId
                                          + "; PlatformSpecificId : " + a.PlatformSpecificId
                                          + "; LanguageId : " + a.LanguageId
                                          + "; Info : " + a.Info,"")
      : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const ffileFontGetInfo = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Get info (metadata) from a Font-file - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontGetInfo', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```
**Simple example**:
```js
  var ffileFontGetInfo = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontGetInfo(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Name records count: " + json.records.length;
        for (let recordIndex = 0; recordIndex < json.records.length; recordIndex++) 
			document.getElementById('output').textContent += " " + "\n"
                                                         + "NameId : " + json.records[recordIndex].NameId
                                                         + ";  PlatformId : " + json.records[recordIndex].PlatformId
                                                         + ";  PlatformSpecificId : " + json.records[recordIndex].PlatformSpecificId
                                                         + ";  LanguageId : " + json.records[recordIndex].LanguageId
                                                         + ";  Info : " + json.records[recordIndex].Info;
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```
