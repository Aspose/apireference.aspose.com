---
title: "System::Collections::Generic::BaseSet::Enumerator クラス"
linktitle: "列挙子"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::BaseSet::Enumerator クラス。列挙子クラス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2800
url: /ja/cpp/system.collections.generic/baseset/enumerator/
---
## Enumerator class


[Enumerator](./) class. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<set_t>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | **set** オブジェクトを反復する列挙子を作成します。 |
## 参照

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [BaseSet](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
