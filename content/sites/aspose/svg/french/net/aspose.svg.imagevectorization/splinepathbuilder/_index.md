---
title: Class SplinePathBuilder
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.ImageVectorization.SplinePathBuilder classe. LeSplinePathBuilder la classe est responsable de la construction des segments de cheminSVGPathSeg à partir de la liste des points de trace. Ce constructeur de chemin est basé sur lapplication dune spline CatmullRoma à un ensemble de points de chemin lissés et réduits..
type: docs
weight: 2160
url: /fr/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

Le`SplinePathBuilder` la classe est responsable de la construction des segments de chemin[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) à partir de la liste des points de trace. Ce constructeur de chemin est basé sur l'application d'une spline Catmull-Roma à un ensemble de points de chemin lissés et réduits..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Initialise une nouvelle instance du`SplinePathBuilder` classe. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Initialise une nouvelle instance du`SplinePathBuilder` classe. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Initialise une nouvelle instance du`SplinePathBuilder` classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | La valeur des tensions affecte la netteté de la courbure aux points de contrôle (interpolés). Elle doit être comprise entre 0 et 1. Toute valeur supérieure ou inférieure sera alignée sur les valeurs minimales et maximales de cette plage, en conséquence. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Obtient ou définit le simplificateur de trace. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Obtient ou définit la trace plus lisse. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Construit des segments de chemin à partir de la liste des points de trace. |

### Voir également

* interface [IPathBuilder](../ipathbuilder/)
* espace de noms [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* Assemblée [Aspose.SVG](../../)


