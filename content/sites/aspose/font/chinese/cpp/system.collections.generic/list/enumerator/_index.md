---
title: "System::Collections::Generic::List::Enumerator 类"
linktitle: "枚举器"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::List::Enumerator 类. 用于遍历列表元素的枚举器。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 6100
url: /zh/cpp/system.collections.generic/list/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through list elements. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<vector_t>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | 创建遍历特定列表的枚举器。 |
## 另见

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
