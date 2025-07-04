---
title: HtmlSaveOptions.CssSavingCallback
linktitle: CssSavingCallback
articleTitle: CssSavingCallback
second_title: Aspose.Words for .NET
description: Control CSS style saving with HtmlSaveOptions CssSavingCallback. Optimize your document exports to HTML, MHTML, or EPUB effortlessly!
type: docs
weight: 40
url: /net/aspose.words.saving/htmlsaveoptions/csssavingcallback/
---
## HtmlSaveOptions.CssSavingCallback property

Allows to control how CSS styles are saved when a document is saved to HTML, MHTML or EPUB.

```csharp
public ICssSavingCallback CssSavingCallback { get; set; }
```

## Examples

Shows how to work with CSS stylesheets that an HTML conversion creates.

```csharp
public void ExternalCssFilenames()
{
    Document doc = new Document(MyDir + "Rendering.docx");

    // Create an "HtmlFixedSaveOptions" object, which we can pass to the document's "Save" method
    // to modify how we convert the document to HTML.
    HtmlSaveOptions options = new HtmlSaveOptions();

    // Set the "CssStylesheetType" property to "CssStyleSheetType.External" to
    // accompany a saved HTML document with an external CSS stylesheet file.
    options.CssStyleSheetType = CssStyleSheetType.External;

    // Below are two ways of specifying directories and filenames for output CSS stylesheets.
    // 1 -  Use the "CssStyleSheetFileName" property to assign a filename to our stylesheet:
    options.CssStyleSheetFileName = ArtifactsDir + "SavingCallback.ExternalCssFilenames.css";

    // 2 -  Use a custom callback to name our stylesheet:
    options.CssSavingCallback =
        new CustomCssSavingCallback(ArtifactsDir + "SavingCallback.ExternalCssFilenames.css", true, false);

    doc.Save(ArtifactsDir + "SavingCallback.ExternalCssFilenames.html", options);
}

/// <summary>
/// Sets a custom filename, along with other parameters for an external CSS stylesheet.
/// </summary>
private class CustomCssSavingCallback : ICssSavingCallback
{
    public CustomCssSavingCallback(string cssDocFilename, bool isExportNeeded, bool keepCssStreamOpen)
    {
        mCssTextFileName = cssDocFilename;
        mIsExportNeeded = isExportNeeded;
        mKeepCssStreamOpen = keepCssStreamOpen;
    }

    public void CssSaving(CssSavingArgs args)
    {
        // We can access the entire source document via the "Document" property.
        Assert.That(args.Document.OriginalFileName.EndsWith("Rendering.docx"), Is.True);

        args.CssStream = new FileStream(mCssTextFileName, FileMode.Create);
        args.IsExportNeeded = mIsExportNeeded;
        args.KeepCssStreamOpen = mKeepCssStreamOpen;

        Assert.That(args.CssStream.CanWrite, Is.True);
    }

    private readonly string mCssTextFileName;
    private readonly bool mIsExportNeeded;
    private readonly bool mKeepCssStreamOpen;
}
```

### See Also

* interface [ICssSavingCallback](../../icsssavingcallback/)
* class [HtmlSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
