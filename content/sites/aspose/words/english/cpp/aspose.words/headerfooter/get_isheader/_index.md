---
title: Aspose::Words::HeaderFooter::get_IsHeader method
linktitle: get_IsHeader
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::HeaderFooter::get_IsHeader method. True if this HeaderFooter object is a header in C++.'
type: docs
weight: 5000
url: /cpp/aspose.words/headerfooter/get_isheader/
---
## HeaderFooter::get_IsHeader method


True if this [HeaderFooter](../) object is a header.

```cpp
bool Aspose::Words::HeaderFooter::get_IsHeader()
```


## Examples



Shows how to create a header and a footer. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();

// Create a header and append a paragraph to it. The text in that paragraph
// will appear at the top of every page of this section, above the main body text.
auto header = System::MakeObject<Aspose::Words::HeaderFooter>(doc, Aspose::Words::HeaderFooterType::HeaderPrimary);
doc->get_FirstSection()->get_HeadersFooters()->Add(header);

System::SharedPtr<Aspose::Words::Paragraph> para = header->AppendParagraph(u"My header.");

ASSERT_TRUE(header->get_IsHeader());
ASSERT_TRUE(para->get_IsEndOfHeaderFooter());

// Create a footer and append a paragraph to it. The text in that paragraph
// will appear at the bottom of every page of this section, below the main body text.
auto footer = System::MakeObject<Aspose::Words::HeaderFooter>(doc, Aspose::Words::HeaderFooterType::FooterPrimary);
doc->get_FirstSection()->get_HeadersFooters()->Add(footer);

para = footer->AppendParagraph(u"My footer.");

ASSERT_FALSE(footer->get_IsHeader());
ASSERT_TRUE(para->get_IsEndOfHeaderFooter());

ASPOSE_ASSERT_EQ(footer, para->get_ParentStory());
ASPOSE_ASSERT_EQ(footer->get_ParentSection(), para->get_ParentSection());
ASPOSE_ASSERT_EQ(footer->get_ParentSection(), header->get_ParentSection());

doc->Save(get_ArtifactsDir() + u"HeaderFooter.Create.docx");
```

## See Also

* Class [HeaderFooter](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
