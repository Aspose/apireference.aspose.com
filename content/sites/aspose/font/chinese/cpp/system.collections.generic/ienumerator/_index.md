---
title: "System::Collections::Generic::IEnumerator 类"
linktitle: "IEnumerator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::IEnumerator 类。可用于遍历某些元素的枚举器接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2300
url: /zh/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


可用于遍历某些元素的枚举器接口。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | 准备迭代器以供 VirtualizedIterator 类使用。 |
| [CloneIterator](./cloneiterator/)() const override | 克隆当前迭代器。 |
| virtual [Current](./current/)() const | 获取当前元素。 |
| virtual [get_Current](./get_current/)() const | 获取当前元素。 |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | 将迭代器向前移动一步。 |
| [InitializeIterator](./initializeiterator/)() override | 执行第一次 [MoveNext()](./movenext/) 调用，并准备枚举器对象供 VirtualizedIterator 使用。 |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | 标记由虚拟化迭代器拥有的枚举器。 |
| virtual [MoveNext](./movenext/)() | 将枚举器移动到下一个元素。如果之前未引用任何元素，则将引用设置为第一个可用元素。如果已到达容器末尾，则不执行任何操作。 |
| virtual [Reset](./reset/)() | 将枚举器重置到第一个元素之前的位置。 |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ValueType](./valuetype/) | 值类型。 |
## 备注



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // 创建 List 类实例。
  auto collection = MakeObject<List<int>>();

  // 填充列表。
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // 获取列表的枚举器。
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // 获取当前元素并打印。
    std::cout << enumerator->get_Current() << ' ';
  }

  // 重置枚举器。
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
