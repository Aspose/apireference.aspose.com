---
title: método set_formulas
second_title: Aspose.Cells for Python via .NET API Referencias
description:
type: docs
weight: 60
url: /es/aspose.cells/formatcondition/set_formulas/
is_root: false
---
##  set_formulas(self, formula1, formula2, is_r1c1, is_local) {#str-str-bool-bool}
Establece el valor o la expresión asociada con esta condición de formato.



```python

def set_formulas(self, formula1, formula2, is_r1c1, is_local):
    ...
```


| Parámetro| Tipo| Descripción|
| :- | :- | :- |
| formula1 | str | El valor o la expresión asociada con esta condición de formato.<br/>Si el valor de entrada empieza por '=', se considerará una fórmula. De lo contrario, se considerará un valor simple (texto, número, booleano).<br/> Para un valor de texto que comienza con '=', el usuario puede ingresarlo como fórmula en el formato: "=\"=...\"".|
| formula2 | str | El valor o la expresión asociada a esta condición de formato. El formato de entrada es el mismo que el de la fórmula 1.|
| is_r1c1 | bool | Si la fórmula es fórmula R1C1.|
| is_local | bool | Si la fórmula tiene formato regional.|



###  Ver también
* módulo [`aspose.cells`](../../)
* clase [`FormatCondition`](/cells/python-net/es/aspose.cells/formatcondition)
