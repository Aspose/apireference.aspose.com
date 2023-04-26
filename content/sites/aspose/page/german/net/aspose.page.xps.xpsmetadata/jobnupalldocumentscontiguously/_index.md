---
title: Class JobNUpAllDocumentsContiguously
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.JobNUpAllDocumentsContiguously klas. Beschreibt die Ausgabe mehrerer logischer Seiten auf einem einzigen physischen Blatt. Alle Dokumente im Job werden zusammenhängend zusammengestellt.JobNUpAllDocumentsContiguously UndDocumentNUp schließen sich gegenseitig aus. Es ist Sache des Treibers die Behandlung von Einschränkungen zwischen diesen Schlüsselwörtern zu bestimmen. https//docs.microsoft.com/enus/windows/win32/printdocs/jobnupalldocumentscontiguously
type: docs
weight: 1390
url: /de/net/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class

Beschreibt die Ausgabe mehrerer logischer Seiten auf einem einzigen physischen Blatt. Alle Dokumente im Job werden zusammenhängend zusammengestellt.`JobNUpAllDocumentsContiguously` Und[`DocumentNUp`](../documentnup/) schließen sich gegenseitig aus. Es ist Sache des Treibers, die Behandlung von Einschränkungen zwischen diesen Schlüsselwörtern zu bestimmen. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously

```csharp
public sealed class JobNUpAllDocumentsContiguously : NUp, IJobPrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [JobNUpAllDocumentsContiguously](jobnupalldocumentscontiguously/)(params INUpItem[]) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Funktion hinzu. Jeder muss a sein[`Feature`](../feature/) , ein[`Option`](../option/) oder ein[`Property`](../property/) Instanz. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/addpagespersheetoption/)(int) | Fügt und Option mit a hinzu Wert der bewerteten Eigenschaft. Gibt die Anzahl der logischen Seiten pro physischem Blatt an. |

### Siehe auch

* class [NUp](../nup/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


