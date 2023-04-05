---
title: Class JobOutputBin
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.JobOutputBin klas. Beschreibt das installierte Ausgabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. DieJobOutputBin DocumentOutputBin UndPageOutputBin Schlüsselwörter schließen sich gegenseitig aus nur eines sollte in einem PrintTicket oder Druckfunktionsdokument angegeben werden. https//docs.microsoft.com/enus/windows/win32/printdocs/joboutputbin
type: docs
weight: 1420
url: /de/net/aspose.page.xps.xpsmetadata/joboutputbin/
---
## JobOutputBin class

Beschreibt das installierte Ausgabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Die`JobOutputBin` ,[`DocumentOutputBin`](../documentoutputbin/) Und[`PageOutputBin`](../pageoutputbin/) Schlüsselwörter schließen sich gegenseitig aus, nur eines sollte in einem PrintTicket- oder Druckfunktionsdokument angegeben werden. https://docs.microsoft.com/en-us/windows/win32/printdocs/joboutputbin

```csharp
public sealed class JobOutputBin : OutputBin, IJobPrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [JobOutputBin](joboutputbin/)(params IOutputBinItem[]) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Funktion hinzu. Jeder muss a sein[`Feature`](../feature/) , ein[`Option`](../option/) oder ein[`Property`](../property/) Instanz. |

### Siehe auch

* class [OutputBin](../outputbin/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


