---
title: "classe Aspose::Page::XPS::XpsMetadata::JobErrorSheet"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page per C++"
description: "classe Aspose::Page::XPS::XpsMetadata::JobErrorSheet. Descrive l'output del foglio di errore. L'intero lavoro avrà un unico foglio di errore. Il foglio di errore dovrebbe essere prodotto con il PageMediaSize predefinito e utilizzando il PageMediaType predefinito. Il foglio di errore dovrebbe essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o elaborazione (come JobDuplex, JobStaple o JobBinding) non dovrebbe includere il foglio di errore. Il foglio di errore dovrebbe comparire come ultimo foglio del lavoro.  in C++."
type: docs
weight: 5300
url: /it/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


Descrive l'output del foglio di errore. L'intero lavoro avrà un unico foglio di errore. Il foglio di errore dovrebbe essere prodotto con il [PageMediaSize](../pagemediasize/) predefinito e utilizzando il [PageMediaType](../pagemediatype/) predefinito. Il foglio di errore dovrebbe essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o elaborazione (come **JobDuplex**, **JobStaple** o **JobBinding**) non dovrebbe includere il foglio di errore. Il foglio di errore dovrebbe comparire come ultimo foglio del lavoro. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
