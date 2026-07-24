---
title: "Aspose::Page::XPS::XpsModel::XpsGradientBrush クラス"
linktitle: "XpsGradientBrush"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsGradientBrush クラス。LinerGradientBrush と RadialGradientBrush 要素の共通機能をカプセル化するクラスです（C++）。"
type: docs
weight: 1700
url: /ja/cpp/aspose.page.xps.xpsmodel/xpsgradientbrush/
---
## XpsGradientBrush class


LinerGradientBrush と RadialGradientBrush 要素の共通機能をカプセル化するクラス。

```cpp
class XpsGradientBrush : public Aspose::Page::XPS::XpsModel::XpsTransformableBrush
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_ColorInterpolationMode](./get_colorinterpolationmode/)() const | 色の補間に使用するガンマ関数を指定する値を取得/設定します。指定された場合、ガンマ調整はアルファ成分には適用しないでください。 |
| [get_GradientStops](./get_gradientstops/)() const | グラデーションを構成するグラデーションストップのリストを取得/設定します。 |
| [get_SpreadMethod](./get_spreadmethod/)() const | ブラシが一次的な初期グラデーション領域の外側のコンテンツ領域をどのように塗りつぶすかを示す値を取得/設定します。 |
| [set_ColorInterpolationMode](./set_colorinterpolationmode/)(XpsColorInterpolationMode) | 色の補間に使用するガンマ関数を指定する値を取得/設定します。指定された場合、ガンマ調整はアルファ成分には適用しないでください。 |
| [set_GradientStops](./set_gradientstops/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsGradientStop\>\>\>) | グラデーションを構成するグラデーションストップのリストを取得/設定します。 |
| [set_SpreadMethod](./set_spreadmethod/)(XpsSpreadMethod) | ブラシが一次的な初期グラデーション領域の外側のコンテンツ領域をどのように塗りつぶすかを示す値を取得/設定します。 |
## 参照

* Class [XpsTransformableBrush](../xpstransformablebrush/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
