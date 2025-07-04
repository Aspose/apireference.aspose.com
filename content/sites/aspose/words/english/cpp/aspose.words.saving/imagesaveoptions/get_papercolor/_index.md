---
title: Aspose::Words::Saving::ImageSaveOptions::get_PaperColor method
linktitle: get_PaperColor
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Saving::ImageSaveOptions::get_PaperColor method. Gets or sets the background (paper) color for the generated images. The default value is White in C++.'
type: docs
weight: 11000
url: /cpp/aspose.words.saving/imagesaveoptions/get_papercolor/
---
## ImageSaveOptions::get_PaperColor method


Gets or sets the background (paper) color for the generated images. The default value is **White**.

```cpp
System::Drawing::Color Aspose::Words::Saving::ImageSaveOptions::get_PaperColor()
```

## Remarks


When rendering pages of a document that specifies its own background color, then the document background color will override the color specified by this property.

## Examples



Renders a page of a Word document into an image with transparent or colored background. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

builder->get_Font()->set_Name(u"Times New Roman");
builder->get_Font()->set_Size(24);
builder->Writeln(u"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

builder->InsertImage(get_ImageDir() + u"Logo.jpg");

// Create an "ImageSaveOptions" object which we can pass to the document's "Save" method
// to modify the way in which that method renders the document into an image.
auto imgOptions = System::MakeObject<Aspose::Words::Saving::ImageSaveOptions>(Aspose::Words::SaveFormat::Png);
// Set the "PaperColor" property to a transparent color to apply a transparent
// background to the document while rendering it to an image.
imgOptions->set_PaperColor(System::Drawing::Color::get_Transparent());

doc->Save(get_ArtifactsDir() + u"ImageSaveOptions.PaperColor.Transparent.png", imgOptions);

// Set the "PaperColor" property to an opaque color to apply that color
// as the background of the document as we render it to an image.
imgOptions->set_PaperColor(System::Drawing::Color::get_LightCoral());

doc->Save(get_ArtifactsDir() + u"ImageSaveOptions.PaperColor.LightCoral.png", imgOptions);
```

## See Also

* Class [ImageSaveOptions](../)
* Namespace [Aspose::Words::Saving](../../)
* Library [Aspose.Words for C++](../../../)
