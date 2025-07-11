---
title: Style.NextParagraphStyleName
linktitle: NextParagraphStyleName
articleTitle: NextParagraphStyleName
second_title: Aspose.Words for .NET
description: Discover how to effectively use the NextParagraphStyleName property to automate style application for new paragraphs, enhancing your document formatting.
type: docs
weight: 140
url: /net/aspose.words/style/nextparagraphstylename/
---
## Style.NextParagraphStyleName property

Gets/sets the name of the style to be applied automatically to a new paragraph inserted after a paragraph formatted with the specified style.

```csharp
public string NextParagraphStyleName { get; set; }
```

## Remarks

This property is not used by Aspose.Words. The next paragraph style will only be applied automatically when you edit the document in MS Word.

## Examples

Shows how to access a document's style collection.

```csharp
Document doc = new Document();

Assert.That(doc.Styles.Count, Is.EqualTo(4));

// Enumerate and list all the styles that a document created using Aspose.Words contains by default.
using (IEnumerator<Style> stylesEnum = doc.Styles.GetEnumerator())
{
    while (stylesEnum.MoveNext())
    {
        Style curStyle = stylesEnum.Current;
        Console.WriteLine($"Style name:\t\"{curStyle.Name}\", of type \"{curStyle.Type}\"");
        Console.WriteLine($"\tSubsequent style:\t{curStyle.NextParagraphStyleName}");
        Console.WriteLine($"\tIs heading:\t\t\t{curStyle.IsHeading}");
        Console.WriteLine($"\tIs QuickStyle:\t\t{curStyle.IsQuickStyle}");

        Assert.That(curStyle.Document, Is.EqualTo(doc));
    }
}
```

### See Also

* class [Style](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
