---
title: "System::Security::Cryptography::SHA512 class"
linktitle: "SHA512"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::SHA512 クラス。入力データの SHA512 ハッシュを計算します。C++ では SHA512 は抽象クラスではありません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として渡してください。"
type: docs
weight: 4700
url: /ja/cpp/system.security.cryptography/sha512/
---
## SHA512 class


Computes [SHA512](./) hash for input data. In C++ [SHA512](./) is not an abstract class. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class SHA512 : public System::Security::Cryptography::HashAlgorithm
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Create](./create/)() | ハッシュアルゴリズムのインスタンスを作成します。 |
| static [Create](./create/)(const String\&) | ハッシュアルゴリズムのインスタンスを作成します。 |
## 参照

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
