---
title: "System::Text::ASCIIEncoding クラス"
linktitle: "ASCIIEncoding"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::ASCIIEncoding クラス。ASCII エンコーディングを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


ASCII エンコーディングを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | コンストラクタ。 |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 既知の文字数の文字列を保持できる最大バイト数を取得します。 |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 指定されたバイト数をデコードするために必要な最大文字数を取得します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI。 |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | デフォルトのコードページ値です。 |
## 参照

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
