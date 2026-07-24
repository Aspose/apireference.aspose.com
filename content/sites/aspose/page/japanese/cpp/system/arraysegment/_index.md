---
title: "System::ArraySegment クラス"
linktitle: "ArraySegment"
second_title: "C++ 用 Aspose.Page"
description: "System::ArraySegment クラス。1 次元配列のセグメントを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。この型のオブジェクトを管理するために System::SmartPtr クラスを C++ で使用しないでください。"
type: docs
weight: 300
url: /ja/cpp/system/arraysegment/
---
## ArraySegment class


1 次元配列のセグメントを表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。この型のオブジェクトを管理するために [System::SmartPtr](../smartptr/) クラスを使用しないでください。

```cpp
template<typename T>class ArraySegment : public System::Object
```


| パラメーター | 説明 |
| --- | --- |
| T | 配列セグメント要素の型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
## 備考



```cpp
#include <system/array_segment.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<ArraySegment<String>> &segment)
{
  for (auto i = segment->get_Offset(); i < segment->get_Offset() + segment->get_Count(); i++)
  {
    std::cout << segment->get_Array()[i] << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // 配列を作成し、データを埋めます。
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // 配列全体を含む配列セグメントを作成します。
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // 配列セグメントの要素を出力します。
  Print(fullArray);

  // 配列セグメントを作成します。
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // 配列セグメントの要素を出力します。
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
