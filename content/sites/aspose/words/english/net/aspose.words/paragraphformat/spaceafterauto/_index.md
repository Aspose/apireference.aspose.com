---
title: ParagraphFormat.SpaceAfterAuto
linktitle: SpaceAfterAuto
articleTitle: SpaceAfterAuto
second_title: Aspose.Words for .NET
description: Discover the ParagraphFormat SpaceAfterAuto property. Automatically adjust paragraph spacing for a cleaner, more professional document layout.
type: docs
weight: 320
url: /net/aspose.words/paragraphformat/spaceafterauto/
---
## ParagraphFormat.SpaceAfterAuto property

True if the amount of spacing after the paragraph is set automatically.

```csharp
public bool SpaceAfterAuto { get; set; }
```

## Remarks

When set to `true`, overrides the effect of [`SpaceAfter`](../spaceafter/).

When you set paragraph Space Before and Space After to Auto, Microsoft Word adds 14 points spacing between paragraphs automatically according to the following rules:

* Normally, spacing is added after all paragraphs.
* In a bulleted or numbered list, spacing is added only after the last item in the list. Spacing is not added between the list items.
* In a nested bulleted or numbered list spacing is not added.
* Spacing is normally added after a table.
* Spacing is not added after a table if it is the last block in a table cell.
* Spacing is not added after the last paragraph in a table cell.

## Examples

Shows how to set automatic paragraph spacing.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Apply a large amount of spacing before and after paragraphs that this builder will create.
builder.ParagraphFormat.SpaceBefore = 24;
builder.ParagraphFormat.SpaceAfter = 24;

// Set these flags to "true" to apply automatic spacing,
// effectively ignoring the spacing in the properties we set above.
// Leave them as "false" will apply our custom paragraph spacing.
builder.ParagraphFormat.SpaceAfterAuto = autoSpacing;
builder.ParagraphFormat.SpaceBeforeAuto = autoSpacing;

// Insert two paragraphs that will have spacing above and below them and save the document.
builder.Writeln("Paragraph 1.");
builder.Writeln("Paragraph 2.");

doc.Save(ArtifactsDir + "ParagraphFormat.ParagraphSpacingAuto.docx");
```

### See Also

* class [ParagraphFormat](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
