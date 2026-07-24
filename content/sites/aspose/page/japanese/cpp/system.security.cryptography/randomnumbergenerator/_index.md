---
title: "System::Security::Cryptography::RandomNumberGenerator クラス"
linktitle: "RandomNumberGenerator"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RandomNumberGenerator クラス。ランダム数ジェネレータが継承すべき抽象クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数呼び出し時の引数として使用してください。"
type: docs
weight: 2600
url: /ja/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


ランダム数ジェネレータが継承すべき抽象クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Create](./create/)() | 暗号用ランダム数ジェネレータのデフォルト実装のインスタンスを作成します。ランダムデータの生成に使用できます。未実装です。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | 既存の配列要素をランダムバイトで埋めます。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | 既存の配列スライスをランダムバイトで埋めます。 |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | 既存の配列ビュー要素をランダムバイトで埋めます。 |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | 既存の配列ビューのスライスをランダムバイトで埋めます。 |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | 既存のスタック配列要素をランダムバイトで埋めます。 |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | 既存のスタック配列スライスをランダムバイトで埋めます。 |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | 既存の配列要素をランダムな非ゼロバイトで埋めます。 |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | 既存の配列ビュー要素をランダムな非ゼロバイトで埋めます。 |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | 既存のスタック配列要素をランダムな非ゼロバイトで埋めます。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
