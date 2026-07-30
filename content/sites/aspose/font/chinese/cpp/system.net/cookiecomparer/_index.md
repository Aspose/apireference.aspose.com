---
title: "System::Net::CookieComparer 类"
linktitle: "CookieComparer"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::CookieComparer 类。用于比较 Cookie 类的实例。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 300
url: /zh/cpp/system.net/cookiecomparer/
---
## CookieComparer class


用于比较 [Cookie](../cookie/) 类的实例。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | 比较指定的对象。 |
| static [get_Instance](./get_instance/)() | RTTI 信息。 |
## 另见

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
