---
title: "System::Drawing::Imaging::ImageAttributes クラス"
linktitle: "ImageAttributes"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Imaging::ImageAttributes クラス。レンダリング中に画像の色がどのように操作されるかに関する情報を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 900
url: /ja/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


レンダリング中に画像の色がどのように操作されるかに関する情報を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class ImageAttributes : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | 未実装です。 |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | 未実装です。 |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | 未実装です。 |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | 未実装です。 |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | 未実装です。 |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | 未実装です。 |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | 未実装です。 |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | 未実装です。 |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | 未実装です。 |
| [Clone](./clone/)() | 現在のオブジェクトのコピーを作成します。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したすべてのオペレーティングシステムリソースを解放します。 |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | 未実装です。 |
| [ImageAttributes](./imageattributes/)() | デフォルトコンストラクタ。 |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | 未実装です。 |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | 未実装です。 |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | 未実装です。 |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | カラー調整行列を設定します。 |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | 未実装です。 |
| [SetNoOp](./setnoop/)(ColorAdjustType) | 未実装です。 |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | 未実装です。 |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | 未実装です。 |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | 未実装です。 |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | 未実装です。 |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | テクスチャを形状全体または形状の境界でタイル配置する際に使用するラップモードと色を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
