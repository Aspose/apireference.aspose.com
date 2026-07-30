---
title: "Aspose::Font::TextUtils::IFontMorseEncoder classe"
linktitle: "IFontMorseEncoder"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TextUtils::IFontMorseEncoder class. Déclare la fonctionnalité d’encoder le texte en code Morse et d’obtenir le résultat sous forme de glyphes de police en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.textutils/ifontmorseencoder/
---
## IFontMorseEncoder class


Déclare la fonctionnalité d'encoder du texte en code Morse et d'obtenir le résultat sous forme de glyphes de police.

```cpp
class IFontMorseEncoder : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) | Encode le texte en code Morse et renvoie le résultat sous forme d’ensemble de glyphes (identifiants de glyphes). |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) | Encode le texte en code Morse et renvoie le résultat sous forme d’ensemble de glyphes (glyphId). Une analyse heuristique est utilisée pour calculer l’alphabet du texte d’entrée. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) | Encode le texte en code Morse et dessine le résultat au format PNG. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) | Encode le texte en code Morse et dessine le résultat au format PNG. Une analyse heuristique est utilisée pour calculer l’alphabet du texte d’entrée. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TextUtils](../)
* Library [Aspose.Font for C++](../../)
