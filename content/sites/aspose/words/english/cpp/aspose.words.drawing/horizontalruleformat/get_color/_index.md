---
title: Aspose::Words::Drawing::HorizontalRuleFormat::get_Color method
linktitle: get_Color
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Drawing::HorizontalRuleFormat::get_Color method. Gets or sets the brush color that fills the horizontal rule in C++.'
type: docs
weight: 3000
url: /cpp/aspose.words.drawing/horizontalruleformat/get_color/
---
## HorizontalRuleFormat::get_Color method


Gets or sets the brush color that fills the horizontal rule.

```cpp
System::Drawing::Color Aspose::Words::Drawing::HorizontalRuleFormat::get_Color()
```

## Remarks


This is a shortcut to the [Color](../../fill/get_color/) property.

The default value is **Gray**.

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

* Class [HorizontalRuleFormat](../)
* Namespace [Aspose::Words::Drawing](../../)
* Library [Aspose.Words for C++](../../../)
