---
title: "Classe Aspose::Font::Ttf::TtfEncoding"
linktitle: "TtfEncoding"
second_title: "Aspose.Font pour C++"
description: "Classe Aspose::Font::Ttf::TtfEncoding. Représente l'encodage d'une police TTF en C++."
type: docs
weight: 400
url: /fr/cpp/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class


Représente l'encodage d'une [Font](../../aspose.font/font/) TTF.

```cpp
class TtfEncoding : public Aspose::Font::IFontEncoding
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | L'implémentation DecodeToGlyphId d'une [Font](../../aspose.font/font/) TTF trouve la table Unicode et renvoie l'identifiant de glyphe pour le caractère Unicode. L'identifiant de glyphe est un nombre unique pour un glyphe, dépendant du type de police. Par exemple : l'identifiant d'une [Type1](../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant d'une TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | La version paramétrée permet d'utiliser une table CMap spécifique (pas Unicode). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Encode le glyphe. Pour les polices TTF, le code caractère est Unicode. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Décode l'identifiant du glyphe en unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de [Type1](../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Décode un unicode et renvoie l'identifiant du glyphe. |
## Voir aussi

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
