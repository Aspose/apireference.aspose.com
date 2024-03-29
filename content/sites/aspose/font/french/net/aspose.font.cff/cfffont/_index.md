---
title: CffFont
second_title: Référence de l'API Aspose.Font pour .NET
description: Représente le format de police compact CFF.
type: docs
weight: 30
url: /fr/net/aspose.font.cff/cfffont/
---
## CffFont class

Représente le format de police compact (CFF).

```csharp
public class CffFont : Font
```

## Propriétés

| Nom | La description |
| --- | --- |
| override [Encoding](../../aspose.font.cff/cfffont/encoding) { get; } | Obtient l'encodage de la police. |
| override [FontDefinition](../../aspose.font.cff/cfffont/fontdefinition) { get; } | Obtient la définition de la police. |
| override [FontFamily](../../aspose.font.cff/cfffont/fontfamily) { get; set; } | Obtient la famille de polices. Le setter de famille de polices n'est pas encore implémenté. |
| override [FontName](../../aspose.font.cff/cfffont/fontname) { get; set; } | Obtient le nom de la police. Le paramètre de nom de police n'est pas encore implémenté. |
| override [FontNames](../../aspose.font.cff/cfffont/fontnames) { get; } | Obtenir les noms de police. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Obtient la fonctionnalité d'enregistrement des polices. |
| override [FontStyle](../../aspose.font.cff/cfffont/fontstyle) { get; } | Obtient le style de police. Il s'agit d'une valeur calculée et représentée en type généralisé. |
| override [FontType](../../aspose.font.cff/cfffont/fonttype) { get; } | Obtient le type de police. Renvoie la valeur FontType.CFF. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Accesseur de glyphe de police. Récupère les glyphes et les identifiants de glyphe. |
| override [GlyphIdType](../../aspose.font.cff/cfffont/glyphidtype) { get; } | Obtient la spécification du type d'identifiant de glyphe. |
| [IsCidKeyedFont](../../aspose.font.cff/cfffont/iscidkeyedfont) { get; } | Obtient une valeur indiquant que la police est à clé cid. |
| override [Metrics](../../aspose.font.cff/cfffont/metrics) { get; } | Obtient les métriques de police. |
| override [NumGlyphs](../../aspose.font.cff/cfffont/numglyphs) { get; } | Obtient le nombre de glyphes dans la police. |
| override [PostscriptNames](../../aspose.font.cff/cfffont/postscriptnames) { get; } | Obtient les noms de police postscript. |
| override [Style](../../aspose.font.cff/cfffont/style) { get; set; } | Obtient le style de police. Il s'agit d'une valeur de chaîne brute fournie par le fichier de police. Le paramètre de style n'est pas encore implémenté. |

## Méthodes

| Nom | La description |
| --- | --- |
| override [Convert](../../aspose.font.cff/cfffont/convert)(FontType) | Convertit la police dans un autre format. |
| override [GetAllGlyphIds](../../aspose.font.cff/cfffont/getallglyphids)() | Renvoie le tableau de tous les identifiants de glyphe, disponibles dans la police. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. CFF L'identifiant de glyphe de police peut être une instance de ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) classe ou ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) classe. |
| override [GetGlyphById](../../aspose.font.cff/cfffont/getglyphbyid#getglyphbyid)(GlyphId) | Renvoie le glyphe par identifiant de glyphe. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. CFF L'identifiant de glyphe de police peut être une instance de ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) classe ou ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) classe. |
| [GetGlyphById](../../aspose.font.cff/cfffont/getglyphbyid#getglyphbyid_1)(string) | Renvoie glyphe par nom de glyphe. |
| [GetGlyphById](../../aspose.font.cff/cfffont/getglyphbyid#getglyphbyid_2)(uint) | Renvoie glyphe par identifiant de glyphe. |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext)(string) | Obtient la représentation des glyphes pour le texte. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Enregistre la police dans son format d'origine. |
| virtual [Save](../../aspose.font/font/save)(string) | Enregistre la police dans son format d'origine. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Enregistre la police dans le format spécifié. |

### Voir également

* class [Font](../../aspose.font/font)
* espace de noms [Aspose.Font.Cff](../../aspose.font.cff)
* Assemblée [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
