---
title: "System::Collections::Generic::Dictionary 类"
linktitle: "Dictionary"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::Dictionary 类。C++ 中 Dictionary 类的前向声明。"
type: docs
weight: 1100
url: /zh/cpp/system.collections.generic/dictionary/
---
## Dictionary class


对 [Dictionary](./) 类的前向声明。

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| 参数 | 描述 |
| --- | --- |
| TKey | 密钥类型。 |
| TValue | 值类型。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [Dictionary](./dictionary/)() | 创建空字典。 |
| [Dictionary](./dictionary/)(const map_t\&) | 从映射复制数据。 |
| [Dictionary](./dictionary/)(int) | 对应创建预分配字典的重载；实际上不进行分配。 |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | 拷贝构造函数。 |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | 拷贝构造函数。 |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | 创建空字典。 |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | 创建空字典。 |
| [GetEnumerator](./getenumerator/)() override | 创建枚举器对象。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | 指向可枚举接口的指针。 |
| [IEnumeratorPtr](./ienumeratorptr/) | 指向枚举器的指针。 |
| [KeyCollection](./keycollection/) | RTTI 信息。 |
| [KVPair](./kvpair/) | 键值对类型。 |
| [map_t](./map_t/) | 底层数据类型。 |
| [Ptr](./ptr/) | 指针类型。 |
| [ValueCollection](./valuecollection/) | 要提取的值集合。 |
## 备注


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // 创建 Dictionary 类的实例。
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // 填充字典。
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // 打印字典项。
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

## 另见

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
