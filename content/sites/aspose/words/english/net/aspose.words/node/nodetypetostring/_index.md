---
title: Node.NodeTypeToString
linktitle: NodeTypeToString
articleTitle: NodeTypeToString
second_title: Aspose.Words for .NET
description: Discover the Node NodeTypeToString method, effortlessly convert node type enums into user-friendly strings for seamless coding and improved readability.
type: docs
weight: 170
url: /net/aspose.words/node/nodetypetostring/
---
## Node.NodeTypeToString method

A utility method that converts a node type enum value into a user friendly string.

```csharp
public static string NodeTypeToString(NodeType nodeType)
```

## Examples

Shows how to use a node's NextSibling property to enumerate through its immediate children.

```csharp
Document doc = new Document(MyDir + "Paragraphs.docx");

for (Node node = doc.FirstSection.Body.FirstChild; node != null; node = node.NextSibling)
{
    Console.WriteLine();
    Console.WriteLine($"Node type: {Node.NodeTypeToString(node.NodeType)}");

    string contents = node.GetText().Trim();
    Console.WriteLine(contents == string.Empty ? "This node contains no text" : $"Contents: \"{node.GetText().Trim()}\"");
}
```

Shows how to traverse a composite node's tree of child nodes.

```csharp
public void RecurseChildren()
{
    Document doc = new Document(MyDir + "Paragraphs.docx");

    // Any node that can contain child nodes, such as the document itself, is composite.
    Assert.That(doc.IsComposite, Is.True);

    // Invoke the recursive function that will go through and print all the child nodes of a composite node.
    TraverseAllNodes(doc, 0);
}

/// <summary>
/// Recursively traverses a node tree while printing the type of each node
/// with an indent depending on depth as well as the contents of all inline nodes.
/// </summary>
public void TraverseAllNodes(CompositeNode parentNode, int depth)
{
    for (Node childNode = parentNode.FirstChild; childNode != null; childNode = childNode.NextSibling)
    {
        Console.Write($"{new string('\t', depth)}{Node.NodeTypeToString(childNode.NodeType)}");

        // Recurse into the node if it is a composite node. Otherwise, print its contents if it is an inline node.
        if (childNode.IsComposite)
        {
            Console.WriteLine();
            TraverseAllNodes((CompositeNode)childNode, depth + 1);
        }
        else if (childNode is Inline)
        {
            Console.WriteLine($" - \"{childNode.GetText().Trim()}\"");
        }
        else
        {
            Console.WriteLine();
        }
    }
}
```

### See Also

* enum [NodeType](../../nodetype/)
* class [Node](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
