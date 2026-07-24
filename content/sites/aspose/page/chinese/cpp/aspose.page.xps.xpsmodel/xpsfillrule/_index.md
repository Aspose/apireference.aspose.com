---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule 枚举"
linktitle: "XpsFillRule"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule 枚举。C++ 中 PathGeometry 元素的 FillRule 属性的有效值。"
type: docs
weight: 4900
url: /zh/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


PathGeometry 元素的 FillRule 属性的有效值。

```cpp
enum class XpsFillRule
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 偶奇 | 0 | 此规则通过从画布上的一点向任意方向射出一条射线至无穷远，并统计该射线穿过给定形状的线段数量来确定点的“内部性”。如果该数量为奇数，则点在内部；如果为偶数，则点在外部。 |
| NonZero | 1 | 此规则通过从点向任意方向绘制一条射线到无穷远，然后检查形状的线段穿过射线的地方，以确定点在画布上的“内部性”。从零计数开始，每当线段从左向右穿过射线时加一，每当路径线段从右向左穿过射线时减一。计数完交叉后，如果结果为零，则点在路径外部；否则在内部。 |

## 另见

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
