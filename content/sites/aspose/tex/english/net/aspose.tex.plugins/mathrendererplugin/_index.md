---
title: Class MathRendererPlugin
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.Plugins.MathRendererPlugin class. MathRenderer plugin class.  The example shows how to render a LaTeX formula in PNG
type: docs
weight: 450
url: /net/aspose.tex.plugins/mathrendererplugin/
---
## MathRendererPlugin class

MathRenderer plugin class.  The example shows how to render a LaTeX formula in PNG.

```csharp
// Create MathRenderer.
MathRendererPlugin renderer = new MathRendererPlugin();
// Create the PngMathRendererPluginOptions instance and set up options.
PngMathRendererPluginOptions options = new PngMathRendererPluginOptions()
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
using (Stream stream = File.Open("output path", FileMode.Create))
{
    // Add an output stream.
    options.AddOutputDataTarget(new StreamDataSource(stream));
    // Run the process.
    ResultContainer result = renderer.Process(options);
}
```

```csharp
public class MathRendererPlugin : IDisposable, IPlugin
```

## Constructors

| Name | Description |
| --- | --- |
| [MathRendererPlugin](mathrendererplugin/)() | The default constructor. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../aspose.tex.plugins/mathrendererplugin/dispose/)() | Disposes this instance. |
| [Process](../../aspose.tex.plugins/mathrendererplugin/process/)(IPluginOptions) | Runs Math Renderer processing with the specified parameters. |

### See Also

* interface [IPlugin](../iplugin/)
* namespace [Aspose.TeX.Plugins](../../aspose.tex.plugins/)
* assembly [Aspose.TeX](../../)


