---
title: "classe Aspose::Font::IFontEncoding"
linktitle: "IFontEncoding"
second_title: "Aspose.Font pour C++"
description: "classe Aspose::Font::IFontEncoding. Définit une interface pour l'encodage des polices en C++."
type: docs
weight: 1400
url: /fr/cpp/aspose.font/ifontencoding/
---
## IFontEncoding class


Définit une interface pour l'encodage des [Font](../font/).

```cpp
class IFontEncoding : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [DecodeToGid](./decodetogid/)(uint32_t) | Décode un code de caractère et renvoie l'ID du glyphe. L'ID du glyphe est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'ID du [Type1](../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'ID du TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). Remarque : le code de caractère n'est pas nécessairement un Unicode. Le code de caractère est un indice de caractère dans la "table" d'encodage du [Font](../font/). |
| virtual [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) | Méthode de décodage paramétrée. |
| virtual [Encode](./encode/)(uint32_t, uint32_t) | Encode le glyphe. Pour les polices TTF, le charCode est Unicode. |
| virtual [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) | Décode Gid en Unicode. L'ID du glyphe est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'ID du [Type1](../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'ID du TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). |
| virtual [UnicodeToGid](./unicodetogid/)(uint32_t) | Décode un Unicode et renvoie l'ID du glyphe. L'ID du glyphe est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'ID du [Type1](../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'ID du TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
