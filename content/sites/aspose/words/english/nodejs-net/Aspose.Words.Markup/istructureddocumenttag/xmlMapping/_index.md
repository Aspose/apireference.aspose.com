﻿---
title: IStructuredDocumentTag.xmlMapping property
linktitle: xmlMapping property
articleTitle: xmlMapping property
second_title: Aspose.Words for Node.js
description: "IStructuredDocumentTag.xmlMapping property. Gets an object that represents the mapping of this structured document tag to XML data in a custom XML part of the current document."
type: docs
weight: 160
url: /nodejs-net/aspose.words.markup/istructureddocumenttag/xmlMapping/
---

## IStructuredDocumentTag.xmlMapping property

Gets an object that represents the mapping of this structured document tag to XML data
in a custom XML part of the current document.


```js
get xmlMapping(): Aspose.Words.Markup.XmlMapping
```

### Remarks

You can use the [XmlMapping.setMapping()](../../xmlmapping/setMapping/#customxmlpart_string_string) method of this object to map 
a structured document tag to XML data.



### Examples

Shows how to create a structured document tag with custom XML data.

```js
let doc = new aw.Document();

// Construct an XML part that contains data and add it to the document's collection.
// If we enable the "Developer" tab in Microsoft Word,
// we can find elements from this collection in the "XML Mapping Pane", along with a few default elements.
let xmlPartId = `{${Guid.newGuid().toString()}}`;
let xmlPartContent = "<root><text>Hello world!</text></root>";
let xmlPart = doc.customXmlParts.add(xmlPartId, xmlPartContent);

expect(Buffer.from(xmlPart.data).toString("ascii")).toEqual(xmlPartContent);
expect(xmlPart.id).toEqual(xmlPartId);

// Below are two ways to refer to XML parts.
// 1 -  By an index in the custom XML part collection:
expect(doc.customXmlParts.at(0)).toEqual(xmlPart);

// 2 -  By GUID:
expect(doc.customXmlParts.getById(xmlPartId)).toEqual(xmlPart);

// Add an XML schema association.
xmlPart.schemas.add("http://www.w3.org/2001/XMLSchema");

// Clone a part, and then insert it into the collection.
let xmlPartClone = xmlPart.clone();
xmlPartClone.id = `{${Guid.newGuid().toString()}}`;
doc.customXmlParts.add(xmlPartClone);

expect(doc.customXmlParts.count).toEqual(2);

// Iterate through the collection and print the contents of each part.
for (let index = 0; index < doc.customXmlParts.count; ++index) {
  console.log(`XML part index ${index}, ID: ${doc.customXmlParts.at(index).id}`);
  console.log(`\tContent: ${Buffer.from(doc.customXmlParts.at(index).data).toString("utf8")}`);
}

// Use the "RemoveAt" method to remove the cloned part by index.
doc.customXmlParts.removeAt(1);

expect(doc.customXmlParts.count).toEqual(1);

// Clone the XML parts collection, and then use the "Clear" method to remove all its elements at once.
let customXmlParts = doc.customXmlParts.clone();
customXmlParts.clear();

// Create a structured document tag that will display our part's contents and insert it into the document body.
let tag = new aw.Markup.StructuredDocumentTag(doc, aw.Markup.SdtType.PlainText, aw.Markup.MarkupLevel.Block);
tag.xmlMapping.setMapping(xmlPart, "/root[1]/text[1]", '');

doc.firstSection.body.appendChild(tag);

doc.save(base.artifactsDir + "StructuredDocumentTag.customXml.docx");
```

### See Also

* module [Aspose.Words.Markup](../../)
* class [IStructuredDocumentTag](../)

