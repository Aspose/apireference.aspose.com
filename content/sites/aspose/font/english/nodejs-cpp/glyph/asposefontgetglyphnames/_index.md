---
title: "AsposeFontGetGlyphNames"
second_title: Aspose.Font for Node.js via C++
description: "Get info (metadata) from a Font-file."
type: docs
url: /nodejs-cpp/glyph/asposefontgetglyphnames/
---
## AsposeFontGetGlyphNames function

_Get glyph names of font._

```js
function AsposeFontGetGlyphNames(
    fileBlob,
    fileName
)
```

| Parameter | Type | Description |
| --------- | ---- | ----------- |
| fileBlob | Blob object | Content of source font for convert. |
| fileName | string | File name. |

### Return Value

JSON object 
| Field | Description |
| ----- | ----------- |
| errorCode | code error (0 no error)
| errorText | text error ("" no error)
| glyphNames | names of glyphs

### Examples

**Simple example**:
```js
    json = AsposeFontModule.AsposeFontGetGlyphNames(font_file);
    console.log("AsposeFontGetGlyphNames => %O",  json.errorCode == 0 ? "Glyph Names:" + json.glyphNames.join(";") : json.errorText);
```
