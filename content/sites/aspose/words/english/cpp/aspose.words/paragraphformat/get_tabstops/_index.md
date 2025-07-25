---
title: Aspose::Words::ParagraphFormat::get_TabStops method
linktitle: get_TabStops
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::ParagraphFormat::get_TabStops method. Gets the collection of custom tab stops defined for this object in C++.'
type: docs
weight: 40000
url: /cpp/aspose.words/paragraphformat/get_tabstops/
---
## ParagraphFormat::get_TabStops method


Gets the collection of custom tab stops defined for this object.

```cpp
System::SharedPtr<Aspose::Words::TabStopCollection> Aspose::Words::ParagraphFormat::get_TabStops()
```


## Examples



Shows how to modify the position of the right tab stop in TOC related paragraphs. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Table of contents.docx");

// Iterate through all paragraphs with TOC result-based styles; this is any style between TOC and TOC9.
for (auto&& para : System::IterateOver<Aspose::Words::Paragraph>(doc->GetChildNodes(Aspose::Words::NodeType::Paragraph, true)))
{
    if (para->get_ParagraphFormat()->get_Style()->get_StyleIdentifier() >= Aspose::Words::StyleIdentifier::Toc1 && para->get_ParagraphFormat()->get_Style()->get_StyleIdentifier() <= Aspose::Words::StyleIdentifier::Toc9)
    {
        // Get the first tab used in this paragraph, this should be the tab used to align the page numbers.
        System::SharedPtr<Aspose::Words::TabStop> tab = para->get_ParagraphFormat()->get_TabStops()->idx_get(0);

        // Replace the first default tab, stop with a custom tab stop.
        para->get_ParagraphFormat()->get_TabStops()->RemoveByPosition(tab->get_Position());
        para->get_ParagraphFormat()->get_TabStops()->Add(tab->get_Position() - 50, tab->get_Alignment(), tab->get_Leader());
    }
}

doc->Save(get_ArtifactsDir() + u"Styles.ChangeTocsTabStops.docx");
```

## See Also

* Class [TabStopCollection](../../tabstopcollection/)
* Class [ParagraphFormat](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
