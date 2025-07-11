---
title: Aspose::Words::Drawing::GlowFormat class
linktitle: GlowFormat
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Drawing::GlowFormat class. Represents the glow formatting for an object in C++.'
type: docs
weight: 1500
url: /cpp/aspose.words.drawing/glowformat/
---
## GlowFormat class


Represents the glow formatting for an object.

```cpp
class GlowFormat : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_Color](./get_color/)() | Gets or sets a **Color** object that represents the color for a glow effect. The default value is **Black**. |
| [get_Radius](./get_radius/)() | Gets or sets a double value that represents the length of the radius for a glow effect in points (pt). The default value is 0.0. |
| [get_Transparency](./get_transparency/)() | Gets or sets the degree of transparency for the glow effect as a value between 0.0 (opaque) and 1.0 (clear). The default value is 0.0. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [Remove](./remove/)() | Removes [GlowFormat](./) from the parent object. |
| [set_Color](./set_color/)(System::Drawing::Color) | Setter for [Aspose::Words::Drawing::GlowFormat::get_Color](./get_color/). |
| [set_Radius](./set_radius/)(double) | Setter for [Aspose::Words::Drawing::GlowFormat::get_Radius](./get_radius/). |
| [set_Transparency](./set_transparency/)(double) | Setter for [Aspose::Words::Drawing::GlowFormat::get_Transparency](./get_transparency/). |
| static [Type](./type/)() |  |
## Remarks


Use the [Glow](../shapebase/get_glow/) property to access glow properties of an object. You do not create instances of the [GlowFormat](./) class directly.

## Examples



Shows how to interact with glow shape effect. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Various shapes.docx");
auto shape = System::ExplicitCast<Aspose::Words::Drawing::Shape>(doc->GetChild(Aspose::Words::NodeType::Shape, 0, true));

shape->get_Glow()->set_Color(System::Drawing::Color::get_Salmon());
shape->get_Glow()->set_Radius(30);
shape->get_Glow()->set_Transparency(0.15);

doc->Save(get_ArtifactsDir() + u"Shape.Glow.docx");

doc = System::MakeObject<Aspose::Words::Document>(get_ArtifactsDir() + u"Shape.Glow.docx");
shape = System::ExplicitCast<Aspose::Words::Drawing::Shape>(doc->GetChild(Aspose::Words::NodeType::Shape, 0, true));

ASSERT_EQ(System::Drawing::Color::FromArgb(217, 250, 128, 114).ToArgb(), shape->get_Glow()->get_Color().ToArgb());
ASPOSE_ASSERT_EQ(30, shape->get_Glow()->get_Radius());
ASSERT_NEAR(0.15, shape->get_Glow()->get_Transparency(), 0.01);

shape->get_Glow()->Remove();

ASSERT_EQ(System::Drawing::Color::get_Black().ToArgb(), shape->get_Glow()->get_Color().ToArgb());
ASPOSE_ASSERT_EQ(0, shape->get_Glow()->get_Radius());
ASPOSE_ASSERT_EQ(0, shape->get_Glow()->get_Transparency());
```

## See Also

* Namespace [Aspose::Words::Drawing](../)
* Library [Aspose.Words for C++](../../)
