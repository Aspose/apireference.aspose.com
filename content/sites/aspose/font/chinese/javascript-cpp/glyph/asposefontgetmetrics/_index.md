---
title: "FontGetFontMetrics"
second_title: "Aspose.Font 用于 JavaScript，通过 C++"
description: "从字体文件获取信息（元数据）。"
type: docs
url: /zh/javascript-cpp/glyph/asposefontgetmetrics/
---
## FontGetFontMetrics function

_获取字体的字形计数._

```js
function FontGetFontMetrics(
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
|  | 度量 | JSON 对象 |
| * 上升 |
| * 下降 |
| * 行间距 |
| * 最大前进宽度 |
| * 最小左侧间距 |
| * 最小右侧间距 |
| * x最大范围 |

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
      ? JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')
      : `Error: ${evt.data.json.errorText}`;

  /*Event handler*/
  const ffileFontGetMetrics = e => {
    const file_reader = new FileReader();
    file_reader.onload = event => {
      /*Get metrics of font - Ask Web Worker*/
      AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontGetMetrics', "params": [event.target.result, e.target.files[0].name] }, [event.target.result]);
    };
    file_reader.readAsArrayBuffer(e.target.files[0]);
  };
```

**Simple example**:
```js
  var ffileFontGetGlyphCount = function (e) {
    const file_reader = new FileReader();
    file_reader.onload = (event) => {
      const json = FontGetFontMetrics(event.target.result, e.target.files[0].name);
      if (json.errorCode == 0) {
        document.getElementById('output').textContent = "Glyph count: " + json.glyphCount;
      }
      else document.getElementById('output').textContent = json.errorText;
    }
    file_reader.readAsArrayBuffer(e.target.files[0]);
  }
```
