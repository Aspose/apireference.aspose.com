---
title: Class SVGPathSeg
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Paths.SVGPathSeg classe. Linterface SVGPathSeg est une interface de base qui correspond à une seule commande dans une spécification de données de chemin.
type: docs
weight: 2490
url: /fr/net/aspose.svg.paths/svgpathseg/
---
## SVGPathSeg class

L'interface SVGPathSeg est une interface de base qui correspond à une seule commande dans une spécification de données de chemin.

```csharp
public abstract class SVGPathSeg : SVGValueType
```

## Propriétés

| Nom | La description |
| --- | --- |
| [PathSegType](../../aspose.svg.paths/svgpathseg/pathsegtype/) { get; } | Le type du segment de chemin tel que spécifié par l'une des constantes définies sur cette interface. |
| [PathSegTypeAsLetter](../../aspose.svg.paths/svgpathseg/pathsegtypeasletter/) { get; } | Le type du segment de chemin, spécifié par le nom de commande à un caractère correspondant. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Libère les ressources non gérées et - éventuellement - gérées. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Cette méthode est utilisée pour récupérer l'objet ECMAScriptType . |

## Des champs

| Nom | La description |
| --- | --- |
| const [PATHSEG_ARC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_arc_abs/) | Correspond à une commande de données de chemin "arcto absolu" (A). |
| const [PATHSEG_ARC_REL](../../aspose.svg.paths/svgpathseg/pathseg_arc_rel/) | Correspond à une commande de données de chemin "arc relatif" (a). |
| const [PATHSEG_CLOSEPATH](../../aspose.svg.paths/svgpathseg/pathseg_closepath/) | Correspond à une commande de données de chemin "closepath" (z). |
| const [PATHSEG_CURVETO_CUBIC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_abs/) | Correspond à une commande de données de chemin "Courbe de Bézier cubique absolue" (C). |
| const [PATHSEG_CURVETO_CUBIC_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_rel/) | Correspond à une commande "courbe de Bézier cubique relative" (c) path data. |
| const [PATHSEG_CURVETO_CUBIC_SMOOTH_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_smooth_abs/) | Correspond à une commande de données de chemin "absolue smooth cubic curveto" (S). |
| const [PATHSEG_CURVETO_CUBIC_SMOOTH_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_smooth_rel/) | Correspond à une commande de données de chemin "relative smooth cubic curveto" (s). |
| const [PATHSEG_CURVETO_QUADRATIC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_abs/) | Correspond à une commande de données de chemin « courbe de Bézier quadratique absolue » (Q). |
| const [PATHSEG_CURVETO_QUADRATIC_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_rel/) | Correspond à une commande de données de chemin "courbe de Bézier quadratique relative" (q). |
| const [PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_smooth_abs/) | Correspond à une commande de données de chemin "absolue smooth quadratic curveto" (T). |
| const [PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_smooth_rel/) | Correspond à une commande de données de chemin "relative smooth quadratic curveto" (t). |
| const [PATHSEG_LINETO_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_abs/) | Correspond à une commande de données de chemin "lineto absolue" (L). |
| const [PATHSEG_LINETO_HORIZONTAL_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_horizontal_abs/) | Correspond à une commande de données de chemin "ligne horizontale absolue" (H). |
| const [PATHSEG_LINETO_HORIZONTAL_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_horizontal_rel/) | Correspond à une commande de données de chemin "relative horizontal lineto" (h). |
| const [PATHSEG_LINETO_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_rel/) | Correspond à une commande de données de chemin "relative lineto" (l). |
| const [PATHSEG_LINETO_VERTICAL_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_vertical_abs/) | Correspond à une commande de données de chemin "ligne verticale absolue" (V). |
| const [PATHSEG_LINETO_VERTICAL_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_vertical_rel/) | Correspond à une commande de données de chemin "relative vertical lineto" (v). |
| const [PATHSEG_MOVETO_ABS](../../aspose.svg.paths/svgpathseg/pathseg_moveto_abs/) | Correspond à une commande de données de chemin "moveto absolu" (M). |
| const [PATHSEG_MOVETO_REL](../../aspose.svg.paths/svgpathseg/pathseg_moveto_rel/) | Correspond à une commande de données de chemin "relative moveto" (m). |
| const [PATHSEG_UNKNOWN](../../aspose.svg.paths/svgpathseg/pathseg_unknown/) | Le type d'unité ne fait pas partie des types prédéfinis. Il n'est pas valide de tenter de définir une nouvelle valeur de ce type ou de tenter de basculer une valeur existante vers ce type. |

### Voir également

* class [SVGValueType](../../aspose.svg.datatypes/svgvaluetype/)
* espace de noms [Aspose.Svg.Paths](../../aspose.svg.paths/)
* Assemblée [Aspose.SVG](../../)


