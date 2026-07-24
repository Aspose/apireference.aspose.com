---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment メソッド"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment メソッド。C++ で、パス図形の前の点から一連の頂点を通って、指定された制御点を使用して二次ベジェ曲線の新しいセットを作成します。"
type: docs
weight: 2600
url: /ja/cpp/aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/
---
## XpsDocument::CreatePolyQuadraticBezierSegment method


パス図形の前の点から頂点のセットを通り、指定された制御点を使用して新しい2次ベジェ曲線のセットを作成します。

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | 複数の二次ベジェセグメント用の制御点。 |
| isStroked | bool | このパスのセグメントのストロークが描画されるかどうかを指定します。 |

### ReturnValue

新しい二次ベジェ曲線セグメント。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
