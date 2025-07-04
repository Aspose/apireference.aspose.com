---
title: Aspose::Words::Saving::HtmlSaveOptions::get_Encoding method
linktitle: get_Encoding
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Saving::HtmlSaveOptions::get_Encoding method. Specifies the encoding to use when exporting to HTML, MHTML or EPUB. Default value is new UTF8Encoding(false) (UTF-8 without BOM) in C++.'
type: docs
weight: 11000
url: /cpp/aspose.words.saving/htmlsaveoptions/get_encoding/
---
## HtmlSaveOptions::get_Encoding method


Specifies the encoding to use when exporting to HTML, MHTML or EPUB. Default value is **new UTF8Encoding(false)** (UTF-8 without BOM).

```cpp
System::SharedPtr<System::Text::Encoding> Aspose::Words::Saving::HtmlSaveOptions::get_Encoding() const
```


## Examples



Shows how to use a specific encoding when saving a document to .epub. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Rendering.docx");

// Use a SaveOptions object to specify the encoding for a document that we will save.
auto saveOptions = System::MakeObject<Aspose::Words::Saving::HtmlSaveOptions>();
saveOptions->set_SaveFormat(Aspose::Words::SaveFormat::Epub);
saveOptions->set_Encoding(System::Text::Encoding::get_UTF8());

// By default, an output .epub document will have all its contents in one HTML part.
// A split criterion allows us to segment the document into several HTML parts.
// We will set the criteria to split the document into heading paragraphs.
// This is useful for readers who cannot read HTML files more significant than a specific size.
saveOptions->set_DocumentSplitCriteria(Aspose::Words::Saving::DocumentSplitCriteria::HeadingParagraph);

// Specify that we want to export document properties.
saveOptions->set_ExportDocumentProperties(true);

doc->Save(get_ArtifactsDir() + u"HtmlSaveOptions.Doc2EpubSaveOptions.epub", saveOptions);
```

## See Also

* Class [HtmlSaveOptions](../)
* Namespace [Aspose::Words::Saving](../../)
* Library [Aspose.Words for C++](../../../)
