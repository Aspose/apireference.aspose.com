---
title: atob method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.svg.window/iwindow/atob/
is_root: false
---

## atob {#str}

Takes the input data, in the form of a Unicode string containing base64-encoded binary data,
decodes it, and returns a string consisting of characters in the range U+0000 to U+00FF,
each representing a binary byte with values 0x00 to 0xFF respectively, corresponding to that binary data.


### Returns 


The string consisting of characters in the range U+0000 to U+00FF


```python
def atob(self, data):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| data | str | The Unicode string containing base64-encoded binary data |
### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | Throws an "InvalidCharacterError" DOMException if the input string is not valid base64 data. |





### See Also
* module [`aspose.svg.window`](../../)
* class [`DOMException`](/svg/python-net/aspose.svg.dom/domexception)
* class [`IWindow`](/svg/python-net/aspose.svg.window/iwindow)
