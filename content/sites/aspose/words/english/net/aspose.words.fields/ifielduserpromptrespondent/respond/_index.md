---
title: IFieldUserPromptRespondent.Respond
linktitle: Respond
articleTitle: Respond
second_title: Aspose.Words for .NET
description: Discover the IFieldUserPromptRespondent Respond method to capture user responses effectively. Learn how to handle cancellations seamlessly!
type: docs
weight: 10
url: /net/aspose.words.fields/ifielduserpromptrespondent/respond/
---
## IFieldUserPromptRespondent.Respond method

When implemented, returns a response from the user on prompting. Your implementation should return `null` to indicate that the user has not responded to the prompt (i.e. the user has pressed the Cancel button in the prompt window).

```csharp
public string Respond(string promptText, string defaultResponse)
```

| Parameter | Type | Description |
| --- | --- | --- |
| promptText | String | Prompt text (i.e. title of the prompt window). |
| defaultResponse | String | Default user response (i.e. initial value contained in the prompt window). |

### Return Value

User response (i.e. confirmed value contained in the prompt window).

## Examples

Shows how to create an ASK field, and set its properties.

```csharp
public void FieldAsk()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    // Place a field where the response to our ASK field will be placed.
    FieldRef fieldRef = (FieldRef)builder.InsertField(FieldType.FieldRef, true);
    fieldRef.BookmarkName = "MyAskField";
    builder.Writeln();

    Assert.That(fieldRef.GetFieldCode(), Is.EqualTo(" REF  MyAskField"));

    // Insert the ASK field and edit its properties to reference our REF field by bookmark name.
    FieldAsk fieldAsk = (FieldAsk)builder.InsertField(FieldType.FieldAsk, true);
    fieldAsk.BookmarkName = "MyAskField";
    fieldAsk.PromptText = "Please provide a response for this ASK field";
    fieldAsk.DefaultResponse = "Response from within the field.";
    fieldAsk.PromptOnceOnMailMerge = true;
    builder.Writeln();

    Assert.That(fieldAsk.GetFieldCode(), Is.EqualTo(" ASK  MyAskField \"Please provide a response for this ASK field\" \\d \"Response from within the field.\" \\o"));

    // ASK fields apply the default response to their respective REF fields during a mail merge.
    DataTable table = new DataTable("My Table");
    table.Columns.Add("Column 1");
    table.Rows.Add("Row 1");
    table.Rows.Add("Row 2");

    FieldMergeField fieldMergeField = (FieldMergeField)builder.InsertField(FieldType.FieldMergeField, true);
    fieldMergeField.FieldName = "Column 1";

    // We can modify or override the default response in our ASK fields with a custom prompt responder,
    // which will occur during a mail merge.
    doc.FieldOptions.UserPromptRespondent = new MyPromptRespondent();
    doc.MailMerge.Execute(table);

    doc.UpdateFields();
    doc.Save(ArtifactsDir + "Field.ASK.docx");
}

/// <summary>
/// Prepends text to the default response of an ASK field during a mail merge.
/// </summary>
private class MyPromptRespondent : IFieldUserPromptRespondent
{
    public string Respond(string promptText, string defaultResponse)
    {
        return "Response from MyPromptRespondent. " + defaultResponse;
    }
}
```

### See Also

* interface [IFieldUserPromptRespondent](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
