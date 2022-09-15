---
title: Type1MetricFont
second_title: Référence de l'API Aspose.Font pour .NET
description: Implémentation de la police métrique Type1. Cette police Type1 est créée à laide de métriques uniquement. Les fonctions de récupération de glyphes et certaines autres qui nécessitent une police réelle ne sont pas autorisées les fonctions non autorisées génèrent une exceptionType1NotSupportedException . Dautres propriétés FontName Weight Metrics et Encoding sont utilisées à partir du fichier de métriques.
type: docs
weight: 1080
url: /fr/net/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class

Implémentation de la police métrique Type1. Cette police Type1 est créée à l'aide de métriques uniquement. Les fonctions de récupération de glyphes et certaines autres qui nécessitent une police réelle ne sont pas autorisées, les fonctions non autorisées génèrent une exceptionType1NotSupportedException . D'autres propriétés (FontName, Weight, Metrics et Encoding) sont utilisées à partir du fichier de métriques.

```csharp
public class Type1MetricFont : Type1Font
```

## Propriétés

| Nom | La description |
| --- | --- |
| override [Encoding](../../aspose.font.type1/type1metricfont/encoding) { get; } | L'encodage est défini dans le fichier de mesures. StandardAdobeEncoding : l'encodage est rempli automatiquement |
| override [FontDefinition](../../aspose.font.type1/type1font/fontdefinition) { get; } | Obtient la définition de la police. |
| override [FontFamily](../../aspose.font.type1/type1metricfont/fontfamily) { get; } | Obtient la famille de polices. |
| override [FontName](../../aspose.font.type1/type1metricfont/fontname) { get; } | Obtient le nom de la police. |
| override [FontNames](../../aspose.font.type1/type1font/fontnames) { get; } | Obtient les noms de police. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Obtient la fonctionnalité d'enregistrement des polices. |
| override [FontStyle](../../aspose.font.type1/type1metricfont/fontstyle) { get; } | Obtient le style de police. Il s'agit d'une valeur calculée et représentée en type généralisé. |
| override [FontType](../../aspose.font.type1/type1font/fonttype) { get; } | Obtient le type de police. Renvoie la valeur FontType.Type1. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Accesseur de glyphe de police. Récupère les glyphes et les identifiants de glyphe. |
| override [GlyphIdType](../../aspose.font.type1/type1font/glyphidtype) { get; } | Spécification du type d'identifiant de glyphe. |
| override [Metrics](../../aspose.font.type1/type1font/metrics) { get; } | Obtient les métriques de police. |
| override [NumGlyphs](../../aspose.font.type1/type1metricfont/numglyphs) { get; } | Obtient le nombre de glyphes dans la police. |
| override [PostscriptNames](../../aspose.font.type1/type1font/postscriptnames) { get; } | Obtient les noms de police postscript. |
| override [Style](../../aspose.font.type1/type1metricfont/style) { get; } | Obtient le style de police. |

## Méthodes

| Nom | La description |
| --- | --- |
| override [Convert](../../aspose.font.type1/type1font/convert)(FontType) | Convertit la police dans un autre format. |
| override [GetAllGlyphIds](../../aspose.font.type1/type1metricfont/getallglyphids)() | Renvoie tous les identifiants de glyphes, disponibles dans la police. Non pris en charge pour[`Type1MetricFont`](../type1metricfont)tapez. |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid#getglyphbyid)(GlyphId) | Renvoie glyphe par identifiant de glyphe. Non pris en charge pour[`Type1MetricFont`](../type1metricfont)tapez. |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid#getglyphbyid_1)(string) | Renvoie glyphe par identifiant de glyphe. Non pris en charge pour[`Type1MetricFont`](../type1metricfont)tapez. |
| [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid)(uint) | Renvoie glyphe par identifiant de glyphe. |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext)(string) | Obtient la représentation des glyphes pour le texte. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Enregistre la police dans son format d'origine. |
| virtual [Save](../../aspose.font/font/save)(string) | Enregistre la police dans son format d'origine. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Enregistre la police dans le format spécifié. |

### Exemples

Remarque : Si le fichier de mesures définit l'encodage comme "FontSpecific", l'utilisateur doit fournir l'encodage spécifique de la manière suivante :  System::ArrayPtr&lt;System::String&gt; zapfDingbatsEncoding = System::MakeArray&lt;System::String&gt;({nullptr, nullptr, ..., u"space", u"a1", ...}); FontEnvironment ::get_Current()-&gt;get_FontSpecificEncodings()-&gt;RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);

```csharp
string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
```

### Voir également

* class [Type1Font](../type1font)
* espace de noms [Aspose.Font.Type1](../../aspose.font.type1)
* Assemblée [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
