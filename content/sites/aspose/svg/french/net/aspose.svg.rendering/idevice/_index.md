---
title: Interface IDevice
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Rendering.IDevice interface. Définit les méthodes et les propriétés qui prennent en charge le rendu personnalisé des éléments graphiques tels que les chemins le texte et les images.
type: docs
weight: 2810
url: /fr/net/aspose.svg.rendering/idevice/
---
## IDevice interface

Définit les méthodes et les propriétés qui prennent en charge le rendu personnalisé des éléments graphiques tels que les chemins, le texte et les images.

```csharp
public interface IDevice : IDisposable
```

## Propriétés

| Nom | La description |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/idevice/graphiccontext/) { get; } | Obtient le contexte graphique. |
| [Options](../../aspose.svg.rendering/idevice/options/) { get; } | Obtient les options de rendu. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AddRect](../../aspose.svg.rendering/idevice/addrect/)(RectangleF) | Ajoute un rectangle au chemin actuel en tant que sous-chemin complet. |
| [BeginDocument](../../aspose.svg.rendering/idevice/begindocument/)(Document) | Commence le rendu du document. |
| [BeginElement](../../aspose.svg.rendering/idevice/beginelement/)(Element, RectangleF) | Commence le rendu de l'élément. |
| [BeginPage](../../aspose.svg.rendering/idevice/beginpage/)(SizeF) | Commence le rendu de la nouvelle page. |
| [Clip](../../aspose.svg.rendering/idevice/clip/)(FillMode) | Modifie le chemin de détourage actuel en le croisant avec le chemin actuel, en utilisant la règle FillMode pour déterminer la région à remplir. Cette méthode termine le chemin actuel. |
| [ClosePath](../../aspose.svg.rendering/idevice/closepath/)() | Ferme le sous-chemin actuel en ajoutant un segment de ligne droite du point actuel au point de départ du sous-chemin. Si le sous-chemin courant est déjà fermé, "ClosePath" ne fait rien. Cet opérateur termine le sous-chemin courant. L'ajout d'un autre segment au chemin actuel commence un nouveau sous-chemin, même si le nouveau segment commence au point final atteint par la méthode "ClosePath". |
| [CubicBezierTo](../../aspose.svg.rendering/idevice/cubicbezierto/)(PointF, PointF, PointF) | Ajoute une courbe de Bézier cubique au chemin courant. La courbe s'étend du point courant au point pt3, en utilisant pt1 et pt2 comme points de contrôle de Bézier. Le nouveau point courant est pt3. |
| [DrawImage](../../aspose.svg.rendering/idevice/drawimage/)(byte[], ImageType, RectangleF) | Dessine l'image spécifiée. |
| [EndDocument](../../aspose.svg.rendering/idevice/enddocument/)() | Termine le rendu du document. |
| [EndElement](../../aspose.svg.rendering/idevice/endelement/)(Element) | Termine le rendu de l'élément. |
| [EndPage](../../aspose.svg.rendering/idevice/endpage/)() | Termine le rendu de la page en cours. |
| [Fill](../../aspose.svg.rendering/idevice/fill/)(FillMode) | Remplit toute la région délimitée par le chemin actuel. Si le chemin se compose de plusieurs sous-chemins déconnectés, il remplit l'intérieur de tous les sous-chemins, considérés ensemble. Cette méthode termine le chemin actuel. |
| [FillText](../../aspose.svg.rendering/idevice/filltext/)(string, PointF) | Remplit la chaîne de texte spécifiée à l'emplacement spécifié. |
| [Flush](../../aspose.svg.rendering/idevice/flush/)() | Vide toutes les données dans le flux de sortie. |
| [LineTo](../../aspose.svg.rendering/idevice/lineto/)(PointF) | Ajoute un segment de ligne droite du point actuel au point (pt). Le nouveau point courant est pt. |
| [MoveTo](../../aspose.svg.rendering/idevice/moveto/)(PointF) | Commence un nouveau sous-chemin en déplaçant le point courant aux coordonnées du paramètre pt, en omettant tout segment de ligne de connexion. Si la méthode de construction de chemin précédente dans le chemin actuel était également "MoveTo", le nouveau "MoveTo" la remplace ; aucun vestige de l'opération "MoveTo" précédente ne reste dans le chemin. |
| [RestoreGraphicContext](../../aspose.svg.rendering/idevice/restoregraphiccontext/)() | Restaure l'ensemble du contexte graphique à son ancienne valeur en le détachant de la pile. |
| [SaveGraphicContext](../../aspose.svg.rendering/idevice/savegraphiccontext/)() | Pousse une copie de tout le contexte graphique sur la pile. |
| [Stroke](../../aspose.svg.rendering/idevice/stroke/)() | Trace une ligne le long du chemin actuel. La ligne tracée suit chaque segment droit ou courbe du chemin, centré sur le segment avec des côtés parallèles à celui-ci. Chacun des sous-chemins du chemin est traité séparément. Cette méthode termine le chemin actuel. |
| [StrokeAndFill](../../aspose.svg.rendering/idevice/strokeandfill/)(FillMode) | Traits et remplit le chemin actuel. Cette méthode termine le chemin actuel. |
| [StrokeText](../../aspose.svg.rendering/idevice/stroketext/)(string, PointF) | Trait la chaîne de texte spécifiée à l'emplacement spécifié. |

### Voir également

* espace de noms [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* Assemblée [Aspose.SVG](../../)


