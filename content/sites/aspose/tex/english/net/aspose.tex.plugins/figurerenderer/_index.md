---
title: Class FigureRenderer
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.Plugins.FigureRenderer class. FigureRenderer plugin class.  The example shows how to render a LaTeX fragment in PNG
type: docs
weight: 330
url: /net/aspose.tex.plugins/figurerenderer/
---
## FigureRenderer class

FigureRenderer plugin class.  The example shows how to render a LaTeX fragment in PNG.

```csharp
// Create FigureRenderer.
FigureRenderer renderer = new FigureRenderer();
// Create the PngFigureRendererOptions instance and set up options.
PngFigureRendererOptions options = new PngFigureRendererOptions()
{
    BackgroundColor = Color.Yellow,
    Resolution = 150,
    Margin = 10,
    Preamble = "LaTeX preamble"
};
// Add an input LaTeX fragment.
options.AddInputDataSource(new StringDataSource("LaTeX fragment"));
// Create a stream to write the image to.
using (Stream stream = File.Open(outputPath, FileMode.Create))
{
    // Add an output stream.
    options.AddOutputDataTarget(new StreamDataSource(stream));
    // Run the process.
    ResultContainer result = renderer.Process(options);
}
```

```csharp
public class FigureRenderer : IDisposable, IPlugin
```

## Constructors

| Name | Description |
| --- | --- |
| [FigureRenderer](figurerenderer/)() | The default constructor. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../aspose.tex.plugins/figurerenderer/dispose/)() | Disposes this instance. |
| [Process](../../aspose.tex.plugins/figurerenderer/process/)(IPluginOptions) | Starts the FigureRenderer processing with the specified parameters. |

### See Also

* interface [IPlugin](../iplugin/)
* namespace [Aspose.TeX.Plugins](../../aspose.tex.plugins/)
* assembly [Aspose.TeX](../../)


