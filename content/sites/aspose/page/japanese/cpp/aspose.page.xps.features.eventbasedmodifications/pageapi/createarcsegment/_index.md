---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method"
linktitle: "CreateArcSegment"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment メソッド。C++ で新しい楕円弧セグメントを作成します。"
type: docs
weight: 600
url: /ja/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createarcsegment/
---
## PageAPI::CreateArcSegment method


新しい楕円弧セグメントを作成します。

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ポイント | System::Drawing::PointF | 楕円弧の終点。 |
| size | System::Drawing::SizeF | 楕円弧の x と y の半径（x,y のペア）。 |
| rotationAngle | 単精度浮動小数点数 | 楕円が現在の座標系に対してどのように回転しているかを示します。 |
| isLargeArc | bool | 弧が 180 度以上のスイープで描画されるかどうかを決定します。 |
| sweepDirection | XpsModel::XpsSweepDirection | 弧が描画される方向。 |
| isStroked | bool | このパスのセグメントのストロークが描画されるかどうかを指定します。 |

### ReturnValue

新しい楕円弧セグメント。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
