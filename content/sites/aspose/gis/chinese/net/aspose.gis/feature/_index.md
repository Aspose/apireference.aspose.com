---
title: Class Feature
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Feature 班级. 由几何图形和用户定义的属性组成的地理特征
type: docs
weight: 130
url: /zh/net/aspose.gis/feature/
---
## Feature class

由几何图形和用户定义的属性组成的地理特征。

```csharp
public class Feature
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | 获取或设置要素的几何形状。 不能`null`， 使用[`Null`](../../aspose.gis.geometries/geometry/null/)指示缺少的几何形状. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | 从另一个特征复制属性值。 |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | 获取属性的值。 |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | 获取属性的值。 |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | 获取属性值，或[`DefaultValue`](../featureattribute/defaultvalue/)如果该值未设置或`无效的`. |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | 获取属性值，或[`DefaultValue`](../featureattribute/defaultvalue/)如果该值未设置或`无效的`. |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | 获取属性值，或[`DefaultValue`](../featureattribute/defaultvalue/)如果该值未设置或`无效的`. |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | 返回数组中所有属性的值。 |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | 返回数组中所有属性的值。 考虑使用[`GetValues`](./getvalues/)避免额外内存分配的方法. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | 获取属性序列的值作为列表。 |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | 确定指定的属性是否已明确设置为`无效的`值. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | 检查是否在此功能中设置了属性值。 |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | 设置属性的新值。 |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | 将属性值设置为`无效的`. |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | 为所有属性设置新值。 也考虑使用[`CopyValues`](./copyvalues/)在一次调用中简化设置值的方法. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | 从此功能中删除属性值。 |

### 也可以看看

* 命名空间 [Aspose.Gis](../../aspose.gis/)
* 部件 [Aspose.GIS](../../)


