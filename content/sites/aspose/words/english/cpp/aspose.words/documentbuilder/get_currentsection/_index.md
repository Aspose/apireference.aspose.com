---
title: Aspose::Words::DocumentBuilder::get_CurrentSection method
linktitle: get_CurrentSection
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::DocumentBuilder::get_CurrentSection method. Gets the section that is currently selected in this DocumentBuilder in C++.'
type: docs
weight: 13000
url: /cpp/aspose.words/documentbuilder/get_currentsection/
---
## DocumentBuilder::get_CurrentSection method


Gets the section that is currently selected in this [DocumentBuilder](../).

```cpp
System::SharedPtr<Aspose::Words::Section> Aspose::Words::DocumentBuilder::get_CurrentSection()
```


## Examples



Shows how to insert a floating image, and specify its position and size. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

System::SharedPtr<Aspose::Words::Drawing::Shape> shape = builder->InsertImage(get_ImageDir() + u"Logo.jpg");
shape->set_WrapType(Aspose::Words::Drawing::WrapType::None);

// Configure the shape's "RelativeHorizontalPosition" property to treat the value of the "Left" property
// as the shape's horizontal distance, in points, from the left side of the page.
shape->set_RelativeHorizontalPosition(Aspose::Words::Drawing::RelativeHorizontalPosition::Page);

// Set the shape's horizontal distance from the left side of the page to 100.
shape->set_Left(100);

// Use the "RelativeVerticalPosition" property in a similar way to position the shape 80pt below the top of the page.
shape->set_RelativeVerticalPosition(Aspose::Words::Drawing::RelativeVerticalPosition::Page);
shape->set_Top(80);

// Set the shape's height, which will automatically scale the width to preserve dimensions.
shape->set_Height(125);

ASPOSE_ASSERT_EQ(125.0, shape->get_Width());

// The "Bottom" and "Right" properties contain the bottom and right edges of the image.
ASPOSE_ASSERT_EQ(shape->get_Top() + shape->get_Height(), shape->get_Bottom());
ASPOSE_ASSERT_EQ(shape->get_Left() + shape->get_Width(), shape->get_Right());

doc->Save(get_ArtifactsDir() + u"Image.CreateFloatingPositionSize.docx");
```

## See Also

* Class [Section](../../section/)
* Class [DocumentBuilder](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
