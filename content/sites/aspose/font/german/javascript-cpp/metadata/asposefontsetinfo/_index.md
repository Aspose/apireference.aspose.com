---
title: "AsposeFontSetInfo"
second_title: "Aspose.Font für JavaScript über C++"
description: "Informationen (Metadaten) in eine Font-Datei setzen."
type: docs
url: /de/javascript-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_Setze Informationen (Metadaten) in eine Font-Datei._

```js
function AsposeFontSetInfo(
    fileBlob,
    fileName,
    nameId, 
    platformId, 
    platformSpecificId, 
    languageId, 
    text
)
```

| Parameter | Typ | Beschreibung |
| --------- | ---- | ----------- |
| fileBlob | Blob-Objekt | Inhalt der Quellschrift für die Konvertierung. |
| fileName | string | Dateiname. |
| nameId | TtfNameTableNameId | Namensbezeichner, logische Zeichenkettenkategorie, angegeben durch die [`NameId`](../../enumerations/ttfnametablenameid/) Aufzählung |
|  | platformId | TtfNameTablePlatformId | Plattformbezeichner |
| platformSpecificId | int | Plattform-spezifischer Codierungsbezeichner. Bitte verwenden Sie einen Wert aus einer der folgenden Aufzählungen – [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/), [`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/), [`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/). Welche Aufzählung zu verwenden ist, wird durch den Kontext (*platformId* Parameter) definiert. |
| languageId | int | Sprachbezeichner. Bitte verwenden Sie einen Wert aus der [`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/) oder [`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/) Aufzählung, abhängig vom Kontext, definiert durch den *platformId* Parameter. |
|  | text | string | Tatsächliche Zeichenkettendaten |

### Rückgabewert

JSON-Objekt
| Feld | Beschreibung |
| ----- | ----------- |
|  | errorCode | Fehlercode (0 kein Fehler) |
|  | errorText | Fehlertext ("" kein Fehler) |
|  | fileNameResult | Ergebnisdateiname |

### Beispiele

**Web Worker example**:
```js
  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = (evt) => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = (evt) => document.getElementById("output").textContent =
    (evt.data == 'ready') ? 'library loaded!' :
    (evt.data.json.errorCode == 0) ? `Result:\n${DownloadFile(evt.data.json.fileNameResult, "font/ttf", evt.data.params[0])}` : `Error: ${evt.data.json.errorText}`;
 
 /*Event handler*/
  const ffileFontSetInfo = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
          const nameId = 'Module.TtfNameTableNameId.' + document.getElementById("NameId").value;
          //Value will be changed for PlatformId = PlatformId.Microsoft, PlatformSpecificId = MSPlatformSpecificId.Unicode_BMP_UCS2 (1) and languageID = 1033 (English_United_States = 0x0409)
          const platformId = 'Module.TtfNameTablePlatformId.Microsoft';
          const platformSpecificId = 'Module.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2';
          const langID = 'Module.TtfNameTableMSLanguageId.English_United_States';
          const text = document.getElementById("textValue").value;
          transfer = [event.target.result];
          params = [event.target.result, e.target.files[0].name, nameId, platformId, platformSpecificId, langID, text];
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontSetInfo', "params": params }, transfer);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```
**Simple example**:
```js
  var fFontSetInfo = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {

      const nameId = new Function("return Module.TtfNameTableNameId." + document.getElementById("NameId").value)();
      const platformId = Module.TtfNameTablePlatformId.Microsoft;
      const platformSpecificId = Module.TtfNameTableMSPlatformSpecificId.Unicode_BMP_UCS2.value;
      const text = document.getElementById("textValue").value;
      const langID = 1033;

      const json = AsposeFontSetInfo(blob, file.name, nameId, platformId, platformSpecificId, langID, text);
      if (json.errorCode == 0) {
        DownloadFile(json.fileNameResult);
        //DownloadFile(file.name);
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(file);
  }
```

### Siehe auch

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
