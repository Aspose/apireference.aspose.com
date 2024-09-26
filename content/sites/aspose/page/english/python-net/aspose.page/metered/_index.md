---
title: Metered class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 80
url: /python-net/aspose.page/metered/
---

## Metered class

Provides methods to set metered key.



The Metered type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
| `Metered()` | Initializes a new instance of this class. |
## Methods
| Name | Description |
| :- | :- |
| `set_metered_key(public_key, private_key)` | Sets metered public and private key.<br/>            If you purchase metered license, when start application, this API should be called, normally, this is enough. <br/>            However, if always fail to upload consumption data and exceed 24 hours, the license will be set to evaluation status, <br/>            to avoid such case, you should regularly check the license status, if it is evaluation status, call this API again. |
| `get_consumption_quantity()` | Gets consumption file size |
| `get_consumption_credit()` | Gets consumption credit |

### See Also

* module [`aspose.page`](/page/python-net/aspose.page/)
* package [`aspose.page`](/page/python-net/)

