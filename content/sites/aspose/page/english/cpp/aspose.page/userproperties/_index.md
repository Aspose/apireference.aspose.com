---
title: Aspose::Page::UserProperties class
linktitle: UserProperties
second_title: Aspose.Page for C++
description: 'Aspose::Page::UserProperties class. Special property class which allows typed properties to be set and returned. It also allows the hookup of two default property objects to be searched if this property object does not contain the property in C++.'
type: docs
weight: 1500
url: /cpp/aspose.page/userproperties/
---
## UserProperties class


Special property class which allows typed properties to be set and returned. It also allows the hookup of two default property objects to be searched if this property object does not contain the property.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Methods

| Method | Description |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Gets string property value. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Gets string property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Gets color property value. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Gets color property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Gets double property value. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Gets double property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Gets float property value. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Gets float property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Gets integer property value. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Gets integer property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Gets margins property value. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Gets margins property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Gets matrix property value. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Gets matrix property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Gets rectangle property value. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Gets rectangle property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Gets size property value. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Gets size property value. If requested property is absent, returns provided default value. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Gets string array property value. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Gets string array property value. If requested property is absent, returns provided default value. |
| virtual [IsProperty](./isproperty/)(System::String) | Gets boolean property value. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Gets boolean property value. If requested property is absent, returns provided default value. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Returns properties names. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Copies properties, including its defaults into this [UserProperties](./). |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Sets string property value. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Sets string array property value. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Sets string array property value in specified properties table. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Sets color property value. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Sets color property value in specified properties table. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Sets rectangle property value. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Sets rectangle property value in specified properties table. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Sets margins property value. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Sets margins property value in specified properties table. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Sets size property value. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Sets size property value in specified properties table. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Sets integer property value. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Sets integer property value in specified properties table. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Sets double property value. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Sets double property value in specified properties table. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Sets float property value. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Sets float property value in specified properties table. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Sets boolean property value. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Sets boolean property value in specified properties table. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Sets matrix property value. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Sets matrix property value in specified properties table. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override |  |
| [UserProperties](./userproperties/)() | Initializes an empty instance of [UserProperties](./) class. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Initializes an of [UserProperties](./) class with default values. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Constructs [UserProperties](./) with a defaults and altDefaults table, which are searched in that order. |
## See Also

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
