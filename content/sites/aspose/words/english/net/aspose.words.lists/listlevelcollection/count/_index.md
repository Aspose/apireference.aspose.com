---
title: ListLevelCollection.Count
linktitle: Count
articleTitle: Count
second_title: Aspose.Words for .NET
description: Discover the ListLevelCollection Count property to easily access the total number of levels in your list, enhancing data management and organization.
type: docs
weight: 10
url: /net/aspose.words.lists/listlevelcollection/count/
---
## ListLevelCollection.Count property

Gets the number of levels in this list.

```csharp
public int Count { get; }
```

## Remarks

There could be 1 or 9 levels in a list.

## Examples

Shows how to create a list style and use it in a document.

```csharp
Document doc = new Document();

// A list allows us to organize and decorate sets of paragraphs with prefix symbols and indents.
// We can create nested lists by increasing the indent level. 
// We can begin and end a list by using a document builder's "ListFormat" property. 
// Each paragraph that we add between a list's start and the end will become an item in the list.
// We can contain an entire List object within a style.
Style listStyle = doc.Styles.Add(StyleType.List, "MyListStyle");

List list1 = listStyle.List;

Assert.That(list1.IsListStyleDefinition, Is.True);
Assert.That(list1.IsListStyleReference, Is.False);
Assert.That(list1.IsMultiLevel, Is.True);
Assert.That(list1.Style, Is.EqualTo(listStyle));

// Change the appearance of all list levels in our list.
foreach (ListLevel level in list1.ListLevels)
{
    level.Font.Name = "Verdana";
    level.Font.Color = Color.Blue;
    level.Font.Bold = true;
}

DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Using list style first time:");

// Create another list from a list within a style.
List list2 = doc.Lists.Add(listStyle);

Assert.That(list2.IsListStyleDefinition, Is.False);
Assert.That(list2.IsListStyleReference, Is.True);
Assert.That(list2.Style, Is.EqualTo(listStyle));

// Add some list items that our list will format.
builder.ListFormat.List = list2;
builder.Writeln("Item 1");
builder.Writeln("Item 2");
builder.ListFormat.RemoveNumbers();

builder.Writeln("Using list style second time:");

// Create and apply another list based on the list style.
List list3 = doc.Lists.Add(listStyle);
builder.ListFormat.List = list3;
builder.Writeln("Item 1");
builder.Writeln("Item 2");
builder.ListFormat.RemoveNumbers();

builder.Document.Save(ArtifactsDir + "Lists.CreateAndUseListStyle.docx");
```

### See Also

* class [ListLevelCollection](../)
* namespace [Aspose.Words.Lists](../../../aspose.words.lists/)
* assembly [Aspose.Words](../../../)
