---
title: "Aspose::Font::TextUtils::IMorseEncoder::Encode méthode"
linktitle: "Encode"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TextUtils::IMorseEncoder::Encode method. Encode le texte en code Morse. Une analyse heuristique est utilisée pour calculer l'alphabet du texte d'entrée. L'alphabet est sélectionné par le premier mot en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.textutils/imorseencoder/encode/
---
## IMorseEncoder::Encode(System::String, char16_t, char16_t) method


Encode le texte en code Morse. Une analyse heuristique est utilisée pour calculer l’alphabet du texte d’entrée. L’alphabet est sélectionné par le premier mot.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| texte | System::String | Texte à encoder en code Morse |
| inputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte d'entrée |
| outputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte encodé |

### ReturnValue

Texte encodé, par ex. "... --- ..." pour le texte d'entrée "SOS"

## Voir aussi

* Class [String](../../../system/string/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
## IMorseEncoder::Encode(System::String, MorseAlphabets, char16_t, char16_t) method


Encode le texte en code Morse.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseEncoder::Encode(System::String text, MorseAlphabets alphabet, char16_t inputSeparator=u' ', char16_t outputSeparator=u'/')=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| texte | System::String | Texte à encoder en code Morse |
| alphabet | MorseAlphabets | Alphabet du code Morse |
| inputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte d'entrée |
| outputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte encodé |

### ReturnValue

Texte encodé, par ex. "... --- ..." pour le texte d'entrée "SOS"

## Voir aussi

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseEncoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
