---
title: VbaProjectReferenceCollection clase
second_title: Aspose.Cells for Python via .NET API Referencias
description:
type: docs
weight: 50
url: /es/aspose.cells.vba/vbaprojectreferencecollection/
is_root: false
---
##  VbaProjectReferenceCollection clase
Representa todas las referencias del proyecto VBA.



El tipo VbaProjectReferenceCollection expone los siguientes miembros:

###  Propiedades
| Propiedad| Descripción|
| :- | :- |
| [capacity](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/capacity) | Obtiene o establece el número de elementos que puede contener la lista de matrices.|


###  Métodos
| Método| Descripción|
| :- | :- |
| [`copy_to(self, array)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/copy_to/#list) |Copia la lista de matrices completa a una lista de matrices unidimensional compatible, comenzando por el principio de la lista de matrices de destino.|
| [`copy_to(self, index, array, array_index, count)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/copy_to/#int-list-int-int) | Copia un rango de elementos de la lista de matrices a una lista de matrices unidimensionales compatible, comenzando en el índice especificado de la lista de matrices de destino.|
| [`index_of(self, item, index)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/index_of/#aspose.cells.vba.vbaprojectreference-int) | Busca el objeto especificado y devuelve el índice basado en cero de la primera ocurrencia dentro del rango de elementos en la lista de la matriz que se extiende desde el índice especificado hasta el último elemento.|
| [`index_of(self, item, index, count)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/index_of/#aspose.cells.vba.vbaprojectreference-int-int) | Busca el objeto especificado y devuelve el índice basado en cero de la primera ocurrencia dentro del rango de elementos en la lista de matriz que comienza en el índice especificado y contiene la cantidad especificada de elementos.|
| [`last_index_of(self, item)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/last_index_of/#aspose.cells.vba.vbaprojectreference) | Busca el objeto especificado y devuelve el índice basado en cero de la última aparición dentro de toda la lista de la matriz.|
| [`last_index_of(self, item, index)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/last_index_of/#aspose.cells.vba.vbaprojectreference-int) |Busca el objeto especificado y devuelve el índice basado en cero de la última ocurrencia dentro del rango de elementos en la lista de matriz que se extiende desde el primer elemento hasta el índice especificado.|
| [`last_index_of(self, item, index, count)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/last_index_of/#aspose.cells.vba.vbaprojectreference-int-int) | Busca el objeto especificado y devuelve el índice basado en cero de la última ocurrencia dentro del rango de elementos en la lista de matriz que contiene la cantidad especificada de elementos y termina en el índice especificado.|
| [`add_registered_reference(self, name, libid)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/add_registered_reference/#str-str) | Agrega una referencia a una biblioteca de tipos de automatización.|
| [`add_control_refrernce(self, name, libid, twiddledlibid, extended_libid)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/add_control_refrernce/#str-str-str-str) |Agrega una referencia a una biblioteca de tipos twiddled y su biblioteca de tipos extendida.|
| [`add_project_refrernce(self, name, absolute_libid, relative_libid)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/add_project_refrernce/#str-str-str) | Agrega una referencia a un proyecto VBA externo.|
| [`binary_search(self, item)`](/cells/python-net/es/aspose.cells.vba/vbaprojectreferencecollection/binary_search/#aspose.cells.vba.vbaprojectreference) | Busca en toda la lista de la matriz ordenada un elemento utilizando el comparador predeterminado y devuelve el índice basado en cero del elemento.|



###  Ejemplo

```python
from aspose.cells import Workbook

# Instantiating a Workbook object
workbook = Workbook()
#  Init VBA project.
vbaProject = workbook.vba_project
#  Add vba project reference
vbaProject.references.add_registered_reference("stdole", "*\\G{00020430-0000-0000-C000-000000000046}#2.0#0#C:\\Windows\\system32\\stdole2.tlb#OLE Automation")
# Saving the Excel file
workbook.save("book1.xlsm")

```

###  Ver también
* módulo [`aspose.cells.vba`](..)
