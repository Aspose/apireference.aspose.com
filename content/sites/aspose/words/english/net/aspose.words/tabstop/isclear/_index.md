---
title: TabStop.IsClear
linktitle: IsClear
articleTitle: IsClear
second_title: Aspose.Words for .NET
description: Discover how the TabStop IsClear property enhances your UI by ensuring seamless tab management, clearing existing stops for a smoother user experience.
type: docs
weight: 30
url: /net/aspose.words/tabstop/isclear/
---
## TabStop.IsClear property

Returns `true` if this tab stop clears any existing tab stops in this position.

```csharp
public bool IsClear { get; }
```

## Examples

Shows how to work with a document's collection of tab stops.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

TabStopCollection tabStops = builder.ParagraphFormat.TabStops;

// 72 points is one "inch" on the Microsoft Word tab stop ruler.
tabStops.Add(new TabStop(72.0));
tabStops.Add(new TabStop(432.0, TabAlignment.Right, TabLeader.Dashes));

Assert.That(tabStops.Count, Is.EqualTo(2));
Assert.That(tabStops[0].IsClear, Is.False);
Assert.That(tabStops[0].Equals(tabStops[1]), Is.False);

// Every "tab" character takes the builder's cursor to the location of the next tab stop.
builder.Writeln("Start\tTab 1\tTab 2");

ParagraphCollection paragraphs = doc.FirstSection.Body.Paragraphs;

Assert.That(paragraphs.Count, Is.EqualTo(2));

// Each paragraph gets its tab stop collection, which clones its values from the document builder's tab stop collection.
Assert.That(paragraphs[1].ParagraphFormat.TabStops, Is.EqualTo(paragraphs[0].ParagraphFormat.TabStops));
Assert.That(paragraphs[1].ParagraphFormat.TabStops, Is.Not.SameAs(paragraphs[0].ParagraphFormat.TabStops));

// A tab stop collection can point us to TabStops before and after certain positions.
Assert.That(tabStops.Before(100.0).Position, Is.EqualTo(72.0));
Assert.That(tabStops.After(100.0).Position, Is.EqualTo(432.0));

// We can clear a paragraph's tab stop collection to revert to the default tabbing behavior.
paragraphs[1].ParagraphFormat.TabStops.Clear();

Assert.That(paragraphs[1].ParagraphFormat.TabStops.Count, Is.EqualTo(0));

doc.Save(ArtifactsDir + "TabStopCollection.TabStopCollection.docx");
```

### See Also

* class [TabStop](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
