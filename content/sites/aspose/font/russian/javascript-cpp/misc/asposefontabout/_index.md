---
title: "AsposeFontAbout"
second_title: "Aspose.Font для JavaScript через C++"
description: "Получить информацию о продукте."
type: docs
url: /ru/javascript-cpp/misc/asposefontabout/
---

## AsposeFontAbout function

Получить информацию о продукте.

```js
function AsposeFontAbout()
```

### Возвращаемое значение

Объект JSON
| Поле | Описание |
| ----- | ----------- |
| errorCode | код ошибки (0 — нет ошибки) |
| errorText | текст ошибки ("" — нет ошибки) |
| продукт | Название продукта |
| версия | Версия продукта |
| islicensed | Продукт лицензирован |


**Web Worker example**:
```js
  /*Create Web Worker*/
  const AsposeFontWebWorker = new Worker("AsposeFontforJS.js");
  AsposeFontWebWorker.onerror = evt => console.log(`Error from Web Worker: ${evt.message}`);
  AsposeFontWebWorker.onmessage = evt => document.getElementById('output').textContent = 
    (evt.data == 'ready') ? 'loaded!' :
      (evt.data.json.errorCode !== 0) ? `Error: ${evt.data.json.errorText}` :
                        "Product      : " + evt.data.json.product
                    + "\nVersion      : " + evt.data.json.version
                    + "\nIs licensed  : " + evt.data.json.islicensed;

  /*Event handler*/
  const onAsposeFontAbout = e => {
    /*Get info about Product - Ask Web Worker*/
    AsposeFontWebWorker.postMessage({ "operation": 'AsposeFontAbout', "params": [] }, []);
  };
```
**Simple example**:
```js
  var onAsposeFontAbout = function () {
    /*Get info about Product*/
    const json = AsposeFontAbout();
    if (json.errorCode == 0) document.getElementById('output').textContent = "Product      : " + json.product
                                                                         + "\nVersion      : " + json.version
                                                                         + "\nIs licensed  : " + json.islicensed;
    else document.getElementById('output').textContent = json.errorText;
  }
```
