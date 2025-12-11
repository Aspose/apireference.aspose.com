---
title: Aspose::Font::Renderers::RenderingUtils::DrawText method
linktitle: DrawText
second_title: Aspose.Font for C++
description: 'Aspose::Font::Renderers::RenderingUtils::DrawText method. Rendering text in BitMap. Return result in PNG-format as stream of bytes in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.renderers/renderingutils/drawtext/
---
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, double) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> glyphIds, double fontSize)
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Text represented as array of glyph identifiers |
| fontSize | double | [Font](../../../aspose.font/font/) size |

### ReturnValue

Image in PNG format as stream of bytes

## See Also

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


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Text represented as array of glyph identifiers |
| fontSize | double | [Font](../../../aspose.font/font/) size |
| lineSpacingType | RenderingUtils::LineSpacingType | Type of line spacing. Number of pixels or percent of font height |
| lineSpacingValue | int32_t | Value of line spacing |
| maxWidth | int32_t | Max width in pixels for image |

### ReturnValue

Image in PNG format as stream of bytes

## See Also

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


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| text | System::String | Text |
| fontSize | double | [Font](../../../aspose.font/font/) size |

### ReturnValue

Image in PNG format as stream of bytes

## See Also

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


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| text | System::String | Text |
| fontSize | double | [Font](../../../aspose.font/font/) size |
| lineSpacingType | RenderingUtils::LineSpacingType | Type of line spacing. Number of pixels or percent of font height |
| lineSpacingValue | int32_t | Value of line spacing |
| maxWidth | int32_t | Max width in pixels for image |

### ReturnValue

Image in PNG format as stream of bytes

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Class [String](../../../system/string/)
* Enum [LineSpacingType](../linespacingtype/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
