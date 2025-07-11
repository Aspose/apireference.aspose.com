---
title: NodeList.ToArray
linktitle: ToArray
articleTitle: ToArray
second_title: Aspose.Words for .NET
description: Effortlessly convert NodeList to an array with the ToArray method, simplifying node manipulation and enhancing your web development workflow.
type: docs
weight: 40
url: /net/aspose.words/nodelist/toarray/
---
## NodeList.ToArray method

Copies all nodes from the collection to a new array of nodes.

```csharp
public Node[] ToArray()
```

### Return Value

An array of nodes.

## Remarks

You should not be adding/removing nodes while iterating over a collection of nodes because it invalidates the iterator and requires refreshes for live collections.

To be able to add/remove nodes during iteration, use this method to copy nodes into a fixed-size array and then iterate over the array.

## Examples

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

* class [Node](../../node/)
* class [NodeList](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
