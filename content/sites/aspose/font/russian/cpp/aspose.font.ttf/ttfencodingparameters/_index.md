---
title: "Aspose::Font::Ttf::TtfEncodingParameters класс"
linktitle: "TtfEncodingParameters"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Ttf::TtfEncodingParameters класс. Представляет параметры кодирования TTF в C++."
type: docs
weight: 500
url: /ru/cpp/aspose.font.ttf/ttfencodingparameters/
---
## TtfEncodingParameters class


Представляет параметры кодировки TTF.

```cpp
class TtfEncodingParameters : public Aspose::Font::IEncodingParameters
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_PlatformId](./get_platformid/)() const | Получает значение PlatformId. |
| [get_PlatformSpecificId](./get_platformspecificid/)() const | Получает значение PlatformSpecificId. |
| [set_PlatformId](./set_platformid/)(uint16_t) | Устанавливает значение PlatformId. |
| [set_PlatformSpecificId](./set_platformspecificid/)(uint16_t) | Устанавливает значение PlatformSpecificId. |
| [TtfEncodingParameters](./ttfencodingparameters/)(uint16_t, uint16_t) | Инициализирует новый экземпляр класса [TtfEncodingParameters](./). Принимает Platform Id, Platform-specific encoding id в качестве параметров. Эти параметры используются для запроса специальной подп таблицы CMap из основной таблицы CMap шрифта, см. таблицы 'CMap', 'name' в спецификации файла OpenType [Font](../../aspose.font/font/). |
## Примечания


Должен использоваться для запроса конкретного кодирования из TTF [Font](../../aspose.font/font/).
## См. также

* Class [IEncodingParameters](../../aspose.font/iencodingparameters/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
