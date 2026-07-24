---
title: "System::Drawing::Region::GetRegionScans メソッド"
linktitle: "GetRegionScans"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Region::GetRegionScans メソッド。指定された行列変換が適用された後、この Region を近似する RectangleF 構造体の配列を C++ で返します。"
type: docs
weight: 1000
url: /ja/cpp/system.drawing/region/getregionscans/
---
## Region::GetRegionScans method


指定された行列変換が適用された後、この [Region](../) を近似する [RectangleF](../../rectanglef/) 構造体の配列を返します。

```cpp
ArrayPtr<RectangleF> System::Drawing::Region::GetRegionScans(const SharedPtr<Drawing2D::Matrix> &matrix) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 行列 | const SharedPtr\<Drawing2D::Matrix\>\& | 領域に適用する幾何変換を表す Matrix。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RectangleF](../../rectanglef/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
