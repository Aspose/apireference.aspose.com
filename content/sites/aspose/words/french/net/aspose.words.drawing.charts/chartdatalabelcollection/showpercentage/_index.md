---
title: ChartDataLabelCollection.ShowPercentage
linktitle: ShowPercentage
articleTitle: ShowPercentage
second_title: Aspose.Words pour .NET
description: ChartDataLabelCollection ShowPercentage propriété. Permet de spécifier si la valeur en pourcentage doit être affichée pour les étiquettes de données de toute la série. La valeur par défaut estFAUX . Sapplique uniquement aux diagrammes circulaires en C#.
type: docs
weight: 120
url: /fr/net/aspose.words.drawing.charts/chartdatalabelcollection/showpercentage/
---
## ChartDataLabelCollection.ShowPercentage property

Permet de spécifier si la valeur en pourcentage doit être affichée pour les étiquettes de données de toute la série. La valeur par défaut est`FAUX` . S'applique uniquement aux diagrammes circulaires.

```csharp
public bool ShowPercentage { get; set; }
```

## Remarques

La valeur définie pour cette propriété peut être remplacée pour une étiquette de données individuelle en utilisant the [`ShowPercentage`](../../chartdatalabel/showpercentage/) propriété.

## Exemples

Montre comment utiliser les étiquettes de données d’un graphique à secteurs.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Chart chart = builder.InsertChart(ChartType.Pie, 500, 300).Chart;

// Efface la série de données de démonstration du graphique pour commencer avec un graphique propre.
chart.Series.Clear();

// Insère une série de graphiques personnalisés avec un nom de catégorie pour chacun des secteurs et leur tableau de fréquence.
ChartSeries series = chart.Series.Add("Aspose Test Series",
    new[] { "Word", "PDF", "Excel" },
    new[] { 2.7, 3.2, 0.8 });

// Active les étiquettes de données qui afficheront à la fois le pourcentage et la fréquence de chaque secteur, et modifieront leur apparence.
series.HasDataLabels = true;
ChartDataLabelCollection dataLabels = series.DataLabels;
dataLabels.ShowLeaderLines = true;
dataLabels.ShowLegendKey = true;
dataLabels.ShowPercentage = true;
dataLabels.ShowValue = true;
dataLabels.Separator = "; ";

doc.Save(ArtifactsDir + "Charts.DataLabelsPieChart.docx");
```

### Voir également

* class [ChartDataLabelCollection](../)
* espace de noms [Aspose.Words.Drawing.Charts](../../../aspose.words.drawing.charts/)
* Assemblée [Aspose.Words](../../../)
