---
title: Aspose::Page::IMultiPageDevice class
linktitle: IMultiPageDevice
second_title: Aspose.Page for C++
description: 'Aspose::Page::IMultiPageDevice class. This interface contains methods for manipulating multi-paged device in C++.'
type: docs
weight: 700
url: /cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


This interface contains methods for manipulating multi-paged device.

```cpp
class IMultiPageDevice : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [ClosePage](./closepage/)() | Makes necessary preparation of the device after page has been rendered. |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | Current page number. |
| virtual [InitPageNumbers](./initpagenumbers/)() | Initializes numbers of pages to output. |
| virtual [OpenPage](./openpage/)(System::String) | Makes necessary preparation of the device before page rendering. |
| virtual [OpenPage](./openpage/)(float, float) | Makes necessary preparation of the device before each page rendering. |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | Updates page parameters from other multi-paged device. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
