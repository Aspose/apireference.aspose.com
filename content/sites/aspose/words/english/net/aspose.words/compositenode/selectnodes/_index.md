---
title: CompositeNode.SelectNodes
linktitle: SelectNodes
articleTitle: SelectNodes
second_title: Aspose.Words for .NET
description: Effortlessly retrieve nodes with the CompositeNode SelectNodes method using XPath expressions for enhanced data manipulation and streamlined coding.
type: docs
weight: 210
url: /net/aspose.words/compositenode/selectnodes/
---
## CompositeNode.SelectNodes method

Selects a list of nodes matching the XPath expression.

```csharp
public NodeList SelectNodes(string xpath)
```

| Parameter | Type | Description |
| --- | --- | --- |
| xpath | String | The XPath expression. |

### Return Value

A list of nodes matching the XPath query.

## Remarks

Only expressions with element names are supported at the moment. Expressions that use attribute names are not supported.

## Examples

Shows how to use an XPath expression to test whether a node is inside a field.

```csharp
Document doc = new Document(MyDir + "Mail merge destination - Northwind employees.docx");

// The NodeList that results from this XPath expression will contain all nodes we find inside a field.
// However, FieldStart and FieldEnd nodes can be on the list if there are nested fields in the path.
// Currently does not find rare fields in which the FieldCode or FieldResult spans across multiple paragraphs.
NodeList resultList =
    doc.SelectNodes("//FieldStart/following-sibling::node()[following-sibling::FieldEnd]");

// Check if the specified run is one of the nodes that are inside the field.
Console.WriteLine($"Contents of the first Run node that's part of a field: {resultList.First(n => n.NodeType == NodeType.Run).GetText().Trim()}");
```

Shows how to select certain nodes by using an XPath expression.

```csharp
Document doc = new Document(MyDir + "Tables.docx");

// This expression will extract all paragraph nodes,
// which are descendants of any table node in the document.
NodeList nodeList = doc.SelectNodes("//Table//Paragraph");

// Iterate through the list with an enumerator and print the contents of every paragraph in each cell of the table.
int index = 0;

using (IEnumerator<Node> e = nodeList.GetEnumerator())
    while (e.MoveNext())
        Console.WriteLine($"Table paragraph index {index++}, contents: \"{e.Current.GetText().Trim()}\"");

// This expression will select any paragraphs that are direct children of any Body node in the document.
nodeList = doc.SelectNodes("//Body/Paragraph");

// We can treat the list as an array.
Assert.That(nodeList.ToArray().Length, Is.EqualTo(4));

// Use SelectSingleNode to select the first result of the same expression as above.
Node node = doc.SelectSingleNode("//Body/Paragraph");

Assert.That(node.GetType(), Is.EqualTo(typeof(Paragraph)));
```

### See Also

* class [NodeList](../../nodelist/)
* class [CompositeNode](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
