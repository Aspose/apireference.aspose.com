---
title: Aspose::Words::Drawing::HorizontalRuleFormat class
linktitle: HorizontalRuleFormat
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Drawing::HorizontalRuleFormat class. Represents horizontal rule formatting. To learn more, visit the  documentation article in C++.'
type: docs
weight: 5000
url: /cpp/aspose.words.drawing/horizontalruleformat/
---
## HorizontalRuleFormat class


Represents horizontal rule formatting. To learn more, visit the [Working with Shapes](https://docs.aspose.com/words/cpp/working-with-shapes/) documentation article.

```cpp
class HorizontalRuleFormat : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_Alignment](./get_alignment/)() | Gets or sets the alignment of the horizontal rule. |
| [get_Color](./get_color/)() | Gets or sets the brush color that fills the horizontal rule. |
| [get_Height](./get_height/)() | Gets or sets the height of the horizontal rule. |
| [get_NoShade](./get_noshade/)() | Indicates the presence of 3D shading for the horizontal rule. If **true**, then the horizontal rule is without 3D shading and solid color is used. |
| [get_WidthPercent](./get_widthpercent/)() | Gets or sets the length of the specified horizontal rule expressed as a percentage of the window width. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [set_Alignment](./set_alignment/)(Aspose::Words::Drawing::HorizontalRuleAlignment) | Setter for [Aspose::Words::Drawing::HorizontalRuleFormat::get_Alignment](./get_alignment/). |
| [set_Color](./set_color/)(System::Drawing::Color) | Setter for [Aspose::Words::Drawing::HorizontalRuleFormat::get_Color](./get_color/). |
| [set_Height](./set_height/)(double) | Setter for [Aspose::Words::Drawing::HorizontalRuleFormat::get_Height](./get_height/). |
| [set_NoShade](./set_noshade/)(bool) | Setter for [Aspose::Words::Drawing::HorizontalRuleFormat::get_NoShade](./get_noshade/). |
| [set_WidthPercent](./set_widthpercent/)(double) | Setter for [Aspose::Words::Drawing::HorizontalRuleFormat::get_WidthPercent](./get_widthpercent/). |
| static [Type](./type/)() |  |

## Examples



Shows how to insert a horizontal rule shape, and customize its formatting. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);
System::SharedPtr<Aspose::Words::Drawing::Shape> shape = builder->InsertHorizontalRule();

System::SharedPtr<Aspose::Words::Drawing::HorizontalRuleFormat> horizontalRuleFormat = shape->get_HorizontalRuleFormat();
horizontalRuleFormat->set_Alignment(Aspose::Words::Drawing::HorizontalRuleAlignment::Center);
horizontalRuleFormat->set_WidthPercent(70);
horizontalRuleFormat->set_Height(3);
horizontalRuleFormat->set_Color(System::Drawing::Color::get_Blue());
horizontalRuleFormat->set_NoShade(true);

ASSERT_TRUE(shape->get_IsHorizontalRule());
ASSERT_TRUE(shape->get_HorizontalRuleFormat()->get_NoShade());
```

## See Also

* Namespace [Aspose::Words::Drawing](../)
* Library [Aspose.Words for C++](../../)
