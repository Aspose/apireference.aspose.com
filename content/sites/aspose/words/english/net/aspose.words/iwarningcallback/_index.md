---
title: IWarningCallback Interface
linktitle: IWarningCallback
articleTitle: IWarningCallback
second_title: Aspose.Words for .NET
description: Implement the Aspose.Words.IWarningCallback interface to customize methods for capturing fidelity warnings during document loading and saving. Enhance document integrity!
type: docs
weight: 3650
url: /net/aspose.words/iwarningcallback/
---
## IWarningCallback interface

Implement this interface if you want to have your own custom method called to capture loss of fidelity warnings that can occur during document loading or saving.

```csharp
public interface IWarningCallback
```

## Methods

| Name | Description |
| --- | --- |
| [Warning](../../aspose.words/iwarningcallback/warning/)(*[WarningInfo](../warninginfo/)*) | Aspose.Words invokes this method when it encounters some issue during document loading or saving that might result in loss of formatting or data fidelity. |

## Examples

Shows how to set the property for finding the closest match for a missing font from the available font sources.

```csharp
// Open a document that contains text formatted with a font that does not exist in any of our font sources.
Document doc = new Document(MyDir + "Missing font.docx");

// Assign a callback for handling font substitution warnings.
WarningInfoCollection warningCollector = new WarningInfoCollection();
doc.WarningCallback = warningCollector;

// Set a default font name and enable font substitution.
FontSettings fontSettings = new FontSettings();
fontSettings.SubstitutionSettings.DefaultFontSubstitution.DefaultFontName = "Arial";
fontSettings.SubstitutionSettings.FontInfoSubstitution.Enabled = true;

// Original font metrics should be used after font substitution.
doc.LayoutOptions.KeepOriginalFontMetrics = true;

// We will get a font substitution warning if we save a document with a missing font.
doc.FontSettings = fontSettings;
doc.Save(ArtifactsDir + "FontSettings.EnableFontSubstitution.pdf");

foreach (WarningInfo info in warningCollector)
{
    if (info.WarningType == WarningType.FontSubstitution)
        Console.WriteLine(info.Description);
}
```

Shows how to use the IWarningCallback interface to monitor font substitution warnings.

```csharp
public void SubstitutionWarning()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    builder.Font.Name = "Times New Roman";
    builder.Writeln("Hello world!");

    FontSubstitutionWarningCollector callback = new FontSubstitutionWarningCollector();
    doc.WarningCallback = callback;

    // Store the current collection of font sources, which will be the default font source for every document
    // for which we do not specify a different font source.
    FontSourceBase[] originalFontSources = FontSettings.DefaultInstance.GetFontsSources();

    // For testing purposes, we will set Aspose.Words to look for fonts only in a folder that does not exist.
    FontSettings.DefaultInstance.SetFontsFolder(string.Empty, false);

    // When rendering the document, there will be no place to find the "Times New Roman" font.
    // This will cause a font substitution warning, which our callback will detect.
    doc.Save(ArtifactsDir + "FontSettings.SubstitutionWarning.pdf");

    FontSettings.DefaultInstance.SetFontsSources(originalFontSources);

    Assert.That(callback.FontSubstitutionWarnings[0].WarningType == WarningType.FontSubstitution, Is.True);
    Assert.That(callback.FontSubstitutionWarnings[0].Description
        .Equals(
            "Font 'Times New Roman' has not been found. Using 'Fanwood' font instead. Reason: first available font."), Is.True);
}

private class FontSubstitutionWarningCollector : IWarningCallback
{
    /// <summary>
    /// Called every time a warning occurs during loading/saving.
    /// </summary>
    public void Warning(WarningInfo info)
    {
        if (info.WarningType == WarningType.FontSubstitution)
            FontSubstitutionWarnings.Warning(info);
    }

    public WarningInfoCollection FontSubstitutionWarnings = new WarningInfoCollection();
}
```

Shows added a fallback to bitmap rendering and changing type of warnings about unsupported metafile records.

```csharp
public void HandleBinaryRasterWarnings()
{
    Document doc = new Document(MyDir + "WMF with image.docx");

    MetafileRenderingOptions metafileRenderingOptions = new MetafileRenderingOptions();

    // Set the "EmulateRasterOperations" property to "false" to fall back to bitmap when
    // it encounters a metafile, which will require raster operations to render in the output PDF.
    metafileRenderingOptions.EmulateRasterOperations = false;

    // Set the "RenderingMode" property to "VectorWithFallback" to try to render every metafile using vector graphics.
    metafileRenderingOptions.RenderingMode = MetafileRenderingMode.VectorWithFallback;

    // Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
    // to modify how that method converts the document to .PDF and applies the configuration
    // in our MetafileRenderingOptions object to the saving operation.
    PdfSaveOptions saveOptions = new PdfSaveOptions();
    saveOptions.MetafileRenderingOptions = metafileRenderingOptions;

    HandleDocumentWarnings callback = new HandleDocumentWarnings();
    doc.WarningCallback = callback;

    doc.Save(ArtifactsDir + "PdfSaveOptions.HandleBinaryRasterWarnings.pdf", saveOptions);

    Assert.That(callback.Warnings.Count, Is.EqualTo(1));
    Assert.That(callback.Warnings[0].Description, Is.EqualTo("'R2_XORPEN' binary raster operation is not supported."));
}

/// <summary>
/// Prints and collects formatting loss-related warnings that occur upon saving a document.
/// </summary>
public class HandleDocumentWarnings : IWarningCallback
{
    public void Warning(WarningInfo info)
    {
        if (info.WarningType == WarningType.MinorFormattingLoss)
        {
            Console.WriteLine("Unsupported operation: " + info.Description);
            Warnings.Warning(info);
        }
    }

    public WarningInfoCollection Warnings = new WarningInfoCollection();
}
```

### See Also

* namespace [Aspose.Words](../../aspose.words/)
* assembly [Aspose.Words](../../)
