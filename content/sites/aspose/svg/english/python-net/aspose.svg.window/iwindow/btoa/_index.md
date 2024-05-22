---
title: btoa method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.svg.window/iwindow/btoa/
is_root: false
---

## btoa {#str}

Takes the input data, in the form of a Unicode string containing only characters in the range U+0000 to U+00FF,
each representing a binary byte with values 0x00 to 0xFF respectively, and converts it to its base64 representation, which it returns.


### Returns 


The base64 string.


```python
def btoa(self, data):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| data | str | The Unicode string containing only characters in the range U+0000 to U+00FF. |
### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | Throws an "InvalidCharacterError" DOMException exception if the input string contains any out-of-range characters. |





### See Also
* module [`aspose.svg.window`](../../)
* class [`DOMException`](/svg/python-net/aspose.svg.dom/domexception)
* class [`IWindow`](/svg/python-net/aspose.svg.window/iwindow)
