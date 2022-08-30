---
title: UserProperties
second_title: Aspose.Page for .NET API 参考
description: 允许设置类型属性并返回 的特殊属性类如果此属性对象不包含该属性它还允许搜索两个默认属性 objects 的连接
type: docs
weight: 260
url: /zh/net/aspose.page/userproperties/
---
## UserProperties class

允许设置类型属性并返回 的特殊属性类。如果此属性对象不包含该属性，它还允许搜索两个默认属性 objects 的连接。

```csharp
public class UserProperties : Dictionary<string, object>
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [UserProperties](userproperties#constructor)() | 初始化 UserProperties 类的空实例。 |
| [UserProperties](userproperties#constructor_1)(Dictionary&lt;string, object&gt;) | 使用默认值初始化 UserProperties 类。 |
| [UserProperties](userproperties#constructor_2)(Dictionary&lt;string, object&gt;, Dictionary&lt;string, object&gt;) | 使用默认值和 altDefaults 表构造 UserProperties， 按该顺序搜索。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [Properties](../../aspose.page/userproperties/properties) { set; } | 将属性（包括其默认值）复制到此 UserProperties |

## 方法

| 姓名 | 描述 |
| --- | --- |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty#getproperty)(string) | 获取字符串属性值。 |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty#getproperty_1)(string, string) | 获取字符串属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor#getpropertycolor)(string) | 获取颜色属性值。 |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor#getpropertycolor_1)(string, Color) | 获取颜色属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble#getpropertydouble)(string) | 获取双属性值。 |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble#getpropertydouble_1)(string, double) | 获取双属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat#getpropertyfloat)(string) | 获取浮点属性值。 |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat#getpropertyfloat_1)(string, float) | 获取浮点属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint#getpropertyint)(string) | 获取整数属性值。 |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint#getpropertyint_1)(string, int) | 获取整数属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins#getpropertymargins)(string) | 获取边距属性值。 |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins#getpropertymargins_1)(string, Margins) | 获取边距属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle#getpropertyrectangle)(string) | 获取矩形属性值。 |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle#getpropertyrectangle_1)(string, RectangleF) | 获取矩形属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize#getpropertysize)(string) | 获取大小属性值。 |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize#getpropertysize_1)(string, Size) | 获取大小属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray#getpropertystringarray)(string) | 获取字符串数组属性值。 |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray#getpropertystringarray_1)(string, string[]) | 获取字符串数组属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty#isproperty)(string) | 获取布尔属性值。 |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty#isproperty_1)(string, bool) | 获取布尔属性值。如果请求的属性不存在，则返回提供的默认值。 |
| virtual [PropertyNames](../../aspose.page/userproperties/propertynames)() | 返回属性名称。 |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_1)(string, bool) | 设置布尔属性值。 |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_5)(string, Color) | 设置颜色属性值。 |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_2)(string, double) | 设置双属性值。 |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_4)(string, float) | 设置浮点属性值。 |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_3)(string, int) | 设置整数属性值。 |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty)(string, Margins) | 设置边距属性值。 |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_6)(string, Rectangle) | 设置矩形属性值。 |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_7)(string, Size) | 设置大小属性值。 |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_8)(string, string) | 设置字符串属性值。 |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_9)(string, string[]) | 设置字符串数组属性值。 |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_1)(Dictionary&lt;string, object&gt;, string, bool) | 在指定的属性表中设置布尔属性值。 |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_5)(Dictionary&lt;string, object&gt;, string, Color) | 在指定属性表中设置颜色属性值。 |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_2)(Dictionary&lt;string, object&gt;, string, double) | 在指定的属性表中设置双属性值。 |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_4)(Dictionary&lt;string, object&gt;, string, float) | 在指定的属性表中设置浮点属性值。 |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_3)(Dictionary&lt;string, object&gt;, string, int) | 在指定的属性表中设置整数属性值。 |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty)(Dictionary&lt;string, object&gt;, string, Margins) | 在指定的属性表中设置边距属性值。 |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_6)(Dictionary&lt;string, object&gt;, string, Rectangle) | 在指定属性表中设置矩形属性值。 |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_7)(Dictionary&lt;string, object&gt;, string, Size) | 在指定属性表中设置大小属性值。 |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_8)(Dictionary&lt;string, object&gt;, string, string[]) | 在指定的属性表中设置字符串数组属性值。 |

### 也可以看看

* 命名空间 [Aspose.Page](../../aspose.page)
* 部件 [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
