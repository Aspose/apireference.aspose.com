---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment method"
linktitle: "CreatePolyLineSegment"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment メソッド。C++ で任意の数の個別頂点を含む新しい多角形描画を作成します。"
type: docs
weight: 2500
url: /ja/cpp/aspose.page.xps/xpsdocument/createpolylinesegment/
---
## XpsDocument::CreatePolyLineSegment method


任意の数の個別頂点を含む新しい多角形描画を作成します。

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| points | System::ArrayPtr\<System::Drawing::PointF\> | ポリラインセグメントを定義する複数のセグメントの座標のセット。 |
| isStroked | bool | このパスのセグメントのストロークが描画されるかどうかを指定します。 |

### ReturnValue

新しい多角形描画セグメント。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyLineSegment](../../../aspose.page.xps.xpsmodel/xpspolylinesegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
