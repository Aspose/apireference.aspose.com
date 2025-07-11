---
title: Aspose::Words::PlainTextDocument class
linktitle: PlainTextDocument
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::PlainTextDocument class. Allows to extract plain-text representation of the document''s content. To learn more, visit the  documentation article in C++.'
type: docs
weight: 50000
url: /cpp/aspose.words/plaintextdocument/
---
## PlainTextDocument class


Allows to extract plain-text representation of the document's content. To learn more, visit the [Working with Text Document](https://docs.aspose.com/words/cpp/working-with-text-document/) documentation article.

```cpp
class PlainTextDocument : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_BuiltInDocumentProperties](./get_builtindocumentproperties/)() const | Gets [BuiltInDocumentProperties](./get_builtindocumentproperties/) of the document. |
| [get_CustomDocumentProperties](./get_customdocumentproperties/)() const | Gets [CustomDocumentProperties](./get_customdocumentproperties/) of the document. |
| [get_Text](./get_text/)() const | Gets textual content of the document concatenated as a string. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [PlainTextDocument](./plaintextdocument/)(const System::String\&) | Creates a plain text document from a file. Automatically detects the file format. |
| [PlainTextDocument](./plaintextdocument/)(const System::String\&, const System::SharedPtr\<Aspose::Words::Loading::LoadOptions\>\&) | Creates a plain text document from a file. Allows to specify additional options such as an encryption password. |
| [PlainTextDocument](./plaintextdocument/)(const System::SharedPtr\<System::IO::Stream\>\&) | Creates a plain text document from a stream. Automatically detects the file format. |
| [PlainTextDocument](./plaintextdocument/)(const System::SharedPtr\<System::IO::Stream\>\&, const System::SharedPtr\<Aspose::Words::Loading::LoadOptions\>\&) | Creates a plain text document from a stream. Allows to specify additional options such as an encryption password. |
| [PlainTextDocument](./plaintextdocument/)(std::istream\&) |  |
| [PlainTextDocument](./plaintextdocument/)(std::istream\&, const System::SharedPtr\<Aspose::Words::Loading::LoadOptions\>\&) |  |
| static [Type](./type/)() |  |

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

* Namespace [Aspose::Words](../)
* Library [Aspose.Words for C++](../../)
