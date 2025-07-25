---
title: HtmlSaveOptions.ExportDropDownFormFieldAsText
linktitle: ExportDropDownFormFieldAsText
articleTitle: ExportDropDownFormFieldAsText
second_title: Aspose.Words for .NET
description: Discover how the HtmlSaveOptions ExportDropDownFormFieldAsText property enhances your HTML/MHTML exports by controlling dropdown field formats. Optimize your documents!
type: docs
weight: 130
url: /net/aspose.words.saving/htmlsaveoptions/exportdropdownformfieldastext/
---
## HtmlSaveOptions.ExportDropDownFormFieldAsText property

Controls how drop-down form fields are saved to HTML or MHTML. Default value is `false`.

```csharp
public bool ExportDropDownFormFieldAsText { get; set; }
```

## Remarks

When set to `true`, exports drop-down form fields as normal text. When `false`, exports drop-down form fields as SELECT element in HTML.

When exporting to EPUB, text drop-down form fields are always saved as text due to requirements of this format.

## Examples

Shows how to get drop-down combo box form fields to blend in with paragraph text when saving to html.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Use a document builder to insert a combo box with the value "Two" selected.
builder.InsertComboBox("MyComboBox", new[] { "One", "Two", "Three" }, 1);

// The "ExportDropDownFormFieldAsText" flag of this SaveOptions object allows us to
// control how saving the document to HTML treats drop-down combo boxes.
// Setting it to "true" will convert each combo box into simple text
// that displays the combo box's currently selected value, effectively freezing it.
// Setting it to "false" will preserve the functionality of the combo box using <select> and <option> tags.
HtmlSaveOptions options = new HtmlSaveOptions();
options.ExportDropDownFormFieldAsText = exportDropDownFormFieldAsText;    

doc.Save(ArtifactsDir + "HtmlSaveOptions.DropDownFormField.html", options);

string outDocContents = File.ReadAllText(ArtifactsDir + "HtmlSaveOptions.DropDownFormField.html");

if (exportDropDownFormFieldAsText)
    Assert.That(outDocContents.Contains(
        "<span>Two</span>"), Is.True);
else
    Assert.That(outDocContents.Contains(
        "<select name=\"MyComboBox\">" +
            "<option>One</option>" +
            "<option selected=\"selected\">Two</option>" +
            "<option>Three</option>" +
        "</select>"), Is.True);
```

### See Also

* class [HtmlSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
