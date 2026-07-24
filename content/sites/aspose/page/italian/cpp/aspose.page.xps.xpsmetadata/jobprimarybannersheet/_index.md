---
title: "Aspose::Page::XPS::XpsMetadata::JobPrimaryBannerSheet class"
linktitle: "JobPrimaryBannerSheet"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::JobPrimaryBannerSheet class. Descrive il foglio di intestazione da emettere per il lavoro. Il foglio di intestazione dovrebbe essere emesso con il PageMediaSize predefinito e utilizzando il PageMediaType predefinito. Il foglio di intestazione dovrebbe essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o di elaborazione (come JobDuplexAllDocumentsContiguously, JobStapleAllDocuments o JobBindAllDocuments) non dovrebbe includere il foglio di intestazione. Il foglio di intestazione dovrebbe comparire come primo foglio del lavoro in C++."
type: docs
weight: 6400
url: /it/cpp/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class


Descrive il foglio di intestazione da emettere per il lavoro. Il foglio di intestazione dovrebbe essere emesso con il [PageMediaSize](../pagemediasize/) predefinito e utilizzando il [PageMediaType](../pagemediatype/) predefinito. Il foglio di intestazione dovrebbe essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o di elaborazione (come [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/), [JobStapleAllDocuments](../jobstaplealldocuments/), o [JobBindAllDocuments](../jobbindalldocuments/)) non dovrebbe includere il foglio di intestazione. Il foglio di intestazione dovrebbe comparire come primo foglio del lavoro.

```cpp
class JobPrimaryBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                              public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [JobPrimaryBannerSheet](./jobprimarybannersheet/)(const System::ArrayPtr\<System::SharedPtr\<JobPrimaryBannerSheet::BannerSheetOption\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
