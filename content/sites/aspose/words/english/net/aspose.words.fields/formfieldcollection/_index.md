---
title: FormFieldCollection Class
linktitle: FormFieldCollection
articleTitle: FormFieldCollection
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Fields.FormFieldCollection class, your go-to solution for managing all form fields in a document with ease and efficiency.
type: docs
weight: 3030
url: /net/aspose.words.fields/formfieldcollection/
---
## FormFieldCollection class

A collection of [`FormField`](../formfield/) objects that represent all the form fields in a range.

To learn more, visit the [Working with Form Fields](https://docs.aspose.com/words/net/working-with-form-fields/) documentation article.

```csharp
public class FormFieldCollection : IEnumerable<FormField>
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.words.fields/formfieldcollection/count/) { get; } | Returns the number of form fields in the collection. |
| [Item](../../aspose.words.fields/formfieldcollection/item/) { get; } | Returns a form field at the specified index. (2 indexers) |

## Methods

| Name | Description |
| --- | --- |
| [Clear](../../aspose.words.fields/formfieldcollection/clear/)() | Removes all form fields from this collection and from the document. |
| [GetEnumerator](../../aspose.words.fields/formfieldcollection/getenumerator/)() | Returns an enumerator object. |
| [Remove](../../aspose.words.fields/formfieldcollection/remove/)(*string*) | Removes a form field with the specified name. |
| [RemoveAt](../../aspose.words.fields/formfieldcollection/removeat/)(*int*) | Removes a form field at the specified index. |

## Examples

Shows how insert different kinds of form fields into a document, and process them with using a document visitor implementation.

```csharp
public void Visitor()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    // Use a document builder to insert a combo box.
    builder.Write("Choose a value from this combo box: ");
    FormField comboBox = builder.InsertComboBox("MyComboBox", new[] { "One", "Two", "Three" }, 0);
    comboBox.CalculateOnExit = true;
    Assert.That(comboBox.DropDownItems.Count, Is.EqualTo(3));
    Assert.That(comboBox.DropDownSelectedIndex, Is.EqualTo(0));
    Assert.That(comboBox.Enabled, Is.True);

    builder.InsertBreak(BreakType.ParagraphBreak);

    // Use a document builder to insert a check box.
    builder.Write("Click this check box to tick/untick it: ");
    FormField checkBox = builder.InsertCheckBox("MyCheckBox", false, 50);
    checkBox.IsCheckBoxExactSize = true;
    checkBox.HelpText = "Right click to check this box";
    checkBox.OwnHelp = true;
    checkBox.StatusText = "Checkbox status text";
    checkBox.OwnStatus = true;
    Assert.That(checkBox.CheckBoxSize, Is.EqualTo(50.0d));
    Assert.That(checkBox.Checked, Is.False);
    Assert.That(checkBox.Default, Is.False);

    builder.InsertBreak(BreakType.ParagraphBreak);

    // Use a document builder to insert text input form field.
    builder.Write("Enter text here: ");
    FormField textInput = builder.InsertTextInput("MyTextInput", TextFormFieldType.Regular, "", "Placeholder text", 50);
    textInput.EntryMacro = "EntryMacro";
    textInput.ExitMacro = "ExitMacro";
    textInput.TextInputDefault = "Regular";
    textInput.TextInputFormat = "FIRST CAPITAL";
    textInput.SetTextInputValue("New placeholder text");
    Assert.That(textInput.TextInputType, Is.EqualTo(TextFormFieldType.Regular));
    Assert.That(textInput.MaxLength, Is.EqualTo(50));

    // This collection contains all our form fields.
    FormFieldCollection formFields = doc.Range.FormFields;
    Assert.That(formFields.Count, Is.EqualTo(3));

    // Fields display our form fields. We can see their field codes by opening this document
    // in Microsoft and pressing Alt + F9. These fields have no switches,
    // and members of the FormField object fully govern their form fields' content.
    Assert.That(doc.Range.Fields.Count, Is.EqualTo(3));
    Assert.That(doc.Range.Fields[0].GetFieldCode(), Is.EqualTo(" FORMDROPDOWN \u0001"));
    Assert.That(doc.Range.Fields[1].GetFieldCode(), Is.EqualTo(" FORMCHECKBOX \u0001"));
    Assert.That(doc.Range.Fields[2].GetFieldCode(), Is.EqualTo(" FORMTEXT \u0001"));

    // Allow each form field to accept a document visitor.
    FormFieldVisitor formFieldVisitor = new FormFieldVisitor();

    using (IEnumerator<FormField> fieldEnumerator = formFields.GetEnumerator())
        while (fieldEnumerator.MoveNext())
            fieldEnumerator.Current.Accept(formFieldVisitor);

    Console.WriteLine(formFieldVisitor.GetText());

    doc.UpdateFields();
    doc.Save(ArtifactsDir + "FormFields.Visitor.html");
}

/// <summary>
/// Visitor implementation that prints details of form fields that it visits. 
/// </summary>
public class FormFieldVisitor : DocumentVisitor
{
    public FormFieldVisitor()
    {
        mBuilder = new StringBuilder();
    }

    /// <summary>
    /// Called when a FormField node is encountered in the document.
    /// </summary>
    public override VisitorAction VisitFormField(FormField formField)
    {
        AppendLine(formField.Type + ": \"" + formField.Name + "\"");
        AppendLine("\tStatus: " + (formField.Enabled ? "Enabled" : "Disabled"));
        AppendLine("\tHelp Text:  " + formField.HelpText);
        AppendLine("\tEntry macro name: " + formField.EntryMacro);
        AppendLine("\tExit macro name: " + formField.ExitMacro);

        switch (formField.Type)
        {
            case FieldType.FieldFormDropDown:
                AppendLine("\tDrop-down items count: " + formField.DropDownItems.Count + ", default selected item index: " + formField.DropDownSelectedIndex);
                AppendLine("\tDrop-down items: " + string.Join(", ", formField.DropDownItems.ToArray()));
                break;
            case FieldType.FieldFormCheckBox:
                AppendLine("\tCheckbox size: " + formField.CheckBoxSize);
                AppendLine("\t" + "Checkbox is currently: " + (formField.Checked ? "checked, " : "unchecked, ") + "by default: " + (formField.Default ? "checked" : "unchecked"));
                break;
            case FieldType.FieldFormTextInput:
                AppendLine("\tInput format: " + formField.TextInputFormat);
                AppendLine("\tCurrent contents: " + formField.Result);
                break;
        }

        // Let the visitor continue visiting other nodes.
        return VisitorAction.Continue;
    }

    /// <summary>
    /// Adds newline char-terminated text to the current output.
    /// </summary>
    private void AppendLine(string text)
    {
        mBuilder.Append(text + '\n');
    }

    /// <summary>
    /// Gets the plain text of the document that was accumulated by the visitor.
    /// </summary>
    public string GetText()
    {
        return mBuilder.ToString();
    }

    private readonly StringBuilder mBuilder;
}
```

### See Also

* class [FormField](../formfield/)
* namespace [Aspose.Words.Fields](../../aspose.words.fields/)
* assembly [Aspose.Words](../../)
