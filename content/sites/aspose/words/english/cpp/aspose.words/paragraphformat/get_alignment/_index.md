---
title: Aspose::Words::ParagraphFormat::get_Alignment method
linktitle: get_Alignment
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::ParagraphFormat::get_Alignment method. Gets or sets text alignment for the paragraph in C++.'
type: docs
weight: 5000
url: /cpp/aspose.words/paragraphformat/get_alignment/
---
## ParagraphFormat::get_Alignment method


Gets or sets text alignment for the paragraph.

```cpp
Aspose::Words::ParagraphAlignment Aspose::Words::ParagraphFormat::get_Alignment()
```


## Examples



Shows how to insert a paragraph into the document. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

System::SharedPtr<Aspose::Words::Font> font = builder->get_Font();
font->set_Size(16);
font->set_Bold(true);
font->set_Color(System::Drawing::Color::get_Blue());
font->set_Name(u"Arial");
font->set_Underline(Aspose::Words::Underline::Dash);

System::SharedPtr<Aspose::Words::ParagraphFormat> paragraphFormat = builder->get_ParagraphFormat();
paragraphFormat->set_FirstLineIndent(8);
paragraphFormat->set_Alignment(Aspose::Words::ParagraphAlignment::Justify);
paragraphFormat->set_AddSpaceBetweenFarEastAndAlpha(true);
paragraphFormat->set_AddSpaceBetweenFarEastAndDigit(true);
paragraphFormat->set_KeepTogether(true);

// The "Writeln" method ends the paragraph after appending text
// and then starts a new line, adding a new paragraph.
builder->Writeln(u"Hello world!");

ASSERT_TRUE(builder->get_CurrentParagraph()->get_IsEndOfDocument());
```


Shows how to construct an Aspose.Words document by hand. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();

// A blank document contains one section, one body and one paragraph.
// Call the "RemoveAllChildren" method to remove all those nodes,
// and end up with a document node with no children.
doc->RemoveAllChildren();

// This document now has no composite child nodes that we can add content to.
// If we wish to edit it, we will need to repopulate its node collection.
// First, create a new section, and then append it as a child to the root document node.
auto section = System::MakeObject<Aspose::Words::Section>(doc);
doc->AppendChild<System::SharedPtr<Aspose::Words::Section>>(section);

// Set some page setup properties for the section.
section->get_PageSetup()->set_SectionStart(Aspose::Words::SectionStart::NewPage);
section->get_PageSetup()->set_PaperSize(Aspose::Words::PaperSize::Letter);

// A section needs a body, which will contain and display all its contents
// on the page between the section's header and footer.
auto body = System::MakeObject<Aspose::Words::Body>(doc);
section->AppendChild<System::SharedPtr<Aspose::Words::Body>>(body);

// Create a paragraph, set some formatting properties, and then append it as a child to the body.
auto para = System::MakeObject<Aspose::Words::Paragraph>(doc);

para->get_ParagraphFormat()->set_StyleName(u"Heading 1");
para->get_ParagraphFormat()->set_Alignment(Aspose::Words::ParagraphAlignment::Center);

body->AppendChild<System::SharedPtr<Aspose::Words::Paragraph>>(para);

// Finally, add some content to do the document. Create a run,
// set its appearance and contents, and then append it as a child to the paragraph.
auto run = System::MakeObject<Aspose::Words::Run>(doc);
run->set_Text(u"Hello World!");
run->get_Font()->set_Color(System::Drawing::Color::get_Red());
para->AppendChild<System::SharedPtr<Aspose::Words::Run>>(run);

ASSERT_EQ(u"Hello World!", doc->GetText().Trim());

doc->Save(get_ArtifactsDir() + u"Section.CreateManually.docx");
```

## See Also

* Enum [ParagraphAlignment](../../paragraphalignment/)
* Class [ParagraphFormat](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
