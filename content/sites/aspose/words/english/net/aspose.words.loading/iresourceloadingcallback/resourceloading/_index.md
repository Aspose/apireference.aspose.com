---
title: IResourceLoadingCallback.ResourceLoading
linktitle: ResourceLoading
articleTitle: ResourceLoading
second_title: Aspose.Words for .NET
description: Discover how the IResourceLoadingCallback enhances Aspose.Words by efficiently managing external resource loading for seamless document processing.
type: docs
weight: 10
url: /net/aspose.words.loading/iresourceloadingcallback/resourceloading/
---
## IResourceLoadingCallback.ResourceLoading method

Called when Aspose.Words loads any external resource.

```csharp
public ResourceLoadingAction ResourceLoading(ResourceLoadingArgs args)
```

## Examples

Shows how to customize the process of loading external resources into a document.

```csharp
public void ResourceLoadingCallback()
{
    Document doc = new Document();
    doc.ResourceLoadingCallback = new ImageNameHandler();

    DocumentBuilder builder = new DocumentBuilder(doc);

    // Images usually are inserted using a URI, or a byte array.
    // Every instance of a resource load will call our callback's ResourceLoading method.
    builder.InsertImage("Google logo");
    builder.InsertImage("Aspose logo");
    builder.InsertImage("Watermark");

    Assert.That(doc.GetChildNodes(NodeType.Shape, true).Count, Is.EqualTo(3));

    doc.Save(ArtifactsDir + "DocumentBase.ResourceLoadingCallback.docx");
}

/// <summary>
/// Allows us to load images into a document using predefined shorthands, as opposed to URIs.
/// This will separate image loading logic from the rest of the document construction.
/// </summary>
private class ImageNameHandler : IResourceLoadingCallback
{
    public ResourceLoadingAction ResourceLoading(ResourceLoadingArgs args)
    {
        // If this callback encounters one of the image shorthands while loading an image,
        // it will apply unique logic for each defined shorthand instead of treating it as a URI.
        if (args.ResourceType == ResourceType.Image)
            switch (args.OriginalUri)
            {
                case "Google logo":
                    using (HttpClient client = new HttpClient())
                    {
                        byte[] imageData = client.GetByteArrayAsync("http://www.google.com/images/logos/ps_logo2.png").GetAwaiter().GetResult();
                        args.SetData(imageData);
                    }

                    return ResourceLoadingAction.UserProvided;

                case "Aspose logo":
                    args.SetData(File.ReadAllBytes(ImageDir + "Logo.jpg"));

                    return ResourceLoadingAction.UserProvided;

                case "Watermark":
                    args.SetData(File.ReadAllBytes(ImageDir + "Transparent background logo.png"));

                    return ResourceLoadingAction.UserProvided;
            }

        return ResourceLoadingAction.Default;
    }
}
```

### See Also

* enum [ResourceLoadingAction](../../resourceloadingaction/)
* class [ResourceLoadingArgs](../../resourceloadingargs/)
* interface [IResourceLoadingCallback](../)
* namespace [Aspose.Words.Loading](../../../aspose.words.loading/)
* assembly [Aspose.Words](../../../)
