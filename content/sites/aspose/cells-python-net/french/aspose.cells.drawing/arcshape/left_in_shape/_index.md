---
title: left_in_shape propriété
second_title: Aspose.Cells for Python via .NET API Références
description:
type: docs
weight: 760
url: /fr/aspose.cells.drawing/arcshape/left_in_shape/
is_root: false
---
##  left_in_shape propriété

 Représente le décalage horizontal de la forme par rapport à la bordure gauche de la forme parent,
en unité de 1/4000 de la largeur de la forme parente.

###  Remarques

S'applique uniquement lorsque cette forme se trouve dans le groupe ou le graphique.

###  Exemple

```python

if shape.is_in_group and shape.left_in_shape == 2000:
    shape.left_in_shape = 4000

```
###  Définition:
```python
@property
def left_in_shape(self):
    ...
@left_in_shape.setter
def left_in_shape(self, value):
    ...
```

###  Voir également
* module [`aspose.cells.drawing`](../../)
* classe [`ArcShape`](/cells/python-net/fr/aspose.cells.drawing/arcshape)
