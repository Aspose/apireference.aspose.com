---
title: FieldNextIf.RightExpression
linktitle: RightExpression
articleTitle: RightExpression
second_title: Aspose.Words for .NET
description: Discover the FieldNextIf RightExpression property to easily manage and customize the right side of your comparison expressions for enhanced data handling.
type: docs
weight: 40
url: /net/aspose.words.fields/fieldnextif/rightexpression/
---
## FieldNextIf.RightExpression property

Gets or sets the right part of the comparison expression.

```csharp
public string RightExpression { get; set; }
```

## Examples

Shows how to use NEXT/NEXTIF fields to merge multiple rows into one page during a mail merge.

```csharp
public void FieldNext()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    // Create a data source for our mail merge with 3 rows.
    // A mail merge that uses this table would normally create a 3-page document.
    DataTable table = new DataTable("Employees");
    table.Columns.Add("Courtesy Title");
    table.Columns.Add("First Name");
    table.Columns.Add("Last Name");
    table.Rows.Add("Mr.", "John", "Doe");
    table.Rows.Add("Mrs.", "Jane", "Cardholder");
    table.Rows.Add("Mr.", "Joe", "Bloggs");

    InsertMergeFields(builder, "First row: ");

    // If we have multiple merge fields with the same FieldName,
    // they will receive data from the same row of the data source and display the same value after the merge.
    // A NEXT field tells the mail merge instantly to move down one row,
    // which means any MERGEFIELDs that follow the NEXT field will receive data from the next row.
    // Make sure never to try to skip to the next row while already on the last row.
    FieldNext fieldNext = (FieldNext)builder.InsertField(FieldType.FieldNext, true);

    Assert.That(fieldNext.GetFieldCode(), Is.EqualTo(" NEXT "));

    // After the merge, the data source values that these MERGEFIELDs accept
    // will end up on the same page as the MERGEFIELDs above. 
    InsertMergeFields(builder, "Second row: ");

    // A NEXTIF field has the same function as a NEXT field,
    // but it skips to the next row only if a statement constructed by the following 3 properties is true.
    FieldNextIf fieldNextIf = (FieldNextIf)builder.InsertField(FieldType.FieldNextIf, true);
    fieldNextIf.LeftExpression = "5";
    fieldNextIf.RightExpression = "2 + 3";
    fieldNextIf.ComparisonOperator = "=";

    Assert.That(fieldNextIf.GetFieldCode(), Is.EqualTo(" NEXTIF  5 = \"2 + 3\""));

    // If the comparison asserted by the above field is correct,
    // the following 3 merge fields will take data from the third row.
    // Otherwise, these fields will take data from row 2 again.
    InsertMergeFields(builder, "Third row: ");

    doc.MailMerge.Execute(table);

    // Our data source has 3 rows, and we skipped rows twice. 
    // Our output document will have 1 page with data from all 3 rows.
    doc.Save(ArtifactsDir + "Field.NEXT.NEXTIF.docx");
}

/// <summary>
/// Uses a document builder to insert MERGEFIELDs for a data source that contains columns named "Courtesy Title", "First Name" and "Last Name".
/// </summary>
public void InsertMergeFields(DocumentBuilder builder, string firstFieldTextBefore)
{
    InsertMergeField(builder, "Courtesy Title", firstFieldTextBefore, " ");
    InsertMergeField(builder, "First Name", null, " ");
    InsertMergeField(builder, "Last Name", null, null);
    builder.InsertParagraph();
}

/// <summary>
/// Uses a document builder to insert a MERRGEFIELD with specified properties.
/// </summary>
public void InsertMergeField(DocumentBuilder builder, string fieldName, string textBefore, string textAfter)
{
    FieldMergeField field = (FieldMergeField) builder.InsertField(FieldType.FieldMergeField, true);
    field.FieldName = fieldName;
    field.TextBefore = textBefore;
    field.TextAfter = textAfter;
}
```

### See Also

* class [FieldNextIf](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
