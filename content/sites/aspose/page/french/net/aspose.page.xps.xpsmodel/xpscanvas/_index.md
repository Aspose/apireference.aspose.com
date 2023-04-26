---
title: Class XpsCanvas
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsModel.XpsCanvas classe. Classe incorporant les fonctionnalités de lélément Canvas. Cet élément regroupe des éléments. Par exemple les éléments Glyphs et Path peuvent être regroupés dans un canevas afin dêtre identifiés comme une unité en tant que destination dun lien hypertexte ou pour appliquer une valeur de propriété composée à chaque élément enfant et ancêtre.
type: docs
weight: 2980
url: /fr/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

Classe incorporant les fonctionnalités de l'élément Canvas. Cet élément regroupe des éléments. Par exemple, les éléments Glyphs et Path peuvent être regroupés dans un canevas afin d'être identifiés comme une unité (en tant que destination d'un lien hypertexte) ou pour appliquer une valeur de propriété composée à chaque élément enfant et ancêtre.

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Renvoie/définit l'instance de géométrie de chemin limitant la région rendue de l'élément. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Renvoie le nombre d'éléments enfants. |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | Renvoie/définit la valeur qui contrôle le rendu des bords des chemins dans le canevas. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Renvoie/définit l'objet cible du lien hypertexte. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Fournit un accès aux enfants de l'élément par index*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Renvoie/définit la valeur définissant la transparence uniforme de l'élément. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Renvoie/définit le pinceau en spécifiant un masque de valeurs alpha qui est appliqué à l'élément de la même manière que l'attribut Opacité, mais en autorisant différentes valeurs alpha pour différentes zones de l'élément. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Renvoie/définit la matrice de transformation affine établissant un nouveau cadre de coordonnées pour tous les attributs de l'élément et pour tous les éléments enfants (le cas échéant). |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | Ajoute un élément à la liste des enfants de ce canevas. |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | Ajoute un nouveau canevas à la liste des enfants de ce canevas. |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | Ajoute de nouveaux glyphes à la liste enfant de ce canevas. |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | Ajoute un nouveau chemin à la liste des enfants de ce canevas. |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | Clone ce canevas. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Mise en œuvre deIEnumerable interface. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | Insère un élément dans la liste des enfants de ce canevas à*index* position. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | Insère un nouveau canevas dans la liste des enfants de ce canevas à*index* position. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | Insère de nouveaux glyphes dans la liste enfant de ce canevas à*index* position. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | Insère un nouveau chemin vers la liste des enfants de ce canevas à*index* position. |

### Voir également

* class [XpsContentElement](../xpscontentelement/)
* espace de noms [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* Assemblée [Aspose.Page](../../)


