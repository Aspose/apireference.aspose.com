---
title: BaseWebExtensionCollection1.GetEnumerator
linktitle: GetEnumerator
articleTitle: GetEnumerator
second_title: Aspose.Words for .NET
description: Discover the BaseWebExtensionCollection GetEnumerator method to easily iterate through collections, enhancing your development efficiency and code management.
type: docs
weight: 50
url: /net/aspose.words.webextensions/basewebextensioncollection-1/getenumerator/
---
## BaseWebExtensionCollection&lt;T&gt;.GetEnumerator method

Returns an enumerator that can iterate through a collection.

```csharp
public IEnumerator<T> GetEnumerator()
```

## Examples

Shows how to work with a document's collection of web extensions.

```csharp
Document doc = new Document(MyDir + "Web extension.docx");

Assert.That(doc.WebExtensionTaskPanes.Count, Is.EqualTo(1));

// Print all properties of the document's web extension.
WebExtensionPropertyCollection webExtensionPropertyCollection = doc.WebExtensionTaskPanes[0].WebExtension.Properties;
using (IEnumerator<WebExtensionProperty> enumerator = webExtensionPropertyCollection.GetEnumerator())
{
    while (enumerator.MoveNext())
    {
        WebExtensionProperty webExtensionProperty = enumerator.Current;
        Console.WriteLine($"Binding name: {webExtensionProperty.Name}; Binding value: {webExtensionProperty.Value}");
    }
}

// Remove the web extension.
doc.WebExtensionTaskPanes.Remove(0);

Assert.That(doc.WebExtensionTaskPanes.Count, Is.EqualTo(0));
```

### See Also

* class [BaseWebExtensionCollection&lt;T&gt;](../)
* namespace [Aspose.Words.WebExtensions](../../../aspose.words.webextensions/)
* assembly [Aspose.Words](../../../)
