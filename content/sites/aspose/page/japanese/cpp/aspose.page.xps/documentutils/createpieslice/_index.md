---
title: "Aspose::Page::XPS::DocumentUtils::CreatePieSlice メソッド"
linktitle: "CreatePieSlice"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::DocumentUtils::CreatePieSlice メソッド。二つの放射状の光線間の円のスライスを表すパスジオメトリを C++ で作成します。"
type: docs
weight: 500
url: /ja/cpp/aspose.page.xps/documentutils/createpieslice/
---
## DocumentUtils::CreatePieSlice method


2 本の放射線間の円スライスを表すパスジオメトリを作成します。

```cpp
System::SharedPtr<XpsModel::XpsPathGeometry> Aspose::Page::XPS::DocumentUtils::CreatePieSlice(System::Drawing::PointF center, float radius, float startAngle, float endAngle)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| center | System::Drawing::PointF | 円の中心。 |
| radius | 単精度浮動小数点数 | 円の半径。 |
| startAngle | 単精度浮動小数点数 | 開始光線の角度。 |
| endAngle | 単精度浮動小数点数 | 終了光線の角度。 |

### ReturnValue

この [XPS](../../) パスジオメトリ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathGeometry](../../../aspose.page.xps.xpsmodel/xpspathgeometry/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [DocumentUtils](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
