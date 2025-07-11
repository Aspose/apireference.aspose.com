---
title: StructuredDocumentTagRangeStart.XmlMapping
linktitle: XmlMapping
articleTitle: XmlMapping
second_title: Aspose.Words for .NET
description: Discover how the StructuredDocumentTagRangeStart XmlMapping property connects your document's tag range to custom XML data, enhancing document integration.
type: docs
weight: 190
url: /net/aspose.words.markup/structureddocumenttagrangestart/xmlmapping/
---
## StructuredDocumentTagRangeStart.XmlMapping property

Gets an object that represents the mapping of this structured document tag range to XML data in a custom XML part of the current document.

```csharp
public XmlMapping XmlMapping { get; }
```

## Remarks

You can use the [`SetMapping`](../../xmlmapping/setmapping/) method of this object to map a structured document tag range to XML data.

## Examples

Shows how to set XML mappings for the range start of a structured document tag.

```csharp
Document doc = new Document(MyDir + "Multi-section structured document tags.docx");

// Construct an XML part that contains text and add it to the document's CustomXmlPart collection.
string xmlPartId = Guid.NewGuid().ToString("B");
string xmlPartContent = "<root><text>Text element #1</text><text>Text element #2</text></root>";
CustomXmlPart xmlPart = doc.CustomXmlParts.Add(xmlPartId, xmlPartContent);

Assert.That(Encoding.UTF8.GetString(xmlPart.Data), Is.EqualTo("<root><text>Text element #1</text><text>Text element #2</text></root>"));

// Create a structured document tag that will display the contents of our CustomXmlPart in the document.
StructuredDocumentTagRangeStart sdtRangeStart = (StructuredDocumentTagRangeStart)doc.GetChild(NodeType.StructuredDocumentTagRangeStart, 0, true);

// If we set a mapping for our structured document tag,
// it will only display a portion of the CustomXmlPart that the XPath points to.
// This XPath will point to the contents second "<text>" element of the first "<root>" element of our CustomXmlPart.
sdtRangeStart.XmlMapping.SetMapping(xmlPart, "/root[1]/text[2]", null);

doc.Save(ArtifactsDir + "StructuredDocumentTag.StructuredDocumentTagRangeStartXmlMapping.docx");
```

### See Also

* class [XmlMapping](../../xmlmapping/)
* class [StructuredDocumentTagRangeStart](../)
* namespace [Aspose.Words.Markup](../../../aspose.words.markup/)
* assembly [Aspose.Words](../../../)
