---
title: Metered class
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.tex/metered/
is_root: false
---

## Metered class

Provides methods to set metered key.



The Metered type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/tex/python-net/aspose.tex/metered/__init__/#) | Initializes a new instance of this class. |


### Methods
| Method | Description |
| :- | :- |
| [set_metered_key](/tex/python-net/aspose.tex/metered/set_metered_key/#str-str) | Sets metered public and private key.<br/>If you purchase metered license, when start application, this API should be called, normally, this is enough. <br/>However, if always fail to upload consumption data and exceed 24 hours, the license will be set to evaluation status, <br/>to avoid such case, you should regularly check the license status, if it is evaluation status, call this API again. |
| [get_consumption_quantity](/tex/python-net/aspose.tex/metered/get_consumption_quantity/#) | Gets consumption file size |
| [get_consumption_credit](/tex/python-net/aspose.tex/metered/get_consumption_credit/#) | Gets consumption credit |



### Example 


In this example, an attempt will be made to set metered public and private key


```python
from aspose.tex import Metered

metered = Metered()
metered.set_metered_key("PublicKey", "PrivateKey")

```

### See Also
* module [`aspose.tex`](..)
