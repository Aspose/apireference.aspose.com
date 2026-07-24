---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure クラス"
linktitle: "XpsPathFigure"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure クラス。PathFigure 要素の機能をカプセル化するクラス。この要素は C++ で1つ以上の直線または曲線セグメントの集合で構成されます。"
type: docs
weight: 3100
url: /ja/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


PathFigure 要素の機能をカプセル化するクラス。この要素は1つ以上の直線または曲線セグメントの集合で構成されます。

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | このパス図形をクローンします。 |
| [get_IsClosed](./get_isclosed/)() const | パス図形が閉じているかどうかを示す値を取得/設定します。 |
| [get_IsFilled](./get_isfilled/)() const | パス図形が包含パスジオメトリの面積計算に使用されているかどうかを示す値を取得/設定します。 |
| [get_Segments](./get_segments/)() | 子パスセグメントのリストを返します。 |
| [get_StartPoint](./get_startpoint/)() const | パス図形の最初のセグメントの開始点を取得/設定します。 |
| [set_IsClosed](./set_isclosed/)(bool) | パス図形が閉じているかどうかを示す値を取得/設定します。 |
| [set_IsFilled](./set_isfilled/)(bool) | パス図形が包含パスジオメトリの面積計算に使用されているかどうかを示す値を取得/設定します。 |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | パス図形の最初のセグメントの開始点を取得/設定します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n 番目のテンプレート引数を弱参照ポインタに設定します（共有ではなく）。コンテナ内のポインタを弱モードに切り替えることができます。 |
## 参照

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
