---
title: Body.ParentSection
linktitle: ParentSection
articleTitle: ParentSection
second_title: Aspose.Words for .NET
description: Discover the Body ParentSection property to easily access a story's parent section and enhance your content management efficiency.
type: docs
weight: 30
url: /net/aspose.words/body/parentsection/
---
## Body.ParentSection property

Gets the parent section of this story.

```csharp
public Section ParentSection { get; }
```

## Remarks

`ParentSection` is equivalent to [`ParentNode`](../../node/parentnode/) casted to [`Section`](../../section/).

## Examples

Shows how to store endnotes at the end of each section, and modify their positions.

```csharp
public void SuppressEndnotes()
{
    Document doc = new Document();
    doc.RemoveAllChildren();

    // By default, a document compiles all endnotes at its end. 
    Assert.That(doc.EndnoteOptions.Position, Is.EqualTo(EndnotePosition.EndOfDocument));

    // We use the "Position" property of the document's "EndnoteOptions" object
    // to collect endnotes at the end of each section instead. 
    doc.EndnoteOptions.Position = EndnotePosition.EndOfSection;

    InsertSectionWithEndnote(doc, "Section 1", "Endnote 1, will stay in section 1");
    InsertSectionWithEndnote(doc, "Section 2", "Endnote 2, will be pushed down to section 3");
    InsertSectionWithEndnote(doc, "Section 3", "Endnote 3, will stay in section 3");

    // While getting sections to display their respective endnotes, we can set the "SuppressEndnotes" flag
    // of a section's "PageSetup" object to "true" to revert to the default behavior and pass its endnotes
    // onto the next section.
    PageSetup pageSetup = doc.Sections[1].PageSetup;
    pageSetup.SuppressEndnotes = true;

    doc.Save(ArtifactsDir + "PageSetup.SuppressEndnotes.docx");
}

/// <summary>
/// Append a section with text and an endnote to a document.
/// </summary>
private static void InsertSectionWithEndnote(Document doc, string sectionBodyText, string endnoteText)
{
    Section section = new Section(doc);

    doc.AppendChild(section);

    Body body = new Body(doc);
    section.AppendChild(body);

    Assert.That(body.ParentNode, Is.EqualTo(section));

    Paragraph para = new Paragraph(doc);
    body.AppendChild(para);

    Assert.That(para.ParentNode, Is.EqualTo(body));

    DocumentBuilder builder = new DocumentBuilder(doc);
    builder.MoveTo(para);
    builder.Write(sectionBodyText);
    builder.InsertFootnote(FootnoteType.Endnote, endnoteText);
}
```

### See Also

* class [Section](../../section/)
* class [Body](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
