---
title: add_icons Methode
second_title: Aspose.Cells for Python via .NET API Referenzen
description:
type: docs
weight: 140
url: /de/aspose.cells.drawing/shapecollection/add_icons/
is_root: false
---
##  add_icons(self, upper_left_row, top, upper_left_column, left, height, width, image_byte_data, compatible_image_data) {#int-int-int-int-int-int-bytes-bytes}
Fügt ein SVG-Bild hinzu.


###  Kehrt zurück




```python

def add_icons(self, upper_left_row, top, upper_left_column, left, height, width, image_byte_data, compatible_image_data):
    ...
```


| Parameter| Typ| Beschreibung|
| :- | :- | :- |
| upper_left_row | int | Zeilenindex oben links.|
| top | int | Stellt den vertikalen Versatz der Form von ihrer linken Reihe in Pixeleinheiten dar.|
| upper_left_column | int | Index der oberen linken Spalte.|
| left | int | Der horizontale Versatz der Form von ihrer linken Spalte in Pixeleinheiten.|
| height | int | Die Höhe der Form in Pixeleinheiten.|
| width | int | Die Breite der Form in Pixeleinheiten.|
| image_byte_data | bytes | Die Bildbytedaten.|
| compatible_image_data | bytes | Konvertierte Bilddaten aus SVG, um mit Excel 2016 oder niedrigeren Versionen kompatibel zu sein.|

###  Beispiel

```python
from aspose import pycore
import bytearray
import int

# add icon
with open("icon.svg", "rb") as fs:
    len = pycore.cast(int, utils.filesize(fs))
    imageData = bytearray(len)
    fs.readinto(imageData)
    picture = shapes.add_icons(4, 0, 5, 0, -1, -1, imageData, None)

```



###  Siehe auch
* Modul [`aspose.cells.drawing`](../../)
* Klasse [`ShapeCollection`](/cells/python-net/de/aspose.cells.drawing/shapecollection)
