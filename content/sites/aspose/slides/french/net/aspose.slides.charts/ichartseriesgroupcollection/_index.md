---
title: IChartSeriesGroupCollection
second_title: Référence de l'API Aspose.Slides pour .NET
description: Représente la collection de groupes de séries combinables.
type: docs
weight: 1840
url: /fr/net/aspose.slides.charts/ichartseriesgroupcollection/
---
## IChartSeriesGroupCollection interface

Représente la collection de groupes de séries combinables.

```csharp
public interface IChartSeriesGroupCollection : IGenericCollection<IChartSeriesGroup>
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Item](../../aspose.slides.charts/ichartseriesgroupcollection/item) { get; } | Obtient la série groupe par série. (2 indexers) |

### Remarques

1) Chaque groupe de séries contient des séries avec des types combinables. Groupes de types de séries combinables définis et décrits avec CombinableSeriesTypesGroup enum. De plus, chaque groupe de séries contient des séries qui sont tracées si sur les axes primaires ou sur les axes secondaires (pas les deux cas dans un groupe). Donc, principe de regroupement des séries est un regroupement par groupes de types mentionnés ci-dessus et par type de tracé primaire/secondaire. 2) Le groupe de séries contient des propriétés de série communes à chaque série du groupe ("propriétés de groupe de séries"). "Propriétés de groupe de séries " dans la classe ChartSeriesGroup est en lecture/écriture. Chacune des "propriétés de groupe de séries" peut avoir une projection en lecture seule dans la classe ChartSeries.

### Voir également

* interface [IGenericCollection&lt;T&gt;](../../aspose.slides/igenericcollection-1)
* interface [IChartSeriesGroup](../ichartseriesgroup)
* espace de noms [Aspose.Slides.Charts](../../aspose.slides.charts)
* Assemblée [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
