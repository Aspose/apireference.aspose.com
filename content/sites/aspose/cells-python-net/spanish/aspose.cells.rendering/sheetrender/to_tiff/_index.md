---
title: método to_tiff
second_title: Aspose.Cells for Python via .NET API Referencias
description:
type: docs
weight: 70
url: /es/aspose.cells.rendering/sheetrender/to_tiff/
is_root: false
---
##  to_tiff(self, stream) {#io.RawIOBase}
Representar toda la hoja de cálculo como imagen Tiff para transmitir.



```python

def to_tiff(self, stream):
    ...
```


| Parámetro| Tipo| Descripción|
| :- | :- | :- |
| stream | io.RawIOBase | el flujo de la imagen de salida|


##  to_tiff(self, filename) {#str}
Representar toda la hoja de cálculo como imagen Tiff en un archivo.



```python

def to_tiff(self, filename):
    ...
```


| Parámetro| Tipo| Descripción|
| :- | :- | :- |
| filename | str | el nombre del archivo de la imagen de salida|

###  Ejemplo

El siguiente código genera todas las páginas de la primera hoja en una imagen Tiff.

```python
from aspose.cells import SaveFormat, Workbook
from aspose.cells.rendering import ImageOrPrintOptions, SheetRender

# load the source file with images.
wb = Workbook("Book1.xlsx")
imgOpt = ImageOrPrintOptions()
# set output image type.
imgOpt.save_format = SaveFormat.TIFF
# render the first sheet.
sr = SheetRender(wb.worksheets[0], imgOpt)
# output all the pages of the sheet to Tiff image.
sr.to_tiff("output.tiff")

```



###  Ver también
* módulo [`aspose.cells.rendering`](../../)
* clase [`SheetRender`](/cells/python-net/es/aspose.cells.rendering/sheetrender)
