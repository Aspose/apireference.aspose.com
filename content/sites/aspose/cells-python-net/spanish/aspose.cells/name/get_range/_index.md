---
title: método get_range
second_title: Aspose.Cells for Python via .NET API Referencias
description:
type: docs
weight: 20
url: /es/aspose.cells/name/get_range/
is_root: false
---
##  get_range(self) {#}
Obtiene el rango si este nombre hace referencia a un rango.


###  Devoluciones

El rango.


```python

def get_range(self):
    ...
```




##  get_range(self, recalculate) {#bool}
Obtiene el rango si este nombre hace referencia a un rango


###  Devoluciones

El rango.


```python

def get_range(self, recalculate):
    ...
```


| Parámetro| Tipo| Descripción|
| :- | :- | :- |
| recalculate | bool | si recalcularlo si este nombre ha sido calculado antes de esta invocación.|


##  get_range(self, sheet_index, row, column) {#int-int-int}
Obtiene el rango si este nombre hace referencia a un rango.
Si la referencia de este nombre no es absoluta, el rango puede ser diferente para cada celda.


###  Devoluciones

El rango.


```python

def get_range(self, sheet_index, row, column):
    ...
```


| Parámetro| Tipo| Descripción|
| :- | :- | :- |
| sheet_index | int | Índice de hojas correspondientes.|
| row | int | El índice de fila correspondiente.|
| column | int | El índice de columna correspondiente|



###  Ver también
* módulo [`aspose.cells`](../../)
* clase [`Name`](/cells/python-net/es/aspose.cells/name)
