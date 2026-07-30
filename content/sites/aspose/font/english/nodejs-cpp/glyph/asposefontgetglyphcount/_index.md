---
title: "AsposeFontGetGlyphCount"
second_title: Aspose.Font for Node.js via C++
description: "Get info (metadata) from a Font-file."
type: docs
url: /nodejs-cpp/glyph/asposefontgetglyphcount/
---
## AsposeFontGetGlyphCount function

_Get glyph count of font._

```js
function AsposeFontGetGlyphCount(
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
| glyphCount | count of glyphs

### Examples

**Simple example**:
```js
    json = AsposeFontModule.AsposeFontGetGlyphCount(font_file);
    console.log("AsposeFontGetGlyphCount => %O",  json.errorCode == 0 ? "Glyph count:" + json.glyphCount : json.errorText);
```
