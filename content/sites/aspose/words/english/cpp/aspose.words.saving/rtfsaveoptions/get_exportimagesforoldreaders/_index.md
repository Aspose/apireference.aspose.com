---
title: Aspose::Words::Saving::RtfSaveOptions::get_ExportImagesForOldReaders method
linktitle: get_ExportImagesForOldReaders
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Saving::RtfSaveOptions::get_ExportImagesForOldReaders method. Specifies whether the keywords for "old readers" are written to RTF or not. This can significantly affect the size of the RTF document. Default value is true in C++.'
type: docs
weight: 4000
url: /cpp/aspose.words.saving/rtfsaveoptions/get_exportimagesforoldreaders/
---
## RtfSaveOptions::get_ExportImagesForOldReaders method


Specifies whether the keywords for "old readers" are written to RTF or not. This can significantly affect the size of the RTF document. Default value is **true**.

```cpp
bool Aspose::Words::Saving::RtfSaveOptions::get_ExportImagesForOldReaders() const
```

## Remarks


"Old readers" are pre-Microsoft Word 97 applications and also WordPad. When this option is **true** Aspose.Words writes additional RTF keywords. These keywords allow the document to be displayed correctly when opened in an "old reader" application, but can significantly increase the size of the document.

If you set this option to **false**, then only images in WMF, EMF and BMP formats will be displayed in "old readers".

## Examples



Shows how to save a document to .rtf with custom options. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Rendering.docx");

// Create an "RtfSaveOptions" object to pass to the document's "Save" method to modify how we save it to an RTF.
auto options = System::MakeObject<Aspose::Words::Saving::RtfSaveOptions>();

ASSERT_EQ(Aspose::Words::SaveFormat::Rtf, options->get_SaveFormat());

// Set the "ExportCompactSize" property to "true" to
// reduce the saved document's size at the cost of right-to-left text compatibility.
options->set_ExportCompactSize(true);

// Set the "ExportImagesFotOldReaders" property to "true" to use extra keywords to ensure that our document is
// compatible with pre-Microsoft Word 97 readers and WordPad.
// Set the "ExportImagesFotOldReaders" property to "false" to reduce the size of the document,
// but prevent old readers from being able to read any non-metafile or BMP images that the document may contain.
options->set_ExportImagesForOldReaders(exportImagesForOldReaders);

doc->Save(get_ArtifactsDir() + u"RtfSaveOptions.ExportImages.rtf", options);
```

## See Also

* Class [RtfSaveOptions](../)
* Namespace [Aspose::Words::Saving](../../)
* Library [Aspose.Words for C++](../../../)
