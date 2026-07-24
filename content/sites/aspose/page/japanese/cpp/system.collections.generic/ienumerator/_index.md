---
title: "System::Collections::Generic::IEnumerator class"
linktitle: "IEnumerator"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IEnumerator クラス。いくつかの要素を反復処理するために使用できる列挙子のインターフェイスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2300
url: /ja/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


列挙子のインターフェイスで、いくつかの要素を反復処理するために使用できます。このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | VirtualizedIterator クラスで使用されるイテレータを準備します。 |
| [CloneIterator](./cloneiterator/)() const override | 現在のイテレータをクローンします。 |
| virtual [Current](./current/)() const | 現在の要素を取得します。 |
| virtual [get_Current](./get_current/)() const | 現在の要素を取得します。 |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | イテレータを 1 ステップ前進させます。 |
| [InitializeIterator](./initializeiterator/)() override | 最初の [MoveNext()](./movenext/) 呼び出しを行い、VirtualizedIterator で使用される列挙子オブジェクトを準備します。 |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | 仮想化イテレータが所有する列挙子にマークを付けます。 |
| virtual [MoveNext](./movenext/)() | 列挙子を次の要素へ移動します。以前に要素が参照されていない場合、利用可能な最初の要素を参照に設定します。コンテナの末尾に達した場合は何もしません。 |
| virtual [Reset](./reset/)() | 列挙子を最初の要素の前の位置にリセットします。 |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ValueType](./valuetype/) | 値型です。 |
## 備考



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // List クラスのインスタンスを作成します。
  auto collection = MakeObject<List<int>>();

  // リストを埋めます。
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // リストの列挙子を取得します。
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // 現在の要素を取得して表示します。
    std::cout << enumerator->get_Current() << ' ';
  }

  // 列挙子をリセットします。
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
