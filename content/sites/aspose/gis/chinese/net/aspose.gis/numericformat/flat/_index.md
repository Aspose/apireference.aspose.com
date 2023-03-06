---
title: NumericFormat.Flat
second_title: Aspose.GIS for .NET API 参考
description: NumericFormat 方法. 将数字转换为不带科学记数法的定点文本
type: docs
weight: 20
url: /zh/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

将数字转换为不带科学记数法的定点文本。

```csharp
public static NumericFormat Flat(int significantDigits)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| significantDigits | Int32 | 有效数字的数目。最大可用精度为“308” |

### 返回值

舍入精度说明符。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentOutOfRangeException | 有效位数小于0或大于308. |

### 评论

内部代码通过以下方式为 WKT 生成数字字符串：coordinate.ToString("0.##..", CultureInfo.InvariantCulture) decision.

### 也可以看看

* class [NumericFormat](../)
* 命名空间 [Aspose.Gis](../../numericformat/)
* 部件 [Aspose.GIS](../../../)


