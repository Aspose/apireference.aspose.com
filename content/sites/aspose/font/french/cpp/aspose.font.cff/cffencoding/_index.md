---
title: "Aspose::Font::Cff::CffEncoding classe"
linktitle: "CffEncoding"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Cff::CffEncoding classe. Représente l'encodage de police CFF en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.cff/cffencoding/
---
## CffEncoding class


Représente l'encodage du [Font](../../aspose.font/font/) CFF.

```cpp
class CffEncoding : public Aspose::Font::IFontEncoding,
                    public Aspose::Font::ISupportsNameAddressing
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Obtient le Gid pour le charCode fourni. Cette méthode est conçue pour les CFF CIDFonts, où le charCode doit être une valeur CID valide. L'identifiant du glyphe est un nombre unique pour un glyphe, dépendant du type de police. L'identifiant de glyphe CFF [Font](../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Méthode de décodage paramétrée. Non prise en charge pour le type CFF [Font](../../aspose.font/font/). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Encode le glyphe. Non pris en charge pour les types CFF [Font](../../aspose.font/font/). |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | Renvoie la table de correspondance nom → code caractère. Remarque : le code caractère n'est pas un unicode. Le code caractère est un indice de caractère dans la "table" d'encodage du [Font](../../aspose.font/font/). |
| [GetNameToGidIndex](./getnametogidindex/)() | Renvoie la table de correspondance nom → code caractère. Remarque : le code caractère n'est pas un unicode. Le code caractère est un indice de caractère dans la "table" d'encodage du [Font](../../aspose.font/font/). |
| [GetNameToSidIndex](./getnametosidindex/)() | Renvoie la table de correspondance nom → code caractère. Remarque : le code caractère n'est pas un unicode. Le code caractère est un indice de caractère dans la "table" d'encodage du [Font](../../aspose.font/font/). |
| [GetSidName](./getsidname/)(int32_t) | Obtient le nom pour le SID spécifié. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Décode le Gid en unicode. L'identifiant du glyphe est un nombre unique pour un glyphe, dépendant du type de police. L'identifiant de glyphe CFF [Font](../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Décode un unicode et renvoie l'identifiant du glyphe. L'identifiant du glyphe est un nombre unique pour un glyphe, dépendant du type de police. L'identifiant de glyphe CFF [Font](../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). |
## Voir aussi

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
