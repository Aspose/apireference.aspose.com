---
title: DocumentProperty
second_title: Aspose.Cells för .NET API-referens
description: Representerar en anpassad eller inbyggd dokumentegenskap.
type: docs
weight: 4860
url: /sv/net/aspose.cells.properties/documentproperty/
---
## DocumentProperty class

Representerar en anpassad eller inbyggd dokumentegenskap.

```csharp
public class DocumentProperty
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [IsGeneratedName](../../aspose.cells.properties/documentproperty/isgeneratedname) { get; } | Returnerar sant om den här egenskapen inte har ett namn i OLE2-lagringen och ett unikt namn genererades endast för det offentliga API:et. |
| [IsLinkedToContent](../../aspose.cells.properties/documentproperty/islinkedtocontent) { get; } | Indikerar om den här egenskapen är länkad till content |
| [Name](../../aspose.cells.properties/documentproperty/name) { get; } | Returnerar namnet på egenskapen. |
| [Source](../../aspose.cells.properties/documentproperty/source) { get; } | Den länkade innehållskällan. |
| [Type](../../aspose.cells.properties/documentproperty/type) { get; } | Hämtar datatypen för egenskapen. |
| [Value](../../aspose.cells.properties/documentproperty/value) { get; set; } | Hämtar eller ställer in värdet på egenskapen. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [ToBool](../../aspose.cells.properties/documentproperty/tobool)() | Returnerar egenskapsvärdet som bool. |
| [ToDateTime](../../aspose.cells.properties/documentproperty/todatetime)() | Returnerar egenskapsvärdet som DateTime i lokal tidszon. |
| [ToDouble](../../aspose.cells.properties/documentproperty/todouble)() | Returnerar egenskapsvärdet som dubbelt. |
| [ToInt](../../aspose.cells.properties/documentproperty/toint)() | Returnerar egenskapsvärdet som heltal. |
| override [ToString](../../aspose.cells.properties/documentproperty/tostring)() | Returnerar egenskapsvärdet som en sträng. |

### Exempel

```csharp

[C#]

//Instantiera ett arbetsboksobjekt
Workbook workbook = new Workbook("book1.xls");
 
//Hämta en lista över alla anpassade dokumentegenskaper för Excel-filen
DocumentPropertyCollection customProperties = workbook.Worksheets.CustomDocumentProperties;
 
//Åtkomst till en anpassad dokumentegenskap genom att använda egenskapsindexet
DocumentProperty customProperty1 = customProperties[3];
 
//Åtkomst till en anpassad dokumentegenskap genom att använda egenskapsnamnet
DocumentProperty customProperty2 = customProperties["Owner"];

[VB.NET]

'Instantiera ett arbetsboksobjekt
Dim workbook As Workbook = New Workbook("book1.xls")
 
'Hämta en lista över alla anpassade dokumentegenskaper för Excel-filen
Dim customProperties As DocumentPropertyCollection = workbook.Worksheets.CustomDocumentProperties
 
'Åtkomst till en anpassad dokumentegenskap genom att använda egenskapsindexet
Dim customProperty1 As DocumentProperty = customProperties(3)
 
'Åtkomst till en anpassad dokumentegenskap genom att använda egenskapsnamnet
Dim customProperty2 As DocumentProperty = customProperties("Owner")
```

### Se även

* namnutrymme [Aspose.Cells.Properties](../../aspose.cells.properties)
* hopsättning [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
