---
title: DocumentPartSavingArgs.KeepDocumentPartStreamOpen
linktitle: KeepDocumentPartStreamOpen
articleTitle: KeepDocumentPartStreamOpen
second_title: Aspose.Words for .NET
description: Discover how the KeepDocumentPartStreamOpen property in DocumentPartSavingArgs lets Aspose.Words manage document part streams efficiently for optimal performance.
type: docs
weight: 40
url: /net/aspose.words.saving/documentpartsavingargs/keepdocumentpartstreamopen/
---
## DocumentPartSavingArgs.KeepDocumentPartStreamOpen property

Specifies whether Aspose.Words should keep the stream open or close it after saving a document part.

```csharp
public bool KeepDocumentPartStreamOpen { get; set; }
```

## Remarks

Default is `false` and Aspose.Words will close the stream you provided in the [`DocumentPartStream`](../documentpartstream/) property after writing a document part into it. Specify `true` to keep the stream open. Please note that the main output stream provided in the call to [`Save`](../../../aspose.words/document/save/) or [`Save`](../../../aspose.words/document/save/) will never be closed by Aspose.Words even if `KeepDocumentPartStreamOpen` is set to `false`.

## Examples

Shows how to split a document into parts and save them.

```csharp
public void DocumentPartsFileNames()
{
    Document doc = new Document(MyDir + "Rendering.docx");
    string outFileName = "SavingCallback.DocumentPartsFileNames.html";

    // Create an "HtmlFixedSaveOptions" object, which we can pass to the document's "Save" method
    // to modify how we convert the document to HTML.
    HtmlSaveOptions options = new HtmlSaveOptions();

    // If we save the document normally, there will be one output HTML
    // document with all the source document's contents.
    // Set the "DocumentSplitCriteria" property to "DocumentSplitCriteria.SectionBreak" to
    // save our document to multiple HTML files: one for each section.
    options.DocumentSplitCriteria = DocumentSplitCriteria.SectionBreak;

    // Assign a custom callback to the "DocumentPartSavingCallback" property to alter the document part saving logic.
    options.DocumentPartSavingCallback = new SavedDocumentPartRename(outFileName, options.DocumentSplitCriteria);

    // If we convert a document that contains images into html, we will end up with one html file which links to several images.
    // Each image will be in the form of a file in the local file system.
    // There is also a callback that can customize the name and file system location of each image.
    options.ImageSavingCallback = new SavedImageRename(outFileName);

    doc.Save(ArtifactsDir + outFileName, options);
}

/// <summary>
/// Sets custom filenames for output documents that the saving operation splits a document into.
/// </summary>
private class SavedDocumentPartRename : IDocumentPartSavingCallback
{
    public SavedDocumentPartRename(string outFileName, DocumentSplitCriteria documentSplitCriteria)
    {
        mOutFileName = outFileName;
        mDocumentSplitCriteria = documentSplitCriteria;
    }

    void IDocumentPartSavingCallback.DocumentPartSaving(DocumentPartSavingArgs args)
    {
        // We can access the entire source document via the "Document" property.
        Assert.That(args.Document.OriginalFileName.EndsWith("Rendering.docx"), Is.True);

        string partType = string.Empty;

        switch (mDocumentSplitCriteria)
        {
            case DocumentSplitCriteria.PageBreak:
                partType = "Page";
                break;
            case DocumentSplitCriteria.ColumnBreak:
                partType = "Column";
                break;
            case DocumentSplitCriteria.SectionBreak:
                partType = "Section";
                break;
            case DocumentSplitCriteria.HeadingParagraph:
                partType = "Paragraph from heading";
                break;
        }

        string partFileName = $"{mOutFileName} part {++mCount}, of type {partType}{Path.GetExtension(args.DocumentPartFileName)}";

        // Below are two ways of specifying where Aspose.Words will save each part of the document.
        // 1 -  Set a filename for the output part file:
        args.DocumentPartFileName = partFileName;

        // 2 -  Create a custom stream for the output part file:
        args.DocumentPartStream = new FileStream(ArtifactsDir + partFileName, FileMode.Create);

        Assert.That(args.DocumentPartStream.CanWrite, Is.True);
        Assert.That(args.KeepDocumentPartStreamOpen, Is.False);
    }

    private int mCount;
    private readonly string mOutFileName;
    private readonly DocumentSplitCriteria mDocumentSplitCriteria;
}

/// <summary>
/// Sets custom filenames for image files that an HTML conversion creates.
/// </summary>
public class SavedImageRename : IImageSavingCallback
{
    public SavedImageRename(string outFileName)
    {
        mOutFileName = outFileName;
    }

    void IImageSavingCallback.ImageSaving(ImageSavingArgs args)
    {
        string imageFileName = $"{mOutFileName} shape {++mCount}, of type {args.CurrentShape.ShapeType}{Path.GetExtension(args.ImageFileName)}";

        // Below are two ways of specifying where Aspose.Words will save each part of the document.
        // 1 -  Set a filename for the output image file:
        args.ImageFileName = imageFileName;

        // 2 -  Create a custom stream for the output image file:
        args.ImageStream = new FileStream(ArtifactsDir + imageFileName, FileMode.Create);

        Assert.That(args.ImageStream.CanWrite, Is.True);
        Assert.That(args.IsImageAvailable, Is.True);
        Assert.That(args.KeepImageStreamOpen, Is.False);
    }

    private int mCount;
    private readonly string mOutFileName;
}
```

### See Also

* class [DocumentPartSavingArgs](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
