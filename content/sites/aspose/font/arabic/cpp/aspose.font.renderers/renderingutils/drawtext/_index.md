---
title: "طريقة Aspose::Font::Renderers::RenderingUtils::DrawText"
linktitle: "DrawText"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Renderers::RenderingUtils::DrawText. عرض النص في BitMap. إرجاع النتيجة بصيغة PNG كتيار من البايتات في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.renderers/renderingutils/drawtext/
---
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, double) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> glyphIds, double fontSize)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [الخط](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | النص ممثل كمصفوفة من معرفات glyph |
| fontSize | double | [الخط](../../../aspose.font/font/) الحجم |

### ReturnValue

صورة بصيغة PNG كتيار من البايتات

## انظر أيضًا

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


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [الخط](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | النص ممثل كمصفوفة من معرفات glyph |
| fontSize | double | [الخط](../../../aspose.font/font/) الحجم |
| lineSpacingType | RenderingUtils::LineSpacingType | نوع تباعد الأسطر. عدد البكسلات أو نسبة من ارتفاع الخط |
| lineSpacingValue | int32_t | قيمة تباعد الأسطر |
| maxWidth | int32_t | العرض الأقصى بالبكسلات للصورة |

### ReturnValue

صورة بصيغة PNG كتيار من البايتات

## انظر أيضًا

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


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [الخط](../../../aspose.font/font/) |
| نص | System::String | Text |
| fontSize | double | [الخط](../../../aspose.font/font/) الحجم |

### ReturnValue

صورة بصيغة PNG كتيار من البايتات

## انظر أيضًا

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


| معامل | نوع | الوصف |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [الخط](../../../aspose.font/font/) |
| نص | System::String | Text |
| fontSize | double | [الخط](../../../aspose.font/font/) الحجم |
| lineSpacingType | RenderingUtils::LineSpacingType | نوع تباعد الأسطر. عدد البكسلات أو نسبة من ارتفاع الخط |
| lineSpacingValue | int32_t | قيمة تباعد الأسطر |
| maxWidth | int32_t | العرض الأقصى بالبكسلات للصورة |

### ReturnValue

صورة بصيغة PNG كتيار من البايتات

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Class [String](../../../system/string/)
* Enum [LineSpacingType](../linespacingtype/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
