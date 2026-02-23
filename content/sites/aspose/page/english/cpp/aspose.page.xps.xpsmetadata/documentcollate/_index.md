---
title: Aspose::Page::XPS::XpsMetadata::DocumentCollate class
linktitle: DocumentCollate
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentCollate class. Describes the collating characteristics of the output. All pages in each individual document are collated. DocumentCollate and JobCollateAlldocuments are mutually exclusive. The behavior and implementation of whether both or only one of these keywords is implemented is left to the driver.  in C++.'
type: docs
weight: 800
url: /cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


Describes the collating characteristics of the output. All pages in each individual document are collated. [DocumentCollate](./) and JobCollateAlldocuments are mutually exclusive. The behavior and implementation of whether both or only one of these keywords is implemented is left to the driver. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate).

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | Creates a new instance. |
## See Also

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
