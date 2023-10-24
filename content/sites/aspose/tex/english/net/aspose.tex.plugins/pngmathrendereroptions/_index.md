---
title: Class PngMathRendererOptions
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.Plugins.PngMathRendererOptions class. The MathRenderer plugins options to render a math formula in PNG
type: docs
weight: 440
url: /net/aspose.tex.plugins/pngmathrendereroptions/
---
## PngMathRendererOptions class

The MathRenderer plugin's options to render a math formula in PNG.

```csharp
public class PngMathRendererOptions : MathRendererOptions, IRasterRendererOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [PngMathRendererOptions](pngmathrendereroptions/)() | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [BackgroundColor](../../aspose.tex.features/figurerendereroptions/backgroundcolor/) { get; set; } | Gets/sets the background color. |
| [ErrorReport](../../aspose.tex.features/figurerendereroptions/errorreport/) { get; } | Gets the error report. |
| [InputDataCollection](../../aspose.tex.plugins/mathrendereroptions/inputdatacollection/) { get; } | Gets the collection of data sources. |
| [LogStream](../../aspose.tex.features/figurerendereroptions/logstream/) { get; set; } | Gets/set the stream to write log output to. |
| override [OperationName](../../aspose.tex.plugins/pngmathrendereroptions/operationname/) { get; } | Returns operation name. |
| [OutputDataCollection](../../aspose.tex.plugins/mathrendereroptions/outputdatacollection/) { get; } | Gets collection of added targets for saving operation results. |
| [Preamble](../../aspose.tex.features/figurerendereroptions/preamble/) { get; set; } | Gets/sets LaTeX document preamble. |
| [RequiredInputDirectory](../../aspose.tex.features/figurerendereroptions/requiredinputdirectory/) { get; set; } | Gets/sets the directory for the required input, e.g., packages that are beyond Aspose.TeX's LaTeX support. |
| [Resolution](../../aspose.tex.plugins/pngmathrendereroptions/resolution/) { get; set; } | Gets/sets the image resolution. |
| [Scale](../../aspose.tex.features/figurerendereroptions/scale/) { get; set; } | Gets/set the scale. 1000 means 100%, 1200 means 120%, etc. |
| [ShowTerminal](../../aspose.tex.features/figurerendereroptions/showterminal/) { get; set; } | The flag that controls terminal output. If |
| [TextColor](../../aspose.tex.features/mathrendereroptions/textcolor/) { get; set; } | Gets/sets the formula text color. |

## Methods

| Name | Description |
| --- | --- |
| [AddInputDataSource](../../aspose.tex.plugins/mathrendereroptions/addinputdatasource/)(IDataSource) | Adds a new data source to the collection. |
| [AddOutputDataTarget](../../aspose.tex.plugins/mathrendereroptions/addoutputdatatarget/)(IDataSource) | Adds a new input data target to the collection. |

### See Also

* class [MathRendererOptions](../mathrendereroptions/)
* interface [IRasterRendererOptions](../../aspose.tex.features/irasterrendereroptions/)
* namespace [Aspose.TeX.Plugins](../../aspose.tex.plugins/)
* assembly [Aspose.TeX](../../)


