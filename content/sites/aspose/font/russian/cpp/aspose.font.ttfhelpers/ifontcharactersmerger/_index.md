---
title: "Aspose::Font::TtfHelpers::IFontCharactersMerger класс"
linktitle: "IFontCharactersMerger"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfHelpers::IFontCharactersMerger класс. Объявляет вспомогательные функции для объединения шрифтов TrueType. Шрифт, переданный параметром font1, считается первичным. Это означает, что многие характеристики, связанные с конечным объединённым шрифтом, такие как метрики, структура кодировки и другие, будут взяты из этого первичного шрифта в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.ttfhelpers/ifontcharactersmerger/
---
## IFontCharactersMerger class


Объявляет вспомогательные функции для объединения шрифтов TrueType. [Font](../../aspose.font/font/) который передаётся параметром font1 считается первичным. Это означает, что многие характеристики, связанные с конечным объединённым шрифтом, такие как метрики, структура кодировки и другие, будут взяты из этого первичного шрифта.

```cpp
class IFontCharactersMerger : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) | Объединяет шрифты на основе переданных списков глифов. Ищет код символа для каждого переданного глифа и добавляет найденный код символа с соответствующим глифом в результирующий новый шрифт. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) | Объединяет шрифты на основе переданных списков кодов символов. Чтобы создать желаемый результирующий шрифт, просто передайте коды символов из оригинальных шрифтов, которые вы хотите включить в результирующий шрифт. [Glyphs](../../aspose.font.glyphs/) связанные с переданными кодами будут найдены автоматически. Например, если вы хотите включить в результирующий шрифт глифы, связанные с буквами A и B из первого шрифта и глифы, связанные с буквами C и D из второго шрифта, просто вызовите этот метод так: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")** |
| virtual [MergeFonts](./mergefonts/)(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) | Эта версия метода предназначена для случаев, когда вы хотите явно задать коды символов для глифов в результирующем шрифте. Не обязательно, чтобы код для предоставленного глифа был включён в оригинальный шрифт. Смысл переданного кода в том, что он будет связан с соответствующим идентификатором глифа в результирующем шрифте. Поэтому правило обработки каждой пары, передаваемой параметром‑словарём [code, glyph ideitifier], состоит в том, что идентификатор глифа берётся только из оригинального шрифта, а затем связывается с соответствующим кодом в результирующем шрифте. Это может быть полезно, когда некоторые коды из первого шрифта конфликтуют с теми же кодами из второго шрифта. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TtfHelpers](../)
* Library [Aspose.Font for C++](../../)
