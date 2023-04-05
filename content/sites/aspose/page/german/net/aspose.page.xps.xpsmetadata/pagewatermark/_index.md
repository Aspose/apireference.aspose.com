---
title: Class PageWatermark
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.PageWatermark klas. Beschreibt die Wasserzeicheneinstellung der Ausgabe und die Wasserzeicheneigenschaften. Wasserzeichen gelten für die logische Seite nicht für die physische Seite. Zum Beispiel wennDocumentDuplex aktiviert ist erscheint auf jedem ein Wasserzeichen Seite auf jedem Blatt. WennDocumentDuplex  2 dann hat jedes Blatt 2 Wasserzeichen. https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2640
url: /de/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

Beschreibt die Wasserzeicheneinstellung der Ausgabe und die Wasserzeicheneigenschaften. Wasserzeichen gelten für die logische Seite, nicht für die physische Seite. Zum Beispiel, wenn[`DocumentDuplex`](../documentduplex/) aktiviert ist, erscheint auf jedem ein Wasserzeichen Seite auf jedem Blatt. Wenn[`DocumentDuplex`](../documentduplex/) , =2, dann hat jedes Blatt 2 Wasserzeichen. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Funktion hinzu. Jeder muss a sein[`Feature`](../feature/) , ein[`Option`](../option/) oder ein[`Property`](../property/) Instanz. |

## Andere Mitglieder

| Name | Beschreibung |
| --- | --- |
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | Die Schnittstelle von jedem`PageWatermark` Funktionselement. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | Die Schnittstelle von jedem[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) Artikel. |
| class [Layering](pagewatermark.layering/) | Beschreibt innere Besonderheit. Definiert das Layering-Verhalten des Wasserzeichens. |
| class [LayeringOption](pagewatermark.layeringoption/) | Beschreibt die[`Layering`](../pagewatermark.layering/) Funktionsoptionen. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | Beschreibt die`PageWatermark` Funktionen Optionen. |

### Siehe auch

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


