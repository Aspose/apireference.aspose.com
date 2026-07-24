---
title: "System::Drawing::TextureBrush クラス"
linktitle: "TextureBrush"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::TextureBrush クラス。画像を使用して形状の内部を塗りつぶすブラシを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 2800
url: /ja/cpp/system.drawing/texturebrush/
---
## TextureBrush class


画像を使用して形状の内部を塗りつぶすブラシを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class TextureBrush : public System::Drawing::Brush
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | 現在のオブジェクトのコピーを作成します。 |
| [get_Image](./get_image/)() | 現在の [TextureBrush](./) オブジェクトで使用されている画像を返します。 |
| [get_Transform](./get_transform/)() | 現在のオブジェクトが表すブラシの幾何変換を指定する Matrix オブジェクトのコピーを返します。 |
| [get_WrapMode](./get_wrapmode/)() | 現在のオブジェクトが表すブラシのタイル設定を指定する値を返します。 |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | 現在のオブジェクトの変換行列を指定された行列で乗算します。 |
| [ResetTransform](./resettransform/)() | 現在のオブジェクトの変換行列をリセットし、単位行列にします。 |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 指定された順序で、ローカルの幾何変換を指定された角度だけ回転させます。 |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 指定された順序で、ローカルの幾何変換を指定された係数で拡大縮小します。 |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | 現在のオブジェクトが表すブラシの幾何変換を指定する Matrix オブジェクトを設定します。 |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | 現在のオブジェクトが表すブラシのタイル設定を指定する値を設定します。 |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | 指定された画像を使用する新しい [TextureBrush](./) クラスのインスタンスを構築します。 |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | 指定された画像を使用する新しい [TextureBrush](./) クラスのインスタンスを構築します。 |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | 指定された画像を使用する新しい [TextureBrush](./) クラスのインスタンスを構築します。 |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | 指定された画像を使用する新しい [TextureBrush](./) クラスのインスタンスを構築します。 |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | 指定された画像を使用する新しい [TextureBrush](./) クラスのインスタンスを構築します。 |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 指定された順序で、ローカルの幾何変換を指定された寸法だけ平行移動します。 |
| virtual [~TextureBrush](./~texturebrush/)() | デストラクタ。 |
## 参照

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
