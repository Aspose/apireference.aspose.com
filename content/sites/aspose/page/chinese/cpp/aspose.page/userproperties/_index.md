---
title: "Aspose::Page::UserProperties 类"
linktitle: "UserProperties"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::UserProperties 类。特殊属性类，允许设置和返回类型化属性。如果此属性对象不包含该属性，还可以挂接两个默认属性对象进行搜索（在 C++ 中）。"
type: docs
weight: 1600
url: /zh/cpp/aspose.page/userproperties/
---
## UserProperties class


特殊属性类，允许设置和返回类型化属性。如果该属性对象不包含某属性，还允许挂接两个默认属性对象进行搜索。

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | 获取字符串属性值。 |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | 获取字符串属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | 获取颜色属性值。 |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | 获取颜色属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | 获取双精度属性值。 |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | 获取双精度属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | 获取浮点属性值。 |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | 获取浮点属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | 获取整数属性值。 |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | 获取整数属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | 获取边距属性值。 |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | 获取边距属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | 获取矩阵属性值。 |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 获取矩阵属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | 获取矩形属性值。 |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | 获取矩形属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | 获取尺寸属性值。 |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | 获取尺寸属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | 获取字符串数组属性值。 |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | 获取字符串数组属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [IsProperty](./isproperty/)(System::String) | 获取布尔属性值。 |
| virtual [IsProperty](./isproperty/)(System::String, bool) | 获取布尔属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | 返回属性名称。 |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | 复制属性，包括其默认值到此 [UserProperties](./)。 |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | 设置字符串属性值。 |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | 设置字符串数组属性值。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | 在指定的属性表中设置字符串数组属性值。 |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | 设置颜色属性值。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | 在指定的属性表中设置颜色属性值。 |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | 设置矩形属性值。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | 在指定的属性表中设置矩形属性值。 |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | 设置边距属性值。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | 在指定的属性表中设置边距属性值。 |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | 设置大小属性值。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | 在指定的属性表中设置大小属性值。 |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | 设置整数属性值。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | 在指定的属性表中设置整数属性值。 |
| virtual [SetProperty](./setproperty/)(System::String, double) | 设置双精度属性值。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | 在指定的属性表中设置双精度属性值。 |
| virtual [SetProperty](./setproperty/)(System::String, float) | 设置浮点属性值。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | 在指定的属性表中设置浮点属性值。 |
| virtual [SetProperty](./setproperty/)(System::String, bool) | 设置布尔属性值。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | 在指定的属性表中设置布尔属性值。 |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 设置矩阵属性值。 |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 在指定的属性表中设置矩阵属性值。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而非共享指针）。允许在容器中将指针切换为弱模式。 |
| [UserProperties](./userproperties/)() | 初始化一个空的 [UserProperties](./) 类实例。 |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | 使用默认值初始化一个 [UserProperties](./) 类实例。 |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | 使用 defaults 和 altDefaults 表构造 [UserProperties](./)，按该顺序搜索。 |
## 另见

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
