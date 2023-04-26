---
title: Class DocumentInputBin
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin klas. Beschreibt das installierte Eingabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. DieJobInputBin DocumentInputBin  UndPageInputBin Schlüsselwörter schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket  oder Print CapabilitiesDokument angegeben werden. https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 740
url: /de/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

Beschreibt das installierte Eingabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Die[`JobInputBin`](../jobinputbin/) ,`DocumentInputBin` , Und[`PageInputBin`](../pageinputbin/) Schlüsselwörter schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket - oder Print Capabilities-Dokument angegeben werden. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | Erstellt eine neue Instanz. |

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
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


