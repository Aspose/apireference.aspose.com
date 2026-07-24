---
title: "System::IO::StringWriter クラス"
linktitle: "StringWriter"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::StringWriter クラス。文字列に情報を書き込む TextWriter を実装します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 2500
url: /ja/cpp/system.io/stringwriter/
---
## StringWriter class


文字列に情報を書き込む [TextWriter](../textwriter/) を実装します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class StringWriter : public System::IO::TextWriter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | 現在使用されているエンコーディングを返します。 |
| virtual [GetStringBuilder](./getstringbuilder/)() | 現在使用されている StringBuilder を返します。 |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | 指定された StringBuilder と [IFormatProvider](../../system/iformatprovider/) を使用して新しい [StringWriter](./) インスタンスを構築します。 |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | 現在のカルチャから取得した [IFormatProvider](../../system/iformatprovider/) と指定された StringBuilder を使用して新しい [StringWriter](./) インスタンスを構築します。 |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | 指定された [IFormatProvider](../../system/iformatprovider/) を使用して新しい [StringWriter](./) インスタンスを構築します。 |
| [StringWriter](./stringwriter/)() | 現在のカルチャから取得した [IFormatProvider](../../system/iformatprovider/) を使用して新しい [StringWriter](./) インスタンスを構築します。 |
| [ToString](./tostring/)() const override | 基になる文字列を返します。 |
| [Write](./write/)(char_t) override | 指定された文字を書き込みます。 |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 指定された文字配列から指定された文字のサブレンジを書き込み、ストリームに出力します。 |
| [Write](./write/)(const String\&) override | 指定された文字列を書き込みます。 |
## 参照

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
