---
title: Aspose::Words::PlainTextDocument::get_Text method
linktitle: get_Text
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::PlainTextDocument::get_Text method. Gets textual content of the document concatenated as a string in C++.'
type: docs
weight: 5000
url: /cpp/aspose.words/plaintextdocument/get_text/
---
## PlainTextDocument::get_Text method


Gets textual content of the document concatenated as a string.

```cpp
System::String Aspose::Words::PlainTextDocument::get_Text() const
```


## Examples



Shows how to load the contents of a Microsoft Word document in plaintext. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);
builder->Writeln(u"Hello world!");

doc->Save(get_ArtifactsDir() + u"PlainTextDocument.Load.docx");

auto plaintext = System::MakeObject<Aspose::Words::PlainTextDocument>(get_ArtifactsDir() + u"PlainTextDocument.Load.docx");

ASSERT_EQ(u"Hello world!", plaintext->get_Text().Trim());
```

## See Also

* Class [PlainTextDocument](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
