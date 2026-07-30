---
title: "Aspose::Font::Renderers::RenderingUtils::DrawText yöntemi"
linktitle: "DrawText"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Renderers::RenderingUtils::DrawText yöntemi. BitMap içinde metin renderleme. Sonucu PNG formatında bayt akışı olarak C++'ta döndür."
type: docs
weight: 100
url: /tr/cpp/aspose.font.renderers/renderingutils/drawtext/
---
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, double) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> glyphIds, double fontSize)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Yazı Tipi](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Metin, glif tanımlayıcılarının bir dizisi olarak temsil edilir |
| fontSize | double | [Yazı Tipi](../../../aspose.font/font/) boyutu |

### ReturnValue

PNG formatında bayt akışı olarak görüntü

## Ayrıca Bakınız

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


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Yazı Tipi](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Metin, glif tanımlayıcılarının bir dizisi olarak temsil edilir |
| fontSize | double | [Yazı Tipi](../../../aspose.font/font/) boyutu |
| lineSpacingType | RenderingUtils::LineSpacingType | Satır aralığı türü. Piksel sayısı veya yazı tipi yüksekliğinin yüzdesi |
| lineSpacingValue | int32_t | Satır aralığının değeri |
| maxWidth | int32_t | Görüntü için piksel cinsinden maksimum genişlik |

### ReturnValue

PNG formatında bayt akışı olarak görüntü

## Ayrıca Bakınız

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


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Yazı Tipi](../../../aspose.font/font/) |
| metin | System::String | Text |
| fontSize | double | [Yazı Tipi](../../../aspose.font/font/) boyutu |

### ReturnValue

PNG formatında bayt akışı olarak görüntü

## Ayrıca Bakınız

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


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Yazı Tipi](../../../aspose.font/font/) |
| metin | System::String | Text |
| fontSize | double | [Yazı Tipi](../../../aspose.font/font/) boyutu |
| lineSpacingType | RenderingUtils::LineSpacingType | Satır aralığı türü. Piksel sayısı veya yazı tipi yüksekliğinin yüzdesi |
| lineSpacingValue | int32_t | Satır aralığının değeri |
| maxWidth | int32_t | Görüntü için piksel cinsinden maksimum genişlik |

### ReturnValue

PNG formatında bayt akışı olarak görüntü

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Class [String](../../../system/string/)
* Enum [LineSpacingType](../linespacingtype/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
