---
title: "Aspose::Font::Cff::CffFont classe"
linktitle: "CffFont"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Cff::CffFont classe. Représente le Compact Font Format (CFF) en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.cff/cfffont/
---
## CffFont class


Représente le format Compact [Font](../../aspose.font/font/) (CFF).

```cpp
class CffFont : public Aspose::Font::Font
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | Convertit la [Font](../../aspose.font/font/) en un autre format. |
| [get_CommonFontsSettings](./get_commonfontssettings/)() const | Obtient/definit les paramètres communs aux polices CFF. Ces paramètres sont utilisés dans différents scénarios et peuvent être modifiés pour chaque police individuelle. |
| [get_Encoding](./get_encoding/)() override | Obtient l'encodage de la [Font](../../aspose.font/font/). |
| [get_FontDefinition](./get_fontdefinition/)() override | Obtient la définition de la [Font](../../aspose.font/font/). |
| [get_FontFamily](./get_fontfamily/)() override | Obtient la famille [Font](../../aspose.font/font/). Le mutateur de famille [Font](../../aspose.font/font/) n'est pas encore implémenté. |
| [get_FontName](./get_fontname/)() override | Obtient le nom de face [Font](../../aspose.font/font/). |
| [get_FontNames](./get_fontnames/)() override | Obtenir les noms [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | Obtient le style de la [Font](../../aspose.font/font/). Il s'agit d'une valeur calculée et représentée sous forme de type généralisé. |
| [get_FontType](./get_fonttype/)() override | Obtient le type [Font](../../aspose.font/font/). Retourne la valeur [FontType.CFF](../../aspose.font/fonttype/). |
| [get_GlyphIdType](./get_glyphidtype/)() override | Obtient la spécification du type d'ID de glyphe. |
| [get_IsCidKeyedFont](./get_iscidkeyedfont/)() | Obtient la valeur indiquant que le [Font](../../aspose.font/font/) est cid-keyed. |
| [get_Metrics](./get_metrics/)() override | Obtient les métriques de la [Font](../../aspose.font/font/). |
| [get_NumGlyphs](./get_numglyphs/)() override | Obtient le nombre de glyphes dans la [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | Obtient les noms postscript [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Obtient le style [Font](../../aspose.font/font/). Il s'agit d'une chaîne brute fournie par le fichier [Font](../../aspose.font/font/). |
| [get_TopDictDataProvider](./get_topdictdataprovider/)() | Obtient l'accesseur du premier DICT de niveau supérieur dans la structure Top DICT INDEX. |
| [GetAllGlyphIds](./getallglyphids/)() override | Retourne un tableau de tous les identifiants de glyphes, disponibles dans le [Font](../../aspose.font/font/). L'identifiant de glyphe est un nombre unique pour un glyphe, dépendant du type de police. L'identifiant de glyphe CFF du [Font](../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Retourne le glyphe par identifiant de glyphe. L'identifiant de glyphe est un nombre unique pour un glyphe, dépendant du type de police. L'identifiant de glyphe CFF du [Font](../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). |
| [GetGlyphById](./getglyphbyid/)(System::String) | Retourne le glyphe par nom de glyphe. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Renvoie le glyphe par identifiant de glyphe. |
| [GetIndexDataProvider](./getindexdataprovider/)(CffDataProviders::CffIndexProviderType) | Obtient le fournisseur pour le type de structure CFF INDEX spécifié. |
| [set_CommonFontsSettings](./set_commonfontssettings/)(System::SharedPtr\<CffFontsSettings\>) | Obtient/definit les paramètres communs aux polices CFF. Ces paramètres sont utilisés dans différents scénarios et peuvent être modifiés pour chaque police individuelle. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | Obtient la famille [Font](../../aspose.font/font/). Le mutateur de famille [Font](../../aspose.font/font/) n'est pas encore implémenté. |
| [set_FontName](./set_fontname/)(System::String) override | Définit le nom de face [Font](../../aspose.font/font/). |
| [set_Style](./set_style/)(System::String) override | Définit le style [Font](../../aspose.font/font/). Il s'agit d'une chaîne brute fournie par le fichier [Font](../../aspose.font/font/). |
## Voir aussi

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
