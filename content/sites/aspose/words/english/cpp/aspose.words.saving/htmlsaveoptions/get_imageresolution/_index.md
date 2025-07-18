---
title: Aspose::Words::Saving::HtmlSaveOptions::get_ImageResolution method
linktitle: get_ImageResolution
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Saving::HtmlSaveOptions::get_ImageResolution method. Specifies the output resolution for images when exporting to HTML, MHTML or EPUB. Default is %96 dpi in C++.'
type: docs
weight: 36000
url: /cpp/aspose.words.saving/htmlsaveoptions/get_imageresolution/
---
## HtmlSaveOptions::get_ImageResolution method


Specifies the output resolution for images when exporting to HTML, MHTML or EPUB. Default is **%96 dpi**.

```cpp
int32_t Aspose::Words::Saving::HtmlSaveOptions::get_ImageResolution() const
```

## Remarks


This property effects raster images when [ScaleImageToShapeSize](../get_scaleimagetoshapesize/) is **true** and effects metafiles exported as raster images. Some image properties such as cropping or rotation require saving transformed images and in this case transformed images are created in the given resolution.

## Examples



Shows how to set folders and folder aliases for externally saved resources that Aspose.Words will create when saving a document to HTML. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Rendering.docx");

auto options = System::MakeObject<Aspose::Words::Saving::HtmlSaveOptions>();
options->set_CssStyleSheetType(Aspose::Words::Saving::CssStyleSheetType::External);
options->set_ExportFontResources(true);
options->set_ImageResolution(72);
options->set_FontResourcesSubsettingSizeThreshold(0);
options->set_FontsFolder(get_ArtifactsDir() + u"Fonts");
options->set_ImagesFolder(get_ArtifactsDir() + u"Images");
options->set_ResourceFolder(get_ArtifactsDir() + u"Resources");
options->set_FontsFolderAlias(u"http://example.com/fonts");
options->set_ImagesFolderAlias(u"http://example.com/images");
options->set_ResourceFolderAlias(u"http://example.com/resources");
options->set_ExportOriginalUrlForLinkedImages(true);

doc->Save(get_ArtifactsDir() + u"HtmlSaveOptions.FolderAlias.html", options);
```

## See Also

* Class [HtmlSaveOptions](../)
* Namespace [Aspose::Words::Saving](../../)
* Library [Aspose.Words for C++](../../../)
