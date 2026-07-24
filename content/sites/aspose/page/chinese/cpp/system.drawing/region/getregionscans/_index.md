---
title: "System::Drawing::Region::GetRegionScans 方法"
linktitle: "GetRegionScans"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Region::GetRegionScans 方法。返回一个 RectangleF 结构数组，这些结构在应用指定的矩阵变换后近似此 Region（在 C++ 中）。"
type: docs
weight: 1000
url: /zh/cpp/system.drawing/region/getregionscans/
---
## Region::GetRegionScans method


返回一个 [RectangleF](../../rectanglef/) 结构数组，这些结构在应用指定的矩阵变换后近似此 [Region](../)。

```cpp
ArrayPtr<RectangleF> System::Drawing::Region::GetRegionScans(const SharedPtr<Drawing2D::Matrix> &matrix) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| matrix | const SharedPtr\<Drawing2D::Matrix\>\& | 一个表示要应用于该区域的几何变换的 Matrix。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RectangleF](../../rectanglef/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
