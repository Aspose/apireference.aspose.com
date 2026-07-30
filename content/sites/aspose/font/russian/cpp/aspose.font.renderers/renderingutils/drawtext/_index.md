---
title: "Метод Aspose::Font::Renderers::DrawText"
linktitle: "DrawText"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::Renderers::RenderingUtils::DrawText. Рендеринг текста в BitMap. Возврат результата в формате PNG в виде потока байтов в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.renderers/renderingutils/drawtext/
---
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, double) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> glyphIds, double fontSize)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Текст, представленный в виде массива идентификаторов глифов |
| fontSize | double | [Font](../../../aspose.font/font/) размер |

### ReturnValue

Изображение в формате PNG в виде потока байтов

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, double, RenderingUtils::LineSpacingType, int32_t, int32_t) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> glyphIds, double fontSize, RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Текст, представленный в виде массива идентификаторов глифов |
| fontSize | double | [Font](../../../aspose.font/font/) размер |
| lineSpacingType | RenderingUtils::LineSpacingType | Тип межстрочного интервала. Количество пикселей или процент от высоты шрифта |
| lineSpacingValue | int32_t | Значение межстрочного интервала |
| maxWidth | int32_t | Максимальная ширина в пикселях для изображения |

### ReturnValue

Изображение в формате PNG в виде потока байтов

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Enum [LineSpacingType](../linespacingtype/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::String, double) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::String text, double fontSize)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| текст | System::String | Text |
| fontSize | double | [Font](../../../aspose.font/font/) размер |

### ReturnValue

Изображение в формате PNG в виде потока байтов

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Class [String](../../../system/string/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::String, double, RenderingUtils::LineSpacingType, int32_t, int32_t) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::String text, double fontSize, RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| текст | System::String | Text |
| fontSize | double | [Font](../../../aspose.font/font/) размер |
| lineSpacingType | RenderingUtils::LineSpacingType | Тип межстрочного интервала. Количество пикселей или процент от высоты шрифта |
| lineSpacingValue | int32_t | Значение межстрочного интервала |
| maxWidth | int32_t | Максимальная ширина в пикселях для изображения |

### ReturnValue

Изображение в формате PNG в виде потока байтов

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Class [String](../../../system/string/)
* Enum [LineSpacingType](../linespacingtype/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
