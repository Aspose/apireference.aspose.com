---
title: DocumentBase.Lists
linktitle: Lists
articleTitle: Lists
second_title: Aspose.Words for .NET
description: Discover DocumentBase Lists for efficient property management. Access customizable list formatting to enhance your document's presentation and clarity.
type: docs
weight: 50
url: /net/aspose.words/documentbase/lists/
---
## DocumentBase.Lists property

Provides access to the list formatting used in the document.

```csharp
public ListCollection Lists { get; }
```

## Remarks

For more information see the description of the [`ListCollection`](../../../aspose.words.lists/listcollection/) class.

## Examples

Shows how to work with list levels.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Assert.That(builder.ListFormat.IsListItem, Is.False);

// A list allows us to organize and decorate sets of paragraphs with prefix symbols and indents.
// We can create nested lists by increasing the indent level. 
// We can begin and end a list by using a document builder's "ListFormat" property. 
// Each paragraph that we add between a list's start and the end will become an item in the list.
// Below are two types of lists that we can create using a document builder.
// 1 -  A numbered list:
// Numbered lists create a logical order for their paragraphs by numbering each item.
builder.ListFormat.List = doc.Lists.Add(ListTemplate.NumberDefault);

Assert.That(builder.ListFormat.IsListItem, Is.True);

// By setting the "ListLevelNumber" property, we can increase the list level
// to begin a self-contained sub-list at the current list item.
// The Microsoft Word list template called "NumberDefault" uses numbers to create list levels for the first list level.
// Deeper list levels use letters and lowercase Roman numerals. 
for (int i = 0; i < 9; i++)
{
    builder.ListFormat.ListLevelNumber = i;
    builder.Writeln("Level " + i);
}

// 2 -  A bulleted list:
// This list will apply an indent and a bullet symbol ("•") before each paragraph.
// Deeper levels of this list will use different symbols, such as "■" and "○".
builder.ListFormat.List = doc.Lists.Add(ListTemplate.BulletDefault);

for (int i = 0; i < 9; i++)
{
    builder.ListFormat.ListLevelNumber = i;
    builder.Writeln("Level " + i);
}

// We can disable list formatting to not format any subsequent paragraphs as lists by un-setting the "List" flag.
builder.ListFormat.List = null;

Assert.That(builder.ListFormat.IsListItem, Is.False);

doc.Save(ArtifactsDir + "Lists.SpecifyListLevel.docx");
```

### See Also

* class [ListCollection](../../../aspose.words.lists/listcollection/)
* class [DocumentBase](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
