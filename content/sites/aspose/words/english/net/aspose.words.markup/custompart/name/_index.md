---
title: CustomPart.Name
linktitle: Name
articleTitle: Name
second_title: Aspose.Words for .NET
description: Discover how to manage CustomPart names in OOXML packages. Easily set or retrieve absolute names for seamless integration and enhanced functionality.
type: docs
weight: 50
url: /net/aspose.words.markup/custompart/name/
---
## CustomPart.Name property

Gets or sets this part's absolute name within the OOXML package or the target URL.

```csharp
public string Name { get; set; }
```

## Remarks

If the relationship target is internal, then this property is the absolute part name within the package. If the relationship target is external, then this property is the target URL.

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
