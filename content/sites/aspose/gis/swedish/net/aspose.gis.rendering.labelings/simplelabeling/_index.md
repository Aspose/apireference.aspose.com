---
title: Class SimpleLabeling
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling klass. En enkel märkning placerar etikett på varje funktion.
type: docs
weight: 1700
url: /sv/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

En enkel märkning placerar etikett på varje funktion.

```csharp
public class SimpleLabeling : Labeling
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | Initierar en ny instans av`SimpleLabeling` class. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | Initierar en ny instans av`SimpleLabeling` class. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | Initierar en ny instans av`SimpleLabeling` class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | En återuppringning som används för att konfigurera denna märkning innan en funktion hanteras. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | Bestämmer färg på text. |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | Teckensnittsfamilj att använda för att rendera text. Standard är systemberoende värde. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | Storlek på texten. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | Stil att tillämpa på text. |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | Ger ett sätt att ersätta objektsgeometrin med en modifierad för märkning. Denna återuppringning åberopas första gången efter[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . Standard är`null` (använd funktionsgeometri som den är). |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | Färg på gloria (strecken) runt text. |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | Storleken på gloria (strecken) runt text. |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | Attributnamn att använda som källa för etiketter. Ignorerade om[`LabelExpression`](./labelexpression/) är inställd. Antingen[`LabelAttribute`](./labelattribute/) eller[`LabelExpression`](./labelexpression/) måste ställas in innan rendering; InvalidOperationException kastas annars. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | Ger ett sätt att anpassa och formatera etiketttext. Om inställt, åsidosätter[`LabelAttribute`](./labelattribute/) . Antingen[`LabelAttribute`](./labelattribute/) eller[`LabelExpression`](./labelexpression/) måste ställas in innan rendering; InvalidOperationException kastas annars. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | Anger renderingsbeteende för flerdelade geometrier. Standard ärAll . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | Etikettplacering anger hur etiketter placeras i förhållande till objektets geometrier. |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | Indikerar prioritet för denna etikett om den överlappar en annan etikett. Etiketten med lägre prioritet återges inte. Standard är 1000. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | Klonar den här instansen. |

### Se även

* class [Labeling](../labeling/)
* namnutrymme [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* hopsättning [Aspose.GIS](../../)


