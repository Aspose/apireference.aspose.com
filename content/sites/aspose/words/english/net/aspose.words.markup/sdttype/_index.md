---
title: SdtType Enum
linktitle: SdtType
articleTitle: SdtType
second_title: Aspose.Words for .NET
description: Discover Aspose.Words.Markup.SdtType enum, defining structured document tag types for enhanced document management and streamlined workflows.
type: docs
weight: 4720
url: /net/aspose.words.markup/sdttype/
---
## SdtType enumeration

Specifies the type of a structured document tag (SDT) node.

```csharp
public enum SdtType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | No type is assigned to the SDT. |
| Bibliography | `1` | The SDT represents a bibliography entry. |
| Citation | `2` | The SDT represents a citation. |
| Equation | `3` | The SDT represents an equation. |
| DropDownList | `4` | The SDT represents a drop down list when displayed in the document. |
| ComboBox | `5` | The SDT represents a combo box when displayed in the document. |
| Date | `6` | The SDT represents a date picker when displayed in the document. |
| BuildingBlockGallery | `7` | The SDT represents a building block gallery type. |
| DocPartObj | `8` | The SDT represents a document part type. |
| Group | `9` | The SDT represents a restricted grouping when displayed in the document. |
| Picture | `10` | The SDT represents a picture when displayed in the document. |
| RichText | `11` | The SDT represents a rich text box when displayed in the document. |
| PlainText | `12` | The SDT represents a plain text box when displayed in the document. |
| Checkbox | `13` | The SDT represents a checkbox when displayed in the document. |
| RepeatingSection | `14` | The SDT represents repeating section type when displayed in the document. |
| RepeatingSectionItem | `15` | The SDT represents repeating section item. |
| EntityPicker | `16` | The SDT represents an entity picker that allows the user to select an instance of an external content type. |

## Examples

Shows how to create a structured document tag of the Citation type.

```csharp
Document doc = new Document();

StructuredDocumentTag sdt = new StructuredDocumentTag(doc, SdtType.Citation, MarkupLevel.Inline);
Paragraph paragraph = doc.FirstSection.Body.FirstParagraph;
paragraph.AppendChild(sdt);

// Create a Citation field.
DocumentBuilder builder = new DocumentBuilder(doc);
builder.MoveToParagraph(0, -1);
builder.InsertField(@"CITATION Ath22 \l 1033 ", "(John Lennon, 2022)");

// Move the field to the structured document tag.
while (sdt.NextSibling != null)
    sdt.AppendChild(sdt.NextSibling);

doc.Save(ArtifactsDir + "StructuredDocumentTag.Citation.docx");
```

Shows how to create group structured document tag at the Row level.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();

// Create a Group structured document tag at the Row level.
StructuredDocumentTag groupSdt = new StructuredDocumentTag(doc, SdtType.Group, MarkupLevel.Row);
table.AppendChild(groupSdt);
groupSdt.IsShowingPlaceholderText = false;
groupSdt.RemoveAllChildren();

// Create a child row of the structured document tag.
Row row = new Row(doc);
groupSdt.AppendChild(row);

Cell cell = new Cell(doc);
row.AppendChild(cell);

builder.EndTable();

// Insert cell contents.
cell.EnsureMinimum();
builder.MoveTo(cell.LastParagraph);
builder.Write("Lorem ipsum dolor.");

// Insert text after the table.
builder.MoveTo(table.NextSibling);
builder.Write("Nulla blandit nisi.");

doc.Save(ArtifactsDir + "StructuredDocumentTag.SdtAtRowLevel.docx");
```

Shows how to work with styles for content control elements.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Below are two ways to apply a style from the document to a structured document tag.
// 1 -  Apply a style object from the document's style collection:
Style quoteStyle = doc.Styles[StyleIdentifier.Quote];
StructuredDocumentTag sdtPlainText =
    new StructuredDocumentTag(doc, SdtType.PlainText, MarkupLevel.Inline) { Style = quoteStyle };

// 2 -  Reference a style in the document by name:
StructuredDocumentTag sdtRichText =
    new StructuredDocumentTag(doc, SdtType.RichText, MarkupLevel.Inline) { StyleName = "Quote" };

builder.InsertNode(sdtPlainText);
builder.InsertNode(sdtRichText);

Assert.That(sdtPlainText.NodeType, Is.EqualTo(NodeType.StructuredDocumentTag));

NodeCollection tags = doc.GetChildNodes(NodeType.StructuredDocumentTag, true);

foreach (Node node in tags)
{
    StructuredDocumentTag sdt = (StructuredDocumentTag)node;

    Console.WriteLine(sdt.WordOpenXMLMinimal);

    Assert.That(sdt.Style.StyleIdentifier, Is.EqualTo(StyleIdentifier.Quote));
    Assert.That(sdt.StyleName, Is.EqualTo("Quote"));
}
```

Shows how to fill a table with data from in an XML part.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

CustomXmlPart xmlPart = doc.CustomXmlParts.Add("Books",
    "<books>" +
        "<book>" +
            "<title>Everyday Italian</title>" +
            "<author>Giada De Laurentiis</author>" +
        "</book>" +
        "<book>" +
            "<title>The C Programming Language</title>" +
            "<author>Brian W. Kernighan, Dennis M. Ritchie</author>" +
        "</book>" +
        "<book>" +
            "<title>Learning XML</title>" +
            "<author>Erik T. Ray</author>" +
        "</book>" +
    "</books>");

// Create headers for data from the XML content.
Table table = builder.StartTable();
builder.InsertCell();
builder.Write("Title");
builder.InsertCell();
builder.Write("Author");
builder.EndRow();
builder.EndTable();

// Create a table with a repeating section inside.
StructuredDocumentTag repeatingSectionSdt =
    new StructuredDocumentTag(doc, SdtType.RepeatingSection, MarkupLevel.Row);
repeatingSectionSdt.XmlMapping.SetMapping(xmlPart, "/books[1]/book", string.Empty);
table.AppendChild(repeatingSectionSdt);

// Add repeating section item inside the repeating section and mark it as a row.
// This table will have a row for each element that we can find in the XML document
// using the "/books[1]/book" XPath, of which there are three.
StructuredDocumentTag repeatingSectionItemSdt =
    new StructuredDocumentTag(doc, SdtType.RepeatingSectionItem, MarkupLevel.Row);
repeatingSectionSdt.AppendChild(repeatingSectionItemSdt);

Row row = new Row(doc);
repeatingSectionItemSdt.AppendChild(row);

// Map XML data with created table cells for the title and author of each book.
StructuredDocumentTag titleSdt =
    new StructuredDocumentTag(doc, SdtType.PlainText, MarkupLevel.Cell);
titleSdt.XmlMapping.SetMapping(xmlPart, "/books[1]/book[1]/title[1]", string.Empty);
row.AppendChild(titleSdt);

StructuredDocumentTag authorSdt =
    new StructuredDocumentTag(doc, SdtType.PlainText, MarkupLevel.Cell);
authorSdt.XmlMapping.SetMapping(xmlPart, "/books[1]/book[1]/author[1]", string.Empty);
row.AppendChild(authorSdt);

doc.Save(ArtifactsDir + "StructuredDocumentTag.RepeatingSectionItem.docx");
```

### See Also

* namespace [Aspose.Words.Markup](../../aspose.words.markup/)
* assembly [Aspose.Words](../../)
