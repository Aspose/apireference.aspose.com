---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet Klasse"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet Klasse. Beschreibt die Ausgabe des Fehlersheets. Der gesamte Auftrag wird ein einzelnes Fehlersheet haben. Das Fehlersheet sollte auf der Standard‑PageMediaSize und mit dem Standard‑PageMediaType ausgegeben werden. Das Fehlersheet sollte vom Rest des Auftrags isoliert sein. Das bedeutet, dass keine Abschluss‑ oder Verarbeitungsoptionen (wie JobDuplex, JobStaple oder JobBinding) das Fehlersheet einschließen sollten. Das Fehlersheet sollte als letztes Blatt des Auftrags erscheinen.  in C++."
type: docs
weight: 5300
url: /de/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


Beschreibt die Ausgabe des Fehlersheets. Der gesamte Auftrag wird ein einzelnes Fehlersheet haben. Das Fehlersheet sollte auf der Standard‑[PageMediaSize](../pagemediasize/) und mit dem Standard‑[PageMediaType](../pagemediatype/) ausgegeben werden. Das Fehlersheet sollte vom Rest des Auftrags isoliert sein. Das bedeutet, dass keine Abschluss‑ oder Verarbeitungsoptionen (wie **JobDuplex**, **JobStaple** oder **JobBinding**) das Fehlersheet einschließen sollten. Das Fehlersheet sollte als letztes Blatt des Auftrags erscheinen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
