---
title: "Metodo Aspose::Font::Renderers::RenderingUtils::DrawText"
linktitle: "DrawText"
second_title: "Aspose.Font per C++"
description: "Metodo Aspose::Font::Renderers::RenderingUtils::DrawText. Rendering del testo in BitMap. Restituisce il risultato in formato PNG come flusso di byte in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.renderers/renderingutils/drawtext/
---
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, double) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> glyphIds, double fontSize)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Testo rappresentato come array di identificatori di glifi |
| fontSize | double | [Font](../../../aspose.font/font/) dimensione |

### ReturnValue

Immagine in formato PNG come flusso di byte

## Vedi anche

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


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Testo rappresentato come array di identificatori di glifi |
| fontSize | double | [Font](../../../aspose.font/font/) dimensione |
| lineSpacingType | RenderingUtils::LineSpacingType | Tipo di interlinea. Numero di pixel o percentuale dell'altezza del font |
| lineSpacingValue | int32_t | Valore dell'interlinea |
| maxWidth | int32_t | Larghezza massima in pixel per l'immagine |

### ReturnValue

Immagine in formato PNG come flusso di byte

## Vedi anche

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


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| testo | System::String | Text |
| fontSize | double | [Font](../../../aspose.font/font/) dimensione |

### ReturnValue

Immagine in formato PNG come flusso di byte

## Vedi anche

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


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Font](../../../aspose.font/font/) |
| testo | System::String | Text |
| fontSize | double | [Font](../../../aspose.font/font/) dimensione |
| lineSpacingType | RenderingUtils::LineSpacingType | Tipo di interlinea. Numero di pixel o percentuale dell'altezza del font |
| lineSpacingValue | int32_t | Valore dell'interlinea |
| maxWidth | int32_t | Larghezza massima in pixel per l'immagine |

### ReturnValue

Immagine in formato PNG come flusso di byte

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Class [String](../../../system/string/)
* Enum [LineSpacingType](../linespacingtype/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
