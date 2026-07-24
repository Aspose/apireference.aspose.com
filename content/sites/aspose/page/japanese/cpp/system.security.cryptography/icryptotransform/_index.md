---
title: "System::Security::Cryptography::ICryptoTransform クラス"
linktitle: "ICryptoTransform"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::ICryptoTransform クラス。暗号変換器の基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンス化しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 2000
url: /ja/cpp/system.security.cryptography/icryptotransform/
---
## ICryptoTransform class


暗号変換器の基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンス化しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class ICryptoTransform : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | 入力ブロックサイズ。 |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | 出力ブロックサイズ。 |
| virtual [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) | RTTI 情報。 |
| virtual [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) | 最後のデータブロックを処理し、出力値を計算します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
