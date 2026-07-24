---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption 类"
linktitle: "PageMediaTypeOption"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption 类。描述了在 C++ 中 PageMediaType 功能选项。"
type: docs
weight: 700
url: /zh/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


描述了 [PageMediaType](../) 功能选项。

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | 向该选项添加一个 [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) 实例数组。 |
| [Clone](./clone/)() | 克隆此选项实例。克隆构造函数的快捷方式。 |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | 创建一个新实例。 |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | 克隆此选项实例。 |
| [SetWeight](./setweight/)(int32_t) | 设置 **Weight** 计分属性值。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Archival](./archival/) | 指定档案级质量媒体。 |
| static [AutoSelect](./autoselect/) | 指定 Media 将自动选择。 |
| static [BackPrintFilm](./backprintfilm/) | 指定专用背面印刷胶片介质。 |
| static [Bond](./bond/) | 指定标准粘合介质。 |
| static [CardStock](./cardstock/) | 指定标准卡纸介质。 |
| static [Continous](./continous/) | 指定连续供纸介质。 |
| static [EnvelopePlain](./envelopeplain/) | 指定标准信封介质。 |
| static [EnvelopeWindow](./envelopewindow/) | 指定带窗信封介质。 |
| static [Fabric](./fabric/) | 指定织物介质。 |
| static [HighResolution](./highresolution/) | 指定专用高分辨率介质。 |
| static [Label](./label/) | 指定标签介质。 |
| static [MultiLayerForm](./multilayerform/) | 指定附加式多页表单介质。 |
| static [MultiPartForm](./multipartform/) | 指定分离式多页表单介质。 |
| static [None](./none/) | 指定未知或未列出的介质。 |
| static [Photographic](./photographic/) | 指定标准摄影介质。 |
| static [PhotographicFilm](./photographicfilm/) | 指定胶片摄影介质。 |
| static [PhotographicGlossy](./photographicglossy/) | 指定光面摄影介质。 |
| static [PhotographicHighGloss](./photographichighgloss/) | 指定高光面摄影介质。 |
| static [PhotographicMatte](./photographicmatte/) | 指定哑光摄影介质。 |
| static [PhotographicSatin](./photographicsatin/) | 指定缎面摄影介质。 |
| static [PhotographicSemiGloss](./photographicsemigloss/) | 指定半光面摄影介质。 |
| static [Plain](./plain/) | 指定标准纸张介质。 |
| static [Screen](./screen/) | 指定以连续形式输出到显示器。 |
| static [ScreenPaged](./screenpaged/) | 指定以分页形式输出到显示器。 |
| static [Stationary](./stationary/) | 指定专用文具介质。 |
| static [TabStockFull](./tabstockfull/) | 指定未预切的标签纸介质（单个标签）。 |
| static [TabStockPreCut](./tabstockprecut/) | 指定已预切的标签纸介质（多个标签）。 |
| static [Transparency](./transparency/) | 指定透明介质。 |
| static [TShirtTransfer](./tshirttransfer/) | 指定特殊 T 恤转印介质。 |
## 另见

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
