---
title: "System::Drawing::Graphics::SetClip 方法"
linktitle: "SetClip"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Graphics::SetClip 方法。将当前 Graphics 对象表示的绘图表面的剪裁区域设置为指定操作的结果，该操作将当前剪裁区域与由图形路径指定的区域合并（在 C++ 中）。"
type: docs
weight: 8600
url: /zh/cpp/system.drawing/graphics/setclip/
---
## Graphics::SetClip(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) method


将当前 [Graphics](../) 对象表示的绘图表面的剪裁区域设置为指定操作的结果，该操作将当前剪裁区域与由图形路径指定的区域合并。

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Drawing2D::GraphicsPath> &path, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 路径 | const SharedPtr\<Drawing2D::GraphicsPath\>\& | 指定要合并的区域 |
| combineMode | Drawing2D::CombineMode | 指定组合操作 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) method


未实现。

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Graphics> &graphics, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Graphics](../)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) method


将当前 [Graphics](../) 对象表示的绘图表面的裁剪区域设置为指定操作的结果，该操作将当前裁剪区域与指定区域合并。

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Region> &region, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 区域 | const SharedPtr\<Region\>\& | 指定要合并的区域 |
| combineMode | Drawing2D::CombineMode | 指定组合操作 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(Rectangle, Drawing2D::CombineMode) method


将当前 [Graphics](../) 对象表示的绘图表面的裁剪区域设置为指定操作的结果，该操作将当前裁剪区域与指定区域合并。

```cpp
void System::Drawing::Graphics::SetClip(Rectangle rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rect | 矩形 | 指定要合并的区域 |
| combineMode | Drawing2D::CombineMode | 指定组合操作 |

## 另见

* Class [Rectangle](../../rectangle/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(RectangleF, Drawing2D::CombineMode) method


将当前 [Graphics](../) 对象表示的绘图表面的裁剪区域设置为指定操作的结果，该操作将当前裁剪区域与指定区域合并。

```cpp
void System::Drawing::Graphics::SetClip(RectangleF rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rect | RectangleF | 指定要合并的区域 |
| combineMode | Drawing2D::CombineMode | 指定组合操作 |

## 另见

* Class [RectangleF](../../rectanglef/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
