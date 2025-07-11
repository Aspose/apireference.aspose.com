---
title: DocumentProperty.Type
linktitle: Type
articleTitle: Type
second_title: Aspose.Words for .NET
description: Discover the DocumentProperty Type to efficiently retrieve and utilize property data types for enhanced document management and automation.
type: docs
weight: 40
url: /net/aspose.words.properties/documentproperty/type/
---
## DocumentProperty.Type property

Gets the data type of the property.

```csharp
public PropertyType Type { get; }
```

## Examples

Shows how to work with built-in document properties.

```csharp
Document doc = new Document(MyDir + "Properties.docx");

// The "Document" object contains some of its metadata in its members.
Console.WriteLine($"Document filename:\n\t \"{doc.OriginalFileName}\"");

// The document also stores metadata in its built-in properties.
// Each built-in property is a member of the document's "BuiltInDocumentProperties" object.
Console.WriteLine("Built-in Properties:");
foreach (DocumentProperty docProperty in doc.BuiltInDocumentProperties)
{
    Console.WriteLine(docProperty.Name);
    Console.WriteLine($"\tType:\t{docProperty.Type}");

    // Some properties may store multiple values.
    if (docProperty.Value is ICollection<object>)
    {
        foreach (object value in docProperty.Value as ICollection<object>)
            Console.WriteLine($"\tValue:\t\"{value}\"");
    }
    else
    {
        Console.WriteLine($"\tValue:\t\"{docProperty.Value}\"");
    }
}
```

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

* enum [PropertyType](../../propertytype/)
* class [DocumentProperty](../)
* namespace [Aspose.Words.Properties](../../../aspose.words.properties/)
* assembly [Aspose.Words](../../../)
