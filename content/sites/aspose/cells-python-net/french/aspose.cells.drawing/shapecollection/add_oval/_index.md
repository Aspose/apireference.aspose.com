---
title: méthode add_oval
second_title: Aspose.Cells for Python via .NET API Références
description:
type: docs
weight: 220
url: /fr/aspose.cells.drawing/shapecollection/add_oval/
is_root: false
---
##  add_oval(self, upper_left_row, top, upper_left_column, left, height, width) {#int-int-int-int-int-int}
Ajoute un ovale à la feuille de calcul.


###  Retour

Un objet ovale.


```python

def add_oval(self, upper_left_row, top, upper_left_column, left, height, width):
    ...
```


| Paramètre| Taper| Description|
| :- | :- | :- |
| upper_left_row | int | Index de la rangée supérieure gauche.|
| top | int | Représente le décalage vertical de l'Ovale par rapport à sa rangée de gauche, en unité de pixel.|
| upper_left_column | int | Index de la colonne supérieure gauche.|
| left | int | Représente le décalage horizontal de l'Ovale par rapport à sa colonne de gauche, en unité de pixel.|
| height | int | Représente la hauteur de l'ovale, en unité de pixel.|
| width | int | Représente la largeur de l'ovale, en unité de pixel.|

###  Exemple

```python

# add a oval
oval = shapes.add_oval(1, 0, 1, 0, 50, 50)

```



###  Voir également
* module [`aspose.cells.drawing`](../../)
* classe [`ShapeCollection`](/cells/python-net/fr/aspose.cells.drawing/shapecollection)
