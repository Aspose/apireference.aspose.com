---
title: "Класс Aspose::Font::TextUtils::IFontMorseEncoder"
linktitle: "IFontMorseEncoder"
second_title: "Aspose.Font для C++"
description: "Класс Aspose::Font::TextUtils::IFontMorseEncoder. Объявляет функциональность для кодирования текста азбукой Морзе и получения результата в виде глифов шрифта в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.textutils/ifontmorseencoder/
---
## IFontMorseEncoder class


Объявляет функциональность для кодирования текста в код Морзе и получения результата в виде глифов шрифта.

```cpp
class IFontMorseEncoder : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) | Кодирует текст азбукой Морзе и возвращает результат в виде набора глифов (идентификаторы глифов). |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) | Кодирует текст азбукой Морзе и возвращает результат в виде набора глифов (glyphId). Для расчёта алфавита входного текста используется эвристический анализ. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) | Кодирует текст азбукой Морзе и рисует результат в формате PNG. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) | Кодирует текст азбукой Морзе и рисует результат в формате PNG. Для расчёта алфавита входного текста используется эвристический анализ. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TextUtils](../)
* Library [Aspose.Font for C++](../../)
