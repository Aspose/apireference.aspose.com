---
title: méthode add_active_x_control
second_title: Aspose.Cells for Python via .NET API Références
description:
type: docs
weight: 20
url: /fr/aspose.cells.drawing/shapecollection/add_active_x_control/
is_root: false
---
##  add_active_x_control(self, type, top_row, top, left_column, left, width, height) {#aspose.cells.drawing.activexcontrols.ControlType-int-int-int-int-int-int}
Crée un contrôle Activex.


###  Retour




```python

def add_active_x_control(self, type, top_row, top, left_column, left, width, height):
    ...
```


| Paramètre| Taper| Description|
| :- | :- | :- |
| type | aspose.cells.drawing.activexcontrols.ControlType | Le type de contrôle.|
| top_row | int | Index de la rangée supérieure gauche.|
| top | int | Représente le décalage vertical de la forme par rapport à sa rangée de gauche, en unité de pixel.|
| left_column | int | Index de la colonne supérieure gauche.|
| left | int | Représente le décalage horizontal de la forme par rapport à sa colonne de gauche, en unité de pixel.|
| width | int | Représente la largeur de la forme, en unité de pixel.|
| height | int | Représente la hauteur de la forme, en unité de pixel.|

###  Exemple

```python
from aspose.cells.drawing.activexcontrols import ControlType

# add an ActiveX control
activeXControl = shapes.add_active_x_control(ControlType.CHECK_BOX, 1, 0, 1, 0, 100, 50)

```



###  Voir également
* module [`aspose.cells.drawing`](../../)
* classe [`ShapeCollection`](/cells/python-net/fr/aspose.cells.drawing/shapecollection)
