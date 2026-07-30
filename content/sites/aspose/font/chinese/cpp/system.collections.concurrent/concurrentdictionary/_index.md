---
title: "System::Collections::Concurrent::ConcurrentDictionary 类"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Concurrent::ConcurrentDictionary 类。线程安全的字典实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 100
url: /zh/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


线程安全的字典实现。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数中作为参数传递。

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| 参数 | 描述 |
| --- | --- |
| TKey | 密钥类型。 |
| TValue | 值类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | 向字典中添加值。 |
| [Clear](./clear/)() override | 删除容器中的所有元素。 |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | 将容器元素复制到现有数组元素中。 |
| [get_KeysInternal](./get_keysinternal/)() const override | 获取包装集合以访问字典键。 |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | RTTI 信息。 |
| [Remove](./remove/)(const TKey\&) override | 从容器中移除元素。 |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | 尝试向字典中添加键/值对。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | 实现类型。 |
| [ThisType](./thistype/) | 此类型。 |
## 备注



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // 创建 ConcurrentDictionary 类的实例。
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // 填充并发字典。
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

## 另见

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Font for C++](../../)
