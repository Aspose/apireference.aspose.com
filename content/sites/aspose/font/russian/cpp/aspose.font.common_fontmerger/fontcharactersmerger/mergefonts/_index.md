---
title: "Метод Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts"
linktitle: "MergeFonts"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts. Объединяет шрифты на основе переданных списков глифов. Ищет код символа для каждого переданного глифа и добавляет найденный код символа вместе с соответствующим глифом в результирующий новый шрифт в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/
---
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


Объединяет шрифты на основе переданных списков глифов. Ищет код символа для каждого переданного глифа и добавляет найденный код символа с соответствующим глифом в результирующий новый шрифт.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> primaryFontGlyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> secondaryFontGlyphs, System::String newFontName)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| primaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Список глифов, которые нужно взять из основного шрифта |
| secondaryFontGlyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Список глифов, которые нужно взять из вторичного шрифта |
| newFontName | System::String | Желаемое имя результирующего шрифта |

### ReturnValue

Объединённый шрифт

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


Объединяет шрифты на основе переданных списков кодов символов. Чтобы создать желаемый результирующий шрифт, просто передайте коды символов из оригинальных шрифтов, которые вы хотите включить в результирующий шрифт. [Glyphs](../../../aspose.font.glyphs/) связанные с переданными кодами будут найдены автоматически. Например, если вы хотите включить в результирующий шрифт глифы, связанные с буквами A и B из первого шрифта и глифы, связанные с буквами C и D из второго шрифта, просто вызовите этот метод так: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")**

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> primaryFontCharCodes, System::ArrayPtr<uint32_t> secondaryFontCharCodes, System::String newFontName)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| primaryFontCharCodes | System::ArrayPtr\<uint32_t\> | Коды, которые нужно взять из основного шрифта |
| secondaryFontCharCodes | System::ArrayPtr\<uint32_t\> | Коды, которые нужно взять из вторичного шрифта |
| newFontName | System::String | Желаемое имя результирующего шрифта |

### ReturnValue

Объединённый шрифт

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
## FontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


Эта версия метода предназначена для случаев, когда вы хотите явно задать коды символов для глифов в результирующем шрифте. Не обязательно, чтобы код для предоставленного глифа был включён в оригинальный шрифт. Смысл переданного кода в том, что он будет связан с соответствующим идентификатором глифа в результирующем шрифте. Поэтому правило обработки каждой пары, передаваемой параметром‑словарём [code, glyph ideitifier], состоит в том, что идентификатор глифа берётся только из оригинального шрифта, а затем связывается с соответствующим кодом в результирующем шрифте. Это может быть полезно, когда некоторые коды из первого шрифта конфликтуют с теми же кодами из второго шрифта.

```cpp
virtual System::SharedPtr<Font> Aspose::Font::Common_FontMerger::FontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> primaryFontDict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> secondaryFontDict, System::String newFontName)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| primaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Словарь с парами [код символа, идентификатор глифа] из основного шрифта |
| secondaryFontDict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Словарь с парами [код символа, идентификатор глифа] из вторичного шрифта |
| newFontName | System::String | Желаемое имя результирующего шрифта |

### ReturnValue

Объединённый шрифт

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../aspose.font/font/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [FontCharactersMerger](../)
* Namespace [Aspose::Font::Common_FontMerger](../../)
* Library [Aspose.Font for C++](../../../)
