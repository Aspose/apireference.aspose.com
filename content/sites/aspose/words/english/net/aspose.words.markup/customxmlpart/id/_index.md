---
title: CustomXmlPart.Id
linktitle: Id
articleTitle: Id
second_title: Aspose.Words for .NET
description: Discover how to manage the CustomXmlPart Id property to easily identify and customize XML parts in your OOXML documents for enhanced document management.
type: docs
weight: 40
url: /net/aspose.words.markup/customxmlpart/id/
---
## CustomXmlPart.Id property

Gets or sets the string that identifies this custom XML part within an OOXML document.

```csharp
public string Id { get; set; }
```

## Remarks

ISO/IEC 29500 specifies that this value is a GUID, but old versions of Microsoft Word allowed any string here. Aspose.Words does the same for ECMA-376 format. But note, that Microsoft Word Online fails to open a document created with a non-GUID value. So, a GUID is preferred value for this property.

A valid value must be an identifier that is unique among all custom XML data parts in this document.

The default value is an empty string. The value cannot be `null`.

## Examples

Shows how to create a structured document tag with custom XML data.

```csharp
Document doc = new Document();

// Construct an XML part that contains data and add it to the document's collection.
// If we enable the "Developer" tab in Microsoft Word,
// we can find elements from this collection in the "XML Mapping Pane", along with a few default elements.
string xmlPartId = Guid.NewGuid().ToString("B");
string xmlPartContent = "<root><text>Hello world!</text></root>";
CustomXmlPart xmlPart = doc.CustomXmlParts.Add(xmlPartId, xmlPartContent);

Assert.That(xmlPart.Data, Is.EqualTo(Encoding.ASCII.GetBytes(xmlPartContent)));
Assert.That(xmlPart.Id, Is.EqualTo(xmlPartId));

// Below are two ways to refer to XML parts.
// 1 -  By an index in the custom XML part collection:
Assert.That(doc.CustomXmlParts[0], Is.EqualTo(xmlPart));

// 2 -  By GUID:
Assert.That(doc.CustomXmlParts.GetById(xmlPartId), Is.EqualTo(xmlPart));

// Add an XML schema association.
xmlPart.Schemas.Add("http://www.w3.org/2001/XMLSchema");

// Clone a part, and then insert it into the collection.
CustomXmlPart xmlPartClone = xmlPart.Clone();
xmlPartClone.Id = Guid.NewGuid().ToString("B");
doc.CustomXmlParts.Add(xmlPartClone);

Assert.That(doc.CustomXmlParts.Count, Is.EqualTo(2));

// Iterate through the collection and print the contents of each part.
using (IEnumerator<CustomXmlPart> enumerator = doc.CustomXmlParts.GetEnumerator())
{
    int index = 0;
    while (enumerator.MoveNext())
    {
        Console.WriteLine($"XML part index {index}, ID: {enumerator.Current.Id}");
        Console.WriteLine($"\tContent: {Encoding.UTF8.GetString(enumerator.Current.Data)}");
        index++;
    }
}

// Use the "RemoveAt" method to remove the cloned part by index.
doc.CustomXmlParts.RemoveAt(1);

Assert.That(doc.CustomXmlParts.Count, Is.EqualTo(1));

// Clone the XML parts collection, and then use the "Clear" method to remove all its elements at once.
CustomXmlPartCollection customXmlParts = doc.CustomXmlParts.Clone();
customXmlParts.Clear();

// Create a structured document tag that will display our part's contents and insert it into the document body.
StructuredDocumentTag tag = new StructuredDocumentTag(doc, SdtType.PlainText, MarkupLevel.Block);
tag.XmlMapping.SetMapping(xmlPart, "/root[1]/text[1]", string.Empty);

doc.FirstSection.Body.AppendChild(tag);

doc.Save(ArtifactsDir + "StructuredDocumentTag.CustomXml.docx");
```

### See Also

* class [CustomXmlPart](../)
* namespace [Aspose.Words.Markup](../../../aspose.words.markup/)
* assembly [Aspose.Words](../../../)
