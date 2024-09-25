---
title: Aspose::TeX::Plugins::FigureRendererPluginOptions class
linktitle: FigureRendererPluginOptions
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Plugins::FigureRendererPluginOptions class. The options for the FigureRendererPlugin in C++.'
type: docs
weight: 200
url: /cpp/aspose.tex.plugins/figurerendererpluginoptions/
---
## FigureRendererPluginOptions class


The options for the [FigureRendererPlugin](../figurerendererplugin/).

```cpp
class FigureRendererPluginOptions : public Aspose::TeX::Features::FigureRendererOptions,
                                    public Aspose::TeX::Plugins::IPluginOptions,
                                    public Aspose::TeX::Plugins::IInputDataContainer,
                                    public Aspose::TeX::Plugins::IOutputDataContainer
```

## Methods

| Method | Description |
| --- | --- |
| [AddInputDataSource](./addinputdatasource/)(System::SharedPtr\<IDataSource\>) override | Adds a new data source to the collection. |
| [AddOutputDataTarget](./addoutputdatatarget/)(System::SharedPtr\<IDataSource\>) override | Adds a new input data target to the collection. |
| [get_InputDataCollection](./get_inputdatacollection/)() override | Gets the collection of data sources. |
| virtual [get_OperationName](./get_operationname/)() | Returns operation name. |
| [get_OutputDataCollection](./get_outputdatacollection/)() override | Gets collection of added targets for saving operation results. |
## See Also

* Class [FigureRendererOptions](../../aspose.tex.features/figurerendereroptions/)
* Class [IPluginOptions](../ipluginoptions/)
* Class [IInputDataContainer](../iinputdatacontainer/)
* Class [IOutputDataContainer](../ioutputdatacontainer/)
* Namespace [Aspose::TeX::Plugins](../)
* Library [Aspose.TeX for C++](../../)
