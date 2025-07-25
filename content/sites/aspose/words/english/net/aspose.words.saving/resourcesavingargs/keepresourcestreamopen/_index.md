---
title: ResourceSavingArgs.KeepResourceStreamOpen
linktitle: KeepResourceStreamOpen
articleTitle: KeepResourceStreamOpen
second_title: Aspose.Words for .NET
description: Discover how the KeepResourceStreamOpen property in ResourceSavingArgs enhances Aspose.Words by managing stream efficiency during resource saving.
type: docs
weight: 20
url: /net/aspose.words.saving/resourcesavingargs/keepresourcestreamopen/
---
## ResourceSavingArgs.KeepResourceStreamOpen property

Specifies whether Aspose.Words should keep the stream open or close it after saving a resource.

```csharp
public bool KeepResourceStreamOpen { get; set; }
```

## Remarks

Default is `false` and Aspose.Words will close the stream you provided in the [`ResourceStream`](../resourcestream/) property after writing a resource into it. Specify `true` to keep the stream open.

## Examples

Shows how to use a callback to print the URIs of external resources created while converting a document to HTML.

```csharp
public void HtmlFixedResourceFolder()
{
    Document doc = new Document(MyDir + "Rendering.docx");

    ResourceUriPrinter callback = new ResourceUriPrinter();

    HtmlFixedSaveOptions options = new HtmlFixedSaveOptions
    {
        SaveFormat = SaveFormat.HtmlFixed,
        ExportEmbeddedImages = false,
        ResourcesFolder = ArtifactsDir + "HtmlFixedResourceFolder",
        ResourcesFolderAlias = ArtifactsDir + "HtmlFixedResourceFolderAlias",
        ShowPageBorder = false,
        ResourceSavingCallback = callback
    };

    // A folder specified by ResourcesFolderAlias will contain the resources instead of ResourcesFolder.
    // We must ensure the folder exists before the streams can put their resources into it.
    Directory.CreateDirectory(options.ResourcesFolderAlias);

    doc.Save(ArtifactsDir + "HtmlFixedSaveOptions.HtmlFixedResourceFolder.html", options);

    Console.WriteLine(callback.GetText());

    string[] resourceFiles = Directory.GetFiles(ArtifactsDir + "HtmlFixedResourceFolderAlias");

    Assert.That(Directory.Exists(ArtifactsDir + "HtmlFixedResourceFolder"), Is.False);
    Assert.That(resourceFiles.Count(f => f.EndsWith(".jpeg") || f.EndsWith(".png") || f.EndsWith(".css")), Is.EqualTo(6));
}

/// <summary>
/// Counts and prints URIs of resources contained by as they are converted to fixed HTML.
/// </summary>
private class ResourceUriPrinter : IResourceSavingCallback
{
    void IResourceSavingCallback.ResourceSaving(ResourceSavingArgs args)
    {
        // If we set a folder alias in the SaveOptions object, we will be able to print it from here.
        mText.AppendLine($"Resource #{++mSavedResourceCount} \"{args.ResourceFileName}\"");

        string extension = Path.GetExtension(args.ResourceFileName);
        switch (extension)
        {
            case ".ttf":
            case ".woff":
            {
                // By default, 'ResourceFileUri' uses system folder for fonts.
                // To avoid problems in other platforms you must explicitly specify the path for the fonts.
                args.ResourceFileUri = ArtifactsDir + Path.DirectorySeparatorChar + args.ResourceFileName;
                break;
            }
        }

        mText.AppendLine("\t" + args.ResourceFileUri);

        // If we have specified a folder in the "ResourcesFolderAlias" property,
        // we will also need to redirect each stream to put its resource in that folder.
        args.ResourceStream = new FileStream(args.ResourceFileUri, FileMode.Create);
        args.KeepResourceStreamOpen = false;
    }

    public string GetText()
    {
        return mText.ToString();
    }

    private int mSavedResourceCount;
    private readonly StringBuilder mText = new StringBuilder();
}
```

### See Also

* class [ResourceSavingArgs](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
