---
title: "System::Collections::Generic::SortedList::Enumerator クラス"
linktitle: "列挙子"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::SortedList::Enumerator クラス。リストを反復するための列挙子クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を用いてこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2600
url: /ja/cpp/system.collections.generic/sortedlist/enumerator/
---
## Enumerator class


[Enumerator](./) class to iterate through list. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | 特定の辞書を反復する列挙子を作成します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) 型エイリアスです。 |
## 参照

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
