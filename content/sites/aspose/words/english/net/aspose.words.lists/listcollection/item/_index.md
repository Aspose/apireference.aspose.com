---
title: ListCollection.Item
linktitle: Item
articleTitle: Item
second_title: Aspose.Words for .NET
description: Access ListCollection items effortlessly by index. Simplify your data management and enhance your coding efficiency with this powerful property!
type: docs
weight: 30
url: /net/aspose.words.lists/listcollection/item/
---
## ListCollection indexer

Gets a list by index.

```csharp
public List this[int index] { get; }
```

## Examples

Shows how to verify owner document properties of lists.

```csharp
Document doc = new Document();

ListCollection lists = doc.Lists;
Assert.AreEqual(doc, lists.Document);

List list = lists.Add(ListTemplate.BulletDefault);
Assert.AreEqual(doc, list.Document);

Console.WriteLine("Current list count: " + lists.Count);
Console.WriteLine("Is the first document list: " + (lists[0].Equals(list)));
Console.WriteLine("ListId: " + list.ListId);
Console.WriteLine("List is the same by ListId: " + (lists.GetListByListId(1).Equals(list)));
```

Shows how to apply list formatting of an existing list to a collection of paragraphs.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Paragraph 1");
builder.Writeln("Paragraph 2");
builder.Write("Paragraph 3");

NodeCollection paras = doc.GetChildNodes(NodeType.Paragraph, true);

Assert.AreEqual(0, paras.Count(n => ((Paragraph)n).ListFormat.IsListItem));

doc.Lists.Add(ListTemplate.NumberDefault);
List docList = doc.Lists[0];

foreach (Paragraph paragraph in paras.OfType<Paragraph>())
{
    paragraph.ListFormat.List = docList;
    paragraph.ListFormat.ListLevelNumber = 2;
}

Assert.AreEqual(3, paras.Count(n => ((Paragraph)n).ListFormat.IsListItem));
```

### See Also

* class [List](../../list/)
* class [ListCollection](../)
* namespace [Aspose.Words.Lists](../../../aspose.words.lists/)
* assembly [Aspose.Words](../../../)
