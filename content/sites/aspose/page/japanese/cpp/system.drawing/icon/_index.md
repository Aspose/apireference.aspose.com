---
title: "System::Drawing::Icon クラス"
linktitle: "アイコン"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Icon クラス。Windows アイコンを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1100
url: /ja/cpp/system.drawing/icon/
---
## Icon class


 [Windows](../../system.windows/) アイコンを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class Icon : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Height](./get_height/)() const | アイコンの高さを返します。 |
| [get_Width](./get_width/)() const | アイコンの幅を返します。 |
| [Icon](./icon/)(const String\&) | 指定されたファイルからアイコンを表す [Icon](./) クラスの新しいインスタンスを構築します。 |
| [ToBitmap](./tobitmap/)() | 現在のオブジェクトを [Bitmap](../bitmap/) オブジェクトに変換します。 |
| virtual [~Icon](./~icon/)() | デストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
