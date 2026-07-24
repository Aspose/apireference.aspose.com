---
title: "Aspose::Page::XPS::XpsMetadata::JobAccountingSheet Klasse"
linktitle: "JobAccountingSheet"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::JobAccountingSheet Klasse. Beschreibt das Abrechnungsblatt, das für den Auftrag ausgegeben werden soll. Das Abrechnungsblatt sollte mit der Standard‑PageMediaSize und dem Standard‑PageMediaType ausgegeben werden. Das Abrechnungsblatt sollte vom Rest des Auftrags isoliert sein. Das bedeutet, dass keine Abschluss‑ oder Verarbeitungsoptionen (wie JobDuplex, JobStaple oder JobBinding) das Abrechnungsblatt enthalten dürfen. Das Abrechnungsblatt kann nach Ermessen des Implementierers als erste oder letzte Seite des Auftrags erscheinen.  in C++."
type: docs
weight: 4400
url: /de/cpp/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class


Beschreibt das Abrechnungsblatt, das für den Auftrag ausgegeben werden soll. Das Abrechnungsblatt sollte auf der Standard-[PageMediaSize](../pagemediasize/)-Größe und unter Verwendung des Standard-[PageMediaType](../pagemediatype/) ausgegeben werden. Das Abrechnungsblatt sollte vom Rest des Auftrags isoliert sein. Das bedeutet, dass alle Veredelungs‑ oder Verarbeitungsoptionen (wie **JobDuplex**, **JobStaple** oder **JobBinding**) das Abrechnungsblatt nicht einschließen sollten. Das Abrechnungsblatt kann nach Ermessen des Implementierers als erste oder letzte Seite des Auftrags erscheinen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet).

```cpp
class JobAccountingSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [JobAccountingSheetOption](./jobaccountingsheetoption/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [JobAccountingSheet](./jobaccountingsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobAccountingSheet::JobAccountingSheetOption\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
