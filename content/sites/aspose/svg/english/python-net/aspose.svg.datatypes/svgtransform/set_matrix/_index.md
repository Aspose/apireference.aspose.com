---
title: set_matrix method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.svg.datatypes/svgtransform/set_matrix/
is_root: false
---

## set_matrix {#aspose.svg.datatypes.SVGMatrix}

Sets the transform type to SVG_TRANSFORM_MATRIX, with parameter matrix defining the new transformation. The values from the parameter matrix are copied, the matrix parameter does not replace SVGTransform::matrix.



```python
def set_matrix(self, matrix):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| matrix | [`SVGMatrix`](/svg/python-net/aspose.svg.datatypes/svgmatrix) | The new matrix for the transformation. |
### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | Code [`DOMException.NO_MODIFICATION_ALLOWED_ERR`](/svg/python-net/aspose.svg.dom/domexception). <br/>Raised on an attempt to change the value of a read only attribute. |





### See Also
* module [`aspose.svg.datatypes`](../../)
* class [`DOMException`](/svg/python-net/aspose.svg.dom/domexception)
* class [`SVGTransform`](/svg/python-net/aspose.svg.datatypes/svgtransform)
