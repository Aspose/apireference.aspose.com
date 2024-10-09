---
title: Aspose::Page::XPS::Presentation::Aps::ApsDevice class
linktitle: ApsDevice
second_title: Aspose.Page for C++
description: 'How to use Aspose::Page::XPS::Presentation::Aps::ApsDevice class in C++.'
type: docs
weight: 100
url: /cpp/aspose.page.xps.presentation.aps/apsdevice/
---
## ApsDevice class




```cpp
class ApsDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPartitionDevice,
                  public Aspose::Page::IInteractiveDevice
```

## Methods

| Method | Description |
| --- | --- |
| [AddOutline](./addoutline/)(int32_t, System::String) override | Adds an outline item with the last object as its target. |
| [AddOutline](./addoutline/)(System::Drawing::PointF, int32_t, System::String) override | Adds an outline item with the origin point as its target. |
| [ApsDevice](./apsdevice/)() | Creates a new instance. |
| [ApsDevice](./apsdevice/)(System::Drawing::Size) | Creates a new instance with the specified media size. |
| [ClosePage](./closepage/)() override | Accomplishes the page. |
| [ClosePartition](./closepartition/)() override | Accomplished the document partition. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Returns the absolute number of the current page within the document. |
| [get_CurrentRelativePageNumber](./get_currentrelativepagenumber/)() override | Returns the relative number of the current page within the current partition. |
| [get_InternalHyperlinksTargets](./get_internalhyperlinkstargets/)() override | Returns the map of internal hyperlink targets. |
| [InitPageNumbers](./initpagenumbers/)() override | Initializes numbers of pages to output. |
| [OpenPage](./openpage/)(System::String) override | Starts a new page with the specifies title. |
| [OpenPage](./openpage/)(float, float) override | Starts a new page with the specified width and height. |
| [OpenPartition](./openpartition/)() override | Starts a new document partition. |
| [SaveInternalHyperlinkTarget](./saveinternalhyperlinktarget/)(int32_t, System::Drawing::RectangleF) override | Saves internal hyperlink target as an absolute page number and a rectangular area on a page. |
| [SetHyperlinkTarget](./sethyperlinktarget/)(System::String) override | Set the hyperlink with an external URI as its target. |
| [SetHyperlinkTarget](./sethyperlinktarget/)(int32_t) override | Set the hyperlink with a page number as its target. |
| [ToString](./tostring/)() const override | Analog of C# Object.ToString() method. Enables converting custom objects to string. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Updates the current page parameters. |
## See Also

* Class [Device](../../aspose.page/device/)
* Class [IMultiPartitionDevice](../../aspose.page/imultipartitiondevice/)
* Class [IInteractiveDevice](../../aspose.page/iinteractivedevice/)
* Namespace [Aspose::Page::XPS::Presentation::Aps](../)
* Library [Aspose.Page for C++](../../)
