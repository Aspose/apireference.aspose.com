---
title: "AsposeFontAbout"
second_title: "Aspose.Font для Node.js через C++"
description: "Получить информацию о продукте."
type: docs
url: /ru/nodejs-cpp/misc/AsposeFontAbout/
---

## AsposeFontAbout function

Получить информацию о продукте.

```js
function AsposeFontAbout()
```

### Возвращаемое значение

JSON-объект
| Поле | Описание |
| ----- | ----------- |
| errorCode | код ошибки (0 нет ошибки) |
| errorText | текстовая ошибка (\"\" нет ошибки) |
| продукт | Название продукта |
| версия | Версия продукта |
| islicensed | Продукт лицензирован |


## Пример
**Common js modules**:
```js
const AsposeFont = require('asposefontnodejs');

const font_file = "./fonts/Lora-Regular.ttf";

console.log("Aspose.Font for Node.js via C++ examples.");

AsposeFont().then(AsposeFontModule => {

    json = AsposeFontModule.AsposeFontAbout();
    console.log("AsposeFontAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
});
```
**ECMAScript\ES6 js modules:**:
```js
import AsposeFont from 'asposefontnodejs';

const font_file ="./fonts/arial.ttf";

console.log('Aspose.Font for Node.js via C++ example');

const AsposeFontModule = await AsposeFont();

//AsposeFontAbout - Get info about Product
const json = AsposeFontModule.AsposeFontAbout();
console.log("AsposeFontAbout => %O",  json.errorCode == 0 ? JSON.parse(JSON.stringify(json).replace('"errorCode":0,"errorText":"",','')) : json.errorText);
```
