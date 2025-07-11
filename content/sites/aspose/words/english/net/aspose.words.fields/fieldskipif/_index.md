---
title: FieldSkipIf Class
linktitle: FieldSkipIf
articleTitle: FieldSkipIf
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Fields.FieldSkipIf class to efficiently implement SKIPIF fields, enhancing document automation and flexibility in your projects.
type: docs
weight: 2820
url: /net/aspose.words.fields/fieldskipif/
---
## FieldSkipIf class

Implements the SKIPIF field.

To learn more, visit the [Working with Fields](https://docs.aspose.com/words/net/working-with-fields/) documentation article.

```csharp
public class FieldSkipIf : Field
```

## Constructors

| Name | Description |
| --- | --- |
| [FieldSkipIf](fieldskipif/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [ComparisonOperator](../../aspose.words.fields/fieldskipif/comparisonoperator/) { get; set; } | Gets or sets the comparison operator. |
| [DisplayResult](../../aspose.words.fields/field/displayresult/) { get; } | Gets the text that represents the displayed field result. |
| [End](../../aspose.words.fields/field/end/) { get; } | Gets the node that represents the field end. |
| [Format](../../aspose.words.fields/field/format/) { get; } | Gets a [`FieldFormat`](../fieldformat/) object that provides typed access to field's formatting. |
| [IsDirty](../../aspose.words.fields/field/isdirty/) { get; set; } | Gets or sets whether the current result of the field is no longer correct (stale) due to other modifications made to the document. |
| [IsLocked](../../aspose.words.fields/field/islocked/) { get; set; } | Gets or sets whether the field is locked (should not recalculate its result). |
| [LeftExpression](../../aspose.words.fields/fieldskipif/leftexpression/) { get; set; } | Gets or sets the left part of the comparison expression. |
| [LocaleId](../../aspose.words.fields/field/localeid/) { get; set; } | Gets or sets the LCID of the field. |
| [Result](../../aspose.words.fields/field/result/) { get; set; } | Gets or sets text that is between the field separator and field end. |
| [RightExpression](../../aspose.words.fields/fieldskipif/rightexpression/) { get; set; } | Gets or sets the right part of the comparison expression. |
| [Separator](../../aspose.words.fields/field/separator/) { get; } | Gets the node that represents the field separator. Can be `null`. |
| [Start](../../aspose.words.fields/field/start/) { get; } | Gets the node that represents the start of the field. |
| virtual [Type](../../aspose.words.fields/field/type/) { get; } | Gets the Microsoft Word field type. |

## Methods

| Name | Description |
| --- | --- |
| [GetFieldCode](../../aspose.words.fields/field/getfieldcode/)() | Returns text between field start and field separator (or field end if there is no separator). Both field code and field result of child fields are included. |
| [GetFieldCode](../../aspose.words.fields/field/getfieldcode/)(*bool*) | Returns text between field start and field separator (or field end if there is no separator). |
| [Remove](../../aspose.words.fields/field/remove/)() | Removes the field from the document. Returns a node right after the field. If the field's end is the last child of its parent node, returns its parent paragraph. If the field is already removed, returns `null`. |
| [Unlink](../../aspose.words.fields/field/unlink/)() | Performs the field unlink. |
| [Update](../../aspose.words.fields/field/update/)() | Performs the field update. Throws if the field is being updated already. |
| [Update](../../aspose.words.fields/field/update/)(*bool*) | Performs a field update. Throws if the field is being updated already. |

## Remarks

Compares the values designated by the expressions [`LeftExpression`](./leftexpression/) and [`RightExpression`](./rightexpression/) in comparison using the operator designated by [`ComparisonOperator`](./comparisonoperator/). If the comparison is true, SKIPIF cancels the current merge document, moves to the next data record in the data source, and starts a new merge document. If the comparison is false, the current merge document is continued.

## Examples

Shows how to skip pages in a mail merge using the SKIPIF field.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a SKIPIF field. If the current row of a mail merge operation fulfills the condition
// which the expressions of this field state, then the mail merge operation aborts the current row,
// discards the current merge document, and then immediately moves to the next row to begin the next merge document.
FieldSkipIf fieldSkipIf = (FieldSkipIf) builder.InsertField(FieldType.FieldSkipIf, true);

// Move the builder to the SKIPIF field's separator so we can place a MERGEFIELD inside the SKIPIF field.
builder.MoveTo(fieldSkipIf.Separator);
FieldMergeField fieldMergeField = (FieldMergeField)builder.InsertField(FieldType.FieldMergeField, true);
fieldMergeField.FieldName = "Department";

// The MERGEFIELD refers to the "Department" column in our data table. If a row from that table
// has a value of "HR" in its "Department" column, then this row will fulfill the condition.
fieldSkipIf.LeftExpression = "=";
fieldSkipIf.RightExpression = "HR";

// Add content to our document, create the data source, and execute the mail merge.
builder.MoveToDocumentEnd();
builder.Write("Dear ");
fieldMergeField = (FieldMergeField)builder.InsertField(FieldType.FieldMergeField, true);
fieldMergeField.FieldName = "Name";
builder.Writeln(", ");

// This table has three rows, and one of them fulfills the condition of our SKIPIF field. 
// The mail merge will produce two pages.
DataTable table = new DataTable("Employees");
table.Columns.Add("Name");
table.Columns.Add("Department");
table.Rows.Add("John Doe", "Sales");
table.Rows.Add("Jane Doe", "Accounting");
table.Rows.Add("John Cardholder", "HR");

doc.MailMerge.Execute(table);
doc.Save(ArtifactsDir + "Field.SKIPIF.docx");
```

Shows how to use MERGEREC and MERGESEQ fields to the number and count mail merge records in a mail merge's output documents.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("Dear ");
FieldMergeField fieldMergeField = (FieldMergeField)builder.InsertField(FieldType.FieldMergeField, true);
fieldMergeField.FieldName = "Name";
builder.Writeln(",");

// A MERGEREC field will print the row number of the data being merged in every merge output document.
builder.Write("\nRow number of record in data source: ");
FieldMergeRec fieldMergeRec = (FieldMergeRec)builder.InsertField(FieldType.FieldMergeRec, true);

Assert.That(fieldMergeRec.GetFieldCode(), Is.EqualTo(" MERGEREC "));

// A MERGESEQ field will count the number of successful merges and print the current value on each respective page.
// If a mail merge skips no rows and invokes no SKIP/SKIPIF/NEXT/NEXTIF fields, then all merges are successful.
// The MERGESEQ and MERGEREC fields will display the same results of their mail merge was successful.
builder.Write("\nSuccessful merge number: ");
FieldMergeSeq fieldMergeSeq = (FieldMergeSeq)builder.InsertField(FieldType.FieldMergeSeq, true);

Assert.That(fieldMergeSeq.GetFieldCode(), Is.EqualTo(" MERGESEQ "));

// Insert a SKIPIF field, which will skip a merge if the name is "John Doe".
FieldSkipIf fieldSkipIf = (FieldSkipIf)builder.InsertField(FieldType.FieldSkipIf, true);
builder.MoveTo(fieldSkipIf.Separator);
fieldMergeField = (FieldMergeField)builder.InsertField(FieldType.FieldMergeField, true);
fieldMergeField.FieldName = "Name";
fieldSkipIf.LeftExpression = "=";
fieldSkipIf.RightExpression = "John Doe";

// Create a data source with 3 rows, one of them having "John Doe" as a value for the "Name" column.
// Since a SKIPIF field will be triggered once by that value, the output of our mail merge will have 2 pages instead of 3.
// On page 1, the MERGESEQ and MERGEREC fields will both display "1".
// On page 2, the MERGEREC field will display "3" and the MERGESEQ field will display "2".
DataTable table = new DataTable("Employees");
table.Columns.Add("Name");
table.Rows.Add("Jane Doe");
table.Rows.Add("John Doe");
table.Rows.Add("Joe Bloggs");

doc.MailMerge.Execute(table);
doc.Save(ArtifactsDir + "Field.MERGEREC.MERGESEQ.docx");
```

### See Also

* class [Field](../field/)
* namespace [Aspose.Words.Fields](../../aspose.words.fields/)
* assembly [Aspose.Words](../../)
