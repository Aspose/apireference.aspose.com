---
title: FieldBarcode.IsUSPostalAddress
linktitle: IsUSPostalAddress
articleTitle: IsUSPostalAddress
second_title: Aspose.Words for .NET
description: Discover the FieldBarcode IsUSPostalAddress property. Easily manage U.S. postal address validation for accurate data handling and enhanced efficiency.
type: docs
weight: 40
url: /net/aspose.words.fields/fieldbarcode/isuspostaladdress/
---
## FieldBarcode.IsUSPostalAddress property

Gets or sets whether [`PostalAddress`](../postaladdress/) is a U.S. postal address.

```csharp
public bool IsUSPostalAddress { get; set; }
```

## Examples

Shows how to use the BARCODE field to display U.S. ZIP codes in the form of a barcode.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln();

// Below are two ways of using BARCODE fields to display custom values as barcodes.
// 1 -  Store the value that the barcode will display in the PostalAddress property:
FieldBarcode field = (FieldBarcode)builder.InsertField(FieldType.FieldBarcode, true);

// This value needs to be a valid ZIP code.
field.PostalAddress = "96801";
field.IsUSPostalAddress = true;
field.FacingIdentificationMark = "C";

Assert.That(field.GetFieldCode(), Is.EqualTo(" BARCODE  96801 \\u \\f C"));

builder.InsertBreak(BreakType.LineBreak);

// 2 -  Reference a bookmark that stores the value that this barcode will display:
field = (FieldBarcode)builder.InsertField(FieldType.FieldBarcode, true);
field.PostalAddress = "BarcodeBookmark";
field.IsBookmark = true;

Assert.That(field.GetFieldCode(), Is.EqualTo(" BARCODE  BarcodeBookmark \\b"));

// The bookmark that the BARCODE field references in its PostalAddress property
// need to contain nothing besides the valid ZIP code.
builder.InsertBreak(BreakType.PageBreak);
builder.StartBookmark("BarcodeBookmark");
builder.Writeln("968877");
builder.EndBookmark("BarcodeBookmark");

doc.Save(ArtifactsDir + "Field.BARCODE.docx");
```

### See Also

* class [FieldBarcode](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
