---
title: SdtListItem Class
linktitle: SdtListItem
articleTitle: SdtListItem
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Markup.SdtListItem class, designed for efficient list item management in ComboBox and DropDownList structured documents.
type: docs
weight: 4700
url: /net/aspose.words.markup/sdtlistitem/
---
## SdtListItem class

This element specifies a single list item within a parent ComboBox or DropDownList structured document tag.

To learn more, visit the [Structured Document Tags or Content Control](https://docs.aspose.com/words/net/working-with-content-control-sdt/) documentation article.

```csharp
public class SdtListItem
```

## Constructors

| Name | Description |
| --- | --- |
| [SdtListItem](sdtlistitem/#constructor)(*string*) | Initializes a new instance of this class. |
| [SdtListItem](sdtlistitem/#constructor_1)(*string, string*) | Initializes a new instance of this class. |

## Properties

| Name | Description |
| --- | --- |
| [DisplayText](../../aspose.words.markup/sdtlistitem/displaytext/) { get; } | Gets the text to display in the run content in place of the [`Value`](./value/) attribute contents for this list item. |
| [Value](../../aspose.words.markup/sdtlistitem/value/) { get; } | Gets the value of this list item. |

## Examples

Shows how to work with drop down-list structured document tags.

```csharp
Document doc = new Document();
StructuredDocumentTag tag = new StructuredDocumentTag(doc, SdtType.DropDownList, MarkupLevel.Block);
doc.FirstSection.Body.AppendChild(tag);

// A drop-down list structured document tag is a form that allows the user to
// select an option from a list by left-clicking and opening the form in Microsoft Word.
// The "ListItems" property contains all list items, and each list item is an "SdtListItem".
SdtListItemCollection listItems = tag.ListItems;
listItems.Add(new SdtListItem("Value 1"));

Assert.That(listItems[0].Value, Is.EqualTo(listItems[0].DisplayText));

// Add 3 more list items. Initialize these items using a different constructor to the first item
// to display strings that are different from their values.
listItems.Add(new SdtListItem("Item 2", "Value 2"));
listItems.Add(new SdtListItem("Item 3", "Value 3"));
listItems.Add(new SdtListItem("Item 4", "Value 4"));

Assert.That(listItems.Count, Is.EqualTo(4));

// The drop-down list is displaying the first item. Assign a different list item to the "SelectedValue" to display it.
listItems.SelectedValue = listItems[3];

Assert.That(listItems.SelectedValue.Value, Is.EqualTo("Value 4"));

// Enumerate over the collection and print each element.
using (IEnumerator<SdtListItem> enumerator = listItems.GetEnumerator())
{
    while (enumerator.MoveNext())
        if (enumerator.Current != null)
            Console.WriteLine($"List item: {enumerator.Current.DisplayText}, value: {enumerator.Current.Value}");
}

// Remove the last list item. 
listItems.RemoveAt(3);

Assert.That(listItems.Count, Is.EqualTo(3));

// Since our drop-down control is set to display the removed item by default, give it an item to display which exists.
listItems.SelectedValue = listItems[1];

doc.Save(ArtifactsDir + "StructuredDocumentTag.ListItemCollection.docx");

// Use the "Clear" method to empty the entire drop-down item collection at once.
listItems.Clear();

Assert.That(listItems.Count, Is.EqualTo(0));
```

### See Also

* namespace [Aspose.Words.Markup](../../aspose.words.markup/)
* assembly [Aspose.Words](../../)
