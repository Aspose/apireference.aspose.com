---
title: active_x_control Eigentum
second_title: Aspose.Cells for Python via .NET API Referenzen
description:
type: docs
weight: 270
url: /de/aspose.cells.drawing/chartshape/active_x_control/
is_root: false
---
##  active_x_control Eigentum

Ruft das ActiveX-Steuerelement ab.

###  Beispiel

```python
from aspose import pycore
from aspose.cells.drawing.activexcontrols import CheckBoxActiveXControl

if shape.active_x_control != None:
    checkBox1 = pycore.cast(CheckBoxActiveXControl, shape.active_x_control)
    # The font name of CheckBox
    fontName = checkBox1.font.name

```
###  Definition:
```python
@property
def active_x_control(self):
    ...
```

###  Siehe auch
* Modul [`aspose.cells.drawing`](../../)
* Klasse [`ChartShape`](/cells/python-net/de/aspose.cells.drawing/chartshape)
