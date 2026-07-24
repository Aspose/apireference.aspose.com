---
title: "énumération Aspose::Page::XPS::XpsModel::XpsTileMode"
linktitle: "XpsTileMode"
second_title: "Aspose.Page pour C++"
description: "énumération Aspose::Page::XPS::XpsModel::XpsTileMode. Valeurs valides de la propriété TileMode des pinceaux de carrelage en C++."
type: docs
weight: 5500
url: /fr/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


Valeurs valides de la propriété TileMode des brosses en mosaïque.

```cpp
enum class XpsTileMode
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| None | 0 | Dans ce mode, seule la tuile de base unique est dessinée. La zone restante reste transparente. |
| Tile | 1 | Dans ce mode, la tuile de base est dessinée et la zone restante est remplie en répétant la tuile de base de façon à ce que le bord droit de chaque tuile touche le bord gauche de la suivante, et le bord inférieur de chaque tuile touche le bord supérieur de la suivante. |
| FlipX | 2 | L'agencement des tuiles est similaire au mode Tile, mais les colonnes alternées de tuiles sont retournées horizontalement. La tuile de base est positionnée comme spécifié par le viewport. Les tuiles des colonnes à gauche et à droite de cette tuile sont retournées horizontalement. |
| FlipY | 3 | L'agencement des tuiles est similaire au mode Tile, mais les rangées alternées de tuiles sont retournées verticalement. La tuile de base est positionnée comme spécifié par le viewport. Les rangées au-dessus et en dessous sont retournées verticalement. |
| FlipXY | 4 | L'agencement des tuiles est similaire au mode Tile tile, mais les colonnes alternées de tuiles sont retournées horizontalement et les rangées alternées de tuiles sont retournées verticalement. La tuile de base est positionnée comme spécifié par le viewport. |

## Voir aussi

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
