---
title: Enum XpsFillRule
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsModel.XpsFillRule énumération. Valeurs valides de la propriété FillRule de lélément PathGeometry.
type: docs
weight: 3080
url: /fr/net/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enumeration

Valeurs valides de la propriété FillRule de l'élément PathGeometry.

```csharp
public enum XpsFillRule
```

### Valeurs

| Nom | Évaluer | La description |
| --- | --- | --- |
| EvenOdd | `0` | Cette règle détermine "l'intérieur" d'un point sur la toile en dessinant un rayon du point à l'infini dans n'importe quelle direction et en comptant le nombre de segments à partir de la forme donnée que le rayon traverse. Si ce nombre est impair, le point est à l'intérieur ; s'il est pair, le point est à l'extérieur. |
| NonZero | `1` | Cette règle détermine "l'intérieur" d'un point sur la toile en dessinant un rayon du point à l'infini dans n'importe quelle direction, puis en examinant les endroits où un segment de la forme croise le rayon. En partant de zéro, ajoutez un chaque fois qu'un segment traverse le rayon de gauche à droite et soustrayez un chaque fois qu'un segment de chemin traverse le rayon de droite à gauche. Après avoir compté les croisements, si le résultat est zéro alors le point est en dehors du chemin ; sinon, c'est à l'intérieur. |

### Voir également

* espace de noms [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* Assemblée [Aspose.Page](../../)


