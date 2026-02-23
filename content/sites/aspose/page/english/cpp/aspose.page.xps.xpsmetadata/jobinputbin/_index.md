---
title: Aspose::Page::XPS::XpsMetadata::JobInputBin class
linktitle: JobInputBin
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::JobInputBin class. Describes the installed input bin in a device or the full list of supported bins for a device. Allows specification of input bin on a per job basis. The JobInputBin, DocumentInputBin, and PageInputBin keywords are mutually exclusive. Both should not be specified simultaneously in a PrintTicket or Print Capabilities document.  in C++.'
type: docs
weight: 5700
url: /cpp/aspose.page.xps.xpsmetadata/jobinputbin/
---
## JobInputBin class


Describes the installed input bin in a device or the full list of supported bins for a device. Allows specification of input bin on a per job basis. The [JobInputBin](./), [DocumentInputBin](../documentinputbin/), and [PageInputBin](../pageinputbin/) keywords are mutually exclusive. Both should not be specified simultaneously in a [PrintTicket](../printticket/) or Print Capabilities document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobinputbin).

```cpp
class JobInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [JobInputBin](./jobinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Creates a new instance. |
## See Also

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
