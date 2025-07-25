---
title: Aspose::Words::Layout::LayoutOptions class
linktitle: LayoutOptions
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Layout::LayoutOptions class. Holds the options that allow controlling the document layout process. To learn more, visit the  documentation article in C++.'
type: docs
weight: 3000
url: /cpp/aspose.words.layout/layoutoptions/
---
## LayoutOptions class


Holds the options that allow controlling the document layout process. To learn more, visit the [Converting to Fixed-page Format](https://docs.aspose.com/words/cpp/converting-to-fixed-page-format/) documentation article.

```cpp
class LayoutOptions : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_Callback](./get_callback/)() const | Gets [IPageLayoutCallback](../ipagelayoutcallback/) implementation used by page layout model. |
| [get_CommentDisplayMode](./get_commentdisplaymode/)() const | Gets or sets the way comments are rendered. Default value is [ShowInBalloons](../commentdisplaymode/). |
| [get_ContinuousSectionPageNumberingRestart](./get_continuoussectionpagenumberingrestart/)() const | Gets or sets the mode of behavior for computing page numbers when a continuous section restarts the page numbering. |
| [get_IgnorePrinterMetrics](./get_ignoreprintermetrics/)() const | Gets or sets indication of whether the "Use printer metrics to lay out document" compatibility option is ignored. Default is **true**. |
| [get_KeepOriginalFontMetrics](./get_keeporiginalfontmetrics/)() const | Gets an indication of whether the original font metrics should be used after font substitution. Default is **true**. |
| [get_RevisionOptions](./get_revisionoptions/)() const | Gets revision options. |
| [get_ShowHiddenText](./get_showhiddentext/)() const | Gets or sets indication of whether hidden text in the document is rendered. Default is **false**. |
| [get_ShowParagraphMarks](./get_showparagraphmarks/)() const | Gets or sets indication of whether paragraph marks are rendered. Default is **false**. |
| [get_TextShaperFactory](./get_textshaperfactory/)() const | Gets [ITextShaperFactory](../) implementation used for Advanced Typography rendering features. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [LayoutOptions](./layoutoptions/)() |  |
| [set_Callback](./set_callback/)(const System::SharedPtr\<Aspose::Words::Layout::IPageLayoutCallback\>\&) | Sets [IPageLayoutCallback](../ipagelayoutcallback/) implementation used by page layout model. |
| [set_CommentDisplayMode](./set_commentdisplaymode/)(Aspose::Words::Layout::CommentDisplayMode) | Setter for [Aspose::Words::Layout::LayoutOptions::get_CommentDisplayMode](./get_commentdisplaymode/). |
| [set_ContinuousSectionPageNumberingRestart](./set_continuoussectionpagenumberingrestart/)(Aspose::Words::Layout::ContinuousSectionRestart) | Setter for [Aspose::Words::Layout::LayoutOptions::get_ContinuousSectionPageNumberingRestart](./get_continuoussectionpagenumberingrestart/). |
| [set_IgnorePrinterMetrics](./set_ignoreprintermetrics/)(bool) | Setter for [Aspose::Words::Layout::LayoutOptions::get_IgnorePrinterMetrics](./get_ignoreprintermetrics/). |
| [set_KeepOriginalFontMetrics](./set_keeporiginalfontmetrics/)(bool) | Sets an indication of whether the original font metrics should be used after font substitution. Default is **true**. |
| [set_ShowHiddenText](./set_showhiddentext/)(bool) | Setter for [Aspose::Words::Layout::LayoutOptions::get_ShowHiddenText](./get_showhiddentext/). |
| [set_ShowParagraphMarks](./set_showparagraphmarks/)(bool) | Setter for [Aspose::Words::Layout::LayoutOptions::get_ShowParagraphMarks](./get_showparagraphmarks/). |
| [set_TextShaperFactory](./set_textshaperfactory/)(const System::SharedPtr\<Aspose::Words::Shaping::ITextShaperFactory\>\&) | Sets [ITextShaperFactory](../) implementation used for Advanced Typography rendering features. |
| static [Type](./type/)() |  |
## Remarks


You do not create instances of this class directly. Use the [LayoutOptions](../../aspose.words/document/get_layoutoptions/) property to access layout options for this document.

Note that after changing any of the options present in this class, [UpdatePageLayout](../../aspose.words/document/updatepagelayout/) method should be called in order for the changed options to be applied to the layout.

## Examples



Shows how to hide text in a rendered output document. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

// Insert hidden text, then specify whether we wish to omit it from a rendered document.
builder->Writeln(u"This text is not hidden.");
builder->get_Font()->set_Hidden(true);
builder->Writeln(u"This text is hidden.");

doc->get_LayoutOptions()->set_ShowHiddenText(showHiddenText);

doc->Save(get_ArtifactsDir() + u"Document.LayoutOptionsHiddenText.pdf");
```


Shows how to show paragraph marks in a rendered output document. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

// Add some paragraphs, then enable paragraph marks to show the ends of paragraphs
// with a pilcrow (¶) symbol when we render the document.
builder->Writeln(u"Hello world!");
builder->Writeln(u"Hello again!");

doc->get_LayoutOptions()->set_ShowParagraphMarks(showParagraphMarks);

doc->Save(get_ArtifactsDir() + u"Document.LayoutOptionsParagraphMarks.pdf");
```


Shows how to alter the appearance of revisions in a rendered output document. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

// Insert a revision, then change the color of all revisions to green.
builder->Writeln(u"This is not a revision.");
doc->StartTrackRevisions(u"John Doe", System::DateTime::get_Now());
builder->Writeln(u"This is a revision.");
doc->StopTrackRevisions();
builder->Writeln(u"This is not a revision.");

// Remove the bar that appears to the left of every revised line.
doc->get_LayoutOptions()->get_RevisionOptions()->set_InsertedTextColor(Aspose::Words::Layout::RevisionColor::BrightGreen);
doc->get_LayoutOptions()->get_RevisionOptions()->set_ShowRevisionBars(false);
doc->get_LayoutOptions()->get_RevisionOptions()->set_RevisionBarsPosition(Aspose::Words::Drawing::HorizontalAlignment::Right);

doc->Save(get_ArtifactsDir() + u"Revision.LayoutOptionsRevisions.pdf");
```

## See Also

* Namespace [Aspose::Words::Layout](../)
* Library [Aspose.Words for C++](../../)
