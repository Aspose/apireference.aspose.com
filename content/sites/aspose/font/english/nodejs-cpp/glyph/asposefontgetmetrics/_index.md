---
title: "AsposeFontGetMetrics"
second_title: Aspose.Font for Node.js via C++
description: "Get info (metadata) from a Font-file."
type: docs
url: /nodejs-cpp/glyph/asposefontgetmetrics/
---
## FontGetFontMetrics function

_Get glyph count of font._

```js
function AsposeFontGetMetrics(
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
| metrics | JSON object
| * ascent |
| * descent |
| * lineGap |
| * advanceWidthMax |
| * minLeftSideBearing |
| * minRightSideBearing |
| * xMaxExtent |

### Examples

*Simple example**:
```js
    const json = AsposeFontModule.AsposeFontGetMetrics(font_file);
    console.log("AsposeFontGetMetrics => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
```

