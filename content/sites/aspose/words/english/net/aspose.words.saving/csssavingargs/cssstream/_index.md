---
title: CssSavingArgs.CssStream
linktitle: CssStream
articleTitle: CssStream
second_title: Aspose.Words for .NET
description: Optimize your CSS storage with the CssSavingArgs CssStream property, enabling seamless saving of CSS data to your preferred stream.
type: docs
weight: 10
url: /net/aspose.words.saving/csssavingargs/cssstream/
---
## CssSavingArgs.CssStream property

Allows to specify the stream where the CSS information will be saved to.

```csharp
public Stream CssStream { get; set; }
```

## Remarks

This property allows you to save CSS information to a stream.

The default value is `null`. This property doesn't suppress saving CSS information to a file or embedding to HTML document. To suppress exporting CSS use the [`IsExportNeeded`](../isexportneeded/) property.

Using [`ICssSavingCallback`](../../icsssavingcallback/) you cannot substitute CSS with another. It is intended only for saving CSS to a stream.

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

* class [CssSavingArgs](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
