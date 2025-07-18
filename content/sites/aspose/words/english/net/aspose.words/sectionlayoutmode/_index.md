---
title: SectionLayoutMode Enum
linktitle: SectionLayoutMode
articleTitle: SectionLayoutMode
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.SectionLayoutMode enum to optimize section layouts and enhance document grid behavior for improved formatting control.
type: docs
weight: 6580
url: /net/aspose.words/sectionlayoutmode/
---
## SectionLayoutMode enumeration

Specifies the layout mode for a section allowing to define the document grid behavior.

```csharp
public enum SectionLayoutMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Default | `0` | Specifies that no document grid shall be applied to the contents of the corresponding section in the document. |
| Grid | `1` | Specifies that the corresponding section shall have both the additional line pitch and character pitch added to each line and character within it in order to maintain a specific number of lines per page and characters per line. Characters will not be automatically aligned with gridlines on typing. |
| LineGrid | `2` | Specifies that the corresponding section shall have additional line pitch added to each line within it in order to maintain the specified number of lines per page. |
| SnapToChars | `3` | Specifies that the corresponding section shall have both the additional line pitch and character pitch added to each line and character within it in order to maintain a specific number of lines per page and characters per line. Characters will be automatically aligned with gridlines on typing. |

## Examples

Shows how to specify a limit for the number of lines that each page may have.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Enable pitching, and then use it to set the number of lines per page in this section.
// A large enough font size will push some lines down onto the next page to avoid overlapping characters.
builder.PageSetup.LayoutMode = SectionLayoutMode.LineGrid;
builder.PageSetup.LinesPerPage = 15;

builder.ParagraphFormat.SnapToGrid = true;

for (int i = 0; i < 30; i++)
    builder.Write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");

doc.Save(ArtifactsDir + "PageSetup.LinesPerPage.docx");
```

Shows how to specify a for the number of characters that each line may have.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Enable pitching, and then use it to set the number of characters per line in this section.
builder.PageSetup.LayoutMode = SectionLayoutMode.Grid;
builder.PageSetup.CharactersPerLine = 10;

// The number of characters also depends on the size of the font.
doc.Styles["Normal"].Font.Size = 20;

Assert.That(doc.FirstSection.PageSetup.CharactersPerLine, Is.EqualTo(8));

builder.Writeln("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

doc.Save(ArtifactsDir + "PageSetup.CharactersPerLine.docx");
```

### See Also

* namespace [Aspose.Words](../../aspose.words/)
* assembly [Aspose.Words](../../)
