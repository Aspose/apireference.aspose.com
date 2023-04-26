---
title: Class JobInputBin
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.JobInputBin klas. Beschreibt das installierte Eingabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Ermöglicht die Angabe des Eingabefachs pro Auftrag. DerJobInputBin DocumentInputBin  undPageInputBin Schlüsselwörter schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket oder Druckfunktionsdokument angegeben werden. https//docs.microsoft.com/enus/windows/win32/printdocs/jobinputbin
type: docs
weight: 1380
url: /de/net/aspose.page.xps.xpsmetadata/jobinputbin/
---
## JobInputBin class

Beschreibt das installierte Eingabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Ermöglicht die Angabe des Eingabefachs pro Auftrag. Der`JobInputBin` ,[`DocumentInputBin`](../documentinputbin/) , und[`PageInputBin`](../pageinputbin/) Schlüsselwörter schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket- oder Druckfunktionsdokument angegeben werden. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobinputbin

```csharp
public sealed class JobInputBin : InputBin, IJobPrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [JobInputBin](jobinputbin/)(params IInputBinItem[]) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Funktion hinzu. Jeder muss a sein[`Feature`](../feature/) , ein[`Option`](../option/) oder ein[`Property`](../property/) Instanz. |

### Siehe auch

* class [InputBin](../inputbin/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


