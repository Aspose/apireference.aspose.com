---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet class"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet class. Beschrijft de uitvoer van het foutblad. De volledige taak krijgt één enkel foutblad. Het foutblad moet worden afgedrukt op de standaard PageMediaSize en met het standaard PageMediaType. Het foutblad moet geïsoleerd zijn van de rest van de taak. Dit betekent dat eventuele afwerkings- of verwerkingsopties (zoals JobDuplex, JobStaple of JobBinding) het foutblad niet mogen opnemen. Het foutblad moet verschijnen als het laatste blad van de taak.  in C++."
type: docs
weight: 5300
url: /nl/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


Beschrijft de uitvoer van het foutblad. De volledige taak krijgt één enkel foutblad. Het foutblad moet worden afgedrukt op de standaard [PageMediaSize](../pagemediasize/) en met het standaard [PageMediaType](../pagemediatype/). Het foutblad moet geïsoleerd zijn van de rest van de taak. Dit betekent dat eventuele afwerkings- of verwerkingsopties (zoals **JobDuplex**, **JobStaple**, of **JobBinding**) het foutblad niet mogen opnemen. Het foutblad moet verschijnen als het laatste blad van de taak. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
