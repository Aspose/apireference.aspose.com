---
title: PageSetup.HeadingLevelForChapter
linktitle: HeadingLevelForChapter
articleTitle: HeadingLevelForChapter
second_title: Aspose.Words for .NET
description: Discover the PageSetup HeadingLevelForChapter property to easily customize chapter title styles in your document for enhanced readability and professionalism.
type: docs
weight: 180
url: /net/aspose.words/pagesetup/headinglevelforchapter/
---
## PageSetup.HeadingLevelForChapter property

Gets or sets the heading level style that is applied to the chapter titles in the document.

```csharp
public int HeadingLevelForChapter { get; set; }
```

## Remarks

Can be a number from 0 through 9. 0 means no chapter number if applied to page number.

Before you can create page numbers that include chapter numbers, the document headings must have a numbered outline format applied.

## Examples

Shows how to work with page chapters.

```csharp
Document doc = new Document(MyDir + "Big document.docx");

PageSetup pageSetup = doc.FirstSection.PageSetup;

pageSetup.PageNumberStyle = NumberStyle.UppercaseRoman;
pageSetup.ChapterPageSeparator = Aspose.Words.ChapterPageSeparator.Colon;
pageSetup.HeadingLevelForChapter = 1;
```

### See Also

* class [PageSetup](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
