---
title: Aspose::Words::Saving::MarkdownSaveOptions::get_ImagesFolder method
linktitle: get_ImagesFolder
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Saving::MarkdownSaveOptions::get_ImagesFolder method. Specifies the physical folder where images are saved when exporting a document to the Markdown format. Default is an empty string in C++.'
type: docs
weight: 5000
url: /cpp/aspose.words.saving/markdownsaveoptions/get_imagesfolder/
---
## MarkdownSaveOptions::get_ImagesFolder method


Specifies the physical folder where images are saved when exporting a document to the [Markdown](../../../aspose.words/saveformat/) format. Default is an empty string.

```cpp
System::String Aspose::Words::Saving::MarkdownSaveOptions::get_ImagesFolder() const
```

## Remarks


When you save a [Document](../../../aspose.words/document/) in [Markdown](../../../aspose.words/saveformat/) format, Aspose.Words needs to save all images embedded in the document as standalone files. [ImagesFolder](./) allows you to specify where the images will be saved.

If you save a document into a file and provide a file name, Aspose.Words, by default, saves the images in the same folder where the document file is saved. Use [ImagesFolder](./) to override this behavior.

If you save a document into a stream, Aspose.Words does not have a folder where to save the images, but still needs to save the images somewhere. In this case, you need to specify an accessible folder in the [ImagesFolder](./) property.

If the folder specified by [ImagesFolder](./) doesn't exist, it will be created automatically.

## Examples



Shows how to specifies the name of the folder used to construct image URIs. 
```cpp
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>();

builder->Writeln(u"Some image below:");
builder->InsertImage(get_ImageDir() + u"Logo.jpg");

System::String imagesFolder = System::IO::Path::Combine(get_ArtifactsDir(), u"ImagesDir");
auto saveOptions = System::MakeObject<Aspose::Words::Saving::MarkdownSaveOptions>();
// Use the "ImagesFolder" property to assign a folder in the local file system into which
// Aspose.Words will save all the document's linked images.
saveOptions->set_ImagesFolder(imagesFolder);
// Use the "ImagesFolderAlias" property to use this folder
// when constructing image URIs instead of the images folder's name.
saveOptions->set_ImagesFolderAlias(u"http://example.com/images");

builder->get_Document()->Save(get_ArtifactsDir() + u"MarkdownSaveOptions.ImagesFolder.md", saveOptions);
```

## See Also

* Class [MarkdownSaveOptions](../)
* Namespace [Aspose::Words::Saving](../../)
* Library [Aspose.Words for C++](../../../)
