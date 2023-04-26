---
title: Class PageOutputBin
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin klas. Beschreibt die vollständige Liste der unterstützten Bins für das Gerät. Ermöglicht die Angabe des Ausgabefachs pro Seite. DieJobOutputBin DocumentOutputBin UndPageOutputBin Schlüsselwörter sind schließen sich gegenseitig aus nur eines sollte in einem PrintTicket oder Druckfunktionsdokument angegeben werden. https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2330
url: /de/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

Beschreibt die vollständige Liste der unterstützten Bins für das Gerät. Ermöglicht die Angabe des Ausgabefachs pro Seite. Die[`JobOutputBin`](../joboutputbin/) ,[`DocumentOutputBin`](../documentoutputbin/) Und`PageOutputBin` Schlüsselwörter sind schließen sich gegenseitig aus, nur eines sollte in einem PrintTicket- oder Druckfunktionsdokument angegeben werden. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | Erstellt eine neue Instanz. |

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
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


