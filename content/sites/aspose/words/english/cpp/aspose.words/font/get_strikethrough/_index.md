---
title: Aspose::Words::Font::get_StrikeThrough method
linktitle: get_StrikeThrough
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Font::get_StrikeThrough method. True if the font is formatted as strikethrough text in C++.'
type: docs
weight: 41000
url: /cpp/aspose.words/font/get_strikethrough/
---
## Font::get_StrikeThrough method


True if the font is formatted as strikethrough text.

```cpp
bool Aspose::Words::Font::get_StrikeThrough()
```


## Examples



Shows how to add a line strikethrough to text. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto para = System::ExplicitCast<Aspose::Words::Paragraph>(doc->GetChild(Aspose::Words::NodeType::Paragraph, 0, true));

auto run = System::MakeObject<Aspose::Words::Run>(doc, u"Text with a single-line strikethrough.");
run->get_Font()->set_StrikeThrough(true);
para->AppendChild<System::SharedPtr<Aspose::Words::Run>>(run);

para = System::ExplicitCast<Aspose::Words::Paragraph>(para->get_ParentNode()->AppendChild<System::SharedPtr<Aspose::Words::Paragraph>>(System::MakeObject<Aspose::Words::Paragraph>(doc)));

run = System::MakeObject<Aspose::Words::Run>(doc, u"Text with a double-line strikethrough.");
run->get_Font()->set_DoubleStrikeThrough(true);
para->AppendChild<System::SharedPtr<Aspose::Words::Run>>(run);

doc->Save(get_ArtifactsDir() + u"Font.StrikeThrough.docx");
```

## See Also

* Class [Font](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
