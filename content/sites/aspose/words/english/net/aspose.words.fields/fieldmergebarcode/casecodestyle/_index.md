---
title: FieldMergeBarcode.CaseCodeStyle
linktitle: CaseCodeStyle
articleTitle: CaseCodeStyle
second_title: Aspose.Words for .NET
description: Discover the FieldMergeBarcode CaseCodeStyle property for ITF14 barcodes. Easily customize your Case Code style with valid options like STDEXTADD.
type: docs
weight: 60
url: /net/aspose.words.fields/fieldmergebarcode/casecodestyle/
---
## FieldMergeBarcode.CaseCodeStyle property

Gets or sets the style of a Case Code for barcode type ITF14. The valid values are [STD&#x7C;EXT&#x7C;ADD]

```csharp
public string CaseCodeStyle { get; set; }
```

## Examples

Shows how to perform a mail merge on ITF14 barcodes.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a MERGEBARCODE field, which will accept values from a data source during a mail merge.
// This field will convert all values in a merge data source's "MyITF14Barcode" column into ITF14 barcodes.
FieldMergeBarcode field = (FieldMergeBarcode)builder.InsertField(FieldType.FieldMergeBarcode, true);
field.BarcodeType = "ITF14";
field.BarcodeValue = "MyITF14Barcode";
field.CaseCodeStyle = "STD";

Assert.That(field.Type, Is.EqualTo(FieldType.FieldMergeBarcode));
Assert.That(field.GetFieldCode(), Is.EqualTo(" MERGEBARCODE  MyITF14Barcode ITF14 \\c STD"));

// Create a DataTable with a column with the same name as our MERGEBARCODE field's BarcodeValue.
// The mail merge will create a new page for each row. Each page will contain a DISPLAYBARCODE field,
// which will display an ITF14 barcode with the value from the merged row.
DataTable table = new DataTable("Barcodes");
table.Columns.Add("MyITF14Barcode");
table.Rows.Add(new[] { "09312345678907" });
table.Rows.Add(new[] { "1234567891234" });

doc.MailMerge.Execute(table);

Assert.That(doc.Range.Fields[0].Type, Is.EqualTo(FieldType.FieldDisplayBarcode));
Assert.That(doc.Range.Fields[0].GetFieldCode(), Is.EqualTo("DISPLAYBARCODE \"09312345678907\" ITF14 \\c STD"));
Assert.That(doc.Range.Fields[1].Type, Is.EqualTo(FieldType.FieldDisplayBarcode));
Assert.That(doc.Range.Fields[1].GetFieldCode(), Is.EqualTo("DISPLAYBARCODE \"1234567891234\" ITF14 \\c STD"));

doc.Save(ArtifactsDir + "Field.MERGEBARCODE.ITF14.docx");
```

### See Also

* class [FieldMergeBarcode](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
