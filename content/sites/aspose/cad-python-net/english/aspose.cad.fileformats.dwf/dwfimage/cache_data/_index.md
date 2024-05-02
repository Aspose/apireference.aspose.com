---
title: cache_data method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.cad.fileformats.dwf/dwfimage/cache_data/
is_root: false
---

## cache_data {#}

Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamSupporter.data_stream_container`](/cad/python-net/aspose.cad/datastreamsupporter#data_stream_container).
Depending on the loading options only the necessary part of the data can be loaded into the cache from the image data.
In this case, we can use this method to load all image data into the cache.



```python
def cache_data(self):
    ...
```



### Example 


Checks whether the object's data is currently cached, and if not, caches it.



### See Also
* module [`aspose.cad.fileformats.dwf`](../../)
* class [`DwfImage`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage)
