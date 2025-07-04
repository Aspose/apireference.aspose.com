---
title: Aspose::Words::PageSetup::get_OddAndEvenPagesHeaderFooter method
linktitle: get_OddAndEvenPagesHeaderFooter
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::PageSetup::get_OddAndEvenPagesHeaderFooter method. True if the document has different headers and footers for odd-numbered and even-numbered pages in C++.'
type: docs
weight: 30000
url: /cpp/aspose.words/pagesetup/get_oddandevenpagesheaderfooter/
---
## PageSetup::get_OddAndEvenPagesHeaderFooter method


True if the document has different headers and footers for odd-numbered and even-numbered pages.

```cpp
bool Aspose::Words::PageSetup::get_OddAndEvenPagesHeaderFooter() const
```


## Examples



Shows how to enable or disable even page headers/footers. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

// Below are two types of header/footers.
// 1 -  The "Primary" header/footer, which appears on every page in the section.
// We can override the primary header/footer by a first and an even page header/footer.
builder->MoveToHeaderFooter(Aspose::Words::HeaderFooterType::HeaderPrimary);
builder->Writeln(u"Primary header.");

builder->MoveToHeaderFooter(Aspose::Words::HeaderFooterType::FooterPrimary);
builder->Writeln(u"Primary footer.");

// 2 -  The "Even" header/footer, which appears on every even page of this section.
builder->MoveToHeaderFooter(Aspose::Words::HeaderFooterType::HeaderEven);
builder->Writeln(u"Even page header.");

builder->MoveToHeaderFooter(Aspose::Words::HeaderFooterType::FooterEven);
builder->Writeln(u"Even page footer.");

builder->MoveToSection(0);
builder->Writeln(u"Page 1.");
builder->InsertBreak(Aspose::Words::BreakType::PageBreak);
builder->Writeln(u"Page 2.");
builder->InsertBreak(Aspose::Words::BreakType::PageBreak);
builder->Writeln(u"Page 3.");

// Each section has a "PageSetup" object that specifies page appearance-related properties
// such as orientation, size, and borders.
// Set the "OddAndEvenPagesHeaderFooter" property to "true"
// to display the even page header/footer on even pages.
// Set the "OddAndEvenPagesHeaderFooter" property to "false"
// to display the primary header/footer on even pages.
builder->get_PageSetup()->set_OddAndEvenPagesHeaderFooter(oddAndEvenPagesHeaderFooter);

doc->Save(get_ArtifactsDir() + u"PageSetup.OddAndEvenPagesHeaderFooter.docx");
```

## See Also

* Class [PageSetup](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
