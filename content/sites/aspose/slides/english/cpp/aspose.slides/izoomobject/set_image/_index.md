---
title: set_Image()
second_title: Aspose.Slides for C++ API Reference
description: Sets image for zoom object. Write IPPImage.
type: docs
weight: 92
url: /cpp/aspose.slides/izoomobject/set_image/
---
## IZoomObject::set_Image(System::SharedPtr\<IPPImage\>) method


Sets image for zoom object. Write [IPPImage](../../ippimage/).

```cpp
virtual void Aspose::Slides::IZoomObject::set_Image(System::SharedPtr<IPPImage> value)=0
```

## Remarks


The example demonstrates changing an image of a Zoom object: 
```cpp
auto pres = System::MakeObject<Presentation>(u"pres.pptx");
auto shapes = pres->get_Slides()->idx_get(0)->get_Shapes();

auto zoomFrame = shapes->AddZoomFrame(150.0f, 20.0f, 50.0f, 50.0f, pres->get_Slides()->idx_get(1));
auto image = pres->get_Images()->AddImage(Image::FromFile(u"image.png"));
zoomFrame->set_Image(image);
```

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPPImage](../../ippimage/)
* Class [IZoomObject](../)
* Namespace [Aspose::Slides](../../)
* Library [Aspose.Slides](../../../)