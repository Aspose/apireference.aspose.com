---
title: "Classe Aspose::Font::Type1::Type1Encoding"
linktitle: "Type1Encoding"
second_title: "Aspose.Font pour C++"
description: "Classe Aspose::Font::Type1::Type1Encoding. Représente l'encodage Type1Font en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.type1/type1encoding/
---
## Type1Encoding class


Représente l'encodage [Type1](../)[Font](../../aspose.font/font/)

```cpp
class Type1Encoding : public Aspose::Font::IFontEncoding,
                      public Aspose::Font::ISupportsNameAddressing
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Décode Gid en unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de [Type1](../) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Méthode de décodage paramétrée. Non prise en charge pour le type [Type1](../)[Font](../../aspose.font/font/). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Encode le glyphe. Pour les polices TTF, le code de caractère est unicode. Non pris en charge pour les types [Type1](../)[Font](../../aspose.font/font/). |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | Renvoie la table de correspondance nom → code caractère. Remarque : le code caractère n'est pas un unicode. Le code caractère est un indice de caractère dans la "table" d'encodage du [Font](../../aspose.font/font/). |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Décode Gid en Unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de [Type1](../) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Renvoie GlyphId pour unicode. Ou notdef si la police ne contient pas de glyphe pour l'unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, qui dépend du type de police. Par exemple : l'identifiant de [Type1](../) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'identifiant de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). |
## Voir aussi

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
