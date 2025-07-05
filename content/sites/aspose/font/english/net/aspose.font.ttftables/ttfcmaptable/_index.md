---
title: Class TtfCMapTable
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfTables.TtfCMapTable class. Represents cmap table of the TTF Font file
type: docs
weight: 1000
url: /net/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class

Represents "cmap" table of the TTF Font file.

```csharp
public class TtfCMapTable : TtfTableBase
```

## Properties

| Name | Description |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | Gets offset from beginning of sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | Reference to TTF table repository. |
| static [Tag](../../aspose.font.ttftables/ttfcmaptable/tag/) { get; } | Gets table tag. |

## Methods

| Name | Description |
| --- | --- |
| [FindUnicodeTable](../../aspose.font.ttftables/ttfcmaptable/findunicodetable/)() | Searches and returns unicode CMap. if there is ucs-4 CMap - returns it first; otherwise - returns any unicode cmap it can find. |
| [GetAllSubtables](../../aspose.font.ttftables/ttfcmaptable/getallsubtables/)() | Returns all the subtables from CMap table. |
| [GetPlatformTables](../../aspose.font.ttftables/ttfcmaptable/getplatformtables/)(ushort, ushort) | Returns CMap subtables for planformId and platformSpecificId. |

## Other Members

| Name | Description |
| --- | --- |
| abstract class [TtfCMapSubtableDescription](../../aspose.font.ttftables/ttfcmaptable.ttfcmapsubtabledescription) | Provides brief information about CMap subtable. |

### See Also

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


