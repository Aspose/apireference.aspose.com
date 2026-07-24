---
title: "classe Aspose::Page::XPS::XpsMetadata::JobAccountingSheet"
linktitle: "JobAccountingSheet"
second_title: "Aspose.Page per C++"
description: "classe Aspose::Page::XPS::XpsMetadata::JobAccountingSheet. Descrive il foglio di contabilità da emettere per il lavoro. Il foglio di contabilità deve essere emesso con la dimensione predefinita PageMediaSize e utilizzando il tipo predefinito PageMediaType. Il foglio di contabilità deve essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o elaborazione (come JobDuplex, JobStaple o JobBinding) non deve includere il foglio di contabilità. Il foglio di contabilità può comparire come prima o ultima pagina del lavoro a discrezione dell'implementatore. in C++."
type: docs
weight: 4400
url: /it/cpp/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class


Descrive il foglio di contabilità da produrre per il lavoro. Il foglio di contabilità dovrebbe essere prodotto con la [PageMediaSize](../pagemediasize/) predefinita e utilizzando il [PageMediaType](../pagemediatype/) predefinito. Il foglio di contabilità dovrebbe essere isolato dal resto del lavoro. Ciò significa che eventuali opzioni di finitura o di elaborazione (come **JobDuplex**, **JobStaple** o **JobBinding**) non dovrebbero includere il foglio di contabilità. Il foglio di contabilità può comparire come prima o ultima pagina del lavoro a discrezione dell'implementatore. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet).

```cpp
class JobAccountingSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [JobAccountingSheetOption](./jobaccountingsheetoption/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [JobAccountingSheet](./jobaccountingsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobAccountingSheet::JobAccountingSheetOption\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
