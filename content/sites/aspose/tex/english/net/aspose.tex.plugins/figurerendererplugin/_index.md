---
title: Class FigureRendererPlugin
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.Plugins.FigureRendererPlugin class. The Figure Renderer plugin class.  The example shows how to render a LaTeX fragment in PNG
type: docs
weight: 350
url: /net/aspose.tex.plugins/figurerendererplugin/
---
## FigureRendererPlugin class

The Figure Renderer plugin class.  The example shows how to render a LaTeX fragment in PNG.

```csharp
// Create the Figure Renderer.
FigureRendererPlugin renderer = new FigureRendererPlugin();
// Create the PngFigureRendererPluginOptions instance and set up options.
PngFigureRendererPluginOptions options = new PngFigureRendererPluginOptions()
{
    BackgroundColor = Color.Yellow,
    Resolution = 150,
    Margin = 10,
    Preamble = "LaTeX preamble"
};
// Add an input LaTeX fragment.
options.AddInputDataSource(new StringDataSource("LaTeX fragment"));
// Create a stream to write the image to.
using (Stream stream = File.Open("output path", FileMode.Create))
{
    // Add an output stream.
    options.AddOutputDataTarget(new StreamDataSource(stream));
    // Run the process.
    ResultContainer result = renderer.Process(options);
}
```

```csharp
public class FigureRendererPlugin : IDisposable, IPlugin
```

## Constructors

| Name | Description |
| --- | --- |
| [FigureRendererPlugin](figurerendererplugin/)() | The default constructor. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../aspose.tex.plugins/figurerendererplugin/dispose/)() | Disposes this instance. |
| [Process](../../aspose.tex.plugins/figurerendererplugin/process/)(IPluginOptions) | Runs Figure Renderer processing with the specified parameters. |

### See Also

* interface [IPlugin](../iplugin/)
* namespace [Aspose.TeX.Plugins](../../aspose.tex.plugins/)
* assembly [Aspose.TeX](../../)


