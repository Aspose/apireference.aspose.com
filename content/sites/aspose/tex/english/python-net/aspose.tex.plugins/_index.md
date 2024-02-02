---
title: aspose.tex.plugins
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.tex.plugins/
is_root: false
---

The **Aspose.TeX.Plugins**  is a root namespace for all classes of Aspose.TeX.Plugins classes.

### Classes
| Class | Description |
| :- | :- |
| [`FigureRendererPlugin`](/tex/python-net/aspose.tex.plugins/figurerendererplugin) | FigureRenderer plugin class.<br/><br/>The example shows how to render a LaTeX fragment in PNG.<br/><br/>```python<br/>from aspose.pydrawing import Color<br/>from aspose.tex.plugins import FigureRendererPlugin, PngFigureRendererPluginOptions, StreamDataSource, StringDataSource<br/><br/>#  Create FigureRenderer.<br/>renderer = FigureRendererPlugin()<br/>options = PngFigureRendererPluginOptions()<br/>options.background_color = Color.yellow<br/>options.resolution = 150<br/>options.margin = 10.0<br/>options.preamble = "LaTeX preamble"<br/><br/>#  Create the PngFigureRendererOptions instance and set up options.<br/>#  Add an input LaTeX fragment.<br/>options.add_input_data_source(StringDataSource("LaTeX fragment"))<br/>#  Create a stream to write the image to.<br/>with open("output path", "wb") as stream:<br/>    #  Add an output stream.<br/>    options.add_output_data_target(StreamDataSource(stream))<br/>    #  Run the process.<br/>    result = renderer.process(options)<br/><br/>``` |
| [`FigureRendererPluginOptions`](/tex/python-net/aspose.tex.plugins/figurerendererpluginoptions) | The options for the FigureRenderer plugin. |
| [`FigureRendererPluginResult`](/tex/python-net/aspose.tex.plugins/figurerendererpluginresult) | The MathRenderer plugin's common result. |
| [`IDataSource`](/tex/python-net/aspose.tex.plugins/idatasource) | The general data source interface. |
| [`IOperationResult`](/tex/python-net/aspose.tex.plugins/ioperationresult) | The general operation result interface. |
| [`IPlugin`](/tex/python-net/aspose.tex.plugins/iplugin) | The general plugin interface. |
| [`IPluginOptions`](/tex/python-net/aspose.tex.plugins/ipluginoptions) | The general plugin options interface. |
| [`MathRendererPlugin`](/tex/python-net/aspose.tex.plugins/mathrendererplugin) | MathRenderer plugin class.<br/><br/>The example shows how to render a LaTeX formula in PNG.<br/><br/>```python<br/>from aspose.pydrawing import Color<br/>from aspose.tex.plugins import MathRendererPlugin, PngMathRendererPluginOptions, StreamDataSource, StringDataSource<br/><br/>#  Create MathRenderer.<br/>renderer = MathRendererPlugin()<br/>options = PngMathRendererPluginOptions()<br/>options.background_color = Color.yellow<br/>options.text_color = Color.blue<br/>options.resolution = 150<br/>options.margin = 10.0<br/>options.preamble = "LaTeX preamble"<br/><br/>#  Create the PngMathRendererPluginOptions instance and set up options.<br/>#  Add a source formula.<br/>options.add_input_data_source(StringDataSource("LaTeX formula"))<br/>#  Create a stream to write the image to.<br/>with open("output path", "wb") as stream:<br/>    #  Add an output stream.<br/>    options.add_output_data_target(StreamDataSource(stream))<br/>    #  Run the process.<br/>    result = renderer.process(options)<br/><br/>``` |
| [`MathRendererPluginOptions`](/tex/python-net/aspose.tex.plugins/mathrendererpluginoptions) | The options for the [`MathRendererPlugin`](/tex/python-net/aspose.tex.plugins/mathrendererplugin) plugin. |
| [`MathRendererPluginResult`](/tex/python-net/aspose.tex.plugins/mathrendererpluginresult) | The MathRenderer plugin's common result. |
| [`PngFigureRendererPluginOptions`](/tex/python-net/aspose.tex.plugins/pngfigurerendererpluginoptions) | The FigureRenderer plugin's options to render a LaTeX figure in PNG. |
| [`PngMathRendererPluginOptions`](/tex/python-net/aspose.tex.plugins/pngmathrendererpluginoptions) | The MathRenderer plugin's options to render a math formula in PNG. |
| [`ResultContainer`](/tex/python-net/aspose.tex.plugins/resultcontainer) | The plugin execution result container. |
| [`StreamDataSource`](/tex/python-net/aspose.tex.plugins/streamdatasource) | The stream data source for plugin's load and save operations. |
| [`StringDataSource`](/tex/python-net/aspose.tex.plugins/stringdatasource) | The string data source for plugin's load operations. |
| [`SvgFigureRendererPluginOptions`](/tex/python-net/aspose.tex.plugins/svgfigurerendererpluginoptions) | The FigureRenderer plugin's options to render a LaTeX figure in SVG. |
| [`SvgMathRendererPluginOptions`](/tex/python-net/aspose.tex.plugins/svgmathrendererpluginoptions) | The MathRenderer plugin's options to render a math formula in SVG. |


### Enumerations
| Enumeration | Description |
| :- | :- |
| [`DataType`](/tex/python-net/aspose.tex.plugins/datatype) | Enumerates available data types for plugins I/O. |


