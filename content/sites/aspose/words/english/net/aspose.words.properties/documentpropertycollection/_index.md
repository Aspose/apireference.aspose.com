---
title: DocumentPropertyCollection Class
linktitle: DocumentPropertyCollection
articleTitle: DocumentPropertyCollection
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Properties.DocumentPropertyCollection class, your go-to for managing BuiltIn and Custom Document Properties efficiently.
type: docs
weight: 5200
url: /net/aspose.words.properties/documentpropertycollection/
---
## DocumentPropertyCollection class

Base class for [`BuiltInDocumentProperties`](../builtindocumentproperties/) and [`CustomDocumentProperties`](../customdocumentproperties/) collections.

To learn more, visit the [Work with Document Properties](https://docs.aspose.com/words/net/work-with-document-properties/) documentation article.

```csharp
public abstract class DocumentPropertyCollection : IEnumerable<DocumentProperty>
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.words.properties/documentpropertycollection/count/) { get; } | Gets number of items in the collection. |
| [Item](../../aspose.words.properties/documentpropertycollection/item/) { get; } | Returns a [`DocumentProperty`](../documentproperty/) object by index. |
| virtual [Item](../../aspose.words.properties/documentpropertycollection/item/) { get; } | Returns a [`DocumentProperty`](../documentproperty/) object by the name of the property. |

## Methods

| Name | Description |
| --- | --- |
| [Clear](../../aspose.words.properties/documentpropertycollection/clear/)() | Removes all properties from the collection. |
| [Contains](../../aspose.words.properties/documentpropertycollection/contains/)(*string*) | Returns `true` if a property with the specified name exists in the collection. |
| [GetEnumerator](../../aspose.words.properties/documentpropertycollection/getenumerator/)() | Returns an enumerator object that can be used to iterate over all items in the collection. |
| [IndexOf](../../aspose.words.properties/documentpropertycollection/indexof/)(*string*) | Gets the index of a property by name. |
| [Remove](../../aspose.words.properties/documentpropertycollection/remove/)(*string*) | Removes a property with the specified name from the collection. |
| [RemoveAt](../../aspose.words.properties/documentpropertycollection/removeat/)(*int*) | Removes a property at the specified index. |

## Remarks

The names of the properties are case-insensitive.

The properties in the collection are sorted alphabetically by name.

## Examples

Shows how to work with a document's custom properties.

```csharp
Document doc = new Document();
CustomDocumentProperties properties = doc.CustomDocumentProperties;

Assert.That(properties.Count, Is.EqualTo(0));

// Custom document properties are key-value pairs that we can add to the document.
properties.Add("Authorized", true);
properties.Add("Authorized By", "John Doe");
properties.Add("Authorized Date", DateTime.Today);
properties.Add("Authorized Revision", doc.BuiltInDocumentProperties.RevisionNumber);
properties.Add("Authorized Amount", 123.45);

// The collection sorts the custom properties in alphabetic order.
Assert.That(properties.IndexOf("Authorized Amount"), Is.EqualTo(1));
Assert.That(properties.Count, Is.EqualTo(5));

// Print every custom property in the document.
using (IEnumerator<DocumentProperty> enumerator = properties.GetEnumerator())
{
    while (enumerator.MoveNext())
        Console.WriteLine($"Name: \"{enumerator.Current.Name}\"\n\tType: \"{enumerator.Current.Type}\"\n\tValue: \"{enumerator.Current.Value}\"");
}

// Display the value of a custom property using a DOCPROPERTY field.
DocumentBuilder builder = new DocumentBuilder(doc);
FieldDocProperty field = (FieldDocProperty)builder.InsertField(" DOCPROPERTY \"Authorized By\"");
field.Update();

Assert.That(field.Result, Is.EqualTo("John Doe"));

// We can find these custom properties in Microsoft Word via "File" -> "Properties" > "Advanced Properties" > "Custom".
doc.Save(ArtifactsDir + "DocumentProperties.DocumentPropertyCollection.docx");

// Below are three ways or removing custom properties from a document.
// 1 -  Remove by index:
properties.RemoveAt(1);

Assert.That(properties.Contains("Authorized Amount"), Is.False);
Assert.That(properties.Count, Is.EqualTo(4));

// 2 -  Remove by name:
properties.Remove("Authorized Revision");

Assert.That(properties.Contains("Authorized Revision"), Is.False);
Assert.That(properties.Count, Is.EqualTo(3));

// 3 -  Empty the entire collection at once:
properties.Clear();

Assert.That(properties.Count, Is.EqualTo(0));
```

### See Also

* class [BuiltInDocumentProperties](../builtindocumentproperties/)
* class [CustomDocumentProperties](../customdocumentproperties/)
* class [DocumentProperty](../documentproperty/)
* namespace [Aspose.Words.Properties](../../aspose.words.properties/)
* assembly [Aspose.Words](../../)
