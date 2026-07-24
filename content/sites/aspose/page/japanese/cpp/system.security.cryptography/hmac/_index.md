---
title: "System::Security::Cryptography::HMAC class"
linktitle: "HMAC"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::HMAC クラス。ハッシュベースのメッセージ認証コード (HMAC) のすべての実装はこの抽象クラスを継承しなければなりません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として渡してください。"
type: docs
weight: 1700
url: /ja/cpp/system.security.cryptography/hmac/
---
## HMAC class


All implementations of Hash-based Message [Authentication](../../system.security.authentication/) Code ([HMAC](./)) must inherit this abstract class. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class HMAC : public System::Security::Cryptography::HashAlgorithm
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Create](./create/)() | 未実装です。 |
## 参照

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
