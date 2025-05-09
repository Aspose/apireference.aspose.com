---
title: ForEach
second_title: Référence de l'API Aspose.Slides pour .NET
description: Représente un groupe de méthodes destinées à itérer sur différentsPresentation../aspose.slides/presentation objets de modèle. Ces méthodes peuvent être utiles si vous avez besoin ditérer et de modifier la mise en forme ou le contenu de certains éléments de la présentation  par exemple modifier la mise en forme de chaque partie.
type: docs
weight: 7230
url: /fr/net/aspose.slides.lowcode/foreach/
---
## ForEach class

Représente un groupe de méthodes destinées à itérer sur différents[`Presentation`](../../aspose.slides/presentation) objets de modèle. Ces méthodes peuvent être utiles si vous avez besoin d'itérer et de modifier la mise en forme ou le contenu de certains éléments de la présentation, , par exemple, modifier la mise en forme de chaque partie.

```csharp
public static class ForEach
```

## Méthodes

| Nom | La description |
| --- | --- |
| static [LayoutSlide](../../aspose.slides.lowcode/foreach/layoutslide)(Presentation, ForEachLayoutSlideCallback) | Itérer chaque[`LayoutSlide`](./layoutslide) dans le[`Presentation`](../../aspose.slides/presentation) . |
| static [MasterSlide](../../aspose.slides.lowcode/foreach/masterslide)(Presentation, ForEachMasterSlideCallback) | Itérer chaque[`MasterSlide`](./masterslide) dans le[`Presentation`](../../aspose.slides/presentation) . |
| static [Paragraph](../../aspose.slides.lowcode/foreach/paragraph)(Presentation, ForEachParagraphCallback) | Itérer chaque[`Paragraph`](./paragraph) dans le[`Presentation`](../../aspose.slides/presentation) .  Les formes seront itérées dans tous les types de diapositives -[`Slide`](./slide) ,[`MasterSlide`](./masterslide) et[`LayoutSlide`](./layoutslide) |
| static [Portion](../../aspose.slides.lowcode/foreach/portion)(Presentation, ForEachPortionCallback) | Itérer chaque[`Portion`](./portion) dans le[`Presentation`](../../aspose.slides/presentation) .  Les parties seront itérées dans tous les types de diapositives -[`Slide`](./slide) ,[`MasterSlide`](./masterslide) et[`LayoutSlide`](./layoutslide) |
| static [Shape](../../aspose.slides.lowcode/foreach/shape#shape)(BaseSlide, ForEachShapeCallback) | Itérer chaque[`Shape`](./shape) dans le[`BaseSlide`](../../aspose.slides/baseslide) . [`BaseSlide`](../../aspose.slides/baseslide) est le type de base pour[`Slide`](./slide) ,[`MasterSlide`](./masterslide) et[`LayoutSlide`](./layoutslide) |
| static [Shape](../../aspose.slides.lowcode/foreach/shape#shape_1)(Presentation, ForEachShapeCallback) | Itérer chaque[`Shape`](./shape) dans le[`Presentation`](../../aspose.slides/presentation) .  Les formes seront itérées dans tous les types de diapositives -[`Slide`](./slide) ,[`MasterSlide`](./masterslide) et[`LayoutSlide`](./layoutslide) |
| static [Slide](../../aspose.slides.lowcode/foreach/slide)(Presentation, ForEachSlideCallback) | Itérer chaque[`Slide`](./slide) dans le[`Presentation`](../../aspose.slides/presentation) . |

## Autres membres

| Nom | La description |
| --- | --- |
| delegate [ForEachLayoutSlideCallback](foreach.foreachlayoutslidecallback) |  |
| delegate [ForEachMasterSlideCallback](foreach.foreachmasterslidecallback) |  |
| delegate [ForEachParagraphCallback](foreach.foreachparagraphcallback) |  |
| delegate [ForEachPortionCallback](foreach.foreachportioncallback) |  |
| delegate [ForEachShapeCallback](foreach.foreachshapecallback) |  |
| delegate [ForEachSlideCallback](foreach.foreachslidecallback) |  |

### Exemples

```csharp
using (Presentation presentation = new Presentation("pres.pptx"))
{
   ForEach.Portion(presentation, (portion, para, slide, index) =>
   {
       portion.PortionFormat.LatinFont = new FontData("Times New Roman");
   });
  
   presentation.Save("pres-out.pptx", SaveFormat.Pptx);
}
```

### Voir également

* espace de noms [Aspose.Slides.LowCode](../../aspose.slides.lowcode)
* Assemblée [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
