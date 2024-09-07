---
title: Class PngFigureRendererPluginOptions
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.Plugins.PngFigureRendererPluginOptions class. The Figure Renderer plugins options to render a LaTeX figure in PNG
type: docs
weight: 510
url: /net/aspose.tex.plugins/pngfigurerendererpluginoptions/
---
## PngFigureRendererPluginOptions class

The Figure Renderer plugin's options to render a LaTeX figure in PNG.

```csharp
public class PngFigureRendererPluginOptions : FigureRendererPluginOptions, IRasterRendererOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [PngFigureRendererPluginOptions](pngfigurerendererpluginoptions/)() | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [BackgroundColor](../../aspose.tex.features/figurerendereroptions/backgroundcolor/) { get; set; } | Gets/sets the background color. |
| [ErrorReport](../../aspose.tex.features/figurerendereroptions/errorreport/) { get; } | Gets the error report. |
| [InputDataCollection](../../aspose.tex.plugins/figurerendererpluginoptions/inputdatacollection/) { get; } | Gets the collection of data sources. |
| [LogStream](../../aspose.tex.features/figurerendereroptions/logstream/) { get; set; } | Gets/set the stream to write log output to. |
| [Margin](../../aspose.tex.features/figurerendereroptions/margin/) { get; set; } | Gets/sets the margin width. |
| override [OperationName](../../aspose.tex.plugins/pngfigurerendererpluginoptions/operationname/) { get; } | Returns operation name. |
| [OutputDataCollection](../../aspose.tex.plugins/figurerendererpluginoptions/outputdatacollection/) { get; } | Gets collection of added targets for saving operation results. |
| [Preamble](../../aspose.tex.features/figurerendereroptions/preamble/) { get; set; } | Gets/sets LaTeX document preamble. |
| [RequiredInputDirectory](../../aspose.tex.features/figurerendereroptions/requiredinputdirectory/) { get; set; } | Gets/sets the directory for the required input, e.g., packages that are beyond Aspose.TeX's LaTeX support. |
| [Resolution](../../aspose.tex.plugins/pngfigurerendererpluginoptions/resolution/) { get; set; } | Gets/sets the image resolution. |
| [Scale](../../aspose.tex.features/figurerendereroptions/scale/) { get; set; } | Gets/set the scale. 1000 means 100%, 1200 means 120%, etc. |
| [ShowTerminal](../../aspose.tex.features/figurerendereroptions/showterminal/) { get; set; } | The flag that controls terminal output. If `true` then terminal output is written to console. |

## Methods

| Name | Description |
| --- | --- |
| [AddInputDataSource](../../aspose.tex.plugins/figurerendererpluginoptions/addinputdatasource/)(IDataSource) | Adds a new data source to the collection. |
| [AddOutputDataTarget](../../aspose.tex.plugins/figurerendererpluginoptions/addoutputdatatarget/)(IDataSource) | Adds a new input data target to the collection. |

### See Also

* class [FigureRendererPluginOptions](../figurerendererpluginoptions/)
* interface [IRasterRendererOptions](../../aspose.tex.features/irasterrendereroptions/)
* namespace [Aspose.TeX.Plugins](../../aspose.tex.plugins/)
* assembly [Aspose.TeX](../../)


