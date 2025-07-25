---
title: Aspose::Words::Properties::BuiltInDocumentProperties::get_TitlesOfParts method
linktitle: get_TitlesOfParts
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Properties::BuiltInDocumentProperties::get_TitlesOfParts method. Each string in the array specifies the name of a part in the document in C++.'
type: docs
weight: 30000
url: /cpp/aspose.words.properties/builtindocumentproperties/get_titlesofparts/
---
## BuiltInDocumentProperties::get_TitlesOfParts method


Each string in the array specifies the name of a part in the document.

```cpp
System::ArrayPtr<System::String> Aspose::Words::Properties::BuiltInDocumentProperties::get_TitlesOfParts()
```

## Remarks


Aspose.Words does not update this property.

## Examples



Shows the relationship between "HeadingPairs" and "TitlesOfParts" properties. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Heading pairs and titles of parts.docx");

// We can find the combined values of these collections via
// "File" -> "Properties" -> "Advanced Properties" -> "Contents" tab.
// The HeadingPairs property is a collection of <string, int> pairs that
// determines how many document parts a heading spans across.
System::ArrayPtr<System::SharedPtr<System::Object>> headingPairs = doc->get_BuiltInDocumentProperties()->get_HeadingPairs();

// The TitlesOfParts property contains the names of parts that belong to the above headings.
System::ArrayPtr<System::String> titlesOfParts = doc->get_BuiltInDocumentProperties()->get_TitlesOfParts();

int32_t headingPairsIndex = 0;
int32_t titlesOfPartsIndex = 0;
while (headingPairsIndex < headingPairs->get_Length())
{
    std::cout << System::String::Format(u"Parts for {0}:", headingPairs[headingPairsIndex++]) << std::endl;
    int32_t partsCount = System::Convert::ToInt32(headingPairs[headingPairsIndex++]);

    for (int32_t i = 0; i < partsCount; i++)
    {
        std::cout << System::String::Format(u"\t\"{0}\"", titlesOfParts[titlesOfPartsIndex++]) << std::endl;
    }
}
```

## See Also

* Class [BuiltInDocumentProperties](../)
* Namespace [Aspose::Words::Properties](../../)
* Library [Aspose.Words for C++](../../../)
