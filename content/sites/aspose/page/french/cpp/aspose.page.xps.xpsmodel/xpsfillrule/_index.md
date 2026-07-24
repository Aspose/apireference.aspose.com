---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule enum"
linktitle: "XpsFillRule"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule enum. Valeurs valides de la propriété FillRule de l'élément PathGeometry en C++."
type: docs
weight: 4900
url: /fr/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


Valeurs valides de la propriété FillRule de l'élément PathGeometry.

```cpp
enum class XpsFillRule
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| EvenOdd | 0 | Cette règle détermine la “insideness” d'un point sur le canvas en dessinant un rayon du point vers l'infini dans n'importe quelle direction et en comptant le nombre de segments de la forme donnée que le rayon traverse. Si ce nombre est impair, le point est à l'intérieur ; s'il est pair, le point est à l'extérieur. |
| NonZero | 1 | Cette règle détermine le « insideness » d’un point sur le canevas en traçant un rayon depuis le point vers l’infini dans n’importe quelle direction, puis en examinant les endroits où un segment de la forme croise le rayon. En commençant avec un compteur à zéro, ajoutez un chaque fois qu’un segment traverse le rayon de gauche à droite et soustrayez‑en un chaque fois qu’un segment de chemin traverse le rayon de droite à gauche. Après avoir compté les traversées, si le résultat est zéro, le point est à l’extérieur du chemin ; sinon, il est à l’intérieur. |

## Voir aussi

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
