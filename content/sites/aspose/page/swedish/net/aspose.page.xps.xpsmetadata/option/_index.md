---
title: Class Option
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsMetadata.Option klass. Klassen som implementerar en gemensam PrintTicket . Basklassen för alla schemadefinierade alternativ. Ett Optionelement innehåller allaProperty och ScoredProperty element associerade med detta alternativ. https//docs.microsoft.com/enus/windows/win32/printdocs/option
type: docs
weight: 1660
url: /sv/net/aspose.page.xps.xpsmetadata/option/
---
## Option class

Klassen som implementerar en gemensam PrintTicket . Basklassen för alla schemadefinierade alternativ. Ett Option-element innehåller alla[`Property`](../property/) och [`ScoredProperty`](../scoredproperty/) element associerade med detta alternativ. https://docs.microsoft.com/en-us/windows/win32/printdocs/option

```csharp
Option
```

```csharp
public class Option : CompositePrintTicketElement, IFeatureItem
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Option](option/#constructor)(params IOptionItem[]) | Skapar en ny PrintTicket-alternativinstans. |
| [Option](option/#constructor_1)(Option) | Skapar en instans av klonalternativ. |
| [Option](option/#constructor_2)(string, params IOptionItem[]) | Skapar en ny PrintTicket-alternativinstans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Hämtar elementets namn. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | Lägger till en lista med objekt i slutet av detta alternativs objektlista. Var och en måste vara en[`ScoredProperty`](../scoredproperty/) eller[`Property`](../property/) instans. |

### Se även

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* namnutrymme [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* hopsättning [Aspose.Page](../../)


