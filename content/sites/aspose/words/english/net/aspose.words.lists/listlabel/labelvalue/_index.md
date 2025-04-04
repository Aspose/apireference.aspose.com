---
title: ListLabel.LabelValue
linktitle: LabelValue
articleTitle: LabelValue
second_title: Aspose.Words for .NET
description: Discover the ListLabel LabelValue property to easily retrieve numeric values for labels, enhancing your data management and reporting efficiency.
type: docs
weight: 30
url: /net/aspose.words.lists/listlabel/labelvalue/
---
## ListLabel.LabelValue property

Gets a numeric value for this label.

```csharp
public int LabelValue { get; }
```

## Remarks

Use the [`UpdateListLabels`](../../../aspose.words/document/updatelistlabels/) method to update the value of this property.

## Examples

Shows how to extract the list labels of all paragraphs that are list items.

```csharp
Document doc = new Document(MyDir + "Rendering.docx");
doc.UpdateListLabels();

NodeCollection paras = doc.GetChildNodes(NodeType.Paragraph, true);

// Find if we have the paragraph list. In our document, our list uses plain Arabic numbers,
// which start at three and ends at six.
foreach (Paragraph paragraph in paras.OfType<Paragraph>().Where(p => p.ListFormat.IsListItem).ToList())
{
    Console.WriteLine($"List item paragraph #{paras.IndexOf(paragraph)}");

    // This is the text we get when getting when we output this node to text format.
    // This text output will omit list labels. Trim any paragraph formatting characters. 
    string paragraphText = paragraph.ToString(SaveFormat.Text).Trim();
    Console.WriteLine($"\tExported Text: {paragraphText}");

    ListLabel label = paragraph.ListLabel;

    // This gets the position of the paragraph in the current level of the list. If we have a list with multiple levels,
    // this will tell us what position it is on that level.
    Console.WriteLine($"\tNumerical Id: {label.LabelValue}");

    // Combine them together to include the list label with the text in the output.
    Console.WriteLine($"\tList label combined with text: {label.LabelString} {paragraphText}");
}
```

### See Also

* class [ListLabel](../)
* namespace [Aspose.Words.Lists](../../../aspose.words.lists/)
* assembly [Aspose.Words](../../../)
