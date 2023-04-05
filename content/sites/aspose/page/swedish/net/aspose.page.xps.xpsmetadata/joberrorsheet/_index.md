---
title: Class JobErrorSheet
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet klass. Beskriver felbladets utdata. Hela jobbet kommer att ha ett enda felark. Felet sheet bör matas ut som standardPageMediaSize och använder standardPageMediaType . Felarket bör isoleras från resten av jobbet. Detta innebär att eventuella efterbehandlings eller bearbetningsalternativ som t.ex   eller  bör inte inkludera felbladet. Felarket bör visas som det sista arket för jobbet. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1290
url: /sv/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Beskriver felbladets utdata. Hela jobbet kommer att ha ett enda felark. Felet sheet bör matas ut som standard[`PageMediaSize`](../pagemediasize/) och använder standard[`PageMediaType`](../pagemediatype/) . Felarket bör isoleras från resten av jobbet. Detta innebär att eventuella efterbehandlings- eller -bearbetningsalternativ (som t.ex , , eller ) bör inte inkludera felbladet. Felarket bör visas som det sista arket för jobbet. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Skapar en ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Hämtar elementets namn. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Lägger till en lista med objekt i slutet av denna funktions objektlista. Var och en måste vara en[`Feature`](../feature/) , en[`Option`](../option/) eller a[`Property`](../property/) instans. |

## Andra medlemmar

| namn | Beskrivning |
| --- | --- |
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | Beskriver`JobErrorSheet` funktionsalternativ. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | Beskriver inre feature. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | Gränssnittet för någon`JobErrorSheet` feature item. |

### Se även

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namnutrymme [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* hopsättning [Aspose.Page](../../)


