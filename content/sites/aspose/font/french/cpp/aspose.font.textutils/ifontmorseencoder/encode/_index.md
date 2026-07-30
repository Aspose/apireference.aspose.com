---
title: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode méthode"
linktitle: "Encode"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder::Encode méthode. Encode le texte en code Morse et renvoie le résultat sous forme d'ensemble de glyphes (glyphId). Une analyse heuristique est utilisée pour calculer l'alphabet du texte d'entrée en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.textutils/ifontmorseencoder/encode/
---
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) method


Encode le texte en code Morse et renvoie le résultat sous forme d’ensemble de glyphes (glyphId). Une analyse heuristique est utilisée pour calculer l’alphabet du texte d’entrée.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| texte | System::String | Texte à encoder en code Morse |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) pour prendre les glyphes liés aux symboles point et trait depuis |
| inputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte d'entrée |
| outputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte encodé |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) method


Encode le texte en code Morse et dessine le résultat au format PNG. Une analyse heuristique est utilisée pour calculer l’alphabet du texte d’entrée.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| texte | System::String | Texte à encoder en code Morse |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) pour prendre les glyphes liés aux symboles point et trait depuis |
| fontSize | double | [Police](../../../aspose.font/font/) taille |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Type d'espacement de ligne. Nombre de pixels ou pourcentage de la hauteur de la police |
| lineSpacingValue | int32_t | Valeur de l'espacement de ligne |
| maxWidth | int32_t | Largeur maximale en pixels pour l'image |
| inputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte d'entrée |
| outputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte encodé |

### ReturnValue

Texte, encodé en code Morse, au format PNG sous forme de flux d'octets

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Encode le texte en code Morse et dessine le résultat au format PNG.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| texte | System::String | Texte à encoder en code Morse |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) pour prendre les glyphes liés aux symboles point et trait depuis |
| fontSize | double | [Police](../../../aspose.font/font/) taille |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Type d'espacement de ligne. Nombre de pixels ou pourcentage de la hauteur de la police |
| lineSpacingValue | int32_t | Valeur de l'espacement de ligne |
| maxWidth | int32_t | Largeur maximale en pixels pour l'image |
| alphabet | MorseAlphabets | Alphabet du code Morse |
| inputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte d'entrée |
| outputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte encodé |

### ReturnValue

Texte, encodé en code Morse, au format PNG sous forme de flux d'octets

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseEncoder::Encode(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) method


Encode le texte en code Morse et renvoie le résultat sous forme d’ensemble de glyphes (identifiants de glyphes).

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseEncoder::Encode(System::String text, System::SharedPtr<IFont> font, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| texte | System::String | Texte à encoder en code Morse |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) pour prendre les glyphes liés aux symboles point et trait depuis |
| alphabet | MorseAlphabets | Alphabet du code Morse |
| inputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte d'entrée |
| outputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte encodé |

### ReturnValue

[Glyphs(glyphId)](../../../aspose.font.glyphs/) related to encoded text, ie "... --- ..." for the input text "SOS"

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
