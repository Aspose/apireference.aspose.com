---
title: SvgOptions class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 370
url: /python-net/aspose.cad.imageoptions/svgoptions/
is_root: false
---

## SvgOptions class

The SVG file format creation options.



**Inheritance:** [`SvgOptions`](/cad/python-net/aspose.cad.imageoptions/svgoptions) → 
[`ImageOptionsBase`](/cad/python-net/aspose.cad.imageoptions/imageoptionsbase)



The SvgOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.imageoptions/svgoptions/__init__/#) | Initializes a new instance of the [`ImageOptionsBase`](/cad/python-net/aspose.cad.imageoptions/imageoptionsbase) class. |


### Properties
| Property | Description |
| :- | :- |
| [target_format](/cad/python-net/aspose.cad.imageoptions/svgoptions/target_format) |  |
| [rotation](/cad/python-net/aspose.cad.imageoptions/svgoptions/rotation) | Gets or sets the parameter for rotate, flip, or rotate and flip the image.. |
| [layers](/cad/python-net/aspose.cad.imageoptions/svgoptions/layers) | Gets or sets a of layer names must be exported.<br/>All data will be exported without layers if names is not sets. |
| [xmp_data](/cad/python-net/aspose.cad.imageoptions/svgoptions/xmp_data) | Gets or sets the XMP metadata container. |
| [source](/cad/python-net/aspose.cad.imageoptions/svgoptions/source) | Gets or sets the source to create image in. |
| [palette](/cad/python-net/aspose.cad.imageoptions/svgoptions/palette) | Gets or sets the color palette. |
| [resolution_settings](/cad/python-net/aspose.cad.imageoptions/svgoptions/resolution_settings) | Gets or sets the resolution settings. |
| [vector_rasterization_options](/cad/python-net/aspose.cad.imageoptions/svgoptions/vector_rasterization_options) | Gets or sets the vector rasterization options. |
| [watermark_guard_options](/cad/python-net/aspose.cad.imageoptions/svgoptions/watermark_guard_options) | Gets or sets the blind watermark options. |
| [timeout](/cad/python-net/aspose.cad.imageoptions/svgoptions/timeout) | Timeout value for export operation (in milliseconds) |
| [pc_3_file](/cad/python-net/aspose.cad.imageoptions/svgoptions/pc_3_file) | Gets or sets the PC3 file full name. |
| [render_to_graphics_bound](/cad/python-net/aspose.cad.imageoptions/svgoptions/render_to_graphics_bound) | Gets or sets a value indicating which image sizes to use when rendering: graphic sizes (true, default) or set in metadata (false). |
| [user_watermark_text](/cad/python-net/aspose.cad.imageoptions/svgoptions/user_watermark_text) | Text for user-generated watermark |
| [user_watermark_color](/cad/python-net/aspose.cad.imageoptions/svgoptions/user_watermark_color) | Color for user-generated watermark |
| [text_as_shapes](/cad/python-net/aspose.cad.imageoptions/svgoptions/text_as_shapes) | Gets or sets a value indicating whether text must be converted as shapes.<br/>By default text will be converted to shapes, so it won't be selectable. |
| [callback](/cad/python-net/aspose.cad.imageoptions/svgoptions/callback) | Gets or sets the callback that can be used to store image and font binary data as user needs |
| [rescale_subpixel_linewidths](/cad/python-net/aspose.cad.imageoptions/svgoptions/rescale_subpixel_linewidths) | Whether sub-pixel linewidths should be rescaled. <br/>If set to true, lines thinner than a width specified by other options will be drawn thicker, asymptotically approaching the minimum width |
| [use_absolute_rescaling](/cad/python-net/aspose.cad.imageoptions/svgoptions/use_absolute_rescaling) | Wether minimum non-rescaled line widh should be defined relative to whole image size (if false) or in pixels (if true).<br/>If false, use [`SvgOptions.minimum_relative_linewidth_ratio`](/cad/python-net/aspose.cad.imageoptions/svgoptions#minimum_relative_linewidth_ratio) to specify maximum rate of image size to line width when line won't be rescaled up yet.<br/>If true, use [`SvgOptions.minimum_absolute_nonscaled_linewidth`](/cad/python-net/aspose.cad.imageoptions/svgoptions#minimum_absolute_nonscaled_linewidth) to specify minimum unscaled width in pixels |
| [minimum_relative_linewidth_ratio](/cad/python-net/aspose.cad.imageoptions/svgoptions/minimum_relative_linewidth_ratio) | Lines with width less than image's size\minimumRelativeLinewidthRatio will be rescaled if relative rescaling treshold is used. A smaller dimension is picked as image size. |
| [minimum_absolute_nonscaled_linewidth](/cad/python-net/aspose.cad.imageoptions/svgoptions/minimum_absolute_nonscaled_linewidth) | Lines with width in pixels less than this will be rescaled if absolute rescaling treshold |
| [minimum_linewidth](/cad/python-net/aspose.cad.imageoptions/svgoptions/minimum_linewidth) | Minumum width of the line relative to minimum non-rescaled linewidth.<br/>A line with width of 0 would be drawn with this width if rescaling is used ( as it is by default), lines thicker than that will be drawn thicker until they reach rescaling treshold, lines thicker than that won't be rescaled. |



### Example 


//Renders loaded file and saves it to SVG
using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
SvgOptions opt = new SvgOptions();

opt.VectorRasterizationOptions = cadRasterizationOptions;
cadRasterizationOptions.DrawType = CadDrawTypeMode.UseObjectColor;
img.Save(outSvg, opt);
}

### See Also
* module [`aspose.cad.imageoptions`](..)
* class [`ImageOptionsBase`](/cad/python-net/aspose.cad.imageoptions/imageoptionsbase)
* class [`SvgOptions`](/cad/python-net/aspose.cad.imageoptions/svgoptions)
