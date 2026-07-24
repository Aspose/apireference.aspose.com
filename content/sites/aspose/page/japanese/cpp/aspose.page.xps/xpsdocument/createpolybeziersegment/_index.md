---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment メソッド"
linktitle: "CreatePolyBezierSegment"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment メソッド。C++ で新しい立方ベジェ曲線のセットを作成します。"
type: docs
weight: 2400
url: /ja/cpp/aspose.page.xps/xpsdocument/createpolybeziersegment/
---
## XpsDocument::CreatePolyBezierSegment method


新しい3次ベジェ曲線のセットを作成します。

```cpp
System::SharedPtr<XpsModel::XpsPolyBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | 複数のベジエセグメントの制御点。 |
| isStroked | bool | このパスのセグメントのストロークが描画されるかどうかを指定します。 |

### ReturnValue

新しい 3 次ベジエ曲線 セグメント。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolybeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
