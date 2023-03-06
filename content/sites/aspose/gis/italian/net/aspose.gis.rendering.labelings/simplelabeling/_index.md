---
title: Class SimpleLabeling
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling classe. Una semplice etichettatura posiziona unetichetta su ogni caratteristica.
type: docs
weight: 1700
url: /it/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

Una semplice etichettatura posiziona un'etichetta su ogni caratteristica.

```csharp
public class SimpleLabeling : Labeling
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | Inizializza una nuova istanza di`SimpleLabeling` classe. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | Inizializza una nuova istanza di`SimpleLabeling` classe. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | Inizializza una nuova istanza di`SimpleLabeling` classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | Un callback utilizzato per configurare questa etichettatura prima di gestire una funzione. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | Determina il colore del testo. |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | Famiglia di caratteri da utilizzare per il rendering del testo. Il valore predefinito è il valore dipendente dal sistema. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | Dimensione del testo. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | Stile da applicare al testo. |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | Fornisce un modo per sostituire la geometria della feature con una modificata per l'etichettatura. Questa richiamata viene richiamata la prima dopo[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . L'impostazione predefinita è`null` (usa la geometria della feature così com'è). |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | Colore dell'alone (tratto) attorno al testo. |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | Dimensione dell'alone (tratto) attorno al testo. |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | Nome dell'attributo da utilizzare come origine delle etichette. Ignorato se[`LabelExpression`](./labelexpression/) è impostato. Entrambi[`LabelAttribute`](./labelattribute/) O[`LabelExpression`](./labelexpression/) deve essere impostato prima del rendering; InvalidOperationException viene lanciato altrimenti. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | Fornisce un modo per personalizzare e formattare il testo dell'etichetta. Se impostato, esegue l'override[`LabelAttribute`](./labelattribute/) . Entrambi[`LabelAttribute`](./labelattribute/) O[`LabelExpression`](./labelexpression/) deve essere impostato prima del rendering; InvalidOperationException viene lanciato altrimenti. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | Specifica il comportamento di rendering per le geometrie multiparte. L'impostazione predefinita èAll . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | Il posizionamento delle etichette specifica come le etichette vengono posizionate in relazione alle geometrie dell'elemento. |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | Indica la priorità di questa etichetta nel caso in cui si sovrapponga a un'altra etichetta. L'etichetta con priorità inferiore non viene visualizzata. Il valore predefinito è 1000. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | Clona questa istanza. |

### Guarda anche

* class [Labeling](../labeling/)
* spazio dei nomi [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* assemblea [Aspose.GIS](../../)


