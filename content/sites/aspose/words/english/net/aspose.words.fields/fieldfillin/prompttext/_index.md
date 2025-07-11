---
title: FieldFillIn.PromptText
linktitle: PromptText
articleTitle: PromptText
second_title: Aspose.Words for .NET
description: Discover the FieldFillIn PromptText property, easily customize prompt window titles to enhance user experience and improve interface clarity.
type: docs
weight: 40
url: /net/aspose.words.fields/fieldfillin/prompttext/
---
## FieldFillIn.PromptText property

Gets or sets the prompt text (the title of the prompt window).

```csharp
public string PromptText { get; set; }
```

## Examples

Shows how to use the FILLIN field to prompt the user for a response.

```csharp
public void FieldFillIn()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    // Insert a FILLIN field. When we manually update this field in Microsoft Word,
    // it will prompt us to enter a response. The field will then display the response as text.
    FieldFillIn field = (FieldFillIn)builder.InsertField(FieldType.FieldFillIn, true);
    field.PromptText = "Please enter a response:";
    field.DefaultResponse = "A default response.";

    // We can also use these fields to ask the user for a unique response for each page
    // created during a mail merge done using Microsoft Word.
    field.PromptOnceOnMailMerge = true;

    Assert.That(field.GetFieldCode(), Is.EqualTo(" FILLIN  \"Please enter a response:\" \\d \"A default response.\" \\o"));

    FieldMergeField mergeField = (FieldMergeField)builder.InsertField(FieldType.FieldMergeField, true);
    mergeField.FieldName = "MergeField";

    // If we perform a mail merge programmatically, we can use a custom prompt respondent
    // to automatically edit responses for FILLIN fields that the mail merge encounters.
    doc.FieldOptions.UserPromptRespondent = new PromptRespondent();
    doc.MailMerge.Execute(new [] { "MergeField" }, new object[] { "" });

    doc.UpdateFields();
    doc.Save(ArtifactsDir + "Field.FILLIN.docx");
}

/// <summary>
/// Prepends a line to the default response of every FILLIN field during a mail merge.
/// </summary>
private class PromptRespondent : IFieldUserPromptRespondent
{
    public string Respond(string promptText, string defaultResponse)
    {
        return "Response modified by PromptRespondent. " + defaultResponse;
    }
}
```

### See Also

* class [FieldFillIn](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
