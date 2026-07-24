---
title: "System::Drawing::Text::PrivateFontCollection クラス"
linktitle: "PrivateFontCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Text::PrivateFontCollection クラス。クライアントアプリケーションが提供するフォントファミリのコレクションを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数呼び出し時の引数として使用してください。"
type: docs
weight: 300
url: /ja/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


クライアントアプリケーションが提供するフォントファミリのコレクションを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | 指定されたフォントをコレクションに追加します。 |
| [AddFontFile](./addfontfile/)(const String\&) | 指定されたファイルからフォントをコレクションに追加します。 |
| [get_Families](./get_families/)() override | 現在のオブジェクトが表すフォントコレクションに関連付けられた [FontFamily](../../system.drawing/fontfamily/) オブジェクトの配列を返します。 |
## 参照

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
