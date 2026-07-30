---
title: "System::Collections::Generic::Stack::Enumerator 类"
linktitle: "枚举器"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::Stack::Enumerator 类。用于遍历栈的枚举器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2000
url: /zh/cpp/system.collections.generic/stack/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through stack. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::ReverseEnumerator<stack_t>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | 构造遍历给定栈的枚举器。 |
## 另见

* Class [ReverseEnumerator](../../reverseenumerator/)
* Class [Stack](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
