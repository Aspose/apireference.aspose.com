---
title: TtfFont
second_title: Référence de l'API Aspose.Font pour .NET
description: Représente la police TrueType TTF.
type: docs
weight: 630
url: /fr/net/aspose.font.ttf/ttffont/
---
## TtfFont class

Représente la police TrueType (TTF).

```csharp
public class TtfFont : Font
```

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont) { get; } | Obtient la police CFF si elle est présente. |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding) { get; } | Obtient l'encodage de la police. |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition) { get; } | Obtient la définition de la police. |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily) { get; set; } | Obtient ou définit la famille de polices. |
| override [FontName](../../aspose.font.ttf/ttffont/fontname) { get; set; } | Obtient ou définit le nom de la police. |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames) { get; } | Obtient les noms de police. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Obtient la fonctionnalité d'enregistrement des polices. |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle) { get; } | Obtient le style de police. Il s'agit d'une valeur calculée et représentée en type généralisé. |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype) { get; } | Obtient le type de police. Renvoie la valeur FontType.TTF. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Accesseur de glyphe de police. Récupère les glyphes et les identifiants de glyphe. |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype) { get; } | Obtient la spécification du type d'identifiant de glyphe. |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic) { get; } | Renvoie vrai si la police est symbolique. |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics) { get; } | Obtient les métriques de police. |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs) { get; } | Obtient le nombre de glyphes dans la police. |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames) { get; } | Obtient les noms de police Postscript. |
| override [Style](../../aspose.font.ttf/ttffont/style) { get; set; } | Obtient ou définit le style de police. Il s'agit d'une valeur de chaîne brute fournie par le fichier de police. |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables) { get; } | Obtient les tables TTF. |

## Méthodes

| Nom | La description |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert)(FontType) | Convertit la police dans un autre format. |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids)() | Renvoie le tableau de tous les identifiants de glyphes, disponibles dans la police. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. TTF L'identifiant de glyphe de police peut être une instance de ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) classe ou ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. L'adressage de glyphe de nom (chaîne) est pris en charge pour les polices TTF via le mappage de table Post. Dans le cas où la police CFF est à l'intérieur, les structures CFF sont utilisées pour adresser les glyphes par leur nom. |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid)(GlyphId) | Renvoie le glyphe par identifiant de glyphe. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. L'identifiant de glyphe de police TTF peut être une instance de ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) classe ou ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. L'adressage de glyphe de nom (chaîne) est pris en charge pour les polices TTF via le mappage de table Post. Dans le cas où la police CFF est à l'intérieur, les structures CFF sont utilisées pour adresser les glyphes par leur nom. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_1)(string) | Renvoie le glyphe par nom de glyphe. L'adressage de glyphe par nom (chaîne) est pris en charge pour les polices TTF via le mappage de table Post. Dans le cas où la police CFF est à l'intérieur, les structures CFF sont utilisées pour adresser les glyphes par leur nom. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_2)(uint) | Renvoie glyphe par identifiant de glyphe. |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | Obtient un glyphe par identifiant de glyphe passé et remplit la liste passée des identifiants de glyphe avec les composants de ce glyphe. L'identifiant de glyphe est un numéro unique pour un glyphe, qui dépend du type de police. TTF L'identifiant de glyphe de police peut être une instance de ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) classe ou ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. L'adressage de glyphe de nom (chaîne) est pris en charge pour les polices TTF via le mappage de table Post. Dans le cas où la police CFF est à l'intérieur, les structures CFF sont utilisées pour adresser les glyphes par leur nom. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_1)(string, GlyphIdList) | Obtient un glyphe par nom de glyphe passé et remplit la liste passée des identifiants de glyphe avec les composants de ce glyphe. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_2)(uint, GlyphIdList) | Obtient un glyphe par index de glyphe passé et remplit la liste passée des identifiants de glyphe avec les composants de ce glyphe. |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext)(string) | Obtenir la représentation des glyphes pour le texte. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Enregistre la police dans son format d'origine. |
| virtual [Save](../../aspose.font/font/save)(string) | Enregistre la police dans son format d'origine. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Enregistre la police dans le format spécifié. |

### Voir également

* class [Font](../../aspose.font/font)
* espace de noms [Aspose.Font.Ttf](../../aspose.font.ttf)
* Assemblée [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
