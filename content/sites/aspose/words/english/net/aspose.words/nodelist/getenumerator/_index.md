---
title: NodeList.GetEnumerator
linktitle: GetEnumerator
articleTitle: GetEnumerator
second_title: Aspose.Words for .NET
description: Effortlessly iterate through NodeList with the GetEnumerator method. Enjoy simple, efficient access to your collection of nodes in C#.
type: docs
weight: 30
url: /net/aspose.words/nodelist/getenumerator/
---
## NodeList.GetEnumerator method

Provides a simple "foreach" style iteration over the collection of nodes.

```csharp
public IEnumerator<Node> GetEnumerator()
```

### Return Value

An IEnumerator.

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
