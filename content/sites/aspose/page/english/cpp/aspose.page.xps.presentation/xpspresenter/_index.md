---
title: Aspose::Page::XPS::Presentation::XpsPresenter class
linktitle: XpsPresenter
second_title: Aspose.Page for C++
description: 'How to use Aspose::Page::XPS::Presentation::XpsPresenter class in C++.'
type: docs
weight: 600
url: /cpp/aspose.page.xps.presentation/xpspresenter/
---
## XpsPresenter class




```cpp
class XpsPresenter : public Aspose::Page::XPS::Presentation::XpsBasePresenter,
                     public Aspose::Pipeline::ISupplyNode<System::SharedPtr<Aspose::Rendering::ApsPage>>
```

## Methods

| Method | Description |
| --- | --- |
| [get_MaxThreadsCount](./get_maxthreadscount/)() override | The maximum number of threads that can be run for the node. |
| [get_OutputPipe](./get_outputpipe/)() override | The pipe to put APS pages to. |
| [RegisterNodeThread](./registernodethread/)(int32_t) override | Registers parent-child relationship between the pipeline and the node threads. |
| [Run](./run/)() override | The method which performs APS pages vertical flip when run by a pipeline. |
| [set_OutputPipe](./set_outputpipe/)(System::SharedPtr\<Aspose::Pipeline::Pipe\<System::SharedPtr\<Aspose::Rendering::ApsPage\>\>\>) override | The pipe to put APS pages to. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Set n'th template argument a weak pointer (rather than shared). Allows switching pointers in containers to weak mode. |
| [XpsPresenter](./xpspresenter/)(System::SharedPtr\<XpsDocument\>, System::SharedPtr\<Device\>, System::SharedPtr\<SaveOptions\>) |  |
## See Also

* Class [XpsBasePresenter](../xpsbasepresenter/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
