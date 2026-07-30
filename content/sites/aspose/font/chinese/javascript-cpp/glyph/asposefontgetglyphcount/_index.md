---
title: "AsposeFontGetGlyphCount"
second_title: "Aspose.Font 用于 JavaScript，通过 C++"
description: "从字体文件获取信息（元数据）。"
type: docs
url: /zh/javascript-cpp/glyph/asposefontgetglyphcount/
---
## AsposeFontGetGlyphCount function

_获取字体的字形计数._

```js
function AsposeFontGetGlyphCount(
    fileBlob,
    fileName
)
```

| 参数 | 类型 | 描述 |
| --------- | ---- | ----------- |
| fileBlob | Blob 对象 | 用于转换的源字体内容。 |
| fileName | 字符串 | 文件名。 |

### 返回值

JSON 对象
| 字段 | 描述 |
| ----- | ----------- |
|  | errorCode | 错误代码（0 表示无错误） |
|  | errorText | 错误文本（"" 表示无错误） |
|  | glyphCount | 字形计数 |

### 示例

**Web Worker example**:
```js

  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = (evt) => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = (evt) => document.getElementById("output").textContent =
    evt.data == "ready"
      ? "loaded!"
      : evt.data.json.errorCode == 0
      ? "Glyph count: " + evt.data.json.glyphCount
      : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const ffileFontGetGlyphCount = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Get glyph count of font - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontGetGlyphCount', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```

**Simple example**:
```js
  var ffileFontGetGlyphCount = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = AsposeFontGetGlyphCount(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Glyph count: " + json.glyphCount;
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```
