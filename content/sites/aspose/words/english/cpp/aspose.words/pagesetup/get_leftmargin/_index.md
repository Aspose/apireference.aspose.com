---
title: Aspose::Words::PageSetup::get_LeftMargin method
linktitle: get_LeftMargin
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::PageSetup::get_LeftMargin method. Returns or sets the distance (in points) between the left edge of the page and the left boundary of the body text in C++.'
type: docs
weight: 22000
url: /cpp/aspose.words/pagesetup/get_leftmargin/
---
## PageSetup::get_LeftMargin method


Returns or sets the distance (in points) between the left edge of the page and the left boundary of the body text.

```cpp
double Aspose::Words::PageSetup::get_LeftMargin()
```


## Examples



Shows how to adjust paper size, orientation, margins, along with other settings for a section. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

builder->get_PageSetup()->set_PaperSize(Aspose::Words::PaperSize::Legal);
builder->get_PageSetup()->set_Orientation(Aspose::Words::Orientation::Landscape);
builder->get_PageSetup()->set_TopMargin(Aspose::Words::ConvertUtil::InchToPoint(1.0));
builder->get_PageSetup()->set_BottomMargin(Aspose::Words::ConvertUtil::InchToPoint(1.0));
builder->get_PageSetup()->set_LeftMargin(Aspose::Words::ConvertUtil::InchToPoint(1.5));
builder->get_PageSetup()->set_RightMargin(Aspose::Words::ConvertUtil::InchToPoint(1.5));
builder->get_PageSetup()->set_HeaderDistance(Aspose::Words::ConvertUtil::InchToPoint(0.2));
builder->get_PageSetup()->set_FooterDistance(Aspose::Words::ConvertUtil::InchToPoint(0.2));

builder->Writeln(u"Hello world!");

doc->Save(get_ArtifactsDir() + u"PageSetup.PageMargins.docx");
```

## See Also

* Class [PageSetup](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
