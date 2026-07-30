---
title: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode méthode"
linktitle: "Décoder"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TextUtils::IFontMorseDecoder::Decode méthode. Déchiffre le code Morse et dessine le résultat au format PNG en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.textutils/ifontmorsedecoder/decode/
---
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) method


Déchiffre le code Morse et dessine le résultat au format PNG.

```cpp
virtual System::SharedPtr<System::IO::Stream> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, double fontSize, Renderers::RenderingUtils::LineSpacingType lineSpacingType, int32_t lineSpacingValue, int32_t maxWidth, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| morseText | System::String | Texte encodé en code Morse, par ex. texte comme "... --- ..."(SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) pour prendre les glyphes liés au texte décodé depuis |
| fontSize | double | [Police](../../../aspose.font/font/) taille |
| lineSpacingType | Renderers::RenderingUtils::LineSpacingType | Type d'espacement de ligne. Nombre de pixels ou pourcentage de la hauteur de la police |
| lineSpacingValue | int32_t | Valeur de l'espacement de ligne |
| maxWidth | int32_t | Largeur maximale en pixels pour l'image |
| alphabet | MorseAlphabets | Alphabet du code Morse |
| inputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte encodé |
| outputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte décodé |

### ReturnValue

Texte décodé au format PNG sous forme de flux d'octets

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [LineSpacingType](../../../aspose.font.renderers/renderingutils/linespacingtype/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IFontMorseDecoder::Decode(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) method


Déchiffre le code Morse en glyphes de la police spécifiée.

```cpp
virtual System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::TextUtils::IFontMorseDecoder::Decode(System::String morseText, System::SharedPtr<IFont> font, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| morseText | System::String | Texte encodé en code Morse, par ex. texte comme "... --- ..."(SOS) |
| font | System::SharedPtr\<IFont\> | [Font](../../../aspose.font/font/) pour prendre les glyphes liés au texte décodé depuis |
| alphabet | MorseAlphabets | Alphabet du code Morse |
| inputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte encodé |
| outputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte décodé |

### ReturnValue

[Glyphs](../../../aspose.font.glyphs/) (glyph identifiers) related to decoded text

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFont](../../../aspose.font/ifont/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IFontMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
