---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet-klass"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet-klass. Beskriver felarkutskriften. Hela jobbet kommer att ha ett enda felark. Felarket ska skrivas ut på standard-PageMediaSize och med standard-PageMediaType. Felarket bör vara isolerat från resten av jobbet. Detta innebär att eventuella efterbehandlings- eller bearbetningsalternativ (såsom JobDuplex, JobStaple eller JobBinding) inte ska inkludera felarket. Felarket ska visas som det sista arket i jobbet.  i C++."
type: docs
weight: 5300
url: /sv/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


Beskriver felarkutskriften. Hela jobbet kommer att ha ett enda felark. Felarket ska skrivas ut på standard- [PageMediaSize](../pagemediasize/) och med standard- [PageMediaType](../pagemediatype/). Felarket bör vara isolerat från resten av jobbet. Detta innebär att eventuella efterbehandlings- eller bearbetningsalternativ (såsom **JobDuplex**, **JobStaple**, eller **JobBinding**) inte ska inkludera felarket. Felarket ska visas som det sista arket i jobbet. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | Skapar en ny instans. |
## Se även

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
