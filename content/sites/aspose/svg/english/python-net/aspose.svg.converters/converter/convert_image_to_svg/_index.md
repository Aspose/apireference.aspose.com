---
title: convert_image_to_svg method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg.converters/converter/convert_image_to_svg/
is_root: false
---

## convert_image_to_svg {#aspose.svg.imagevectorization.ImageVectorizerConfiguration-str-str}

Converts a raster image located on disk to SVG format.



```python
def convert_image_to_svg(self, configuration, image_file, output_path):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| configuration | aspose.svg.imagevectorization.ImageVectorizerConfiguration | The [`ImageVectorizerConfiguration`](/svg/python-net/aspose.svg.imagevectorization/imagevectorizerconfiguration) that controls tracing parameters. |
| image_file | str | Path to the source image file. |
| output_path | str | Destination path for the generated SVG. |


## convert_image_to_svg {#aspose.svg.imagevectorization.ImageVectorizerConfiguration-io.RawIOBase-str}

Converts a raster image provided as a Stream to SVG format.



```python
def convert_image_to_svg(self, configuration, image_stream, output_path):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| configuration | aspose.svg.imagevectorization.ImageVectorizerConfiguration | The [`ImageVectorizerConfiguration`](/svg/python-net/aspose.svg.imagevectorization/imagevectorizerconfiguration) that controls tracing parameters. |
| image_stream | io.RawIOBase | Readable stream that contains the source image. |
| output_path | str | Destination path for the generated SVG. |



### See Also
* module [`aspose.svg.converters`](../../)
* class [`Converter`](/svg/python-net/aspose.svg.converters/converter)
* class [`ImageVectorizerConfiguration`](/svg/python-net/aspose.svg.imagevectorization/imagevectorizerconfiguration)
