---
title: "System::Drawing::Drawing2D::GraphicsPath::GraphicsPath 构造函数"
linktitle: "GraphicsPath"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Drawing2D::GraphicsPath::GraphicsPath 构造函数。构造一个表示指定路径的 GraphicsPath 对象的新实例（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.drawing.drawing2d/graphicspath/graphicspath/
---
## GraphicsPath::GraphicsPath(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) constructor


构造一个表示指定路径的 [GraphicsPath](../) 对象的新实例。

```cpp
System::Drawing::Drawing2D::GraphicsPath::GraphicsPath(const ArrayPtr<Point> &pts, const ArrayPtr<uint8_t> &types, FillMode fillMode=FillMode::Alternate)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| pts | const ArrayPtr\<Point\>\& | 一个数组，包含用于指定由正在创建的对象表示的路径的点 |
| types | const ArrayPtr\<uint8_t\>\& | 一个数组，包含指定 **pts** 数组中相应点类型的值 |
| fillMode | FillMode | 指定正在创建的对象所表示的闭合路径的内部应如何填充 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Point](../../../system.drawing/point/)
* Enum [FillMode](../../fillmode/)
* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
## GraphicsPath::GraphicsPath(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) constructor


构造一个表示指定路径的 [GraphicsPath](../) 对象的新实例。

```cpp
System::Drawing::Drawing2D::GraphicsPath::GraphicsPath(const ArrayPtr<PointF> &pts, const ArrayPtr<uint8_t> &types, FillMode fillMode=FillMode::Alternate)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| pts | const ArrayPtr\<PointF\>\& | 一个数组，包含用于指定由正在创建的对象表示的路径的点 |
| types | const ArrayPtr\<uint8_t\>\& | 一个数组，包含指定 **pts** 数组中相应点类型的值 |
| fillMode | FillMode | 指定正在创建的对象所表示的闭合路径的内部应如何填充 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Enum [FillMode](../../fillmode/)
* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
## GraphicsPath::GraphicsPath(const SkPath\&) constructor




```cpp
System::Drawing::Drawing2D::GraphicsPath::GraphicsPath(const SkPath &path)
```

## 另见

* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
## GraphicsPath::GraphicsPath(FillMode) constructor


使用指定的填充模式构造一个 [GraphicsPath](../) 类的新实例。

```cpp
System::Drawing::Drawing2D::GraphicsPath::GraphicsPath(FillMode fillMode=FillMode::Alternate)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| fillMode | FillMode | 指定正在创建的对象所表示的闭合路径的内部应如何填充 |

## 另见

* Enum [FillMode](../../fillmode/)
* Class [GraphicsPath](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
