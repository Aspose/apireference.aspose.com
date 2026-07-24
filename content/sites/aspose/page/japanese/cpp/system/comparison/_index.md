---
title: "System::Comparison クラス"
linktitle: "Comparison"
second_title: "C++ 用 Aspose.Page"
description: "System::Comparison クラス。 同じ型のオブジェクト二つを比較するメソッドへのポインタを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 1300
url: /ja/cpp/system/comparison/
---
## Comparison class


同じ型のオブジェクト二つを比較するメソッドへのポインタを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。[System::SmartPtr](../smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| パラメーター | 説明 |
| --- | --- |
| T | メソッドが比較するオブジェクトの型 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Comparison](./comparison/)(Y) | 指定された呼び出し可能エンティティへのポインタを表す [Comparison](./) デリゲートのインスタンスを作成します。 |
| [operator()](./operator()/)(T, T) | 現在のオブジェクトが指す呼び出し可能オブジェクトを呼び出します。 |
## 備考



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// 動的配列を表すテンプレートクラスです。
template <typename T>
class MyArray
{
  // 配列データの格納に使用されます。
  std::vector<T> m_data;

public:
  // 動的配列の新しいインスタンスを作成します。
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // 配列データをソートするために使用されます。このメソッドはインスタンスを受け取ります。
  // 'System::Comparison' テンプレートクラス。
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // 動的配列が保持する要素数を返します。
  size_t get_Size()
  {
    return m_data.size();
  }

  // 指定されたインデックスの要素を取得するために使用されます。
  T& operator[](int index)
  {
    if (index < 0 || index >= m_data.size())
    {
      throw IndexOutOfRangeException(u"index");
    }
    return m_data[index];
  }
};

int main() {
  // 指定された要素で MyArray クラスのインスタンスを作成します。
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // 動的配列の要素を昇順にソートします。
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // 動的配列の要素を出力します。
  for (auto i = 0; i < arr.get_Size(); ++i)
  {
    Console::WriteLine(arr[i]);
  }

  return 0;
}
/*
This code example produces the following output:
a
b
c
d
e
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
