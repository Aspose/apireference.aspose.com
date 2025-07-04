---
title: Style.IsQuickStyle
linktitle: IsQuickStyle
articleTitle: IsQuickStyle
second_title: Aspose.Words for .NET
description: Discover how the IsQuickStyle property enhances your MS Word experience by showcasing styles in the Quick Style gallery for easy access and improved workflow.
type: docs
weight: 80
url: /net/aspose.words/style/isquickstyle/
---
## Style.IsQuickStyle property

Specifies whether this style is shown in the Quick Style gallery inside MS Word UI.

```csharp
public bool IsQuickStyle { get; set; }
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

* class [Style](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
