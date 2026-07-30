---
title: "Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts метод"
linktitle: "MergeFonts"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts метод. Объединяет шрифты на основе переданных списков глифов. Ищет код символа для каждого переданного глифа и добавляет найденный код символа с соответствующим глифом в результирующий новый шрифт в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/
---
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


Объединяет шрифты на основе переданных списков глифов. Ищет код символа для каждого переданного глифа и добавляет найденный код символа с соответствующим глифом в результирующий новый шрифт.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font1Glyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font2Glyphs, System::String newFontName)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font1Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Список глифов из первого шрифта |
| font2Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Список глифов из второго шрифта |
| newFontName | System::String | Желаемое имя результирующего шрифта |

### ReturnValue

Объединённый шрифт

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


Объединяет шрифты на основе переданных списков кодов символов. Чтобы создать желаемый результирующий шрифт, просто передайте коды символов из оригинальных шрифтов, которые вы хотите включить в результирующий шрифт. [Glyphs](../../../aspose.font.glyphs/) связанные с переданными кодами будут найдены автоматически. Например, если вы хотите включить в результирующий шрифт глифы, связанные с буквами A и B из первого шрифта и глифы, связанные с буквами C и D из второго шрифта, просто вызовите этот метод так: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")**

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> font1CharCodes, System::ArrayPtr<uint32_t> font2CharCodes, System::String newFontName)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font1CharCodes | System::ArrayPtr\<uint32_t\> | Коды для извлечения из первого шрифта |
| font2CharCodes | System::ArrayPtr\<uint32_t\> | Коды для извлечения из второго шрифта |
| newFontName | System::String | Желаемое имя результирующего шрифта |

### ReturnValue

Объединённый шрифт

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


Эта версия метода предназначена для случаев, когда вы хотите явно задать коды символов для глифов в результирующем шрифте. Не обязательно, чтобы код для предоставленного глифа был включён в оригинальный шрифт. Смысл переданного кода в том, что он будет связан с соответствующим идентификатором глифа в результирующем шрифте. Поэтому правило обработки каждой пары, передаваемой параметром‑словарём [code, glyph ideitifier], состоит в том, что идентификатор глифа берётся только из оригинального шрифта, а затем связывается с соответствующим кодом в результирующем шрифте. Это может быть полезно, когда некоторые коды из первого шрифта конфликтуют с теми же кодами из второго шрифта.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font1Dict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font2Dict, System::String newFontName)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font1Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Словарь с парами [symbol code, glyph identifier] из первого шрифта |
| font2Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Словарь с парами [symbol code, glyph identifier] из второго шрифта |
| newFontName | System::String | Желаемое имя результирующего шрифта |

### ReturnValue

Объединённый шрифт

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
