---
title: Aspose::Words::Loading::LoadOptions::get_BaseUri method
linktitle: get_BaseUri
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Loading::LoadOptions::get_BaseUri method. Gets or sets the string that will be used to resolve relative URIs found in the document into absolute URIs when required. Can be null or empty string. Default is null in C++.'
type: docs
weight: 3000
url: /cpp/aspose.words.loading/loadoptions/get_baseuri/
---
## LoadOptions::get_BaseUri method


Gets or sets the string that will be used to resolve relative URIs found in the document into absolute URIs when required. Can be **null** or empty string. Default is **null**.

```cpp
System::String Aspose::Words::Loading::LoadOptions::get_BaseUri() const
```

## Remarks


This property is used to resolve relative URIs into absolute in the following cases:

1. When loading an HTML document from a stream and the document contains images with relative URIs and does not have a base URI specified in the BASE HTML element.
1. When saving a document to PDF and other formats, to retrieve images linked using relative URIs so the images can be saved into the output document.



## Examples



Shows how to open an HTML document with images from a stream using a base URI. 
```cpp
{
    System::SharedPtr<System::IO::Stream> stream = System::IO::File::OpenRead(get_MyDir() + u"Document.html");
    // Pass the URI of the base folder while loading it
    // so that any images with relative URIs in the HTML document can be found.
    auto loadOptions = System::MakeObject<Aspose::Words::Loading::LoadOptions>();
    loadOptions->set_BaseUri(get_ImageDir());

    auto doc = System::MakeObject<Aspose::Words::Document>(stream, loadOptions);

    // Verify that the first shape of the document contains a valid image.
    auto shape = System::ExplicitCast<Aspose::Words::Drawing::Shape>(doc->GetChild(Aspose::Words::NodeType::Shape, 0, true));

    ASSERT_TRUE(shape->get_IsImage());
    ASSERT_FALSE(System::TestTools::IsNull(shape->get_ImageData()->get_ImageBytes()));
    ASSERT_NEAR(32.0, Aspose::Words::ConvertUtil::PointToPixel(shape->get_Width()), 0.01);
    ASSERT_NEAR(32.0, Aspose::Words::ConvertUtil::PointToPixel(shape->get_Height()), 0.01);
}
```

## See Also

* Class [LoadOptions](../)
* Namespace [Aspose::Words::Loading](../../)
* Library [Aspose.Words for C++](../../../)
