---
title: Aspose::Words::Properties::PropertyType enum
linktitle: PropertyType
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Properties::PropertyType enum. Specifies data type of a document property in C++.'
type: docs
weight: 6000
url: /cpp/aspose.words.properties/propertytype/
---
## PropertyType enum


Specifies data type of a document property.

```cpp
enum class PropertyType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Boolean | 0 | The property is a boolean value. |
| DateTime | 1 | The property is a date time value. |
| Double | 2 | The property is a floating number. |
| Number | 3 | The property is an integer number. |
| String | 4 | The property is a string value. |
| StringArray | 5 | The property is an array of strings. |
| ObjectArray | 6 | The property is an array of objects. |
| ByteArray | 7 | The property is an array of bytes. |
| Other | 8 | The property is some other type. |


## Examples



Shows how to work with a document's custom properties. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
System::SharedPtr<Aspose::Words::Properties::CustomDocumentProperties> properties = doc->get_CustomDocumentProperties();

ASSERT_EQ(0, properties->get_Count());

// Custom document properties are key-value pairs that we can add to the document.
properties->Add(u"Authorized", true);
properties->Add(u"Authorized By", System::String(u"John Doe"));
properties->Add(u"Authorized Date", System::DateTime::get_Today());
properties->Add(u"Authorized Revision", doc->get_BuiltInDocumentProperties()->get_RevisionNumber());
properties->Add(u"Authorized Amount", 123.45);

// The collection sorts the custom properties in alphabetic order.
ASSERT_EQ(1, properties->IndexOf(u"Authorized Amount"));
ASSERT_EQ(5, properties->get_Count());

// Print every custom property in the document.
{
    System::SharedPtr<System::Collections::Generic::IEnumerator<System::SharedPtr<Aspose::Words::Properties::DocumentProperty>>> enumerator = properties->GetEnumerator();
    while (enumerator->MoveNext())
    {
        std::cout << System::String::Format(u"Name: \"{0}\"\n\tType: \"{1}\"\n\tValue: \"{2}\"", enumerator->get_Current()->get_Name(), enumerator->get_Current()->get_Type(), enumerator->get_Current()->get_Value()) << std::endl;
    }
}

// Display the value of a custom property using a DOCPROPERTY field.
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);
auto field = System::ExplicitCast<Aspose::Words::Fields::FieldDocProperty>(builder->InsertField(u" DOCPROPERTY \"Authorized By\""));
field->Update();

ASSERT_EQ(u"John Doe", field->get_Result());

// We can find these custom properties in Microsoft Word via "File" -> "Properties" > "Advanced Properties" > "Custom".
doc->Save(get_ArtifactsDir() + u"DocumentProperties.DocumentPropertyCollection.docx");

// Below are three ways or removing custom properties from a document.
// 1 -  Remove by index:
properties->RemoveAt(1);

ASSERT_FALSE(properties->Contains(u"Authorized Amount"));
ASSERT_EQ(4, properties->get_Count());

// 2 -  Remove by name:
properties->Remove(u"Authorized Revision");

ASSERT_FALSE(properties->Contains(u"Authorized Revision"));
ASSERT_EQ(3, properties->get_Count());

// 3 -  Empty the entire collection at once:
properties->Clear();

ASSERT_EQ(0, properties->get_Count());
```

## See Also

* Namespace [Aspose::Words::Properties](../)
* Library [Aspose.Words for C++](../../)
