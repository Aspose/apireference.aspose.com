---
title: "AsposeFontSetInfo"
second_title: "Aspose.Font para JavaScript vía C++"
description: "Establecer información (metadatos) en un archivo de fuente."
type: docs
url: /es/javascript-cpp/metadata/asposefontsetinfo/
---
## AsposeFontSetInfo function

_Establecer información (metadatos) en un archivo de fuente._

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

| Parámetro | Tipo | Descripción |
| --------- | ---- | ----------- |
| fileBlob | Objeto Blob | Contenido de la fuente de origen para convertir. |
| fileName | string | Nombre de archivo. |
| nameId | TtfNameTableNameId | Identificador de nombre, categoría lógica de cadena, especificado por la enumeración [`NameId`](../../enumerations/ttfnametablenameid/) |
|  | platformId | TtfNameTablePlatformId | Identificador de plataforma |
| platformSpecificId | int | Identificador de codificación específico de la plataforma. Por favor, use un valor de una de estas enumeraciones - [`UnicodePlatformSpecificId`](../../enumerations/ttfnametableunicodeplatformspecificid/), [`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid/), [`MSPlatformSpecificId`](../../enumerations/ttfnametablemsplatformspecificid/). La enumeración a usar se define por el contexto (parámetro *platformId*) |
| languageId | int | Identificador de idioma. Por favor, use un valor de las enumeraciones [`MSLanguageId`](../../enumerations/ttfnametablemslanguageid/) o [`MacLanguageId`](../../enumerations/ttfnametablemaclanguageid/). Las enumeraciones dependen del contexto, definido por el parámetro *platformId*. |
|  | texto | string | Datos de cadena reales |

### Valor de retorno

Objeto JSON
| Campo | Descripción |
| ----- | ----------- |
|  | errorCode | código de error (0 sin error) |
|  | errorText | texto de error ("" sin error) |
|  | fileNameResult | nombre de archivo resultante |

### Ejemplos

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

### Ver también

* enum [TtfNameTableNameId](../../enumerations/ttfnametablenameid/)
* enum [TtfNameTablePlatformId](../../enumerations/ttfnametableplatformid/)
* enum [TtfNameTableMacPlatformSpecificId](../../enumerations/ttfnametablemacplatformspecificid/)
* enum [TtfNameTableMSPlatformSpecificId](../../enumerations/ttfnametablemsplatformspecificid/)
* enum [TtfNameTableUnicodePlatformSpecificId](../../enumerations/ttfnametableunicodeplatformspecificid/)
* enum [TtfNameTableMacLanguageId](../../enumerations/ttfnametablemaclanguageid/)
* enum [TtfNameTableMSLanguageId](../../enumerations/ttfnametablemslanguageid/)
