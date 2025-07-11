---
title: FormField.Result
linktitle: Result
articleTitle: Result
second_title: Aspose.Words for .NET
description: Discover the FormField Result property, easily manage and customize the string output of your form fields for enhanced user experience.
type: docs
weight: 170
url: /net/aspose.words.fields/formfield/result/
---
## FormField.Result property

Gets or sets a string that represents the result of this form field.

```csharp
public string Result { get; set; }
```

## Remarks

For a text form field the result is the text that is in the field.

For a checkbox form field the result can be "1" or "0" to indicate checked or unchecked.

For a dropdown form field the result is the string selected in the dropdown.

Setting `Result` for a text form field does not apply the text format specified in [`TextInputFormat`](../textinputformat/). If you want to set a value and apply the format, use the [`SetTextInputValue`](../settextinputvalue/) method.

For a text form field the [`TextInputDefault`](../textinputdefault/) value is applied if *value* is `null`.

## Examples

Shows how to insert a combo box.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("Please select a fruit: ");

// Insert a combo box which will allow a user to choose an option from a collection of strings.
FormField comboBox = builder.InsertComboBox("MyComboBox", new[] { "Apple", "Banana", "Cherry" }, 0);

Assert.That(comboBox.Name, Is.EqualTo("MyComboBox"));
Assert.That(comboBox.Type, Is.EqualTo(FieldType.FieldFormDropDown));
Assert.That(comboBox.Result, Is.EqualTo("Apple"));

// The form field will appear in the form of a "select" html tag.
doc.Save(ArtifactsDir + "FormFields.Create.html");
```

### See Also

* class [FormField](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
