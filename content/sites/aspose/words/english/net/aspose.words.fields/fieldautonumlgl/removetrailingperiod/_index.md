---
title: FieldAutoNumLgl.RemoveTrailingPeriod
linktitle: RemoveTrailingPeriod
articleTitle: RemoveTrailingPeriod
second_title: Aspose.Words for .NET
description: Manage FieldAutoNumLgl's RemoveTrailingPeriod property to customize number display—eliminate trailing periods for cleaner, professional formatting.
type: docs
weight: 20
url: /net/aspose.words.fields/fieldautonumlgl/removetrailingperiod/
---
## FieldAutoNumLgl.RemoveTrailingPeriod property

Gets or sets whether to display the number without a trailing period.

```csharp
public bool RemoveTrailingPeriod { get; set; }
```

## Examples

Shows how to organize a document using AUTONUMLGL fields.

```csharp
public void FieldAutoNumLgl()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    const string fillerText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                              "\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ";

    // AUTONUMLGL fields display a number that increments at each AUTONUMLGL field within its current heading level.
    // These fields maintain a separate count for each heading level,
    // and each field also displays the AUTONUMLGL field counts for all heading levels below its own. 
    // Changing the count for any heading level resets the counts for all levels above that level to 1.
    // This allows us to organize our document in the form of an outline list.
    // This is the first AUTONUMLGL field at a heading level of 1, displaying "1." in the document.
    InsertNumberedClause(builder, "\tHeading 1", fillerText, StyleIdentifier.Heading1);

    // This is the second AUTONUMLGL field at a heading level of 1, so it will display "2.".
    InsertNumberedClause(builder, "\tHeading 2", fillerText, StyleIdentifier.Heading1);

    // This is the first AUTONUMLGL field at a heading level of 2,
    // and the AUTONUMLGL count for the heading level below it is "2", so it will display "2.1.".
    InsertNumberedClause(builder, "\tHeading 3", fillerText, StyleIdentifier.Heading2);

    // This is the first AUTONUMLGL field at a heading level of 3. 
    // Working in the same way as the field above, it will display "2.1.1.".
    InsertNumberedClause(builder, "\tHeading 4", fillerText, StyleIdentifier.Heading3);

    // This field is at a heading level of 2, and its respective AUTONUMLGL count is at 2, so the field will display "2.2.".
    InsertNumberedClause(builder, "\tHeading 5", fillerText, StyleIdentifier.Heading2);

    // Incrementing the AUTONUMLGL count for a heading level below this one
    // has reset the count for this level so that this field will display "2.2.1.".
    InsertNumberedClause(builder, "\tHeading 6", fillerText, StyleIdentifier.Heading3);

    foreach (FieldAutoNumLgl field in doc.Range.Fields.Where(f => f.Type == FieldType.FieldAutoNumLegal).ToList())
    {
        // The separator character, which appears in the field result immediately after the number,
        // is a full stop by default. If we leave this property null,
        // our last AUTONUMLGL field will display "2.2.1." in the document.
        Assert.That(field.SeparatorCharacter, Is.Null);

        // Setting a custom separator character and removing the trailing period
        // will change that field's appearance from "2.2.1." to "2:2:1".
        // We will apply this to all the fields that we have created.
        field.SeparatorCharacter = ":";
        field.RemoveTrailingPeriod = true;
        Assert.That(field.GetFieldCode(), Is.EqualTo(" AUTONUMLGL  \\s : \\e"));
    }

    doc.Save(ArtifactsDir + "Field.AUTONUMLGL.docx");
}

/// <summary>
/// Uses a document builder to insert a clause numbered by an AUTONUMLGL field.
/// </summary>
private static void InsertNumberedClause(DocumentBuilder builder, string heading, string contents, StyleIdentifier headingStyle)
{
    builder.InsertField(FieldType.FieldAutoNumLegal, true);
    builder.CurrentParagraph.ParagraphFormat.StyleIdentifier = headingStyle;
    builder.Writeln(heading);

    // This text will belong to the auto num legal field above it.
    // It will collapse when we click the arrow next to the corresponding AUTONUMLGL field in Microsoft Word.
    builder.CurrentParagraph.ParagraphFormat.StyleIdentifier = StyleIdentifier.BodyText;
    builder.Writeln(contents);
}
```

### See Also

* class [FieldAutoNumLgl](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
