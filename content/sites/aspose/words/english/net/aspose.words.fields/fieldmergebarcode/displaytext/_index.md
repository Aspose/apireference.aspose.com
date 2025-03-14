---
title: FieldMergeBarcode.DisplayText
linktitle: DisplayText
articleTitle: DisplayText
second_title: Aspose.Words for .NET
description: Control barcode text display with FieldMergeBarcode's DisplayText property. Enhance readability and functionality in your applications effortlessly.
type: docs
weight: 70
url: /net/aspose.words.fields/fieldmergebarcode/displaytext/
---
## FieldMergeBarcode.DisplayText property

Gets or sets whether to display barcode data (text) along with image.

```csharp
public bool DisplayText { get; set; }
```

## Examples

Shows how to perform a mail merge on EAN13 barcodes.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a MERGEBARCODE field, which will accept values from a data source during a mail merge.
// This field will convert all values in a merge data source's "MyEAN13Barcode" column into EAN13 barcodes.
FieldMergeBarcode field = (FieldMergeBarcode)builder.InsertField(FieldType.FieldMergeBarcode, true);
field.BarcodeType = "EAN13";
field.BarcodeValue = "MyEAN13Barcode";

// Display the numeric value of the barcode underneath the bars.
field.DisplayText = true;
field.PosCodeStyle = "CASE";
field.FixCheckDigit = true;

Assert.AreEqual(FieldType.FieldMergeBarcode, field.Type);
Assert.AreEqual(" MERGEBARCODE  MyEAN13Barcode EAN13 \\t \\p CASE \\x", field.GetFieldCode());
builder.Writeln();

// Create a DataTable with a column with the same name as our MERGEBARCODE field's BarcodeValue.
// The mail merge will create a new page for each row. Each page will contain a DISPLAYBARCODE field,
// which will display an EAN13 barcode with the value from the merged row.
DataTable table = new DataTable("Barcodes");
table.Columns.Add("MyEAN13Barcode");
table.Rows.Add(new[] { "501234567890" });
table.Rows.Add(new[] { "123456789012" });

doc.MailMerge.Execute(table);

Assert.AreEqual(FieldType.FieldDisplayBarcode, doc.Range.Fields[0].Type);
Assert.AreEqual("DISPLAYBARCODE \"501234567890\" EAN13 \\t \\p CASE \\x",
    doc.Range.Fields[0].GetFieldCode());
Assert.AreEqual(FieldType.FieldDisplayBarcode, doc.Range.Fields[1].Type);
Assert.AreEqual("DISPLAYBARCODE \"123456789012\" EAN13 \\t \\p CASE \\x",
    doc.Range.Fields[1].GetFieldCode());

doc.Save(ArtifactsDir + "Field.MERGEBARCODE.EAN13.docx");
```

### See Also

* class [FieldMergeBarcode](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
