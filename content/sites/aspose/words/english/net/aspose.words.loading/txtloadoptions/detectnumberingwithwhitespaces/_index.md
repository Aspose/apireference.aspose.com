---
title: TxtLoadOptions.DetectNumberingWithWhitespaces
linktitle: DetectNumberingWithWhitespaces
articleTitle: DetectNumberingWithWhitespaces
second_title: Aspose.Words for .NET
description: Optimize your document imports with TxtLoadOptions' DetectNumberingWithWhitespaces feature, ensuring accurate recognition of numbered lists from plain text.
type: docs
weight: 40
url: /net/aspose.words.loading/txtloadoptions/detectnumberingwithwhitespaces/
---
## TxtLoadOptions.DetectNumberingWithWhitespaces property

Allows to specify how numbered list items are recognized when document is imported from plain text format. The default value is `true`.

```csharp
public bool DetectNumberingWithWhitespaces { get; set; }
```

## Remarks

If this option is set to `false`, lists recognition algorithm detects list paragraphs, when list numbers ends with either dot, right bracket or bullet symbols (such as "•", "*", "-" or "o").

If this option is set to `true`, whitespaces are also used as list number delimiters: list recognition algorithm for Arabic style numbering (1., 1.1.2.) uses both whitespaces and dot (".") symbols.

## Examples

Shows how to detect lists when loading plaintext documents.

```csharp
// Create a plaintext document in a string with four separate parts that we may interpret as lists,
// with different delimiters. Upon loading the plaintext document into a "Document" object,
// Aspose.Words will always detect the first three lists and will add a "List" object
// for each to the document's "Lists" property.
const string textDoc = "Full stop delimiters:\n" +
                       "1. First list item 1\n" +
                       "2. First list item 2\n" +
                       "3. First list item 3\n\n" +
                       "Right bracket delimiters:\n" +
                       "1) Second list item 1\n" +
                       "2) Second list item 2\n" +
                       "3) Second list item 3\n\n" +
                       "Bullet delimiters:\n" +
                       "• Third list item 1\n" +
                       "• Third list item 2\n" +
                       "• Third list item 3\n\n" +
                       "Whitespace delimiters:\n" +
                       "1 Fourth list item 1\n" +
                       "2 Fourth list item 2\n" +
                       "3 Fourth list item 3";

// Create a "TxtLoadOptions" object, which we can pass to a document's constructor
// to modify how we load a plaintext document.
TxtLoadOptions loadOptions = new TxtLoadOptions();

// Set the "DetectNumberingWithWhitespaces" property to "true" to detect numbered items
// with whitespace delimiters, such as the fourth list in our document, as lists.
// This may also falsely detect paragraphs that begin with numbers as lists.
// Set the "DetectNumberingWithWhitespaces" property to "false"
// to not create lists from numbered items with whitespace delimiters.
loadOptions.DetectNumberingWithWhitespaces = detectNumberingWithWhitespaces;

Document doc = new Document(new MemoryStream(Encoding.UTF8.GetBytes(textDoc)), loadOptions);

if (detectNumberingWithWhitespaces)
{
    Assert.That(doc.Lists.Count, Is.EqualTo(4));
    Assert.That(doc.FirstSection.Body.Paragraphs.Any(p => p.GetText().Contains("Fourth list") && ((Paragraph)p).IsListItem), Is.True);
}
else
{
    Assert.That(doc.Lists.Count, Is.EqualTo(3));
    Assert.That(doc.FirstSection.Body.Paragraphs.Any(p => p.GetText().Contains("Fourth list") && ((Paragraph)p).IsListItem), Is.False);
}
```

### See Also

* class [TxtLoadOptions](../)
* namespace [Aspose.Words.Loading](../../../aspose.words.loading/)
* assembly [Aspose.Words](../../../)
