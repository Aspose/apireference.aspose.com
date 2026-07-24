---
title: "System::Drawing::Pen class"
linktitle: "Pen"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Pen クラス。描画される線や曲線の色、幅などのプロパティを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 1500
url: /ja/cpp/system.drawing/pen/
---
## Pen class


描画される線や曲線の色、幅などのプロパティを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class Pen : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | 現在のオブジェクトのコピーを返します。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したすべての操作リソースを解放します。 |
| [get_Alignment](./get_alignment/)() const | 現在の [Pen](./) オブジェクトの配置を示す値を返します。 |
| [get_Brush](./get_brush/)() | このペンの [Brush](../brush/) オブジェクトを返します。 |
| [get_Color](./get_color/)() const | このペンの色を返します。 |
| [get_CompoundArray](./get_compoundarray/)() const | 複合ペンを指定する値の配列を返します。 |
| [get_DashCap](./get_dashcap/)() const | 破線の両端で使用されるキャップを示す値を返します。 |
| [get_DashOffset](./get_dashoffset/)() const | 線の開始点からダッシュパターンの開始までの距離を返します。 |
| [get_DashPattern](./get_dashpattern/)() const | 破線のカスタムダッシュパターンを示す配列を返します。 |
| [get_DashStyle](./get_dashstyle/)() const | 現在の [Pen](./) オブジェクトのダッシュスタイルを示す値を返します。 |
| [get_EndCap](./get_endcap/)() const | 現在の [Pen](./) オブジェクトの終端ラインキャップを示す値を返します。 |
| [get_LineJoin](./get_linejoin/)() const | この [Pen](./) オブジェクトで描画された線がどのように結合されるかを示す値を返します。 |
| [get_MiterLimit](./get_miterlimit/)() const | 斜め角の結合部の厚さの上限を返します。 |
| [get_PenType](./get_pentype/)() const | 未実装です。 |
| [get_StartCap](./get_startcap/)() const | 現在の [Pen](./) オブジェクトの開始ラインキャップを示す値を返します。 |
| [get_Transform](./get_transform/)() | 現在のオブジェクトが表すペンの幾何変換を指定する Matrix オブジェクトのコピーを返します。 |
| [get_Width](./get_width/)() const | 現在の [Pen](./) オブジェクトの幅を返します。 |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | 現在のオブジェクトの変換行列を指定された行列で乗算します。 |
| [Pen](./pen/)(const Color\&) | 指定された色を表す新しい [Pen](./) オブジェクトを作成します。 |
| [Pen](./pen/)(const Color\&, float) | 指定された色と幅を表す新しい [Pen](./) オブジェクトを作成します。 |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | 指定された [Brush](../brush/) オブジェクトで初期化された新しい [Pen](./) オブジェクトを作成します。 |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | 指定された [Brush](../brush/) オブジェクトで初期化された新しい [Pen](./) オブジェクトを作成します。 |
| [ResetTransform](./resettransform/)() | 現在のオブジェクトの変換行列をリセットし、単位行列にします。 |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 指定された順序で、ローカルの幾何変換を指定された角度だけ回転させます。 |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 指定された順序で、ローカルの幾何変換を指定された係数で拡大縮小します。 |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | 現在の [Pen](./) オブジェクトの配置を設定します。 |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | このペンの [Brush](../brush/) オブジェクトを設定します。 |
| [set_Color](./set_color/)(const Color\&) | このペンの色を設定します。 |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | 複合ペンを指定する値の配列を設定します。 |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | カスタム終端ラインキャップを設定します。 |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | カスタム開始ラインキャップを設定します。 |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | 破線の両端で使用されるキャップを指定する値を設定します。 |
| [set_DashOffset](./set_dashoffset/)(float) | 線の開始点からダッシュパターンの開始までの距離を設定します。 |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | 破線のカスタムダッシュパターンを指定する配列を設定します。この配列は、交互のダッシュとスペースの長さを指定する数値で構成されます。 |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | 現在の [Pen](./) オブジェクトのダッシュスタイルを指定する値を設定します。 |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | 現在の [Pen](./) オブジェクトの終端ラインキャップを設定します。 |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | この [Pen](./) オブジェクトで描画される線がどのように結合されるかを指定する値を設定します。 |
| [set_MiterLimit](./set_miterlimit/)(float) | マイター角の結合部の厚さの上限を設定します。 |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | 現在の [Pen](./) オブジェクトの開始ラインキャップを設定します。 |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | 現在のオブジェクトで表されるペンの幾何変換を指定する Matrix オブジェクトを設定します。 |
| [set_Width](./set_width/)(float) | 現在の [Pen](./) オブジェクトの幅を設定します。 |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | 未実装です。 |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 指定された順序で、ローカルの幾何変換を指定された寸法だけ平行移動します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
