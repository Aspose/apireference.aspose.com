---
title: "AsposeFontSetInfo"
second_title: "Aspose.Font per JavaScript via C++"
description: "Imposta le informazioni (metadati) in un file Font."
type: docs
url: /it/javascript-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_Imposta le informazioni (metadati) in un file Font._

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

| Parametro | Tipo | Descrizione |
| --------- | ---- | ----------- |
| fileBlob | Oggetto Blob | Contenuto del font sorgente per la conversione. |
| fileName | stringa | Nome file. |
| nameId | TtfNameTableNameId | Identificatore del nome, categoria logica della stringa, specificato dall'enumerazione [`NameId`](../../enumerations/ttfnametablenameid/) |
|  | platformId | TtfNameTablePlatformId | Identificatore della piattaforma |
| platformSpecificId | int | Identificatore della codifica specifica della piattaforma. Si prega di utilizzare un valore da una di queste enumerazioni - [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/), [`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/), [`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/). L'enumerazione da utilizzare è definita dal contesto (parametro *platformId*) |
| languageId | int | Identificatore della lingua. Si prega di utilizzare un valore dalle enumerazioni [`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/) o [`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/). Le enumerazioni dipendono dal contesto, definito dal parametro *platformId*. |
|  | testo | stringa | Dati della stringa effettivi |

### Valore di ritorno

oggetto JSON
| Campo | Descrizione |
| ----- | ----------- |
|  | errorCode | codice errore (0 nessun errore) |
|  | errorText | testo errore (\"\" nessun errore) |
|  | fileNameResult | nome file risultato |

### Esempi

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

### Vedi anche

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
