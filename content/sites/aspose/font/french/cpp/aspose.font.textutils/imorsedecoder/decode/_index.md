---
title: "Aspose::Font::TextUtils::IMorseDecoder::Decode méthode"
linktitle: "Décoder"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TextUtils::IMorseDecoder::Decode method. Déchiffre le code Morse en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.textutils/imorsedecoder/decode/
---
## IMorseDecoder::Decode method


Décode le code Morse.

```cpp
virtual System::String Aspose::Font::TextUtils::IMorseDecoder::Decode(System::String morseText, MorseAlphabets alphabet=Aspose::Font::TextUtils::MorseAlphabets::Latin, char16_t inputSeparator=u'/', char16_t outputSeparator=u' ')=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| morseText | System::String | Texte encodé en code Morse, par ex. texte comme "... --- ..."(SOS) |
| alphabet | MorseAlphabets | Alphabet du code Morse |
| inputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte encodé |
| outputSeparator | char16_t | Symbole utilisé pour séparer les mots dans le texte décodé |

### ReturnValue

Texte décodé

## Voir aussi

* Class [String](../../../system/string/)
* Enum [MorseAlphabets](../../morsealphabets/)
* Class [IMorseDecoder](../)
* Namespace [Aspose::Font::TextUtils](../../)
* Library [Aspose.Font for C++](../../../)
