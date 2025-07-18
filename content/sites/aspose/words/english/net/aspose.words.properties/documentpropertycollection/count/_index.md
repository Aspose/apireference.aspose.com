---
title: DocumentPropertyCollection.Count
linktitle: Count
articleTitle: Count
second_title: Aspose.Words for .NET
description: Discover the DocumentPropertyCollection Count property to effortlessly retrieve the number of items in your collection for efficient data management.
type: docs
weight: 10
url: /net/aspose.words.properties/documentpropertycollection/count/
---
## DocumentPropertyCollection.Count property

Gets number of items in the collection.

```csharp
public int Count { get; }
```

## Examples

Shows how to work with custom document properties.

```csharp
Document doc = new Document(MyDir + "Properties.docx");

// Every document contains a collection of custom properties, which, like the built-in properties, are key-value pairs.
// The document has a fixed list of built-in properties. The user creates all of the custom properties. 
Assert.That(doc.CustomDocumentProperties["CustomProperty"].ToString(), Is.EqualTo("Value of custom document property"));

doc.CustomDocumentProperties.Add("CustomProperty2", "Value of custom document property #2");

Console.WriteLine("Custom Properties:");
foreach (var customDocumentProperty in doc.CustomDocumentProperties)
{
    Console.WriteLine(customDocumentProperty.Name);
    Console.WriteLine($"\tType:\t{customDocumentProperty.Type}");
    Console.WriteLine($"\tValue:\t\"{customDocumentProperty.Value}\"");
}
```

### See Also

* class [DocumentPropertyCollection](../)
* namespace [Aspose.Words.Properties](../../../aspose.words.properties/)
* assembly [Aspose.Words](../../../)
