---
title: "Méthode Aspose::Font::Renderers::RenderingUtils::DrawText"
linktitle: "DrawText"
second_title: "Aspose.Font pour C++"
description: "Méthode Aspose::Font::Renderers::RenderingUtils::DrawText. Rendu du texte dans BitMap. Retourner le résultat au format PNG sous forme de flux d'octets en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.renderers/renderingutils/drawtext/
---
## RenderingUtils::DrawText(System::SharedPtr\<Font\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, double) method


[Rendering](../../../aspose.font.rendering/) text in BitMap. Return result in PNG-format as stream of bytes.

```cpp
static System::SharedPtr<System::IO::Stream> Aspose::Font::Renderers::RenderingUtils::DrawText(System::SharedPtr<Font> font, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> glyphIds, double fontSize)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Police](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Texte représenté sous forme de tableau d'identifiants de glyphes |
| fontSize | double | [Police](../../../aspose.font/font/) taille |

### ReturnValue

Image au format PNG sous forme de flux d'octets

## Voir aussi

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


| Paramètre | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Police](../../../aspose.font/font/) |
| glyphIds | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | Texte représenté sous forme de tableau d'identifiants de glyphes |
| fontSize | double | [Police](../../../aspose.font/font/) taille |
| lineSpacingType | RenderingUtils::LineSpacingType | Type d'espacement de ligne. Nombre de pixels ou pourcentage de la hauteur de la police |
| lineSpacingValue | int32_t | Valeur de l'espacement de ligne |
| maxWidth | int32_t | Largeur maximale en pixels pour l'image |

### ReturnValue

Image au format PNG sous forme de flux d'octets

## Voir aussi

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


| Paramètre | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Police](../../../aspose.font/font/) |
| texte | System::String | Texte |
| fontSize | double | [Police](../../../aspose.font/font/) taille |

### ReturnValue

Image au format PNG sous forme de flux d'octets

## Voir aussi

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


| Paramètre | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<Font\> | [Police](../../../aspose.font/font/) |
| texte | System::String | Texte |
| fontSize | double | [Police](../../../aspose.font/font/) taille |
| lineSpacingType | RenderingUtils::LineSpacingType | Type d'espacement de ligne. Nombre de pixels ou pourcentage de la hauteur de la police |
| lineSpacingValue | int32_t | Valeur de l'espacement de ligne |
| maxWidth | int32_t | Largeur maximale en pixels pour l'image |

### ReturnValue

Image au format PNG sous forme de flux d'octets

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Font](../../../aspose.font/font/)
* Class [String](../../../system/string/)
* Enum [LineSpacingType](../linespacingtype/)
* Class [RenderingUtils](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
