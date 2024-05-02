---
title: are_equal_by_content method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.cad.fileformats.glb.io/jsoncontent/are_equal_by_content/
is_root: false
---

## are_equal_by_content {#aspose.cad.fileformats.glb.io.JsonContent-aspose.cad.fileformats.glb.io.JsonContent-float}

Compares two [`JsonContent`](/cad/python-net/aspose.cad.fileformats.glb.io/jsoncontent) objects for equality.


### Returns 


true if the objects are considered equal


```python
def are_equal_by_content(self, a, b, precission):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| a | [`JsonContent`](/cad/python-net/aspose.cad.fileformats.glb.io/jsoncontent) | The first object to compare. |
| b | [`JsonContent`](/cad/python-net/aspose.cad.fileformats.glb.io/jsoncontent) | The second object to compare. |
| precission | float | The precission threshold when comparing floating point values. |
### Remarks

- Comparing json structures is tricky because the values are typeless, so when we parse a json DOM
into memory we don't know which should be the right type to use for comparison.
- Also, Json is roundtrip safe when used in Net Core, but it is not when used in
Net Framework, so depending on the framework we use, floating point roundtrips will behave differently.


### See Also
* module [`aspose.cad.fileformats.glb.io`](../../)
* class [`JsonContent`](/cad/python-net/aspose.cad.fileformats.glb.io/jsoncontent)
