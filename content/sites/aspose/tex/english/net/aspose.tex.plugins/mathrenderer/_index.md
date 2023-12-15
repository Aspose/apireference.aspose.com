---
title: Class MathRenderer
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.Plugins.MathRenderer class. MathRenderer plugin class.  The example shows how to render a LaTeX formula in PNG
type: docs
weight: 410
url: /net/aspose.tex.plugins/mathrenderer/
---
## MathRenderer class

MathRenderer plugin class.  The example shows how to render a LaTeX formula in PNG.

```csharp
// Create MathRenderer.
MathRenderer renderer = new MathRenderer();
// Create the PngMathRendererOptions instance and set up options.
PngMathRendererOptions options = new PngMathRendererOptions()
{
    BackgroundColor = Color.Yellow,
    TextColor = Color.Blue,
    Resolution = 150,
    Margin = 10,
    Preamble = "LaTeX preamble"
};
// Add a source formula.
options.AddInputDataSource(new StringDataSource("LaTeX formula"));
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
public class MathRenderer : IDisposable, IPlugin
```

## Constructors

| Name | Description |
| --- | --- |
| [MathRenderer](mathrenderer/)() | The default constructor. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../aspose.tex.plugins/mathrenderer/dispose/)() | Disposes this instance. |
| [Process](../../aspose.tex.plugins/mathrenderer/process/)(IPluginOptions) | Starts the MathRenderer processing with the specified parameters. |

### See Also

* interface [IPlugin](../iplugin/)
* namespace [Aspose.TeX.Plugins](../../aspose.tex.plugins/)
* assembly [Aspose.TeX](../../)


