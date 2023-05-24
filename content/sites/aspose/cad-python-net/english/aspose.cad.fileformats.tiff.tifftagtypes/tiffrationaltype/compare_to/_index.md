---
title: compare_to method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 20
url: /aspose.cad.fileformats.tiff.tifftagtypes/tiffrationaltype/compare_to/
is_root: false
---

## compare_to {#any}

Compares the current instance with another object of the same type and returns an integer that indicates whether the current instance precedes, follows, or occurs in the same position in the sort order as the other object.


### Returns 


A 32-bit signed integer that indicates the relative order of the objects being compared. The return value has these meanings:
Value
Meaning
Less than zero
This instance is less than `obj`.
Zero
This instance is equal to `obj`.
Greater than zero
This instance is greater than `obj`.


```python
def compare_to(self, obj):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| obj | any | An object to compare with this instance. |
### Exceptions
| Exception | Description |
| :- | :- |
| [`TiffImageException`](/cad/python-net/aspose.cad.cadexceptions.imageformats/tiffimageexception) | Expected TiffDataType type. |





### See Also
* module [`aspose.cad.fileformats.tiff.tifftagtypes`](../../)
* class [`TiffImageException`](/cad/python-net/aspose.cad.cadexceptions.imageformats/tiffimageexception)
* class [`TiffRationalType`](/cad/python-net/aspose.cad.fileformats.tiff.tifftagtypes/tiffrationaltype)
