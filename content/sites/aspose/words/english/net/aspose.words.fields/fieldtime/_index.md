---
title: FieldTime Class
linktitle: FieldTime
articleTitle: FieldTime
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Fields.FieldTime class for seamless TIME field implementation. Enhance your document automation with powerful features!
type: docs
weight: 2900
url: /net/aspose.words.fields/fieldtime/
---
## FieldTime class

Implements the TIME field.

To learn more, visit the [Working with Fields](https://docs.aspose.com/words/net/working-with-fields/) documentation article.

```csharp
public class FieldTime : Field
```

## Constructors

| Name | Description |
| --- | --- |
| [FieldTime](fieldtime/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [DisplayResult](../../aspose.words.fields/field/displayresult/) { get; } | Gets the text that represents the displayed field result. |
| [End](../../aspose.words.fields/field/end/) { get; } | Gets the node that represents the field end. |
| [Format](../../aspose.words.fields/field/format/) { get; } | Gets a [`FieldFormat`](../fieldformat/) object that provides typed access to field's formatting. |
| [IsDirty](../../aspose.words.fields/field/isdirty/) { get; set; } | Gets or sets whether the current result of the field is no longer correct (stale) due to other modifications made to the document. |
| [IsLocked](../../aspose.words.fields/field/islocked/) { get; set; } | Gets or sets whether the field is locked (should not recalculate its result). |
| [LocaleId](../../aspose.words.fields/field/localeid/) { get; set; } | Gets or sets the LCID of the field. |
| [Result](../../aspose.words.fields/field/result/) { get; set; } | Gets or sets text that is between the field separator and field end. |
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

Inserts the current date and time.

## Examples

Shows how to display the current time using the TIME field.

```csharp
public void FieldTime()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    // By default, time is displayed in the "h:mm am/pm" format.
    FieldTime field = InsertFieldTime(builder, "");

    Assert.That(field.GetFieldCode(), Is.EqualTo(" TIME "));

    // We can use the \@ flag to change the format of our displayed time.
    field = InsertFieldTime(builder, "\\@ HHmm");

    Assert.That(field.GetFieldCode(), Is.EqualTo(" TIME \\@ HHmm"));

    // We can adjust the format to get TIME field to also display the date, according to the Gregorian calendar.
    field = InsertFieldTime(builder, "\\@ \"M/d/yyyy h mm:ss am/pm\"");

    Assert.That(field.GetFieldCode(), Is.EqualTo(" TIME \\@ \"M/d/yyyy h mm:ss am/pm\""));

    doc.Save(ArtifactsDir + "Field.TIME.docx");
}

/// <summary>
/// Use a document builder to insert a TIME field, insert a new paragraph and return the field.
/// </summary>
private static FieldTime InsertFieldTime(DocumentBuilder builder, string format)
{
    FieldTime field = (FieldTime)builder.InsertField(FieldType.FieldTime, true);
    builder.MoveTo(field.Separator);
    builder.Write(format);
    builder.MoveTo(field.Start.ParentNode);

    builder.InsertParagraph();
    return field;
}
```

### See Also

* class [Field](../field/)
* namespace [Aspose.Words.Fields](../../aspose.words.fields/)
* assembly [Aspose.Words](../../)
