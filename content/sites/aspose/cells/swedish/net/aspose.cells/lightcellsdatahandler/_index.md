---
title: LightCellsDataHandler
second_title: Aspose.Cells för .NET API-referens
description: Representerar celldatahanterare för läsning av stora kalkylbladsfiler i lättviktsläge.
type: docs
weight: 3950
url: /sv/net/aspose.cells/lightcellsdatahandler/
---
## LightCellsDataHandler interface

Representerar celldatahanterare för läsning av stora kalkylbladsfiler i lättviktsläge.

```csharp
public interface LightCellsDataHandler
```

## Metoder

| namn | Beskrivning |
| --- | --- |
| [ProcessCell](../../aspose.cells/lightcellsdatahandler/processcell)(Cell) | Börjar bearbeta en cell. |
| [ProcessRow](../../aspose.cells/lightcellsdatahandler/processrow)(Row) | Börjar bearbeta en rad. |
| [StartCell](../../aspose.cells/lightcellsdatahandler/startcell)(int) | Förbereder bearbetning av en cell. |
| [StartRow](../../aspose.cells/lightcellsdatahandler/startrow)(int) | Förbereder bearbetning av en rad. |
| [StartSheet](../../aspose.cells/lightcellsdatahandler/startsheet)(Worksheet) | Börjar bearbeta ett kalkylblad. |

### Anmärkningar

När du läser en arbetsbok med detta läge,[`StartSheet`](./startsheet) kommer att kontrolleras när du läser varje kalkylblad i arbetsboken. För ett blad, if[`StartSheet`](./startsheet) ger sant, då kommer alla data och egenskaper för rader/celler i detta ark att kontrolleras och bearbetas av implementeringen av detta gränssnitt. För varje rad,[`StartRow`](./startrow) kommer att anropas för att kontrollera om den behöver bearbetas. Om en rad behöver bearbetas, kommer egenskaperna för denna rad att läsas först och användaren kan komma åt dess egenskaper genom att[`ProcessRow`](./processrow). om radens celler också behöver bearbetas, då[`ProcessRow`](./processrow) bör returnerar sant och sedan[`StartCell`](./startcell) kommer be att anropas för varje befintlig cell i den här raden för att kontrollera om en cell behöver bearbetas. Om en cell behöver bearbetas, då[`ProcessCell`](./processcell) kommer att anropas för att behandla cellen genom implementeringen av detta gränssnitt.

### Se även

* namnutrymme [Aspose.Cells](../../aspose.cells)
* hopsättning [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
