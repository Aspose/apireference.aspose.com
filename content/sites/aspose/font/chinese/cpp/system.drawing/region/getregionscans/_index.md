---
title: "System::Drawing::Region::GetRegionScans 方法"
linktitle: "GetRegionScans"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Region::GetRegionScans 方法。返回一个 RectangleF 结构数组，表示在应用指定的矩阵变换后近似此 Region 的形状（C++）。"
type: docs
weight: 1000
url: /zh/cpp/system.drawing/region/getregionscans/
---
## Region::GetRegionScans method


返回一个 [RectangleF](../../rectanglef/) 结构数组，表示在应用指定的矩阵变换后近似此 [Region](../) 的形状。

```cpp
ArrayPtr<RectangleF> System::Drawing::Region::GetRegionScans(const SharedPtr<Drawing2D::Matrix> &matrix) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 矩阵 | const SharedPtr\<Drawing2D::Matrix\>\& | 一个 Matrix，表示要应用于该区域的几何变换。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RectangleF](../../rectanglef/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
