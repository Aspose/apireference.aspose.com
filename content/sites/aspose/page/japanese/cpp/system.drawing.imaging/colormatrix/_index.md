---
title: "System::Drawing::Imaging::ColorMatrix class"
linktitle: "ColorMatrix"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Imaging::ColorMatrix class. RGBAW カラースペースの座標を含む 5x5 行列を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


RGBAW カラースペースの座標を含む 5x5 行列を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class ColorMatrix : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | [ColorMatrix](./) クラスの新しいインスタンスを構築し、単位行列の値で初期化します。 |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | [ColorMatrix](./) クラスの新しいインスタンスを構築し、指定された値で初期化します。 |
| [get_Matrix00](./get_matrix00/)() const | 0 行目 0 列目の値を返します。 |
| [get_Matrix01](./get_matrix01/)() const | 0 行目 1 列目の値を返します。 |
| [get_Matrix02](./get_matrix02/)() const | 0 行目 2 列目の値を返します。 |
| [get_Matrix03](./get_matrix03/)() const | 0 行目 3 列目の値を返します。 |
| [get_Matrix04](./get_matrix04/)() const | 0 行目 4 列目の値を返します。 |
| [get_Matrix10](./get_matrix10/)() const | 1 行目 0 列目の値を返します。 |
| [get_Matrix11](./get_matrix11/)() const | 1 行目 1 列目の値を返します。 |
| [get_Matrix12](./get_matrix12/)() const | 1 行目 2 列目の値を返します。 |
| [get_Matrix13](./get_matrix13/)() const | 1 行目の 3 列目の値を返します。 |
| [get_Matrix14](./get_matrix14/)() const | 1 行目の 4 列目の値を返します。 |
| [get_Matrix20](./get_matrix20/)() const | 2 行目の 0 列目の値を返します。 |
| [get_Matrix21](./get_matrix21/)() const | 2 行目の 1 列目の値を返します。 |
| [get_Matrix22](./get_matrix22/)() const | 2 行目の 2 列目の値を返します。 |
| [get_Matrix23](./get_matrix23/)() const | 2 行目の 3 列目の値を返します。 |
| [get_Matrix24](./get_matrix24/)() const | 2 行目の 4 列目の値を返します。 |
| [get_Matrix30](./get_matrix30/)() const | 3 行目の 0 列目の値を返します。 |
| [get_Matrix31](./get_matrix31/)() const | 3 行目の 1 列目の値を返します。 |
| [get_Matrix32](./get_matrix32/)() const | 3 行目の 2 列目の値を返します。 |
| [get_Matrix33](./get_matrix33/)() const | 3 行目の 3 列目の値を返します。 |
| [get_Matrix34](./get_matrix34/)() const | 3 行目の 4 列目の値を返します。 |
| [get_Matrix40](./get_matrix40/)() const | 4 行目の 0 列目の値を返します。 |
| [get_Matrix41](./get_matrix41/)() const | 4 行目の 1 列目の値を返します。 |
| [get_Matrix42](./get_matrix42/)() const | 4 行目の 2 列目の値を返します。 |
| [get_Matrix43](./get_matrix43/)() const | 4 行目の 3 列目の値を返します。 |
| [get_Matrix44](./get_matrix44/)() const | 4 行目の 4 列目の値を返します。 |
| [idx_get](./idx_get/)(int, int) | 指定された行と列の値を返します。 |
| [idx_set](./idx_set/)(int, int, float) | 行列の指定された位置に指定された値を設定します。 |
| [set_Matrix00](./set_matrix00/)(float) | 0 行目の 0 列目に値を設定します。 |
| [set_Matrix01](./set_matrix01/)(float) | 0 行目の 1 列目に値を設定します。 |
| [set_Matrix02](./set_matrix02/)(float) | 0 行目の 2 列目に値を設定します。 |
| [set_Matrix03](./set_matrix03/)(float) | 0 行目の 3 列目に値を設定します。 |
| [set_Matrix04](./set_matrix04/)(float) | 0 行目の 4 列目に値を設定します。 |
| [set_Matrix10](./set_matrix10/)(float) | 1 行目の 0 列目に値を設定します。 |
| [set_Matrix11](./set_matrix11/)(float) | 1 行目の 1 列目に値を設定します。 |
| [set_Matrix12](./set_matrix12/)(float) | 1 行目の 2 列目に値を設定します。 |
| [set_Matrix13](./set_matrix13/)(float) | 1 行目の 3 列目に値を設定します。 |
| [set_Matrix14](./set_matrix14/)(float) | 1 行目の 4 列目に値を設定します。 |
| [set_Matrix20](./set_matrix20/)(float) | 2 行目の 0 列目に値を設定します。 |
| [set_Matrix21](./set_matrix21/)(float) | 2 行目の 1 列目に値を設定します。 |
| [set_Matrix22](./set_matrix22/)(float) | 2 行目の 2 列目に値を設定します。 |
| [set_Matrix23](./set_matrix23/)(float) | 2 行目の 3 列目に値を設定します。 |
| [set_Matrix24](./set_matrix24/)(float) | 2 行目の 4 列目に値を設定します。 |
| [set_Matrix30](./set_matrix30/)(float) | 3 行目の 0 列目に値を設定します。 |
| [set_Matrix31](./set_matrix31/)(float) | 3 行目の 1 列目に値を設定します。 |
| [set_Matrix32](./set_matrix32/)(float) | 3 行目の 2 列目に値を設定します。 |
| [set_Matrix33](./set_matrix33/)(float) | 3 行目の 3 列目に値を設定します。 |
| [set_Matrix34](./set_matrix34/)(float) | 3 行目の 4 列目に値を設定します。 |
| [set_Matrix40](./set_matrix40/)(float) | 4 行目の 0 列目に値を設定します。 |
| [set_Matrix41](./set_matrix41/)(float) | 4 行目の 1 列目に値を設定します。 |
| [set_Matrix42](./set_matrix42/)(float) | 4 行目の 2 列目に値を設定します。 |
| [set_Matrix43](./set_matrix43/)(float) | 4 行目の 3 列目に値を設定します。 |
| [set_Matrix44](./set_matrix44/)(float) | 4 行目の 4 列目に値を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
