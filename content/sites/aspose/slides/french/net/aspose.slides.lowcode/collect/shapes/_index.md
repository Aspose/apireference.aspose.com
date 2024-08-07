---
title: Shapes
second_title: Référence de l'API Aspose.Slides pour .NET
description: Collecte toutes les instances deShapeaspose.slides/shape dans lePresentationaspose.slides/presentation .
type: docs
weight: 10
url: /fr/net/aspose.slides.lowcode/collect/shapes/
---
## Collect.Shapes method

Collecte toutes les instances de[`Shape`](../../../aspose.slides/shape) dans le[`Presentation`](../../../aspose.slides/presentation) .

```csharp
public static IEnumerable<Shape> Shapes(Presentation pres)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| pres | Presentation | Présentation pour collecter des formes |

### Return_Value

Collection de toutes les formes contenues dans la présentation

### Exemples

```csharp
using (Presentation pres = new Presentation("pres.pptx"))
{
    foreach (Shape shape in Collect.Shapes(pres))
    {
        // si la forme est une forme automatique, ajoute une bordure noire pleine
        if (shape is AutoShape autoShape)
        {
            autoShape.LineFormat.Style = LineStyle.Single;
            autoShape.LineFormat.Width = 10f;
            autoShape.LineFormat.FillFormat.FillType = FillType.Solid;
            autoShape.LineFormat.FillFormat.SolidFillColor.Color = Color.Black;
        }
    }
    
    pres.Save("pres-out.pptx", SaveFormat.Pptx);
}        
```

### Voir également

* class [Shape](../../../aspose.slides/shape)
* class [Presentation](../../../aspose.slides/presentation)
* class [Collect](../../collect)
* espace de noms [Aspose.Slides.LowCode](../../collect)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
