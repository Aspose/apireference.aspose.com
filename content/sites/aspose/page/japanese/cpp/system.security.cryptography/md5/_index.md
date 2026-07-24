---
title: "System::Security::Cryptography::MD5 クラス"
linktitle: "MD5"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::MD5 クラス。MD5 ハッシュアルゴリズム。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2300
url: /ja/cpp/system.security.cryptography/md5/
---
## MD5 class


[MD5](./) hashing algorithm. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class MD5 : public System::Security::Cryptography::HashAlgorithm
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Create](./create/)() | [MD5](./) アルゴリズムを作成します。 |
| static [Create](./create/)(const String\&) | [MD5](./) アルゴリズムを作成します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ptr](./ptr/) | RTTI 情報。 |
## 参照

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
