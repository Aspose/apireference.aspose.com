---
title: ErrorCheckOption clase
second_title: Aspose.Cells for Python via .NET API Referencias
description:
type: docs
weight: 530
url: /es/aspose.cells/errorcheckoption/
is_root: false
---
##  ErrorCheckOption clase
Configuración de comprobación de errores aplicada en ciertos rangos.



El tipo ErrorCheckOption expone los siguientes miembros:

###  Métodos
| Método| Descripción|
| :- | :- |
| [`is_error_check(self, error_check_type)`](/cells/python-net/es/aspose.cells/errorcheckoption/is_error_check/#aspose.cells.errorchecktype) | Comprueba si se comprobará el tipo de error dado.|
| [`set_error_check(self, error_check_type, is_check)`](/cells/python-net/es/aspose.cells/errorcheckoption/set_error_check/#aspose.cells.errorchecktype-bool) | Establece si se comprobará el tipo de error dado.|
| [`get_count_of_range(self)`](/cells/python-net/es/aspose.cells/errorcheckoption/get_count_of_range/#) | Obtiene el recuento de rangos influenciados por esta configuración.|
| [`add_range(self, ca)`](/cells/python-net/es/aspose.cells/errorcheckoption/add_range/#aspose.cells.cellarea) | Agrega un rango influenciado por esta configuración.|
| [`get_range(self, index)`](/cells/python-net/es/aspose.cells/errorcheckoption/get_range/#int) | Obtiene el rango influenciado de esta configuración por el índice dado.|
| [`remove_range(self, index)`](/cells/python-net/es/aspose.cells/errorcheckoption/remove_range/#int) | Elimina un rango por índice dado.|



###  Ejemplo

```python
from aspose.cells import CellArea, ErrorCheckType, Workbook

workbook = Workbook()
opts = workbook.worksheets[0].error_check_options
optionIdx = opts.add()
opt = opts[optionIdx]
opt.set_error_check(ErrorCheckType.INCONSIST_FORMULA, False)
opt.set_error_check(ErrorCheckType.INCONSIST_RANGE, False)
opt.set_error_check(ErrorCheckType.TEXT_DATE, False)
opt.set_error_check(ErrorCheckType.TEXT_NUMBER, False)
opt.set_error_check(ErrorCheckType.VALIDATION, False)
opt.add_range(CellArea.create_cell_area("A1", "B10"))
workbook.save(r"Book1.xlsx")

```

###  Ver también
* módulo [`aspose.cells`](..)
