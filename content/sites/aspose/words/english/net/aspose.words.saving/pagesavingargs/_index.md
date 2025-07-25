---
title: PageSavingArgs Class
linktitle: PageSavingArgs
articleTitle: PageSavingArgs
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Saving.PageSavingArgs class, essential for optimizing document processing with detailed PageSaving event data. Enhance your workflow!
type: docs
weight: 6160
url: /net/aspose.words.saving/pagesavingargs/
---
## PageSavingArgs class

Provides data for the [`PageSaving`](../ipagesavingcallback/pagesaving/) event.

To learn more, visit the [Programming with Documents](https://docs.aspose.com/words/net/programming-with-documents/) documentation article.

```csharp
public class PageSavingArgs
```

## Constructors

| Name | Description |
| --- | --- |
| [PageSavingArgs](pagesavingargs/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [KeepPageStreamOpen](../../aspose.words.saving/pagesavingargs/keeppagestreamopen/) { get; set; } | Specifies whether Aspose.Words should keep the stream open or close it after saving a document page. |
| [PageFileName](../../aspose.words.saving/pagesavingargs/pagefilename/) { get; set; } | Gets or sets the file name where the document page will be saved to. |
| [PageIndex](../../aspose.words.saving/pagesavingargs/pageindex/) { get; } | Current page index. |
| [PageStream](../../aspose.words.saving/pagesavingargs/pagestream/) { get; set; } | Allows to specify the stream where the document page will be saved to. |

## Examples

Shows how to use a callback to save a document to HTML page by page.

```csharp
public void PageFileNames()
{
    Document doc = new Document();
    DocumentBuilder builder = new DocumentBuilder(doc);

    builder.Writeln("Page 1.");
    builder.InsertBreak(BreakType.PageBreak);
    builder.Writeln("Page 2.");
    builder.InsertImage(ImageDir + "Logo.jpg");
    builder.InsertBreak(BreakType.PageBreak);
    builder.Writeln("Page 3.");

    // Create an "HtmlFixedSaveOptions" object, which we can pass to the document's "Save" method
    // to modify how we convert the document to HTML.
    HtmlFixedSaveOptions htmlFixedSaveOptions = new HtmlFixedSaveOptions();

    // We will save each page in this document to a separate HTML file in the local file system.
    // Set a callback that allows us to name each output HTML document.
    htmlFixedSaveOptions.PageSavingCallback = new CustomFileNamePageSavingCallback();

    doc.Save(ArtifactsDir + "SavingCallback.PageFileNames.html", htmlFixedSaveOptions);

    string[] filePaths = Directory.GetFiles(ArtifactsDir).Where(
        s => s.StartsWith(ArtifactsDir + "SavingCallback.PageFileNames.Page_")).OrderBy(s => s).ToArray();

    Assert.That(filePaths.Length, Is.EqualTo(3));
}

/// <summary>
/// Saves all pages to a file and directory specified within.
/// </summary>
private class CustomFileNamePageSavingCallback : IPageSavingCallback
{
    public void PageSaving(PageSavingArgs args)
    {
        string outFileName = $"{ArtifactsDir}SavingCallback.PageFileNames.Page_{args.PageIndex}.html";

        // Below are two ways of specifying where Aspose.Words will save each page of the document.
        // 1 -  Set a filename for the output page file:
        args.PageFileName = outFileName;

        // 2 -  Create a custom stream for the output page file:
        args.PageStream = new FileStream(outFileName, FileMode.Create);

        Assert.That(args.KeepPageStreamOpen, Is.False);
    }
}
```

### See Also

* namespace [Aspose.Words.Saving](../../aspose.words.saving/)
* assembly [Aspose.Words](../../)
