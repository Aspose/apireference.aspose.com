---
title: NumericFormat.General
second_title: Aspose.GIS for .NET API 参考
description: NumericFormat 方法. 将数字转换为更紧凑的定点或科学计数法 取决于数字的类型以及是否存在精度说明符推荐使用.
type: docs
weight: 30
url: /zh/net/aspose.gis/numericformat/general/
---
## NumericFormat.General method

将数字转换为更紧凑的定点或科学计数法， 取决于数字的类型以及是否存在精度说明符。推荐使用.

```csharp
public static NumericFormat General(int precision = 0)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| precision | Int32 | 精度定义了结果字符串中可以出现的最大有效数字位数。 如果精度为零，则使用值“15”。最大可用精度为“17”. |

### 返回值

通用格式说明符。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | 有效位数小于0或大于17. |

### 评论

内部代码通过以下方式为 WKT 生成数字字符串：coordinate.ToString("G", CultureInfo.InvariantCulture).

### 也可以看看

* class [NumericFormat](../)
* 命名空间 [Aspose.Gis](../../numericformat/)
* 部件 [Aspose.GIS](../../../)


