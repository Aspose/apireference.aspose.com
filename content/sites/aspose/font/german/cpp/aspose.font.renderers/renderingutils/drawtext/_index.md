---
title: "Aspose::Font::Renderers::RenderingUtils::DrawText method"
linktitle: "DrawText"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Renderers::RenderingUtils::DrawText-Methode. Text in BitMap rendern. Ergebnis im PNG-Format als Bytestrom in C++ zurückgeben."
type: docs
weight: 100
url: /de/cpp/aspose.font.renderers/renderingutils/drawtext/
---
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, double) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> glyphIds, double fontSize)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Text dargestellt als Array von Glyph-Identifikatoren |
| fontSize | double | [Font](../../../aspose.font/font/) Größe |

### ReturnValue

Bild im PNG-Format als Bytestrom

## Siehe auch

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


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Text dargestellt als Array von Glyph-Identifikatoren |
| fontSize | double | [Font](../../../aspose.font/font/) Größe |
| lineSpacingType | RenderingUtils::LineSpacingType | Typ des Zeilenabstands. Anzahl der Pixel oder Prozentsatz der Schriftgröße |
| lineSpacingValue | int32_t | Wert des Zeilenabstands |
| maxWidth | int32_t | Maximale Breite in Pixeln für das Bild |

### ReturnValue

Bild im PNG-Format als Bytestrom

## Siehe auch

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


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| Text | System::String | Text |
| fontSize | double | [Font](../../../aspose.font/font/) Größe |

### ReturnValue

Bild im PNG-Format als Bytestrom

## Siehe auch

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


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| Text | System::String | Text |
| fontSize | double | [Font](../../../aspose.font/font/) Größe |
| lineSpacingType | RenderingUtils::LineSpacingType | Typ des Zeilenabstands. Anzahl der Pixel oder Prozentsatz der Schriftgröße |
| lineSpacingValue | int32_t | Wert des Zeilenabstands |
| maxWidth | int32_t | Maximale Breite in Pixeln für das Bild |

### ReturnValue

Bild im PNG-Format als Bytestrom

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Class [String](../../../system/string/)
* Enum [LineSpacingType](../linespacingtype/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
