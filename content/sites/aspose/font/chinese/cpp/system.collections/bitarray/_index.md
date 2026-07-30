---
title: "System::Collections::BitArray 类"
linktitle: "BitArray"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::BitArray 类。位数组，可通过索引访问。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 100
url: /zh/cpp/system.collections/bitarray/
---
## BitArray class


[Array](../../system/array/) of bits which can be addressed by index. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class BitArray : public virtual System::Object,
                 public System::Collections::Generic::ICollection<bool>
```

## Nested classes

* Class [Enumerator](./enumerator/)
* Class [Reference](./reference/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const bool\&) override | 在容器末尾添加值。 |
| [And](./and/)(const BitArrayPtr\&) | 计算两个 BitSet 之间的按位 'and'。 |
| [BitArray](./bitarray/)(const bitset\&) | 拷贝构造函数。 |
| [BitArray](./bitarray/)(const BitArray\&) | 拷贝构造函数。 |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | 拷贝构造函数。 |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | 拷贝构造函数。 |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | 拷贝构造函数。 |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | 拷贝构造函数。 |
| [BitArray](./bitarray/)(int, bool) | 填充构造函数。 |
| [Clear](./clear/)() override | 删除所有元素。 |
| [Contains](./contains/)(const bool\&) const override | 检查容器中是否存在特定值。未实现。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | 将数据复制到现有数组元素。 |
| [data](./data/)() | 底层数据结构访问。 |
| [data](./data/)() const | 底层数据结构访问。 |
| [Get](./get/)(int) const | 获取 [BitArray](./) 元素。 |
| [get_Count](./get_count/)() const override | 获取容器大小。 |
| [get_Length](./get_length/)() const | 获取容器大小。 |
| [GetEnumerator](./getenumerator/)() override | 创建枚举器对象。 |
| [idx_get](./idx_get/)(int) const | 获取函数。 |
| [idx_set](./idx_set/)(int, bool) | 设置函数。 |
| [Not](./not/)() | 对 BitSet 取反。 |
| [operator!=](./operator!=/)(const BitArray\&) const | 按位比较运算符。 |
| [operator==](./operator==/)(const BitArray\&) const | 按位比较运算符。 |
| [operator[]](./operator[]/)(int) | 访问器函数。 |
| [Or](./or/)(const BitArrayPtr\&) | 计算两个 BitSet 之间的按位 'or'。 |
| [Remove](./remove/)(const bool\&) override | 返回指定值的第一次出现。未实现。 |
| [Set](./set/)(int, bool) | 设置 [BitArray](./) 元素。 |
| [SetAll](./setall/)(bool) | 将所有元素设置为特定值。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 弱模板参数机制的正式实现；不适用于此类。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
| [Xor](./xor/)(const BitArrayPtr\&) | 计算两个 BitSet 之间的按位 'xor'。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [bitset](./bitset/) | RTTI 信息。 |
## 备注



```cpp
#include <system/collections/bitarray.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void Print(const System::SmartPtr<System::Collections::Generic::IEnumerable<bool>> &bitArray)
{
  for (const auto item: bitArray)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // 构造 BitArray 类的新实例。
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // 打印值。
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## 另见

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
