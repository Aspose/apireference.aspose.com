---
title: Aspose::Words::Fields::FieldComments class
linktitle: FieldComments
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Fields::FieldComments class. Implements the COMMENTS field. To learn more, visit the  documentation article in C++.'
type: docs
weight: 24000
url: /cpp/aspose.words.fields/fieldcomments/
---
## FieldComments class


Implements the COMMENTS field. To learn more, visit the [Working with Fields](https://docs.aspose.com/words/cpp/working-with-fields/) documentation article.

```cpp
class FieldComments : public Aspose::Words::Fields::Field
```

## Methods

| Method | Description |
| --- | --- |
| [get_DisplayResult](../field/get_displayresult/)() | Gets the text that represents the displayed field result. |
| [get_End](../field/get_end/)() const | Gets the node that represents the field end. |
| [get_FieldEnd](../field/get_fieldend/)() const | Gets the node that represents the field end. |
| [get_FieldStart](../field/get_fieldstart/)() const | Gets the node that represents the start of the field. |
| [get_Format](../field/get_format/)() | Gets a [FieldFormat](../fieldformat/) object that provides typed access to field's formatting. |
| [get_IsDirty](../field/get_isdirty/)() | Gets or sets whether the current result of the field is no longer correct (stale) due to other modifications made to the document. |
| [get_IsLocked](../field/get_islocked/)() | Gets or sets whether the field is locked (should not recalculate its result). |
| [get_LocaleId](../field/get_localeid/)() | Gets or sets the LCID of the field. |
| [get_Result](../field/get_result/)() | Gets or sets text that is between the field separator and field end. |
| [get_Separator](../field/get_separator/)() | Gets the node that represents the field separator. Can be **null**. |
| [get_Start](../field/get_start/)() const | Gets the node that represents the start of the field. |
| [get_Text](./get_text/)() | Gets or sets the text of the comments. |
| virtual [get_Type](../field/get_type/)() const | Gets the Microsoft Word field type. |
| [GetFieldCode](../field/getfieldcode/)() | Returns text between field start and field separator (or field end if there is no separator). Both field code and field result of child fields are included. |
| [GetFieldCode](../field/getfieldcode/)(bool) | Returns text between field start and field separator (or field end if there is no separator). |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [Remove](../field/remove/)() | Removes the field from the document. Returns a node right after the field. If the field's end is the last child of its parent node, returns its parent paragraph. If the field is already removed, returns **null**. |
| [set_IsDirty](../field/set_isdirty/)(bool) | Setter for [Aspose::Words::Fields::Field::get_IsDirty](../field/get_isdirty/). |
| [set_IsLocked](../field/set_islocked/)(bool) | Setter for [Aspose::Words::Fields::Field::get_IsLocked](../field/get_islocked/). |
| [set_LocaleId](../field/set_localeid/)(int32_t) | Setter for [Aspose::Words::Fields::Field::get_LocaleId](../field/get_localeid/). |
| [set_Result](../field/set_result/)(const System::String\&) | Setter for [Aspose::Words::Fields::Field::get_Result](../field/get_result/). |
| [set_Text](./set_text/)(const System::String\&) | Setter for [Aspose::Words::Fields::FieldComments::get_Text](./get_text/). |
| static [Type](./type/)() |  |
| [Unlink](../field/unlink/)() | Performs the field unlink. |
| [Update](../field/update/)() | Performs the field update. Throws if the field is being updated already. |
| [Update](../field/update/)(bool) | Performs a field update. Throws if the field is being updated already. |

## Examples



Shows how to use the COMMENTS field. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

// Set a value for the document's "Comments" built-in property.
doc->get_BuiltInDocumentProperties()->set_Comments(u"My comment.");

// Create a COMMENTS field to display the value of that built-in property.
auto field = System::ExplicitCast<Aspose::Words::Fields::FieldComments>(builder->InsertField(Aspose::Words::Fields::FieldType::FieldComments, true));
field->Update();

ASSERT_EQ(u" COMMENTS ", field->GetFieldCode());
ASSERT_EQ(u"My comment.", field->get_Result());

// If we give the COMMENTS field's Text property value and update it, the field will
// overwrite the current value of the "Comments" built-in property with the value of its Text property,
// and then display the new value.
field->set_Text(u"My overriding comment.");
field->Update();

ASSERT_EQ(u" COMMENTS  \"My overriding comment.\"", field->GetFieldCode());
ASSERT_EQ(u"My overriding comment.", field->get_Result());

doc->Save(get_ArtifactsDir() + u"Field.COMMENTS.docx");
```

## See Also

* Class [Field](../field/)
* Namespace [Aspose::Words::Fields](../)
* Library [Aspose.Words for C++](../../)
