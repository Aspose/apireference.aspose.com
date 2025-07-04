---
title: Aspose::Words::Saving::MarkdownExportAsHtml enum
linktitle: MarkdownExportAsHtml
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Saving::MarkdownExportAsHtml enum. Allows to specify the elements to be exported to Markdown as raw HTML in C++.'
type: docs
weight: 66500
url: /cpp/aspose.words.saving/markdownexportashtml/
---
## MarkdownExportAsHtml enum


Allows to specify the elements to be exported to Markdown as raw HTML.

```cpp
enum class MarkdownExportAsHtml
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | 0 | Export all elements using Markdown syntax without any raw HTML. |
| Tables | 1 | Export tables as raw HTML. |


## Examples



Shows how to export a table to Markdown as raw HTML. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

builder->Writeln(u"Sample table:");

// Create table.
builder->InsertCell();
builder->get_ParagraphFormat()->set_Alignment(Aspose::Words::ParagraphAlignment::Right);
builder->Write(u"Cell1");
builder->InsertCell();
builder->get_ParagraphFormat()->set_Alignment(Aspose::Words::ParagraphAlignment::Center);
builder->Write(u"Cell2");

auto saveOptions = System::MakeObject<Aspose::Words::Saving::MarkdownSaveOptions>();
saveOptions->set_ExportAsHtml(Aspose::Words::Saving::MarkdownExportAsHtml::Tables);

doc->Save(get_ArtifactsDir() + u"MarkdownSaveOptions.ExportTableAsHtml.md", saveOptions);
```

## See Also

* Namespace [Aspose::Words::Saving](../)
* Library [Aspose.Words for C++](../../)
