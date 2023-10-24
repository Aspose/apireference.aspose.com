---
title: Class MathRendererOptions
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.Plugins.MathRendererOptions class. The options for the MathRenderer plugin
type: docs
weight: 410
url: /net/aspose.tex.plugins/mathrendereroptions/
---
## MathRendererOptions class

The options for the [`MathRenderer`](../mathrenderer/) plugin.

```csharp
public abstract class MathRendererOptions : MathRendererOptions, IPluginOptions
```

## Properties

| Name | Description |
| --- | --- |
| [BackgroundColor](../../aspose.tex.features/figurerendereroptions/backgroundcolor/) { get; set; } | Gets/sets the background color. |
| [ErrorReport](../../aspose.tex.features/figurerendereroptions/errorreport/) { get; } | Gets the error report. |
| [InputDataCollection](../../aspose.tex.plugins/mathrendereroptions/inputdatacollection/) { get; } | Gets the collection of data sources. |
| [LogStream](../../aspose.tex.features/figurerendereroptions/logstream/) { get; set; } | Gets/set the stream to write log output to. |
| virtual [OperationName](../../aspose.tex.plugins/mathrendereroptions/operationname/) { get; } | Returns operation name. |
| [OutputDataCollection](../../aspose.tex.plugins/mathrendereroptions/outputdatacollection/) { get; } | Gets collection of added targets for saving operation results. |
| [Preamble](../../aspose.tex.features/figurerendereroptions/preamble/) { get; set; } | Gets/sets LaTeX document preamble. |
| [RequiredInputDirectory](../../aspose.tex.features/figurerendereroptions/requiredinputdirectory/) { get; set; } | Gets/sets the directory for the required input, e.g., packages that are beyond Aspose.TeX's LaTeX support. |
| [Scale](../../aspose.tex.features/figurerendereroptions/scale/) { get; set; } | Gets/set the scale. 1000 means 100%, 1200 means 120%, etc. |
| [ShowTerminal](../../aspose.tex.features/figurerendereroptions/showterminal/) { get; set; } | The flag that controls terminal output. If |
| [TextColor](../../aspose.tex.features/mathrendereroptions/textcolor/) { get; set; } | Gets/sets the formula text color. |

## Methods

| Name | Description |
| --- | --- |
| [AddInputDataSource](../../aspose.tex.plugins/mathrendereroptions/addinputdatasource/)(IDataSource) | Adds a new data source to the collection. |
| [AddOutputDataTarget](../../aspose.tex.plugins/mathrendereroptions/addoutputdatatarget/)(IDataSource) | Adds a new input data target to the collection. |

### See Also

* class [MathRendererOptions](../../aspose.tex.features/mathrendereroptions/)
* interface [IPluginOptions](../ipluginoptions/)
* namespace [Aspose.TeX.Plugins](../../aspose.tex.plugins/)
* assembly [Aspose.TeX](../../)


