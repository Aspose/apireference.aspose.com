---
title: source property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 100
url: /aspose.cad.fileformats.collada.fileparser.elements/brep/source/
is_root: false
---

## source property


Gets or sets the source.
The source elements define the access of the elements vertices, edges and faces to their geometric entities.
At least one source element is needed for the vertices.
If there are edges a second source element is needed for accessing the curves in the curve element by an IDREF_array.
If there are faces the third source element is needed for accessing the surfaces in the surface element by an IDREF_array.
### Definition:
```python
@property
def source(self):
    ...
@source.setter
def source(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.collada.fileparser.elements`](../../)
* class [`Brep`](/cad/python-net/aspose.cad.fileformats.collada.fileparser.elements/brep)
