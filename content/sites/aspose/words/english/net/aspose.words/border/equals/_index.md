---
title: Border.Equals
linktitle: Equals
articleTitle: Equals
second_title: Aspose.Words for .NET
description: Discover the Border Equals method to easily compare border values and enhance your design precision. Achieve consistent results effortlessly!
type: docs
weight: 100
url: /net/aspose.words/border/equals/
---
## Equals(*[Border](../)*) {#equals}

Determines whether the specified border is equal in value to the current border.

```csharp
public bool Equals(Border rhs)
```

## Examples

Shows how border collections can share elements.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Paragraph 1.");
builder.Write("Paragraph 2.");

// Since we used the same border configuration while creating
// these paragraphs, their border collections share the same elements.
BorderCollection firstParagraphBorders = doc.FirstSection.Body.FirstParagraph.ParagraphFormat.Borders;
BorderCollection secondParagraphBorders = builder.CurrentParagraph.ParagraphFormat.Borders;
for (int i = 0; i < firstParagraphBorders.Count; i++)
{
    Assert.That(firstParagraphBorders[i].Equals(secondParagraphBorders[i]), Is.True);
    Assert.That(secondParagraphBorders[i].GetHashCode(), Is.EqualTo(firstParagraphBorders[i].GetHashCode()));
    Assert.That(firstParagraphBorders[i].IsVisible, Is.False);
}

foreach (Border border in secondParagraphBorders)
    border.LineStyle = LineStyle.DotDash;

// After changing the line style of the borders in just the second paragraph,
// the border collections no longer share the same elements.
for (int i = 0; i < firstParagraphBorders.Count; i++)
{
    Assert.That(firstParagraphBorders[i].Equals(secondParagraphBorders[i]), Is.False);
    Assert.That(secondParagraphBorders[i].GetHashCode(), Is.Not.EqualTo(firstParagraphBorders[i].GetHashCode()));

    // Changing the appearance of an empty border makes it visible.
    Assert.That(secondParagraphBorders[i].IsVisible, Is.True);
}

doc.Save(ArtifactsDir + "Border.SharedElements.docx");
```

### See Also

* class [Border](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## Equals(*object*) {#equals_1}

Determines whether the specified object is equal in value to the current object.

```csharp
public override bool Equals(object obj)
```

## Examples

Shows how border collections can share elements.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Paragraph 1.");
builder.Write("Paragraph 2.");

// Since we used the same border configuration while creating
// these paragraphs, their border collections share the same elements.
BorderCollection firstParagraphBorders = doc.FirstSection.Body.FirstParagraph.ParagraphFormat.Borders;
BorderCollection secondParagraphBorders = builder.CurrentParagraph.ParagraphFormat.Borders;
for (int i = 0; i < firstParagraphBorders.Count; i++)
{
    Assert.That(firstParagraphBorders[i].Equals(secondParagraphBorders[i]), Is.True);
    Assert.That(secondParagraphBorders[i].GetHashCode(), Is.EqualTo(firstParagraphBorders[i].GetHashCode()));
    Assert.That(firstParagraphBorders[i].IsVisible, Is.False);
}

foreach (Border border in secondParagraphBorders)
    border.LineStyle = LineStyle.DotDash;

// After changing the line style of the borders in just the second paragraph,
// the border collections no longer share the same elements.
for (int i = 0; i < firstParagraphBorders.Count; i++)
{
    Assert.That(firstParagraphBorders[i].Equals(secondParagraphBorders[i]), Is.False);
    Assert.That(secondParagraphBorders[i].GetHashCode(), Is.Not.EqualTo(firstParagraphBorders[i].GetHashCode()));

    // Changing the appearance of an empty border makes it visible.
    Assert.That(secondParagraphBorders[i].IsVisible, Is.True);
}

doc.Save(ArtifactsDir + "Border.SharedElements.docx");
```

### See Also

* class [Border](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
