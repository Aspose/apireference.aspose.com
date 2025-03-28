---
title: ErrorBarsFormat
second_title: Référence de l'API Aspose.Slides pour .NET
description: Représente les barres derreur des séries de graphiques. Les valeurs personnalisées ErrorBars sont dans IChartDataPointCollection dansErrorBarsCustomValues./ichartdatapoint/errorbarscustomvalues propriété.
type: docs
weight: 1550
url: /fr/net/aspose.slides.charts/errorbarsformat/
---
## ErrorBarsFormat class

Représente les barres d'erreur des séries de graphiques. Les valeurs personnalisées ErrorBars sont dans IChartDataPointCollection (dans[`ErrorBarsCustomValues`](../ichartdatapoint/errorbarscustomvalues) propriété).

```csharp
public class ErrorBarsFormat : DomObject<ChartSeries>, IErrorBarsFormat
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Chart](../../aspose.slides.charts/errorbarsformat/chart) { get; } | Renvoie le graphique parent. Lecture seule[`IChart`](../ichart) . |
| [Format](../../aspose.slides.charts/errorbarsformat/format) { get; set; } | Représente le format des barres d'erreur. Lecture/écriture[`IFormat`](../iformat) . |
| [HasEndCap](../../aspose.slides.charts/errorbarsformat/hasendcap) { get; set; } | Spécifie qu'un capuchon de fin n'est pas dessiné sur les barres d'erreur. Lecture/écritureBoolean . |
| [IsVisible](../../aspose.slides.charts/errorbarsformat/isvisible) { get; set; } | Obtient ou définit la visibilité des barres d'erreur . Lecture/écritureBoolean . |
| [Type](../../aspose.slides.charts/errorbarsformat/type) { get; set; } | Obtient ou définit le type de barres d'erreur. Lecture/écriture[`ErrorBarType`](../errorbartype) . |
| [Value](../../aspose.slides.charts/errorbarsformat/value) { get; set; } | Obtient ou définit la valeur qui est utilisée avec les types de valeur Fixed, Percentage et StandardDeviation pour déterminer la longueur des barres d'erreur. Dans tous les autres cas, renverra NaN. Lecture/écritureSingle . |
| [ValueType](../../aspose.slides.charts/errorbarsformat/valuetype) { get; set; } | Représente les manières possibles de déterminer la longueur des barres d'erreur. En cas de type de valeur personnalisé pour spécifier l'utilisation de la valeur[`ErrorBarsCustomValues`](../ichartdatapoint/errorbarscustomvalues)propriété d'un point de données spécifique dans la collection DataPoints de la série. En cas de type de valeur Fixe, Pourcentage ou StandardDeviation, utilisez la propriété Value pour spécifier la valeur. Lecture/écriture[`ErrorBarValueType`](../errorbarvaluetype) . |

### Voir également

* class [DomObject&lt;TParent&gt;](../../aspose.slides/domobject-1)
* class [ChartSeries](../chartseries)
* interface [IErrorBarsFormat](../ierrorbarsformat)
* espace de noms [Aspose.Slides.Charts](../../aspose.slides.charts)
* Assemblée [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
