---
title: FieldUserName Class
linktitle: FieldUserName
articleTitle: FieldUserName
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Fields.FieldUserName class for seamless USERNAME field integration. Enhance document automation with powerful features today!
type: docs
weight: 3000
url: /net/aspose.words.fields/fieldusername/
---
## FieldUserName class

Implements the USERNAME field.

To learn more, visit the [Working with Fields](https://docs.aspose.com/words/net/working-with-fields/) documentation article.

```csharp
public class FieldUserName : Field
```

## Constructors

| Name | Description |
| --- | --- |
| [FieldUserName](fieldusername/)() | The default constructor. |

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
| [UserName](../../aspose.words.fields/fieldusername/username/) { get; set; } | Gest or sets the current user's name. |

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

Retrieves the current user's name.

## Examples

Shows how to use the USERNAME field.

```csharp
Document doc = new Document();

// Create a UserInformation object and set it as the source of user information for any fields that we create.
UserInformation userInformation = new UserInformation();
userInformation.Name = "John Doe";
doc.FieldOptions.CurrentUser = userInformation;

DocumentBuilder builder = new DocumentBuilder(doc);

// Create a USERNAME field to display the current user's name,
// taken from the UserInformation object we created above.
FieldUserName fieldUserName = (FieldUserName)builder.InsertField(FieldType.FieldUserName, true);
Assert.That(fieldUserName.Result, Is.EqualTo(userInformation.Name));

Assert.That(fieldUserName.GetFieldCode(), Is.EqualTo(" USERNAME "));
Assert.That(fieldUserName.Result, Is.EqualTo("John Doe"));

// We can set this property to get our field to override the value currently stored in the UserInformation object. 
fieldUserName.UserName = "Jane Doe";
fieldUserName.Update();

Assert.That(fieldUserName.GetFieldCode(), Is.EqualTo(" USERNAME  \"Jane Doe\""));
Assert.That(fieldUserName.Result, Is.EqualTo("Jane Doe"));

// This does not affect the value in the UserInformation object.
Assert.That(doc.FieldOptions.CurrentUser.Name, Is.EqualTo("John Doe"));

doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.USERNAME.docx");
```

### See Also

* class [Field](../field/)
* namespace [Aspose.Words.Fields](../../aspose.words.fields/)
* assembly [Aspose.Words](../../)
