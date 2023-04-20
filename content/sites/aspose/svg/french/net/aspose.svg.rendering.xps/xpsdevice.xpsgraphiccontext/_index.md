---
title: Class XpsDevice.XpsGraphicContext
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Rendering.Xps.XpsDeviceXpsGraphicContext classe. Contient les paramètres de contrôle graphiques actuels pour le XpsDevice. Ces paramètres définissent le cadre global dans lequel les opérateurs graphiques sexécutent.
type: docs
weight: 3060
url: /fr/net/aspose.svg.rendering.xps/xpsdevice.xpsgraphiccontext/
---
## XpsDevice.XpsGraphicContext class

Contient les paramètres de contrôle graphiques actuels pour le XpsDevice. Ces paramètres définissent le cadre global dans lequel les opérateurs graphiques s'exécutent.

```csharp
public class XpsGraphicContext : GraphicContext
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [XpsGraphicContext](xpsgraphiccontext/)() | Default_Constructor |

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Définit ou obtient l'espacement des caractères. |
| virtual [FillBrush](../../aspose.svg.rendering/graphiccontext/fillbrush/) { get; set; } | Définit ou obtient l'objet pinceau utilisé pour remplir l'intérieur des chemins. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Définit ou obtient l'objet de police True Type utilisé pour le rendu du texte. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Définit ou obtient la taille de la police du texte. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Définit ou obtient le style de police du texte. |
| virtual [LineCap](../../aspose.svg.rendering/graphiccontext/linecap/) { get; set; } | Définit ou obtient le code spécifiant la forme des points de terminaison pour tout chemin ouvert tracé. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Définit ou obtient le décalage de phase du motif de tiret de ligne actuel. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Définit ou obtient la description du motif de tirets à utiliser lorsque les chemins sont tracés. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Ensembles de obtient le style des lignes en pointillés d'un chemin tracé. |
| virtual [LineJoin](../../aspose.svg.rendering/graphiccontext/linejoin/) { get; set; } | Définit ou obtient le code spécifiant la forme des joints entre les segments connectés d'un tracé tracé. |
| virtual [LineWidth](../../aspose.svg.rendering/graphiccontext/linewidth/) { get; set; } | Définit ou obtient l'épaisseur des chemins à tracer. |
| virtual [MiterLimit](../../aspose.svg.rendering/graphiccontext/miterlimit/) { get; set; } | Définit ou obtient la longueur maximale des jointures de lignes en onglet pour les chemins tracés. Ce paramètre limite la longueur des "pointes" produites lorsque les segments de ligne se rejoignent à des angles vifs. |
| virtual [StrokeBrush](../../aspose.svg.rendering/graphiccontext/strokebrush/) { get; set; } | Définit ou obtient l'objet pinceau utilisé pour les tracés tracés. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Obtient un[`TextInfo`](../../aspose.svg.rendering/textinfo/) objet qui contient des informations sur le texte rendu. |
| virtual [TransformationMatrix](../../aspose.svg.rendering/graphiccontext/transformationmatrix/) { get; set; } | Définit ou obtient la matrice de transformation. |

## Méthodes

| Nom | La description |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.xps/xpsgraphiccontext/clone/)() | Crée une nouvelle instance d'une classe XpsGraphicContext avec les mêmes valeurs de propriété qu'une instance existante. |
| virtual [Transform](../../aspose.svg.rendering/graphiccontext/transform/)(Matrix) | Modifier la matrice de transformation actuelle en multipliant la matrice spécifiée. |

### Voir également

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [XpsDevice](../xpsdevice/)
* espace de noms [Aspose.Svg.Rendering.Xps](../../aspose.svg.rendering.xps/)
* Assemblée [Aspose.SVG](../../)


