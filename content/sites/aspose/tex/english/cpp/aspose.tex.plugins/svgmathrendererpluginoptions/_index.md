---
title: Aspose::TeX::Plugins::SvgMathRendererPluginOptions class
linktitle: SvgMathRendererPluginOptions
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Plugins::SvgMathRendererPluginOptions class. The Math Renderer plugin''s options to render a math formula in SVG in C++.'
type: docs
weight: 1900
url: /cpp/aspose.tex.plugins/svgmathrendererpluginoptions/
---
## SvgMathRendererPluginOptions class


The Math Renderer plugin's options to render a math formula in SVG.

```cpp
class SvgMathRendererPluginOptions : public Aspose::TeX::Plugins::MathRendererPluginOptions
```

## Methods

| Method | Description |
| --- | --- |
| [AddInputDataSource](../mathrendererpluginoptions/addinputdatasource/)(System::SharedPtr\<IDataSource\>) override | Adds a new data source to the collection. |
| [AddOutputDataTarget](../mathrendererpluginoptions/addoutputdatatarget/)(System::SharedPtr\<IDataSource\>) override | Adds a new input data target to the collection. |
| [FigureRendererOptions](../../aspose.tex.features/figurerendereroptions/figurerendereroptions/)() | Creates a new instance. |
| [get_BackgroundColor](../../aspose.tex.features/figurerendereroptions/get_backgroundcolor/)() const | Gets/sets the background color. |
| [get_ErrorReport](../../aspose.tex.features/figurerendereroptions/get_errorreport/)() const | Gets the error report. |
| [get_InputDataCollection](../mathrendererpluginoptions/get_inputdatacollection/)() override | Gets the collection of data sources. |
| [get_LogStream](../../aspose.tex.features/figurerendereroptions/get_logstream/)() const | Gets/set the stream to write log output to. |
| [get_Margin](../../aspose.tex.features/figurerendereroptions/get_margin/)() const | Gets/sets the margin width. |
| [get_OperationName](./get_operationname/)() override | Returns operation name. |
| [get_OutputDataCollection](../mathrendererpluginoptions/get_outputdatacollection/)() override | Gets collection of added targets for saving operation results. |
| [get_Preamble](../../aspose.tex.features/figurerendereroptions/get_preamble/)() const | Gets/sets LaTeX document preamble. |
| [get_RequiredInputDirectory](../../aspose.tex.features/figurerendereroptions/get_requiredinputdirectory/)() const | Gets/sets the directory for the required input, e.g., packages that are beyond [Aspose.TeX](../../aspose.tex/)'s LaTeX support. |
| [get_Scale](../../aspose.tex.features/figurerendereroptions/get_scale/)() const | Gets/set the scale. 1000 means 100%, 1200 means 120%, etc. |
| [get_ShowTerminal](../../aspose.tex.features/figurerendereroptions/get_showterminal/)() const | The flag that controls terminal output. If **true** then terminal output is written to console. |
| [get_TextColor](../../aspose.tex.features/mathrendereroptions/get_textcolor/)() const | Gets/sets the formula text color. |
| [MathRendererOptions](../../aspose.tex.features/mathrendereroptions/mathrendereroptions/)() | Creates a new instance. |
| [set_BackgroundColor](../../aspose.tex.features/figurerendereroptions/set_backgroundcolor/)(System::Drawing::Color) | Gets/sets the background color. |
| [set_LogStream](../../aspose.tex.features/figurerendereroptions/set_logstream/)(System::SharedPtr\<System::IO::Stream\>) | Gets/set the stream to write log output to. |
| [set_Margin](../../aspose.tex.features/figurerendereroptions/set_margin/)(float) | Gets/sets the margin width. |
| [set_Preamble](../../aspose.tex.features/figurerendereroptions/set_preamble/)(System::String) | Gets/sets LaTeX document preamble. |
| [set_RequiredInputDirectory](../../aspose.tex.features/figurerendereroptions/set_requiredinputdirectory/)(System::SharedPtr\<Aspose::TeX::IO::IInputWorkingDirectory\>) | Gets/sets the directory for the required input, e.g., packages that are beyond [Aspose.TeX](../../aspose.tex/)'s LaTeX support. |
| [set_Scale](../../aspose.tex.features/figurerendereroptions/set_scale/)(int32_t) | Gets/set the scale. 1000 means 100%, 1200 means 120%, etc. |
| [set_ShowTerminal](../../aspose.tex.features/figurerendereroptions/set_showterminal/)(bool) | The flag that controls terminal output. If **true** then terminal output is written to console. |
| [set_TextColor](../../aspose.tex.features/mathrendereroptions/set_textcolor/)(System::Drawing::Color) | Gets/sets the formula text color. |
| [SvgMathRendererPluginOptions](./svgmathrendererpluginoptions/)() | Creates a new instance. |
## See Also

* Class [MathRendererPluginOptions](../mathrendererpluginoptions/)
* Namespace [Aspose::TeX::Plugins](../)
* Library [Aspose.TeX for C++](../../)
