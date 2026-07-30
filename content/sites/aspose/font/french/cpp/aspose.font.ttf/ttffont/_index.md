---
title: "Aspose::Font::Ttf::TtfFont classe"
linktitle: "TtfFont"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Ttf::TtfFont classe. Représente la police TrueType (TTF) en C++."
type: docs
weight: 600
url: /fr/cpp/aspose.font.ttf/ttffont/
---
## TtfFont class


Représente la police TrueType [Font](../../aspose.font/font/) (TTF).

```cpp
class TtfFont : public Aspose::Font::Font
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | Convertit la [Font](../../aspose.font/font/) en un autre format. |
| [Convert](./convert/)(Aspose::Font::FontType, System::SharedPtr\<System::Collections::Generic::ICollection\<uint32_t\>\>) | Convertit la [Font](../../aspose.font/font/) en un autre format avec un jeu de caractères limité. |
| virtual [get_CffFont](./get_cfffont/)() | Obtient la [Font](../../aspose.font/font/) CFF si elle est présente. |
| [get_Encoding](./get_encoding/)() override | Obtient l'encodage de la [Font](../../aspose.font/font/). |
| [get_FontDefinition](./get_fontdefinition/)() override | Obtient la définition de la [Font](../../aspose.font/font/). |
| [get_FontFamily](./get_fontfamily/)() override | Obtient ou définit la famille de la [Font](../../aspose.font/font/). |
| [get_FontName](./get_fontname/)() override | Obtient ou définit le nom de la face de la [Font](../../aspose.font/font/). |
| [get_FontNames](./get_fontnames/)() override | Obtient les noms de la [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | Obtient le style de la [Font](../../aspose.font/font/). Il s'agit d'une valeur calculée et représentée sous forme de type généralisé. |
| [get_FontType](./get_fonttype/)() override | Obtient le type de la [Font](../../aspose.font/font/). Retourne la valeur [FontType.TTF](../../aspose.font/fonttype/). |
| [get_GlyphIdType](./get_glyphidtype/)() override | Obtient la spécification du type d'ID de glyphe. |
| [get_IsSymbolic](./get_issymbolic/)() | Retourne vrai si la [Font](../../aspose.font/font/) est symbolique. |
| [get_Metrics](./get_metrics/)() override | Obtient les métriques de la [Font](../../aspose.font/font/). |
| [get_NumGlyphs](./get_numglyphs/)() override | Obtient le nombre de glyphes dans la [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | Obtient les noms Postscript de la [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Obtient ou définit le style de la [Font](../../aspose.font/font/). Il s'agit d'une valeur de chaîne brute fournie par le fichier [Font](../../aspose.font/font/). |
| virtual [get_TtfTables](./get_ttftables/)() | Obtient les tables TTF. |
| [GetAllGlyphIds](./getallglyphids/)() override | Renvoie un tableau de tous les identifiants de glyphes, disponibles dans la [Font](../../aspose.font/font/). L'identifiant de glyphe est un nombre unique pour un glyphe, dépendant du type de police. L'identifiant de glyphe TTF de la [Font](../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). L'adressage des glyphes par nom (chaîne) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d'une [Font](../../aspose.font/font/) CFF, les structures CFF sont utilisées pour adresser les glyphes par leur nom. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Renvoie le glyphe par identifiant de glyphe. L'identifiant de glyphe est un nombre unique pour un glyphe, dépendant du type de police. L'identifiant de glyphe TTF de la [Font](../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). L'adressage des glyphes par nom (chaîne) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d'une [Font](../../aspose.font/font/) CFF, les structures CFF sont utilisées pour adresser les glyphes par leur nom. |
| [GetGlyphById](./getglyphbyid/)(System::String) | Renvoie le glyphe par nom de glyphe. L'adressage des glyphes par nom (chaîne) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d'une [Font](../../aspose.font/font/) CFF, les structures CFF sont utilisées pour adresser les glyphes par leur nom. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Renvoie le glyphe par identifiant de glyphe. |
| virtual [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) | Obtient un glyphe par l'identifiant de glyphe fourni et remplit la liste d'identifiants de glyphes passée avec les composants de ce glyphe. L'identifiant de glyphe est un nombre unique pour un glyphe, dépendant du type de police. L'identifiant de glyphe TTF de la [Font](../../aspose.font/font/) peut être une instance de la classe ([GlyphStringId](../)) ou de la classe ([GlyphUInt32Id](../)). L'adressage des glyphes par nom (chaîne) est pris en charge pour les polices TTF via le mappage de la table Post. Dans le cas d'une [Font](../../aspose.font/font/) CFF, les structures CFF sont utilisées pour adresser les glyphes par leur nom. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) | Obtient un glyphe par le nom de glyphe fourni et remplit la liste d'identifiants de glyphes passée avec les composants de ce glyphe. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) | Obtient un glyphe par l'index de glyphe fourni et remplit la liste d'identifiants de glyphes passée avec les composants de ce glyphe. |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Obtenez la représentation des glyphes pour le texte. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | Obtient ou définit la famille de la [Font](../../aspose.font/font/). |
| [set_FontName](./set_fontname/)(System::String) override | Obtient ou définit le nom de la face de la [Font](../../aspose.font/font/). |
| [set_Style](./set_style/)(System::String) override | Obtient ou définit le style de la [Font](../../aspose.font/font/). Il s'agit d'une valeur de chaîne brute fournie par le fichier [Font](../../aspose.font/font/). |
## Voir aussi

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
