---
title: "System::Reflection::MemberInfo 类"
linktitle: "MemberInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Reflection::MemberInfo 类。提供成员的反射信息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 700
url: /zh/cpp/system.reflection/memberinfo/
---
## MemberInfo class


提供成员的反射信息。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数参数中传递。

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | 向集合添加属性。 |
| [get_DeclaringType](./get_declaringtype/)() const | 获取声明类型。 |
| [get_FullName](./get_fullname/)() const | 获取成员的完整名称。可能在手动实现的部分中不同。 |
| virtual [get_MemberType](./get_membertype/)() const | 获取一个指示成员类型的 [System::Reflection::MemberTypes](../membertypes/) 值——方法、构造函数、事件等。 |
| [get_Name](./get_name/)() const | 获取成员名称。 |
| [get_ReflectedType](./get_reflectedtype/)() const | 获取反射类型的类型。 |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | 返回一个数组，包含表示当前对象所代表类型上应用的所有自定义属性的对象。 |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | 返回一个数组，包含表示当前对象所代表类型上应用的所有自定义属性的对象。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ObjectPtr](./objectptr/) | 指向 [Object](../../system/object/) 的共享指针的别名。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
