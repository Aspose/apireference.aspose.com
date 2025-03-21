﻿---
title: add_copy method
second_title: Aspose.Cells for Python via .NET API References
description: 
type: docs
weight: 30
url: /aspose.cells/worksheetcollection/add_copy/
is_root: false
---

## add_copy(self, sheet_name) {#str}

Adds a worksheet to the collection and copies data from an existed worksheet.


### Returns 


[`Worksheet`](/cells/python-net/aspose.cells/worksheet) object index.


```python

def add_copy(self, sheet_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| sheet_name | str | Name of source worksheet. |
### Exceptions
| Exception | Description |
| :- | :- |
| [`CellsException`](/cells/python-net/aspose.cells/cellsexception) | Specifies an invalid worksheet name. |




## add_copy(self, sheet_index) {#int}

Adds a worksheet to the collection and copies data from an existed worksheet.


### Returns 


[`Worksheet`](/cells/python-net/aspose.cells/worksheet) object index.


```python

def add_copy(self, sheet_index):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| sheet_index | int | Index of source worksheet. |


## add_copy(self, source, dest_sheet_names) {#list-list}

Copy a group of worksheets.



```python

def add_copy(self, source, dest_sheet_names):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| source | list | The source worksheets. |
| dest_sheet_names | list | The names of the copied sheets. |



### See Also
* module [`aspose.cells`](../../)
* class [`CellsException`](/cells/python-net/aspose.cells/cellsexception)
* class [`Worksheet`](/cells/python-net/aspose.cells/worksheet)
* class [`WorksheetCollection`](/cells/python-net/aspose.cells/worksheetcollection)
