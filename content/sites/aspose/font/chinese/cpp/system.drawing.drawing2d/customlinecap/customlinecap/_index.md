---
title: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap 构造函数"
linktitle: "CustomLineCap"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap 构造函数。构造一个新的 CustomLineCap 类实例，该实例表示具有指定属性的用户定义线帽（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.drawing.drawing2d/customlinecap/customlinecap/
---
## CustomLineCap::CustomLineCap constructor


构造一个新的 [CustomLineCap](../) 类实例，该实例表示具有指定属性的用户定义线帽。

```cpp
System::Drawing::Drawing2D::CustomLineCap::CustomLineCap(const SharedPtr<GraphicsPath> &fillPath, const SharedPtr<GraphicsPath> &strokePath, LineCap baseCap=LineCap::Flat, float baseInset=0)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fillPath | const SharedPtr\<GraphicsPath\>\& | 指定自定义帽的填充 |
| strokePath | const SharedPtr\<GraphicsPath\>\& | 指定自定义帽的轮廓 |
| baseCap | LineCap | 创建自定义帽的基础线帽 |
| baseInset | float | 指定线条与帽之间的距离 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../graphicspath/)
* Enum [LineCap](../../linecap/)
* Class [CustomLineCap](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Font for C++](../../../)
