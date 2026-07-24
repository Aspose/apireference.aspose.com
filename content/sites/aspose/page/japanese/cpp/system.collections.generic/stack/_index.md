---
title: "System::Collections::Generic::Stack クラス"
linktitle: "スタック"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::Stack クラス。C++ における Stack クラスの前方宣言です。"
type: docs
weight: 4600
url: /ja/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | 要素をスタックに入れます。 |
| virtual [Clear](./clear/)() | スタックからすべての要素を削除します。 |
| virtual [Contains](./contains/)(const T\&) const | コンテナに特定のアイテムが存在するかチェックします。比較には operator == を使用します。 |
| [data](./data/)() | 内部データ構造アクセサー。 |
| [data](./data/)() const | 内部データ構造アクセサー。 |
| virtual [get_Count](./get_count/)() const | スタックの要素数を取得します。 |
| [GetEnumerator](./getenumerator/)() override | 現在のスタックを反復するための列挙子を取得します。 |
| [Peek](./peek/)() | スタックのトップ要素を取得しますが、スタックからは削除しません。 |
| [Pop](./pop/)() | スタックの一番上から要素を取得します。 |
| [Push](./push/)(const T\&) | スタックの一番上に要素を置きます。 |
| [Stack](./stack/)() | 空のスタックを構築します。 |
| [Stack](./stack/)(int) | 空のスタックを構築します。 |
| [Stack](./stack/)(IEnumerablePtr) | コピーコンストラクタ。 |
| virtual [ToArray](./toarray/)() | スタックを配列に変換します。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | 同じ型の要素を含むコレクションです。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 型。 |
| [stack_t](./stack_t/) | RTTI 情報。 |
| [ValueType](./valuetype/) | 値型です。 |
## 備考


[Stack](./) class wrapping std::list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/stack.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &stack)
{
  for (const auto item: stack)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Stack-class のインスタンスを作成します。
  auto stack = MakeObject<Stack<int>>();

  // スタックに要素を詰めます。
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // スタックの最後の項目を出力します。Peek メソッドはスタックから項目を削除しません。
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // スタックの最後の項目を出力します。Pop メソッドはスタックから項目を削除します。
  std::cout << stack->Pop() << std::endl;
  PrintItems(stack);

  return 0;
}
/*
This code example produces the following output:
3
3 2 1
3
2 1
*/
```

## 参照

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
