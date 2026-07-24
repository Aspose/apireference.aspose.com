---
title: "System::Collections::Concurrent::ConcurrentDictionary クラス"
linktitle: "ConcurrentDictionary"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Concurrent::ConcurrentDictionary クラス。スレッドセーフな辞書実装です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


スレッドセーフな辞書実装です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| パラメーター | 説明 |
| --- | --- |
| TKey | キーの種類です。 |
| TValue | 値型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | 辞書に値を追加します。 |
| [Clear](./clear/)() override | コンテナ内のすべての要素を削除します。 |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | コンテナの要素を既存の配列要素にコピーします。 |
| [get_KeysInternal](./get_keysinternal/)() const override | 辞書のキーにアクセスするためのラッパーコレクションを取得します。 |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | RTTI 情報。 |
| [Remove](./remove/)(const TKey\&) override | コンテナから要素を削除します。 |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | 辞書にキーと値のペアを追加しようとします。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) | 実装型です。 |
| [ThisType](./thistype/) | このタイプ。 |
## 備考



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // ConcurrentDictionary クラスのインスタンスを作成します。
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // ConcurrentDictionary にデータを追加します。
  for (auto i = 0; i < itemsCount; ++i)
  {
    concurrentDictionary->Add(i, i * i);
  }

  Console::WriteLine(concurrentDictionary->idx_get(3));

  return 0;
}
/*
This code example produces the following output:
9
*/
```

## 参照

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Page for C++](../../)
