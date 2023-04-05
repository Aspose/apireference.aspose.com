---
title: Enum XpsFillRule
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsModel.XpsFillRule 枚举. PathGeometry 元素的 FillRule 属性的有效值
type: docs
weight: 3070
url: /zh/net/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enumeration

PathGeometry 元素的 FillRule 属性的有效值。

```csharp
public enum XpsFillRule
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| EvenOdd | `0` | 此规则通过从该点向任意方向无穷远绘制一条 ray 并计算光线穿过给定形状的 segments 的数量来确定画布上某个点的“内部性”。如果这个数是奇数，则点在 里面；如果是偶数，则点在外面。 |
| NonZero | `1` | 此规则确定画布上某个点的“内部性”，方法是从该点向任意方向绘制一条 ray 到无穷远，然后检查形状的一段与射线交叉的位置。从零计数开始，每次一条线段从左到右穿过射线时加一个 ，每次路径线段从右到左穿过射线时减去一个 。在计算交叉点后， 如果结果为零则该点在路径之外；否则，它在里面。 |

### 也可以看看

* 命名空间 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 部件 [Aspose.Page](../../)


