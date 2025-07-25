---
title: método to_image
second_title: Aspose.Cells for Python via .NET API Referencias
description:
type: docs
weight: 240
url: /es/aspose.cells.drawing/label/to_image/
is_root: false
---
##  to_image(self, stream, image_type) {#io.RawIOBase-aspose.cells.drawing.ImageType}
Crea la imagen de forma y la guarda en una secuencia en el formato especificado.



```python

def to_image(self, stream, image_type):
    ...
```


| Parámetro| Tipo| Descripción|
| :- | :- | :- |
| stream | io.RawIOBase | El flujo de salida.|
| image_type | [`ImageType`](/cells/python-net/es/aspose.cells.drawing/imagetype) | El tipo en el que se guardará la imagen.|
###  Observaciones

Se admiten los siguientes formatos:
.bmp, .gif, .jpg, .jpeg, .tiff, .emf.
###  Ejemplo

```python
from aspose.cells.drawing import ImageType
from io import BytesIO

imageStream = BytesIO()
shape.to_image(imageStream, ImageType.PNG)

```


##  to_image(self, image_file, options) {#str-aspose.cells.rendering.ImageOrPrintOptions}
Guarda la forma en un archivo.



```python

def to_image(self, image_file, options):
    ...
```


| Parámetro| Tipo| Descripción|
| :- | :- | :- |
| image_file | str |  |
| options | aspose.cells.rendering.ImageOrPrintOptions |  |

###  Ejemplo

```python
from aspose.cells.rendering import ImageOrPrintOptions

op = ImageOrPrintOptions()
shape.to_image("exmaple.png", op)

```


##  to_image(self, stream, options) {#io.RawIOBase-aspose.cells.rendering.ImageOrPrintOptions}
Guarda la forma en una secuencia.



```python

def to_image(self, stream, options):
    ...
```


| Parámetro| Tipo| Descripción|
| :- | :- | :- |
| stream | io.RawIOBase |  |
| options | aspose.cells.rendering.ImageOrPrintOptions |  |

###  Ejemplo

```python
from aspose.cells.rendering import ImageOrPrintOptions
from io import BytesIO

imageStream = BytesIO()
op = ImageOrPrintOptions()
shape.to_image(imageStream, op)

```



###  Ver también
* módulo [`aspose.cells.drawing`](../../)
* clase [`Label`](/cells/python-net/es/aspose.cells.drawing/label)
