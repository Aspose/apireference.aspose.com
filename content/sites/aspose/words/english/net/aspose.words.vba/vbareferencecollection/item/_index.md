---
title: VbaReferenceCollection.Item
linktitle: Item
articleTitle: Item
second_title: Aspose.Words for .NET
description: Access the VbaReference object easily with the Item property. Efficiently retrieve references by index for streamlined VBA development.
type: docs
weight: 20
url: /net/aspose.words.vba/vbareferencecollection/item/
---
## VbaReferenceCollection indexer

Gets [`VbaReference`](../../vbareference/) object at the specified index.

```csharp
public VbaReference this[int index] { get; }
```

| Parameter | Description |
| --- | --- |
| index | The zero-based index of the reference to get. |

## Examples

Shows how to get/remove an element from the VBA reference collection.

```csharp
public void RemoveVbaReference()
{
    const string brokenPath = @"X:\broken.dll";
    Document doc = new Document(MyDir + "VBA project.docm");

    VbaReferenceCollection references = doc.VbaProject.References;
    Assert.That(references.Count, Is.EqualTo(5 ));

    for (int i = references.Count - 1; i >= 0; i--)
    {
        VbaReference reference = doc.VbaProject.References[i];
        string path = GetLibIdPath(reference);

        if (path == brokenPath)
            references.RemoveAt(i);
    }
    Assert.That(references.Count, Is.EqualTo(4 ));

    references.Remove(references[1]);
    Assert.That(references.Count, Is.EqualTo(3 ));

    doc.Save(ArtifactsDir + "VbaProject.RemoveVbaReference.docm"); 
}

/// <summary>
/// Returns string representing LibId path of a specified reference. 
/// </summary>
private static string GetLibIdPath(VbaReference reference)
{
    switch (reference.Type)
    {
        case VbaReferenceType.Registered:
        case VbaReferenceType.Original:
        case VbaReferenceType.Control:
            return GetLibIdReferencePath(reference.LibId);
        case VbaReferenceType.Project:
            return GetLibIdProjectPath(reference.LibId);
        default:
            throw new ArgumentOutOfRangeException();
    }
}

/// <summary>
/// Returns path from a specified identifier of an Automation type library.
/// </summary>
private static string GetLibIdReferencePath(string libIdReference)
{
    if (libIdReference != null)
    {
        string[] refParts = libIdReference.Split('#');
        if (refParts.Length > 3)
            return refParts[3];
    }

    return "";
}

/// <summary>
/// Returns path from a specified identifier of an Automation type library.
/// </summary>
private static string GetLibIdProjectPath(string libIdProject)
{
    return libIdProject != null ? libIdProject.Substring(3) : "";
}
```

### See Also

* class [VbaReference](../../vbareference/)
* class [VbaReferenceCollection](../)
* namespace [Aspose.Words.Vba](../../../aspose.words.vba/)
* assembly [Aspose.Words](../../../)
