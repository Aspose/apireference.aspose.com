---
title: Class Feature
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.Feature klas. Die Klasse die ein gemeinsames DruckschemaFeature kapselt. Die Basisklasse für alle Schemadefinierten Features. A Element enthält eine vollständige Liste derOption UndProperty Elemente die ein Geräteattribut eine Auftragsformatierungseinstellung oder andere relevante Merkmale vollständig beschreiben. https//docs.microsoft.com/enus/windows/win32/printdocs/feature
type: docs
weight: 880
url: /de/net/aspose.page.xps.xpsmetadata/feature/
---
## Feature class

Die Klasse, die ein gemeinsames Druckschema-Feature kapselt. Die Basisklasse für alle Schema-definierten Features. A Element enthält eine vollständige Liste der[`Option`](../option/) Und[`Property`](../property/) Elemente, die ein Geräteattribut, eine Auftragsformatierungseinstellung oder andere relevante Merkmale vollständig beschreiben. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature

```csharp
Feature
```

```csharp
public class Feature : CompositePrintTicketElement, IFeatureItem, IPrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Feature](feature/#constructor)(string, Feature, params IFeatureItem[]) | Erstellt eine neue PrintTicket-Funktionsinstanz. |
| [Feature](feature/#constructor_1)(string, Option, params IFeatureItem[]) | Erstellt eine neue PrintTicket-Funktionsinstanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Funktion hinzu. Jeder muss a sein`Feature` , ein[`Option`](../option/) oder ein[`Property`](../property/) Instanz. |

### Siehe auch

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* interface [IPrintTicketItem](../iprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)


