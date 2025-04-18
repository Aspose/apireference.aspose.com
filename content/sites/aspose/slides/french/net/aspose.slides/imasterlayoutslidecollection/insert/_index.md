---
title: Insert
second_title: Référence de l'API Aspose.Slides pour .NET
description: Insère une nouvelle diapositive de mise en page à la position spécifiée de la collection.
type: docs
weight: 40
url: /fr/net/aspose.slides/imasterlayoutslidecollection/insert/
---
## IMasterLayoutSlideCollection.Insert method

Insère une nouvelle diapositive de mise en page à la position spécifiée de la collection.

```csharp
public ILayoutSlide Insert(int index, SlideLayoutType layoutType, string layoutName)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| index | Int32 | Index de la nouvelle diapositive. |
| layoutType | SlideLayoutType | Type de mise en page pour une nouvelle mise en page. Types de mise en page pris en charge : Title, TitleOnly, Blank, TitleAndObject, VerticalText, VerticalTitleAndText, TwoObjects, SectionHeader, TwoTextAndTwoObjects, TitleObjectAndCaption, PictureAndCaption, Custom. Les autres types de mise en page ne sont plus pris en charge : Text, TwoColumnText, Tableau, TextAndChart, ChartAndText, Diagramme, Graphique, TextAndClipArt, ClipArtAndText, TextAndObject, ObjectAndText, Objet, TextAndMedia, MediaAndText, ObjectOverText, TextOverObject, TextAndTwoObjects, TwoObjectsAndText, TwoObjectsOverText, FourObjects, ClipArtAndVerticalText, VerticalTitleAndTextOverChart, ObjectAndTwoObject, TwoObjectsAndObject. |
| layoutName | String | Nom d'une nouvelle mise en page. Si le nom passé est déjà utilisé, l'ArgumentException sera lancée. Si le paramètre null est passé, le nom est généré automatiquement en ce qui concerne le type de mise en page passé (par exemple "Title Slide" ou "1_Title Slide", "2_..", etc. .). |

### Return_Value

Diapositive insérée.

### Exceptions

| exception | condition |
| --- | --- |
| NotImplementedException | Levé si la valeur du paramètre n'est pas prise en charge*layoutType* est passé. Types de mise en page qui ne sont pas pris en charge actuellement : Text, TwoColumnText, Table, TextAndChart, ChartAndText, Diagram, Chart, TextAndClipArt, ClipArtAndText, TextAndObject, ObjectAndText, Object, TextAndMedia, MediaAndText, ObjectOverText, TextOverObject, TextAndTwoObjects, TwoObjectsAndText, TwoObjectsOverText, FourObjects, ClipArtAndVerticalText, VerticalTitleAndTextOverChart, ObjectAndTwoObject, TwoObjectsAndObject. |
| ArgumentException | Levé si la valeur du nom de la mise en page*layoutName*est déjà utilisé dans cette collection de mises en page. |

### Remarques

Mise en page insérée pour la valeur SlideLayoutType.Custom de*layoutType* ne contient aucun espace réservé ni aucune forme.

### Voir également

* interface [ILayoutSlide](../../ilayoutslide)
* enum [SlideLayoutType](../../slidelayouttype)
* interface [IMasterLayoutSlideCollection](../../imasterlayoutslidecollection)
* espace de noms [Aspose.Slides](../../imasterlayoutslidecollection)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
