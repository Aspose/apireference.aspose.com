---
title: CustomXmlSchemaCollection.Count
linktitle: Count
articleTitle: Count
second_title: Aspose.Words for .NET
description: Discover the CustomXmlSchemaCollection Count property to easily retrieve the total number of elements in your XML schema collection. Optimize your data management!
type: docs
weight: 10
url: /net/aspose.words.markup/customxmlschemacollection/count/
---
## CustomXmlSchemaCollection.Count property

Gets the number of elements contained in the collection.

```csharp
public int Count { get; }
```

## Examples

Shows how to work with an XML schema collection.

```csharp
Document doc = new Document();

string xmlPartId = Guid.NewGuid().ToString("B");
string xmlPartContent = "<root><text>Hello, World!</text></root>";
CustomXmlPart xmlPart = doc.CustomXmlParts.Add(xmlPartId, xmlPartContent);

// Add an XML schema association.
xmlPart.Schemas.Add("http://www.w3.org/2001/XMLSchema");

// Clone the custom XML part's XML schema association collection,
// and then add a couple of new schemas to the clone.
CustomXmlSchemaCollection schemas = xmlPart.Schemas.Clone();
schemas.Add("http://www.w3.org/2001/XMLSchema-instance");
schemas.Add("http://schemas.microsoft.com/office/2006/metadata/contentType");

Assert.That(schemas.Count, Is.EqualTo(3));
Assert.That(schemas.IndexOf("http://schemas.microsoft.com/office/2006/metadata/contentType"), Is.EqualTo(2));

// Enumerate the schemas and print each element.
using (IEnumerator<string> enumerator = schemas.GetEnumerator())
{
    while (enumerator.MoveNext())
        Console.WriteLine(enumerator.Current);
}

// Below are three ways of removing schemas from the collection.
// 1 -  Remove a schema by index:
schemas.RemoveAt(2);

// 2 -  Remove a schema by value:
schemas.Remove("http://www.w3.org/2001/XMLSchema");

// 3 -  Use the "Clear" method to empty the collection at once.
schemas.Clear();

Assert.That(schemas.Count, Is.EqualTo(0));
```

### See Also

* class [CustomXmlSchemaCollection](../)
* namespace [Aspose.Words.Markup](../../../aspose.words.markup/)
* assembly [Aspose.Words](../../../)
