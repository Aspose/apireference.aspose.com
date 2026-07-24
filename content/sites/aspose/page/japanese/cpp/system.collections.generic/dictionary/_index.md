---
title: "System::Collections::Generic::Dictionary クラス"
linktitle: "Dictionary"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::Dictionary クラス。C++ における Dictionary クラスの前方宣言です。"
type: docs
weight: 1100
url: /ja/cpp/system.collections.generic/dictionary/
---
## Dictionary class


[Dictionary](./) クラスの前方宣言です。

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| パラメーター | 説明 |
| --- | --- |
| TKey | キーの種類です。 |
| TValue | 値型です。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Dictionary](./dictionary/)() | 空の Dictionary を作成します。 |
| [Dictionary](./dictionary/)(const map_t\&) | map からデータをコピーします。 |
| [Dictionary](./dictionary/)(int) | 事前に割り当てられた Dictionary を作成することに対応するオーバーロードです。実際には割り当てを行いません。 |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | コピーコンストラクタ。 |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | コピーコンストラクタ。 |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | 空の Dictionary を作成します。 |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | 空の Dictionary を作成します。 |
| [GetEnumerator](./getenumerator/)() override | 列挙子オブジェクトを作成します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | 列挙可能インターフェイスへのポインタです。 |
| [IEnumeratorPtr](./ienumeratorptr/) | 列挙子へのポインタです。 |
| [KeyCollection](./keycollection/) | RTTI 情報。 |
| [KVPair](./kvpair/) | キーと値のペアの型です。 |
| [map_t](./map_t/) | 基礎となるデータ型。 |
| [Ptr](./ptr/) | ポインタ型。 |
| [ValueCollection](./valuecollection/) | 抽出する値のコレクションです。 |
## 備考


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Dictionary クラスのインスタンスを作成します。
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // Dictionary を埋めます。
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // Dictionary の項目を出力します。
  for (const auto &pair: dictionary)
  {
    std::cout << pair.get_Key() << " - " << pair.get_Value() << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
0 - Foo
1 - Bar
2 - Baz
*/
```

## 参照

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
