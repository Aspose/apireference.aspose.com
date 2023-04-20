---
title: Class BezierPathBuilder
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.ImageVectorization.BezierPathBuilder classe. LeSplinePathBuilder la classe est responsable de la construction des segments de cheminSVGPathSeg à partir de la liste des points de trace. Ce constructeur de chemin est basé sur lutilisation de la méthode des moindres carrés pour trouver les points de contrôle de Bézier pour la trace des points.
type: docs
weight: 2080
url: /fr/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

Le[`SplinePathBuilder`](../splinepathbuilder/) la classe est responsable de la construction des segments de chemin[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) à partir de la liste des points de trace. Ce constructeur de chemin est basé sur l'utilisation de la méthode des moindres carrés pour trouver les points de contrôle de Bézier pour la trace des points.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Initialise une nouvelle instance du`BezierPathBuilder` classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Obtient ou définit le seuil d'erreur. Ce paramètre définit l'écart maximal des points par rapport à la courbe ajustée. Par défaut, il est de 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Obtient ou définit le seuil d'erreur. Ce paramètre définit le nombre d'itérations pour la méthode d'approximation des moindres carrés. Par défaut, il est 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | Obtient ou définit la trace plus lisse. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Construit des segments de chemin à partir de la liste des points de trace. |

### Voir également

* interface [IPathBuilder](../ipathbuilder/)
* espace de noms [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* Assemblée [Aspose.SVG](../../)


