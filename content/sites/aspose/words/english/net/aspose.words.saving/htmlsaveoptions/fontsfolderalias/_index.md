---
title: HtmlSaveOptions.FontsFolderAlias
linktitle: FontsFolderAlias
articleTitle: FontsFolderAlias
second_title: Aspose.Words for .NET
description: Discover the HtmlSaveOptions FontsFolderAlias property to customize font URIs in your HTML documents. Enhance your web design with ease!
type: docs
weight: 320
url: /net/aspose.words.saving/htmlsaveoptions/fontsfolderalias/
---
## HtmlSaveOptions.FontsFolderAlias property

Specifies the name of the folder used to construct font URIs written into an HTML document. Default is an empty string.

```csharp
public string FontsFolderAlias { get; set; }
```

## Remarks

When you save a [`Document`](../../../aspose.words/document/) in HTML format and [`ExportFontResources`](../exportfontresources/) is set to `true`, Aspose.Words needs to save fonts used in the document as standalone files. [`FontsFolder`](../fontsfolder/) allows you to specify where the fonts will be saved and `FontsFolderAlias` allows to specify how the font URIs will be constructed.

If `FontsFolderAlias` is not an empty string, then the font URI written to HTML will be FontsFolderAlias + &lt;font file name&gt;.

If `FontsFolderAlias` is an empty string, then the font URI written to HTML will be FontsFolder + &lt;font file name&gt;.

If `FontsFolderAlias` is set to '.' (dot), then the font file name will be written to HTML without path regardless of other options.

Alternative way to specify the name of the folder to construct font URIs is to use [`ResourceFolderAlias`](../resourcefolderalias/).

## Examples

Shows how to set folders and folder aliases for externally saved resources that Aspose.Words will create when saving a document to HTML.

```csharp
Document doc = new Document(MyDir + "Rendering.docx");

HtmlSaveOptions options = new HtmlSaveOptions
{
    CssStyleSheetType = CssStyleSheetType.External,
    ExportFontResources = true,
    ImageResolution = 72,
    FontResourcesSubsettingSizeThreshold = 0,
    FontsFolder = ArtifactsDir + "Fonts",
    ImagesFolder = ArtifactsDir + "Images",
    ResourceFolder = ArtifactsDir + "Resources",
    FontsFolderAlias = "http://example.com/fonts",
    ImagesFolderAlias = "http://example.com/images",
    ResourceFolderAlias = "http://example.com/resources",
    ExportOriginalUrlForLinkedImages = true
};

doc.Save(ArtifactsDir + "HtmlSaveOptions.FolderAlias.html", options);
```

### See Also

* class [HtmlSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
