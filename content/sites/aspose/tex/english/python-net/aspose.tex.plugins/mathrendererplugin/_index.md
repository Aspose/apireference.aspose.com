---
title: MathRendererPlugin class
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.tex.plugins/mathrendererplugin/
is_root: false
---

## MathRendererPlugin class

MathRenderer plugin class.

The example shows how to render a LaTeX formula in PNG.

```python
from aspose.pydrawing import Color
from aspose.tex.plugins import MathRendererPlugin, PngMathRendererPluginOptions, StreamDataSource, StringDataSource

#  Create MathRenderer.
renderer = MathRendererPlugin()
options = PngMathRendererPluginOptions()
options.background_color = Color.yellow
options.text_color = Color.blue
options.resolution = 150
options.margin = 10.0
options.preamble = "LaTeX preamble"

#  Create the PngMathRendererPluginOptions instance and set up options.
options = options
#  Add a source formula.
options.add_input_data_source(StringDataSource("LaTeX formula"))
#  Create a stream to write the image to.
with open("output path", "wb") as stream:
    #  Add an output stream.
    options.add_output_data_target(StreamDataSource(stream))
    #  Run the process.
    result = renderer.process(options)

```



The MathRendererPlugin type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/tex/python-net/aspose.tex.plugins/mathrendererplugin/__init__/#) | Constructs a new instance of MathRendererPlugin |


### Methods
| Method | Description |
| :- | :- |
| [process](/tex/python-net/aspose.tex.plugins/mathrendererplugin/process/#aspose.tex.plugins.IPluginOptions) | Runs Math Renderer processing with the specified parameters. |



### See Also
* module [`aspose.tex.plugins`](..)
* class [`IPlugin`](/tex/python-net/aspose.tex.plugins/iplugin)
