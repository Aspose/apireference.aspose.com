---
title: Style.List
linktitle: List
articleTitle: List
second_title: Aspose.Words for .NET
description: Discover how to style your lists effectively! Learn to define unique formatting for list styles to enhance your content's visual appeal.
type: docs
weight: 100
url: /net/aspose.words/style/list/
---
## Style.List property

Gets the list that defines formatting of this list style.

```csharp
public List List { get; }
```

## Remarks

This property is only valid for list styles. For other style types this property returns `null`.

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

* class [List](../../../aspose.words.lists/list/)
* class [Style](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
