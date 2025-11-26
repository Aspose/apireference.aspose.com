---
title: Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class
linktitle: BeforeSavingEventArgs
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class. Defines the base class for arguments of various before-saving events in C++.'
type: docs
weight: 200
url: /cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Defines the base class for arguments of various before-saving events.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parameter | Description |
| --- | --- |
| T | The modification API type. |
## Methods

| Method | Description |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | The current absolute page number across all documents within the [XPS](../../aspose.page.xps/) package. |
| [get_DocumentNumber](./get_documentnumber/)() const | The current document number within the [XPS](../../aspose.page.xps/) package. |
| [get_ElementAPI](./get_elementapi/)() const | Gets the modification API of the element that is about to be saved. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | The current output number. It differs from **AbsolutePageNumber** if the **PageNumbers** save option is specified. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | The current page number relative to the current document within the [XPS](../../aspose.page.xps/) package. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Set n'th template argument a weak pointer (rather than shared). Allows switching pointers in containers to weak mode. |

## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
