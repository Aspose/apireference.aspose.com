---
title: "System::Drawing::FontFamily クラス"
linktitle: "FontFamily"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::FontFamily クラス。類似した基本デザインを共有するフォントファミリのグループを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 900
url: /ja/cpp/system.drawing/fontfamily/
---
## FontFamily class


類似した基本デザインを共有するフォントファミリのグループを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class FontFamily : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | 現在の [FontFamily](./) オブジェクトのコピーを返します。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したすべてのオペレーティングシステムリソースを解放します。 |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 現在のオブジェクトと指定されたオブジェクトが同一かどうかを判定します。 |
| [FontFamily](./fontfamily/)(const String\&) | 指定された名前のフォントファミリーを表す [FontFamily](./) クラスの新しいインスタンスを構築します。 |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | 指定された名前で、指定された FontCollection 内に [FontFamily](./) の新しいインスタンスを構築します。 |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | 指定された汎用フォントファミリーから [FontFamily](./) の新しいインスタンスを構築します。 |
| static [get_Families](./get_families/)() | 現在のグラフィックスコンテキストに関連付けられたすべての [FontFamily](./) オブジェクトを含む配列を返します。 |
| static [get_GenericMonospace](./get_genericmonospace/)() | 汎用モノスペースフォントファミリーを表す [FontFamily](./) オブジェクトを返します。 |
| static [get_GenericSansSerif](./get_genericsansserif/)() | 汎用サンセリフフォントファミリーを表す [FontFamily](./) オブジェクトを返します。 |
| static [get_GenericSerif](./get_genericserif/)() | 汎用セリフフォントファミリーを表す [FontFamily](./) オブジェクトを返します。 |
| [get_Name](./get_name/)() const | 現在のオブジェクトが表すフォントファミリーの名前を返します。 |
| [GetCellAscent](./getcellascent/)(FontStyle) | 指定されたフォントスタイルに対して、現在のオブジェクトが表すフォントファミリーのセルアセントを返します。 |
| [GetCellDescent](./getcelldescent/)(FontStyle) | 指定されたフォントスタイルに対して、現在のオブジェクトが表すフォントファミリーのセルディセントを返します。 |
| [GetEmHeight](./getemheight/)(FontStyle) | 指定されたスタイルに対するフォントデザイン単位でのエムスクエアの高さを返します。 |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | 指定されたフォントスタイルに対して、現在のオブジェクトが表すフォントファミリーの行間隔を返します。 |
| [GetName](./getname/)(int) const | 現在のオブジェクトが表すフォントファミリーの名前を返します。 |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | 指定されたフォントスタイルが利用可能かどうかを判定します。 |
| virtual [~FontFamily](./~fontfamily/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
