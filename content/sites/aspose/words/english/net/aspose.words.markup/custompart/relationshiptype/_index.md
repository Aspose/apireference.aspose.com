---
title: CustomPart.RelationshipType
linktitle: RelationshipType
articleTitle: RelationshipType
second_title: Aspose.Words for .NET
description: Discover the CustomPart RelationshipType property to easily manage and define relationships between parent and custom parts for enhanced functionality.
type: docs
weight: 60
url: /net/aspose.words.markup/custompart/relationshiptype/
---
## CustomPart.RelationshipType property

Gets or sets the relationship type from the parent part to this custom part.

```csharp
public string RelationshipType { get; set; }
```

## Remarks

The relationship type for a custom part must be "unknown" e.g. a custom relationship type, not one of the relationship types defined within ISO/IEC 29500.

The default value is an empty string. A valid value must be a non-empty string.

## Examples

Shows how to access a document's arbitrary custom parts collection.

```csharp
Document doc = new Document(MyDir + "Custom parts OOXML package.docx");

Assert.That(doc.PackageCustomParts.Count, Is.EqualTo(2));

// Clone the second part, then add the clone to the collection.
CustomPart clonedPart = doc.PackageCustomParts[1].Clone();
doc.PackageCustomParts.Add(clonedPart);
Assert.That(doc.PackageCustomParts.Count, Is.EqualTo(3));

// Enumerate over the collection and print every part.
using (IEnumerator<CustomPart> enumerator = doc.PackageCustomParts.GetEnumerator())
{
    int index = 0;
    while (enumerator.MoveNext())
    {
        Console.WriteLine($"Part index {index}:");
        Console.WriteLine($"\tName:\t\t\t\t{enumerator.Current.Name}");
        Console.WriteLine($"\tContent type:\t\t{enumerator.Current.ContentType}");
        Console.WriteLine($"\tRelationship type:\t{enumerator.Current.RelationshipType}");
        Console.WriteLine(enumerator.Current.IsExternal ?
            "\tSourced from outside the document" :
            $"\tStored within the document, length: {enumerator.Current.Data.Length} bytes");
        index++;
    }
}

// We can remove elements from this collection individually, or all at once.
doc.PackageCustomParts.RemoveAt(2);

Assert.That(doc.PackageCustomParts.Count, Is.EqualTo(2));

doc.PackageCustomParts.Clear();

Assert.That(doc.PackageCustomParts.Count, Is.EqualTo(0));
```

### See Also

* class [CustomPart](../)
* namespace [Aspose.Words.Markup](../../../aspose.words.markup/)
* assembly [Aspose.Words](../../../)
