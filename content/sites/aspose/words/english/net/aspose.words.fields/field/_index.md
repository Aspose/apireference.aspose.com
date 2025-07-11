---
title: Field Class
linktitle: Field
articleTitle: Field
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Fields.Field class, your key to enhancing Microsoft Word documents with dynamic fields for improved functionality and efficiency.
type: docs
weight: 1910
url: /net/aspose.words.fields/field/
---
## Field class

Represents a Microsoft Word document field.

To learn more, visit the [Working with Fields](https://docs.aspose.com/words/net/working-with-fields/) documentation article.

```csharp
public class Field
```

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
| [GetFieldCode](../../aspose.words.fields/field/getfieldcode/#getfieldcode)() | Returns text between field start and field separator (or field end if there is no separator). Both field code and field result of child fields are included. |
| [GetFieldCode](../../aspose.words.fields/field/getfieldcode/#getfieldcode_1)(*bool*) | Returns text between field start and field separator (or field end if there is no separator). |
| [Remove](../../aspose.words.fields/field/remove/)() | Removes the field from the document. Returns a node right after the field. If the field's end is the last child of its parent node, returns its parent paragraph. If the field is already removed, returns `null`. |
| [Unlink](../../aspose.words.fields/field/unlink/)() | Performs the field unlink. |
| [Update](../../aspose.words.fields/field/update/#update)() | Performs the field update. Throws if the field is being updated already. |
| [Update](../../aspose.words.fields/field/update/#update_1)(*bool*) | Performs a field update. Throws if the field is being updated already. |

## Remarks

A field in a Word document is a complex structure consisting of multiple nodes that include field start, field code, field separator, field result and field end. Fields can be nested, contain rich content and span multiple paragraphs or sections in a document. The `Field` class is a "facade" object that provides properties and methods that allow to work with a field as a single object.

The [`Start`](./start/), [`Separator`](./separator/) and [`End`](./end/) properties point to the field start, separator and end nodes of the field respectively.

The content between the field start and separator is the field code. The content between the field separator and field end is the field result. The field code typically consists of one or more [`Run`](../../aspose.words/run/) objects that specify instructions. The processing application is expected to execute the field code to calculate the field result.

The process of calculating field results is called the field update. Aspose.Words can update field results of most of the field types in exactly the same way as Microsoft Word does it. Most notably, Aspose.Words can calculate results of even the most complex formula fields. To calculate the field result of a single field use the [`Update`](./update/) method. To update fields in the whole document use [`UpdateFields`](../../aspose.words/document/updatefields/).

You can get the plain text version of the field code using the [`GetFieldCode`](./getfieldcode/) method. You can get and set the plain text version of the field result using the [`Result`](./result/) property. Both the field code and field result can contain complex content, such as nested fields, paragraphs, shapes, tables and in this case you might want to work with the field nodes directly if you need more control.

You do not create instances of the `Field` class directly. To create a new field use the [`InsertField`](../../aspose.words/documentbuilder/insertfield/) method.

## Examples

Shows how to insert a field into a document using a field code.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Field field = builder.InsertField("DATE \\@ \"dddd, MMMM dd, yyyy\"");

Assert.That(field.Type, Is.EqualTo(FieldType.FieldDate));
Assert.That(field.GetFieldCode(), Is.EqualTo("DATE \\@ \"dddd, MMMM dd, yyyy\""));

// This overload of the InsertField method automatically updates inserted fields.
Assert.That((DateTime.Today - DateTime.Parse(field.Result)).Days <= 1, Is.True);
```

### See Also

* namespace [Aspose.Words.Fields](../../aspose.words.fields/)
* assembly [Aspose.Words](../../)
