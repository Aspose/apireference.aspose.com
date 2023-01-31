---
title: Metered class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 140
url: /python-net/aspose.threed/metered/
is_root: false
---

## Metered class

Provides methods to set metered key.



The Metered type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Metered()](/3d/python-net/aspose.threed/metered/__init__/#) | Initializes a new instance of this class. |


### Methods
| Method | Description |
| :- | :- |
| [set_metered_key(public_key, private_key)](/3d/python-net/aspose.threed/metered/set_metered_key/#str-str) | Sets metered public and private key.<br/>If you purchase metered license, when start application, this API should be called, normally, this is enough. However, if always fail to upload consumption data and exceed 24 hours, the license will be set to evaluation status, to avoid such case, you should regularly check the license status, if it is evaluation status, call this API again. |
| [get_consumption_quantity()](/3d/python-net/aspose.threed/metered/get_consumption_quantity/#) | Gets consumption file size |
| [get_consumption_credit()](/3d/python-net/aspose.threed/metered/get_consumption_credit/#) | Gets consumption credit |



### Example 


In this example, an attempt will be made to set metered public and private key
### See Also

* module [aspose.threed](../)
