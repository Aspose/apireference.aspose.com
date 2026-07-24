---
title: "Aspose::Page::XPS::XpsDocument::CreatePathFigure メソッド"
linktitle: "CreatePathFigure"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreatePathFigure メソッド。C++ で新しいパスフィギュアを作成します。"
type: docs
weight: 2200
url: /ja/cpp/aspose.page.xps/xpsdocument/createpathfigure/
---
## XpsDocument::CreatePathFigure(System::Drawing::PointF, bool) method


新しいパス図形を作成します。

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::XpsDocument::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | パス図形の最初のセグメントの開始点です。 |
| isClosed | bool | パスが閉じているかどうかを指定します。true に設定すると、ストロークは \"閉じた\" と描画され、つまりパス図形の最後のセグメントの最後の点が StartPoint 属性で指定された点と接続されます。false の場合、ストロークは \"開いた\" と描画され、最後の点は開始点と接続されません。これは、パス図形がストロークを指定する Path 要素で使用されている場合にのみ適用されます。 |

### ReturnValue

新しいパス図形です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


新しいパス図形を作成します。

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::XpsDocument::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | パス図形の最初のセグメントの開始点です。 |
| セグメント | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | パスセグメントのリストです。 |
| isClosed | bool | パスが閉じているかどうかを指定します。true に設定すると、ストロークは \"閉じた\" と描画され、つまりパス図形の最後のセグメントの最後の点が StartPoint 属性で指定された点と接続されます。false の場合、ストロークは \"開いた\" と描画され、最後の点は開始点と接続されません。これは、パス図形がストロークを指定する Path 要素で使用されている場合にのみ適用されます。 |

### ReturnValue

新しいパス図形です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
