﻿---
title: Row class
linktitle: Row class
articleTitle: Row class
second_title: Aspose.Words for Node.js
description: "Aspose.Words.Tables.Row class. Represents a table row"
type: docs
weight: 90
url: /nodejs-net/aspose.words.tables/row/
---

## Row class

Represents a table row.
To learn more, visit the [Working with Tables](https://docs.aspose.com/words/nodejs-net/working-with-tables/) documentation article.




### Remarks

[Row](./) can only be a child of a [Table](../../aspose.words/table/).

[Row](./) can contain one or more [Cell](../cell/) nodes.

A minimal valid row needs to have at least one [Cell](../cell/).




**Inheritance:** [Row](./) → [CompositeNode](../../aspose.words/compositenode/) → [Node](../../aspose.words/node/)

### Constructors
| Name | Description |
| --- | --- |
| [Row(doc)](./constructor/#documentbase) | Initializes a new instance of the [Row](./) class. |

### Properties

| Name | Description |
| --- | --- |
| [cells](./cells/) | Provides typed access to the [Cell](../cell/) child nodes of the row. |
| [count](../../aspose.words/compositenode/count/) | Gets the number of immediate children of this node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
| [customNodeId](../../aspose.words/node/customNodeId/) | Specifies custom node identifier.<br>(Inherited from [Node](../../aspose.words/node/)) |
| [document](../../aspose.words/node/document/) | Gets the document to which this node belongs.<br>(Inherited from [Node](../../aspose.words/node/)) |
| [firstCell](./firstCell/) | Returns the first [Cell](../cell/) in the row. |
| [firstChild](../../aspose.words/compositenode/firstChild/) | Gets the first child of the node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
| [hasChildNodes](../../aspose.words/compositenode/hasChildNodes/) | Returns ``true`` if this node has any child nodes.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
| [hidden](./hidden/) | Gets or sets a flag indicating whether this row is hidden or not. |
| [isComposite](../../aspose.words/node/isComposite/) | Returns ``true`` if this node can contain other nodes.<br>(Inherited from [Node](../../aspose.words/node/)) |
| [isFirstRow](./isFirstRow/) | True if this is the first row in a table; false otherwise. |
| [isLastRow](./isLastRow/) | True if this is the last row in a table; false otherwise. |
| [lastCell](./lastCell/) | Returns the last [Cell](../cell/) in the row. |
| [lastChild](../../aspose.words/compositenode/lastChild/) | Gets the last child of the node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
| [nextRow](./nextRow/) | Gets the next [Row](./) node. |
| [nextSibling](../../aspose.words/node/nextSibling/) | Gets the node immediately following this node.<br>(Inherited from [Node](../../aspose.words/node/)) |
| [nodeType](./nodeType/) | Returns [NodeType.Row](../../aspose.words/nodetype/#Row). |
| [parentNode](../../aspose.words/node/parentNode/) | Gets the immediate parent of this node.<br>(Inherited from [Node](../../aspose.words/node/)) |
| [parentTable](./parentTable/) | Returns the immediate parent table of the row. |
| [previousRow](./previousRow/) | Gets the previous [Row](./) node. |
| [previousSibling](../../aspose.words/node/previousSibling/) | Gets the node immediately preceding this node.<br>(Inherited from [Node](../../aspose.words/node/)) |
| [range](../../aspose.words/node/range/) | Returns a [Range](../../aspose.words/range/) object that represents the portion of a document that is contained in this node.<br>(Inherited from [Node](../../aspose.words/node/)) |
| [rowFormat](./rowFormat/) | Provides access to the formatting properties of the row. |

### Methods

| Name | Description |
| --- | --- |
|[ appendChild(newChild)](../../aspose.words/compositenode/appendChild/#node) | Adds the specified node to the end of the list of child nodes for this node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ asBody()](../../aspose.words/node/asBody/#default) | Cast node to [Body](../../aspose.words/body/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asBookmarkEnd()](../../aspose.words/node/asBookmarkEnd/#default) | Cast node to [BookmarkEnd](../../aspose.words/bookmarkend/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asBookmarkStart()](../../aspose.words/node/asBookmarkStart/#default) | Cast node to [BookmarkStart](../../aspose.words/bookmarkstart/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asBuildingBlock()](../../aspose.words/node/asBuildingBlock/#default) | Cast node to [BuildingBlock](../../aspose.words/buildingblock/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asCell()](../../aspose.words/node/asCell/#default) | Cast node to [Cell](../cell/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asComment()](../../aspose.words/node/asComment/#default) | Cast node to [Comment](../../aspose.words/comment/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asCommentRangeEnd()](../../aspose.words/node/asCommentRangeEnd/#default) | Cast node to [CommentRangeEnd](../../aspose.words/commentrangeend/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asCommentRangeStart()](../../aspose.words/node/asCommentRangeStart/#default) | Cast node to [CommentRangeStart](../../aspose.words/commentrangestart/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asCompositeNode()](../../aspose.words/node/asCompositeNode/#default) | Cast node to [CompositeNode](../../aspose.words/compositenode/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asDocument()](../../aspose.words/node/asDocument/#default) | Cast node to [Node.document](../../aspose.words/node/document/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asEditableRangeEnd()](../../aspose.words/node/asEditableRangeEnd/#default) | Cast node to [EditableRangeEnd](../../aspose.words/editablerangeend/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asEditableRangeStart()](../../aspose.words/node/asEditableRangeStart/#default) | Cast node to [EditableRangeStart](../../aspose.words/editablerangestart/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asFieldEnd()](../../aspose.words/node/asFieldEnd/#default) | Cast node to [FieldEnd](../../aspose.words.fields/fieldend/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asFieldSeparator()](../../aspose.words/node/asFieldSeparator/#default) | Cast node to [FieldSeparator](../../aspose.words.fields/fieldseparator/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asFieldStart()](../../aspose.words/node/asFieldStart/#default) | Cast node to [FieldStart](../../aspose.words.fields/fieldstart/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asFootnote()](../../aspose.words/node/asFootnote/#default) | Cast node to [Footnote](../../aspose.words.notes/footnote/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asFormField()](../../aspose.words/node/asFormField/#default) | Cast node to [FormField](../../aspose.words.fields/formfield/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asGlossaryDocument()](../../aspose.words/node/asGlossaryDocument/#default) | Cast node to [GlossaryDocument](../../aspose.words.buildingblocks/glossarydocument/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asGroupShape()](../../aspose.words/node/asGroupShape/#default) | Cast node to [GroupShape](../../aspose.words.drawing/groupshape/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asHeaderFooter()](../../aspose.words/node/asHeaderFooter/#default) | Cast node to [HeaderFooter](../../aspose.words/headerfooter/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asOfficeMath()](../../aspose.words/node/asOfficeMath/#default) | Cast node to [OfficeMath](../../aspose.words.math/officemath/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asParagraph()](../../aspose.words/node/asParagraph/#default) | Cast node to [Paragraph](../../aspose.words/paragraph/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asRow()](../../aspose.words/node/asRow/#default) | Cast node to [Row](./).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asRun()](../../aspose.words/node/asRun/#default) | Cast node to [Run](../../aspose.words/run/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asSection()](../../aspose.words/node/asSection/#default) | Cast node to [Section](../../aspose.words/section/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asShape()](../../aspose.words/node/asShape/#default) | Cast node to [Shape](../../aspose.words.drawing/shape/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asSmartTag()](../../aspose.words/node/asSmartTag/#default) | Cast node to [SmartTag](../../aspose.words.markup/smarttag/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asSpecialChar()](../../aspose.words/node/asSpecialChar/#default) | Cast node to [SpecialChar](../../aspose.words/specialchar/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asStructuredDocumentTag()](../../aspose.words/node/asStructuredDocumentTag/#default) | Cast node to [StructuredDocumentTag](../../aspose.words.markup/structureddocumenttag/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asStructuredDocumentTagRangeEnd()](../../aspose.words/node/asStructuredDocumentTagRangeEnd/#default) | Cast node to [StructuredDocumentTagRangeEnd](../../aspose.words.markup/structureddocumenttagrangeend/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asStructuredDocumentTagRangeStart()](../../aspose.words/node/asStructuredDocumentTagRangeStart/#default) | Cast node to [StructuredDocumentTagRangeStart](../../aspose.words.markup/structureddocumenttagrangestart/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asSubDocument()](../../aspose.words/node/asSubDocument/#default) | Cast node to [SubDocument](../../aspose.words/subdocument/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ asTable()](../../aspose.words/node/asTable/#default) | Cast node to [Table](../../aspose.words/table/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ clone(isCloneChildren)](../../aspose.words/node/clone/#boolean) | Creates a duplicate of the node.<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ ensureMinimum()](./ensureMinimum/#default) | If the [Row](./) has no cells, creates and appends one [Cell](../cell/). |
|[ getAncestor(ancestorType)](../../aspose.words/node/getAncestor/#nodetype) | Gets the first ancestor of the specified [NodeType](../../aspose.words/nodetype/).<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ getBuildingBlock(index, isDeep)](../../aspose.words/compositenode/getBuildingBlock/#number_boolean) | Returns an Nth child [BuildingBlock](../../aspose.words/buildingblock/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getChild(nodeType, index, isDeep)](../../aspose.words/compositenode/getChild/#nodetype_number_boolean) | Returns an Nth child node that matches the specified type.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getChildNodes(nodeType, isDeep)](../../aspose.words/compositenode/getChildNodes/#nodetype_boolean) | Returns a live collection of child nodes that match the specified type.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getComment(index, isDeep)](../../aspose.words/compositenode/getComment/#number_boolean) | Returns an Nth child [Comment](../../aspose.words/comment/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getEditableRangeStart(index, isDeep)](../../aspose.words/compositenode/getEditableRangeStart/#number_boolean) | Returns an Nth child [EditableRangeStart](../../aspose.words/editablerangestart/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getFootnote(index, isDeep)](../../aspose.words/compositenode/getFootnote/#number_boolean) | Returns an Nth child [Footnote](../../aspose.words.notes/footnote/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getGroupShape(index, isDeep)](../../aspose.words/compositenode/getGroupShape/#number_boolean) | Returns an Nth child [GroupShape](../../aspose.words.drawing/groupshape/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getOfficeMath(index, isDeep)](../../aspose.words/compositenode/getOfficeMath/#number_boolean) | Returns an Nth child [OfficeMath](../../aspose.words.math/officemath/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getParagraph(index, isDeep)](../../aspose.words/compositenode/getParagraph/#number_boolean) | Returns an Nth child [Paragraph](../../aspose.words/paragraph/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getRun(index, isDeep)](../../aspose.words/compositenode/getRun/#number_boolean) | Returns an Nth child [Run](../../aspose.words/run/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getSdt(index, isDeep)](../../aspose.words/compositenode/getSdt/#number_boolean) | Returns an Nth child [StructuredDocumentTag](../../aspose.words.markup/structureddocumenttag/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getSdtRangeEnd(index, isDeep)](../../aspose.words/compositenode/getSdtRangeEnd/#number_boolean) | Returns an Nth child [StructuredDocumentTagRangeEnd](../../aspose.words.markup/structureddocumenttagrangeend/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getSdtRangeStart(index, isDeep)](../../aspose.words/compositenode/getSdtRangeStart/#number_boolean) | Returns an Nth child [StructuredDocumentTagRangeStart](../../aspose.words.markup/structureddocumenttagrangestart/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getShape(index, isDeep)](../../aspose.words/compositenode/getShape/#number_boolean) | Returns an Nth child [Shape](../../aspose.words.drawing/shape/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getSmartTag(index, isDeep)](../../aspose.words/compositenode/getSmartTag/#number_boolean) | Returns an Nth child [SmartTag](../../aspose.words.markup/smarttag/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getTable(index, isDeep)](../../aspose.words/compositenode/getTable/#number_boolean) | Returns an Nth child [Table](../../aspose.words/table/) node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ getText()](./getText/#default) | Gets the text of all cells in this row including the end of row character. |
|[ indexOf(child)](../../aspose.words/compositenode/indexOf/#node) | Returns the index of the specified child node in the child node array.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ insertAfter(newChild, refChild)](../../aspose.words/compositenode/insertAfter/#node_node) | Inserts the specified node immediately after the specified reference node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ insertBefore(newChild, refChild)](../../aspose.words/compositenode/insertBefore/#node_node) | Inserts the specified node immediately before the specified reference node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ nextPreOrder(rootNode)](../../aspose.words/node/nextPreOrder/#node) | Gets next node according to the pre-order tree traversal algorithm.<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ nodeTypeToString(nodeType)](../../aspose.words/node/nodeTypeToString/#nodetype) | A utility method that converts a node type enum value into a user friendly string.<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ prependChild(newChild)](../../aspose.words/compositenode/prependChild/#node) | Adds the specified node to the beginning of the list of child nodes for this node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ previousPreOrder(rootNode)](../../aspose.words/node/previousPreOrder/#node) | Gets the previous node according to the pre-order tree traversal algorithm.<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ referenceEquals(other)](../../aspose.words/node/referenceEquals/#node) | <br>(Inherited from [Node](../../aspose.words/node/)) |
|[ remove()](../../aspose.words/node/remove/#default) | Removes itself from the parent.<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ removeAllChildren()](../../aspose.words/compositenode/removeAllChildren/#default) | Removes all the child nodes of the current node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ removeChild(oldChild)](../../aspose.words/compositenode/removeChild/#node) | Removes the specified child node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ removeSmartTags()](../../aspose.words/compositenode/removeSmartTags/#default) | Removes all [SmartTag](../../aspose.words.markup/smarttag/) descendant nodes of the current node.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ selectNodes(xpath)](../../aspose.words/compositenode/selectNodes/#string) | Selects a list of nodes matching the XPath expression.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ selectSingleNode(xpath)](../../aspose.words/compositenode/selectSingleNode/#string) | Selects the first [Node](../../aspose.words/node/) that matches the XPath expression.<br>(Inherited from [CompositeNode](../../aspose.words/compositenode/)) |
|[ toString(saveFormat)](../../aspose.words/node/toString/#saveformat) | Exports the content of the node into a string in the specified format.<br>(Inherited from [Node](../../aspose.words/node/)) |
|[ toString(saveOptions)](../../aspose.words/node/toString/#saveoptions) | Exports the content of the node into a string using the specified save options.<br>(Inherited from [Node](../../aspose.words/node/)) |

### Examples

Shows how to create a table.

```js
let doc = new aw.Document();
let table = new aw.Tables.Table(doc);
doc.firstSection.body.appendChild(table);

// Tables contain rows, which contain cells, which may have paragraphs
// with typical elements such as runs, shapes, and even other tables.
// Calling the "EnsureMinimum" method on a table will ensure that
// the table has at least one row, cell, and paragraph.
let firstRow = new aw.Tables.Row(doc);
table.appendChild(firstRow);

let firstCell = new aw.Tables.Cell(doc);
firstRow.appendChild(firstCell);

let paragraph = new aw.Paragraph(doc);
firstCell.appendChild(paragraph);

// Add text to the first cell in the first row of the table.
let run = new aw.Run(doc, "Hello world!");
paragraph.appendChild(run);

doc.save(base.artifactsDir + "Table.CreateTable.docx");
```

Shows how to iterate through all tables in the document and print the contents of each cell.

```js
let doc = new aw.Document(base.myDir + "Tables.docx");
let tables = doc.firstSection.body.tables;

expect(tables.toArray().length).toEqual(2);

for (let i = 0; i < tables.count; i++)
{
  console.log(`Start of Table ${i}`);

  let rows = tables.at(i).rows;

  for (let j = 0; j < rows.count; j++)
  {
    console.log(`\tStart of Row ${j}`);

    let cells = rows.at(j).cells;

    for (let k = 0; k < cells.count; k++)
    {
      let cellText = cells.at(k).toString(aw.SaveFormat.Text).trim();
      console.log(`\t\tContents of Cell:${k} = \"${cellText}\"`);
    }

    console.log(`\tEnd of Row ${j}`);
  }

  console.log(`End of Table ${i}\n`);
}
```

Shows how to build a nested table without using a document builder.

```js
test('CreateNestedTable', () => {
  let doc = new aw.Document();

  // Create the outer table with three rows and four columns, and then add it to the document.
  let outerTable = createTable(doc, 3, 4, "Outer Table");
  doc.firstSection.body.appendChild(outerTable);

  // Create another table with two rows and two columns and then insert it into the first table's first cell.
  let innerTable = createTable(doc, 2, 2, "Inner Table");
  outerTable.firstRow.firstCell.appendChild(innerTable);

  doc.save(base.artifactsDir + "Table.CreateNestedTable.docx");
});


/// <summary>
/// Creates a new table in the document with the given dimensions and text in each cell.
/// </summary>
function createTable(doc, rowCount, cellCount, cellText)
{
  let table = new aw.Tables.Table(doc);

  for (let rowId = 1; rowId <= rowCount; rowId++)
  {
    let row = new aw.Tables.Row(doc);
    table.appendChild(row);

    for (let cellId = 1; cellId <= cellCount; cellId++)
    {
      let cell = new aw.Tables.Cell(doc);
      cell.appendChild(new aw.Paragraph(doc));
      cell.firstParagraph.appendChild(new aw.Run(doc, cellText));

      row.appendChild(cell);
    }
  }

  // You can use the "Title" and "Description" properties to add a title and description respectively to your table.
  // The table must have at least one row before we can use these properties.
  // These properties are meaningful for ISO / IEC 29500 compliant .docx documents (see the OoxmlCompliance class).
  // If we save the document to pre-ISO/IEC 29500 formats, Microsoft Word ignores these properties.
  table.title = "Aspose table title";
  table.description = "Aspose table description";

  return table;
}
```

### See Also

* module [Aspose.Words.Tables](../)
* class [CompositeNode](../../aspose.words/compositenode/)

