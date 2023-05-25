---
title: serialize_exif_data method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /aspose.cad.exif/jpegexifdata/serialize_exif_data/
is_root: false
---

## serialize_exif_data {#}

Serializes the EXIF data. Writes the tags values and contents. The most influencing size tag is Thumbnail tag contents.


### Returns 


The serialized EXIF data.


```python
def serialize_exif_data(self):
    ...
```


### Remarks

The overall segment size must be less than or equal to MaxExifSegmentSize bytes in order to produce correct jpeg image.
Hint: try to reduce the thumbnail size or change its compression in case you have too big EXIF section size.


### See Also
* module [`aspose.cad.exif`](../../)
* class [`JpegExifData`](/cad/python-net/aspose.cad.exif/jpegexifdata)
