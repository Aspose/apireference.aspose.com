---
title: "System::Collections::Generic::Queue クラス"
linktitle: "Queue"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::Queue クラス。C++ における Queue クラスの前方宣言です。"
type: docs
weight: 3600
url: /ja/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Clear](./clear/)() | キュー内のすべての要素を削除します。 |
| virtual [Contains](./contains/)(const T\&) const | operator == を使用して要素を比較し、キューが特定の要素を含むかどうかをチェックします。 |
| [data](./data/)() | 基礎となるデータ構造へのアクセサです。 |
| [data](./data/)() const | 基礎となるデータ構造へのアクセサです。 |
| [Dequeue](./dequeue/)() | キューの先頭からアイテムを取得します。 |
| [Enqueue](./enqueue/)(const T\&) | アイテムをキューの末尾に追加します。 |
| virtual [get_Count](./get_count/)() const | キュー内の要素数を取得します。 |
| [GetEnumerator](./getenumerator/)() override | キューを反復処理するための列挙子を取得します。 |
| [Peek](./peek/)() | キューの先頭からアイテムを取得しますが、キューからは削除しません。 |
| [Queue](./queue/)() | 空のキューを構築します。 |
| [Queue](./queue/)(int) | 空のキューを構築します。 |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | コピーコンストラクタ。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | 同じ型の要素のコンテナです。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 型。 |
| [queue_t](./queue_t/) | RTTI 情報。 |
| [ValueType](./valuetype/) | このタイプ。 |
## 備考


[Queue](./) container wrapping STL list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/queue.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &queue)
{
  for (const int item: queue)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Queue クラスのインスタンスを作成します。
  auto queue = MakeObject<Queue<int>>();

  // キューにデータを入れます。
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // キューの最初の項目を出力します。Peek メソッドはキューから項目を削除しません。
  std::cout << queue->Peek() << std::endl;
  // キューの項目を出力します。
  PrintItems(queue);

  // キューの最初の項目を出力します。Dequeue メソッドはキューから項目を削除します。
  std::cout << queue->Dequeue() << std::endl;
  // キューの項目を出力します。
  PrintItems(queue);

  return 0;
}
/*
This code example produces the following output:
1
1 2 3
1
2 3
*/
```

## 参照

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
