---
title: Aspose::Words::Fields::FieldAutoNum::get_SeparatorCharacter method
linktitle: get_SeparatorCharacter
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Fields::FieldAutoNum::get_SeparatorCharacter method. Gets or sets the separator character to be used in C++.'
type: docs
weight: 2000
url: /cpp/aspose.words.fields/fieldautonum/get_separatorcharacter/
---
## FieldAutoNum::get_SeparatorCharacter method


Gets or sets the separator character to be used.

```cpp
System::String Aspose::Words::Fields::FieldAutoNum::get_SeparatorCharacter()
```


## Examples



Shows how to number paragraphs using autonum fields. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

// Each AUTONUM field displays the current value of a running count of AUTONUM fields,
// allowing us to automatically number items like a numbered list.
// This field will display a number "1.".
auto field = System::ExplicitCast<Aspose::Words::Fields::FieldAutoNum>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldAutoNum, true));
builder->Writeln(u"\tParagraph 1.");

ASSERT_EQ(u" AUTONUM ", field->GetFieldCode());

field = System::ExplicitCast<Aspose::Words::Fields::FieldAutoNum>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldAutoNum, true));
builder->Writeln(u"\tParagraph 2.");

// The separator character, which appears in the field result immediately after the number,is a full stop by default.
// If we leave this property null, our second AUTONUM field will display "2." in the document.
ASSERT_TRUE(System::TestTools::IsNull(field->get_SeparatorCharacter()));

// We can set this property to apply the first character of its string as the new separator character.
// In this case, our AUTONUM field will now display "2:".
field->set_SeparatorCharacter(u":");

ASSERT_EQ(u" AUTONUM  \\s :", field->GetFieldCode());

doc->Save(get_ArtifactsDir() + u"Field.AUTONUM.docx");
```

## See Also

* Class [FieldAutoNum](../)
* Namespace [Aspose::Words::Fields](../../)
* Library [Aspose.Words for C++](../../../)
