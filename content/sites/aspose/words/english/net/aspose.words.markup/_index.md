---
title: Aspose.Words.Markup
linktitle: Aspose.Words.Markup
articleTitle: Aspose.Words.Markup
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Markup namespace, featuring customizable classes for smart tags, XML, and content controls to enhance your document management.
type: docs
weight: 180
url: /net/aspose.words.markup/
---
The **Aspose.Words.Markup** namespace contains classes that represent customer defined semantics in a document: smart tags, custom XML and structured document tags (content controls).

## Classes

| Class | Description |
| --- | --- |
| [CustomPart](./custompart/) | Represents a custom (arbitrary content) part, that is not defined by the ISO/IEC 29500 standard. |
| [CustomPartCollection](./custompartcollection/) | Represents a collection of [`CustomPart`](../aspose.words.markup/custompart/) objects. |
| [CustomXmlPart](./customxmlpart/) | Represents a Custom XML Data Storage Part (custom XML data within a package). |
| [CustomXmlPartCollection](./customxmlpartcollection/) | Represents a collection of Custom XML Parts. The items are [`CustomXmlPart`](../aspose.words.markup/customxmlpart/) objects. |
| [CustomXmlProperty](./customxmlproperty/) | Represents a single custom XML attribute or a smart tag property. |
| [CustomXmlPropertyCollection](./customxmlpropertycollection/) | Represents a collection of custom XML attributes or smart tag properties. |
| [CustomXmlSchemaCollection](./customxmlschemacollection/) | A collection of strings that represent XML schemas that are associated with a custom XML part. |
| [SdtListItem](./sdtlistitem/) | This element specifies a single list item within a parent ComboBox or DropDownList structured document tag. |
| [SdtListItemCollection](./sdtlistitemcollection/) | Provides access to [`SdtListItem`](../aspose.words.markup/sdtlistitem/) elements of a structured document tag. |
| [SmartTag](./smarttag/) | This element specifies the presence of a smart tag around one or more inline structures (runs, images, fields,etc.) within a paragraph. |
| [StructuredDocumentTag](./structureddocumenttag/) | Represents a structured document tag (SDT or content control) in a document. |
| [StructuredDocumentTagCollection](./structureddocumenttagcollection/) | A collection of [`IStructuredDocumentTag`](../aspose.words.markup/istructureddocumenttag/) instances that represent the structured document tags in the specified range. |
| [StructuredDocumentTagRangeEnd](./structureddocumenttagrangeend/) | Represents an end of **ranged** structured document tag which accepts multi-sections content. See also [`StructuredDocumentTagRangeStart`](../aspose.words.markup/structureddocumenttagrangestart/) node. |
| [StructuredDocumentTagRangeStart](./structureddocumenttagrangestart/) | Represents a start of **ranged** structured document tag which accepts multi-sections content. See also [`StructuredDocumentTagRangeEnd`](../aspose.words.markup/structureddocumenttagrangeend/). |
| [XmlMapping](./xmlmapping/) | Specifies the information that is used to establish a mapping between the parent structured document tag and an XML element stored within a custom XML data part in the document. |
## Interfaces

| Interface | Description |
| --- | --- |
| [IStructuredDocumentTag](./istructureddocumenttag/) | Interface to define a common data for [`StructuredDocumentTag`](../aspose.words.markup/structureddocumenttag/) and [`StructuredDocumentTagRangeStart`](../aspose.words.markup/structureddocumenttagrangestart/). |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [MarkupLevel](./markuplevel/) | Specifies the level in the document tree where a particular [`StructuredDocumentTag`](../aspose.words.markup/structureddocumenttag/) can occur. |
| [SdtAppearance](./sdtappearance/) | Specifies the appearance of a structured document tag. |
| [SdtCalendarType](./sdtcalendartype/) | Specifies the possible types of calendars which can be used to specify [`CalendarType`](../aspose.words.markup/structureddocumenttag/calendartype/) in an Office Open XML document. |
| [SdtDateStorageFormat](./sdtdatestorageformat/) | Specifies how the date for a date SDT is stored/retrieved when the SDT is bound to an XML node in the document's data store. |
| [SdtType](./sdttype/) | Specifies the type of a structured document tag (SDT) node. |
