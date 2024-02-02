---
title: FigureRendererPlugin class
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.tex.plugins/figurerendererplugin/
is_root: false
---

## FigureRendererPlugin class

FigureRenderer plugin class.

The example shows how to render a LaTeX fragment in PNG.

```python
from aspose.pydrawing import Color
from aspose.tex.plugins import FigureRendererPlugin, PngFigureRendererPluginOptions, StreamDataSource, StringDataSource

#  Create FigureRenderer.
renderer = FigureRendererPlugin()
#  Create the PngFigureRendererOptions instance and set up options.
options = PngFigureRendererPluginOptions()
options.background_color = Color.yellow
options.resolution = 150
options.margin = 10.0
options.preamble = "LaTeX preamble"
#  Add an input LaTeX fragment.
options.add_input_data_source(StringDataSource("LaTeX fragment"))
#  Create a stream to write the image to.
with open("output path", "wb") as stream:
    #  Add an output stream.
    options.add_output_data_target(StreamDataSource(stream))
    #  Run the process.
    result = renderer.process(options)

```



The FigureRendererPlugin type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/tex/python-net/aspose.tex.plugins/figurerendererplugin/__init__/#) | Constructs a new instance of FigureRendererPlugin |


### Methods
| Method | Description |
| :- | :- |
| [process](/tex/python-net/aspose.tex.plugins/figurerendererplugin/process/#aspose.tex.plugins.IPluginOptions) | Starts the FigureRenderer processing with the specified parameters. |



### See Also
* module [`aspose.tex.plugins`](..)
* class [`IPlugin`](/tex/python-net/aspose.tex.plugins/iplugin)
