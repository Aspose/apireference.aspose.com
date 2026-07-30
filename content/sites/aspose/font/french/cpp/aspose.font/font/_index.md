---
title: "Aspose::Font::Font classe"
linktitle: "Police"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Font classe. Représente la classe de base Font en C++."
type: docs
weight: 400
url: /fr/cpp/aspose.font/font/
---
## Font class


Représente la classe de base [Font](./).

```cpp
class Font : public virtual Aspose::Font::IFont,
             public Aspose::Font::Glyphs::IGlyphAccessor,
             public Aspose::Font::IFontSaver,
             public Aspose::Font::Licensing::IVentureLicenseTarget
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Convert](./convert/)(Aspose::Font::FontType) | Convertit le [Font](./) en un autre format. |
| virtual [get_Encoding](./get_encoding/)() | Obtient l'encodage du [Font](./). |
| virtual [get_FontDefinition](./get_fontdefinition/)() | Obtient la définition du [Font](./). |
| virtual [get_FontFamily](./get_fontfamily/)() | Obtient ou définit la famille du [Font](./). |
| virtual [get_FontName](./get_fontname/)() | Obtient ou définit le nom de la face du [Font](./). |
| virtual [get_FontNames](./get_fontnames/)() | Obtient les noms du [Font](./). |
| [get_FontSaver](./get_fontsaver/)() override | Obtient la fonctionnalité d'enregistrement du [Font](./). |
| virtual [get_FontStyle](./get_fontstyle/)() | Obtient le style du [Font](./). Il s'agit d'une valeur calculée et représentée sous forme de type généralisé. |
| virtual [get_FontType](./get_fonttype/)() | Obtient le type du [Font](./). |
| [get_GlyphAccessor](./get_glyphaccessor/)() override | Accesseur de glyphes du [Font](./). Récupère les glyphes et les identifiants de glyphes. |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | Spécification du type d'ID de glyphe. Pour les consommateurs qui ont besoin de connaître le vrai type 'bytes[]'. |
| virtual [get_Metrics](./get_metrics/)() | Obtient les métriques du [Font](./). |
| virtual [get_NumGlyphs](./get_numglyphs/)() | Obtient le nombre de glyphes dans le [Font](./). |
| virtual [get_PostscriptNames](./get_postscriptnames/)() | Obtient les noms postscript du [Font](./). |
| virtual [get_Style](./get_style/)() | Obtient ou définit le style du [Font](./). Il s'agit d'une valeur de chaîne brute fournie par le fichier [Font](./). |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Renvoie tous les IDs de glyphes disponibles dans le [Font](./). Un ID de glyphe est un numéro unique pour un glyphe, dépendant du type de police. Par exemple : l'ID de [Type1](../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'ID de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) | Renvoie le glyphe par son ID de glyphe. Un ID de glyphe est un numéro unique pour un glyphe, dépendant du type de police. GlyphId – objet dérivé. Par exemple : l'ID de [Type1](../../aspose.font.type1/) est un nom de glyphe, instance de la classe ([GlyphStringId](../)). L'ID de TTF est un indice entier, instance de la classe ([GlyphUInt32Id](../)). |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Obtient la représentation des glyphes pour le texte. |
| static [Open](./open/)(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) | Ouvre une police en utilisant l'objet FontDefinition. |
| static [Open](./open/)(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) | Ouvre une police en utilisant le type de police et la source du flux. |
| static [Open](./open/)(Aspose::Font::FontType, System::String) | Ouvre une police en utilisant le type de police et le nom du fichier de police. |
| static [Open](./open/)(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) | Ouvre une police en utilisant le type de police et le tableau d'octets de données de police. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) override | Enregistre le [Font](./) au format original. |
| [Save](./save/)(System::String) override | Enregistre le [Font](./) au format original. |
| [SaveToFormat](./savetoformat/)(System::SharedPtr\<System::IO::Stream\>, FontSavingFormats) override | Enregistre le [Font](./) au format spécifié. |
| virtual [set_FontFamily](./set_fontfamily/)(System::String) | Obtient ou définit la famille du [Font](./). |
| virtual [set_FontName](./set_fontname/)(System::String) | Obtient ou définit le nom de la face du [Font](./). |
| virtual [set_Style](./set_style/)(System::String) | Obtient ou définit le style du [Font](./). Il s'agit d'une valeur de chaîne brute fournie par le fichier [Font](./). |
## Voir aussi

* Class [IFont](../ifont/)
* Class [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* Class [IFontSaver](../ifontsaver/)
* Class [IVentureLicenseTarget](../../aspose.font.licensing/iventurelicensetarget/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
