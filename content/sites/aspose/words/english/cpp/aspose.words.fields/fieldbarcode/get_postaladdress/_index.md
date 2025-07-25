---
title: Aspose::Words::Fields::FieldBarcode::get_PostalAddress method
linktitle: get_PostalAddress
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Fields::FieldBarcode::get_PostalAddress method. Gets or sets the postal address used for generating a barcode or the name of the bookmark that refers to it in C++.'
type: docs
weight: 5000
url: /cpp/aspose.words.fields/fieldbarcode/get_postaladdress/
---
## FieldBarcode::get_PostalAddress method


Gets or sets the postal address used for generating a barcode or the name of the bookmark that refers to it.

```cpp
System::String Aspose::Words::Fields::FieldBarcode::get_PostalAddress()
```


## Examples



Shows how to use the BARCODE field to display U.S. ZIP codes in the form of a barcode. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

builder->Writeln();

// Below are two ways of using BARCODE fields to display custom values as barcodes.
// 1 -  Store the value that the barcode will display in the PostalAddress property:
auto field = System::ExplicitCast<Aspose::Words::Fields::FieldBarcode>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldBarcode, true));

// This value needs to be a valid ZIP code.
field->set_PostalAddress(u"96801");
field->set_IsUSPostalAddress(true);
field->set_FacingIdentificationMark(u"C");

ASSERT_EQ(u" BARCODE  96801 \\u \\f C", field->GetFieldCode());

builder->InsertBreak(Aspose::Words::BreakType::LineBreak);

// 2 -  Reference a bookmark that stores the value that this barcode will display:
field = System::ExplicitCast<Aspose::Words::Fields::FieldBarcode>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldBarcode, true));
field->set_PostalAddress(u"BarcodeBookmark");
field->set_IsBookmark(true);

ASSERT_EQ(u" BARCODE  BarcodeBookmark \\b", field->GetFieldCode());

// The bookmark that the BARCODE field references in its PostalAddress property
// need to contain nothing besides the valid ZIP code.
builder->InsertBreak(Aspose::Words::BreakType::PageBreak);
builder->StartBookmark(u"BarcodeBookmark");
builder->Writeln(u"968877");
builder->EndBookmark(u"BarcodeBookmark");

doc->Save(get_ArtifactsDir() + u"Field.BARCODE.docx");
```

## See Also

* Class [FieldBarcode](../)
* Namespace [Aspose::Words::Fields](../../)
* Library [Aspose.Words for C++](../../../)
