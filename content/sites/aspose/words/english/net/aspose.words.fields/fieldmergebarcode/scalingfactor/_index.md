---
title: FieldMergeBarcode.ScalingFactor
linktitle: ScalingFactor
articleTitle: ScalingFactor
second_title: Aspose.Words for .NET
description: Discover the FieldMergeBarcode ScalingFactor property to easily adjust your barcode size in whole percentage points (10-1000) for optimal visibility.
type: docs
weight: 120
url: /net/aspose.words.fields/fieldmergebarcode/scalingfactor/
---
## FieldMergeBarcode.ScalingFactor property

Gets or sets a scaling factor for the symbol. The value is in whole percentage points and the valid values are [10, 1000]

```csharp
public string ScalingFactor { get; set; }
```

## Examples

Shows how to perform a mail merge on QR barcodes.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a MERGEBARCODE field, which will accept values from a data source during a mail merge.
// This field will convert all values in a merge data source's "MyQRCode" column into QR codes.
FieldMergeBarcode field = (FieldMergeBarcode)builder.InsertField(FieldType.FieldMergeBarcode, true);
field.BarcodeType = "QR";
field.BarcodeValue = "MyQRCode";

// Apply custom colors and scaling.
field.BackgroundColor = "0xF8BD69";
field.ForegroundColor = "0xB5413B";
field.ErrorCorrectionLevel = "3";
field.ScalingFactor = "250";
field.SymbolHeight = "1000";
field.SymbolRotation = "0";

Assert.That(field.Type, Is.EqualTo(FieldType.FieldMergeBarcode));
Assert.That(field.GetFieldCode(), Is.EqualTo(" MERGEBARCODE  MyQRCode QR \\b 0xF8BD69 \\f 0xB5413B \\q 3 \\s 250 \\h 1000 \\r 0"));
builder.Writeln();

// Create a DataTable with a column with the same name as our MERGEBARCODE field's BarcodeValue.
// The mail merge will create a new page for each row. Each page will contain a DISPLAYBARCODE field,
// which will display a QR code with the value from the merged row.
DataTable table = new DataTable("Barcodes");
table.Columns.Add("MyQRCode");
table.Rows.Add(new[] { "ABC123" });
table.Rows.Add(new[] { "DEF456" });

doc.MailMerge.Execute(table);

Assert.That(doc.Range.Fields[0].Type, Is.EqualTo(FieldType.FieldDisplayBarcode));
Assert.That(doc.Range.Fields[0].GetFieldCode(), Is.EqualTo("DISPLAYBARCODE \"ABC123\" QR \\q 3 \\s 250 \\h 1000 \\r 0 \\b 0xF8BD69 \\f 0xB5413B"));
Assert.That(doc.Range.Fields[1].Type, Is.EqualTo(FieldType.FieldDisplayBarcode));
Assert.That(doc.Range.Fields[1].GetFieldCode(), Is.EqualTo("DISPLAYBARCODE \"DEF456\" QR \\q 3 \\s 250 \\h 1000 \\r 0 \\b 0xF8BD69 \\f 0xB5413B"));

doc.Save(ArtifactsDir + "Field.MERGEBARCODE.QR.docx");
```

### See Also

* class [FieldMergeBarcode](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
