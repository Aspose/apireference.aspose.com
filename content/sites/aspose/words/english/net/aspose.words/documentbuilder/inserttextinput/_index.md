---
title: DocumentBuilder.InsertTextInput
linktitle: InsertTextInput
articleTitle: InsertTextInput
second_title: Aspose.Words for .NET
description: Effortlessly add text form fields with the DocumentBuilder InsertTextInput method. Enhance your document's interactivity and user experience today!
type: docs
weight: 510
url: /net/aspose.words/documentbuilder/inserttextinput/
---
## DocumentBuilder.InsertTextInput method

Inserts a text form field at the current position.

```csharp
public FormField InsertTextInput(string name, TextFormFieldType type, string format, 
    string fieldValue, int maxLength)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | The name of the form field. Can be an empty string. |
| type | TextFormFieldType | Specifies the type of the text form field. |
| format | String | Format string used to format the value of the form field. |
| fieldValue | String | Text that will be shown in the field. |
| maxLength | Int32 | Maximum length the user can enter into the form field. Set to zero for unlimited length. |

### Return Value

The form field node that was just inserted.

## Remarks

If you specify a name for the form field, then a bookmark is automatically created with the same name.

## Examples

Shows how to insert a text input form field into a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a form that prompts the user to enter text.
builder.InsertTextInput("TextInput", TextFormFieldType.Regular, "", "Enter your text here", 0);

doc.Save(ArtifactsDir + "DocumentBuilder.InsertTextInput.docx");
```

Shows how to insert a text input form field.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("Please enter text here: ");

// Insert a text input field, which will allow the user to click it and enter text.
// Assign some placeholder text that the user may overwrite and pass
// a maximum text length of 0 to apply no limit on the form field's contents.
builder.InsertTextInput("TextInput1", TextFormFieldType.Regular, "", "Placeholder text", 0);

// The form field will appear in the form of an "input" html tag, with a type of "text".
doc.Save(ArtifactsDir + "FormFields.TextInput.html");
```

Shows how to create form fields.

```csharp
DocumentBuilder builder = new DocumentBuilder();

// Form fields are objects in the document that the user can interact with by being prompted to enter values.
// We can create them using a document builder, and below are two ways of doing so.
// 1 -  Basic text input:
builder.InsertTextInput("My text input", TextFormFieldType.Regular,
    "", "Enter your name here", 30);

// 2 -  Combo box with prompt text, and a range of possible values:
string[] items =
{
    "-- Select your favorite footwear --", "Sneakers", "Oxfords", "Flip-flops", "Other"
};

builder.InsertParagraph();
builder.InsertComboBox("My combo box", items, 0);

builder.Document.Save(ArtifactsDir + "DocumentBuilder.CreateForm.docx");
```

### See Also

* class [FormField](../../../aspose.words.fields/formfield/)
* enum [TextFormFieldType](../../../aspose.words.fields/textformfieldtype/)
* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
