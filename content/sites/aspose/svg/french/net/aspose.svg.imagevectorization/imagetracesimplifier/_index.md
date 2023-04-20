---
title: Class ImageTraceSimplifier
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.ImageVectorization.ImageTraceSimplifier classe. La classe ImageTraceSimplifier est responsable de la réduction du nombre de points dans une courbe approximée par une série de points de trace.
type: docs
weight: 2120
url: /fr/net/aspose.svg.imagevectorization/imagetracesimplifier/
---
## ImageTraceSimplifier class

La classe ImageTraceSimplifier est responsable de la réduction du nombre de points dans une courbe approximée par une série de points de trace.

```csharp
public class ImageTraceSimplifier : IImageTraceSimplifier
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [ImageTraceSimplifier](imagetracesimplifier/#constructor)() | Initialise une nouvelle instance du`ImageTraceSimplifier` classe. |
| [ImageTraceSimplifier](imagetracesimplifier/#constructor_1)(float) | Initialise une nouvelle instance du`ImageTraceSimplifier` classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Tolerance](../../aspose.svg.imagevectorization/imagetracesimplifier/tolerance/) { get; set; } | La valeur de la tolérance détermine la tolérance d'erreur maximale autorisée pour qu'un point soit éliminé de la trace. Il doit être compris entre 0 et 4. Toute valeur supérieure ou inférieure sera alignée sur les valeurs minimales et maximales de cette plage, en conséquence. La valeur par défaut est 0,3. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Simplify](../../aspose.svg.imagevectorization/imagetracesimplifier/simplify/)(IEnumerable&lt;PointF&gt;) | Réduit le nombre de points dans la liste des points de trace. |

### Voir également

* interface [IImageTraceSimplifier](../iimagetracesimplifier/)
* espace de noms [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* Assemblée [Aspose.SVG](../../)


