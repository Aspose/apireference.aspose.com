---
title: Style.Document
linktitle: Document
articleTitle: Document
second_title: Aspose.Words for .NET
description: Discover the Style Document property to easily access and manage your owner document for enhanced organization and efficiency.
type: docs
weight: 50
url: /net/aspose.words/style/document/
---
## Style.Document property

Gets the owner document.

```csharp
public DocumentBase Document { get; }
```

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

* class [DocumentBase](../../documentbase/)
* class [Style](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
