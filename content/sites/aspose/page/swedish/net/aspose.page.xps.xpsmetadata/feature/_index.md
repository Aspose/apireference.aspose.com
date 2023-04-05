---
title: Class Feature
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsMetadata.Feature klass. Klassen som inkapslar en gemensam Print Schemafunktion. Basklassen för alla schemadefinierade funktioner. A elementet innehåller en komplett lista överOption ochProperty element som fullständigt beskriver ett enhetsattribut jobbformateringsinställning eller annan relevant egenskap. https//docs.microsoft.com/enus/windows/win32/printdocs/feature
type: docs
weight: 870
url: /sv/net/aspose.page.xps.xpsmetadata/feature/
---
## Feature class

Klassen som inkapslar en gemensam Print Schema-funktion. Basklassen för alla schemadefinierade funktioner. A elementet innehåller en komplett lista över[`Option`](../option/) och[`Property`](../property/) element som fullständigt beskriver ett enhetsattribut, jobbformateringsinställning eller annan relevant egenskap. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature

```csharp
Feature
```

```csharp
public class Feature : CompositePrintTicketElement, IFeatureItem, IPrintTicketItem
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Feature](feature/#constructor)(string, Feature, params IFeatureItem[]) | Skapar en ny PrintTicket-funktionsinstans. |
| [Feature](feature/#constructor_1)(string, Option, params IFeatureItem[]) | Skapar en ny PrintTicket-funktionsinstans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Hämtar elementets namn. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Lägger till en lista med objekt i slutet av denna funktions objektlista. Var och en måste vara en`Feature` , en[`Option`](../option/) eller a[`Property`](../property/) instans. |

### Se även

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* interface [IPrintTicketItem](../iprintticketitem/)
* namnutrymme [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* hopsättning [Aspose.Page](../../)


