---
title: "System::Runtime::Serialization::SerializationInfo 类"
linktitle: "SerializationInfo"
second_title: "Aspose.Page 适用于 C++"
description: "System::Runtime::Serialization::SerializationInfo 类。保存表示已序列化对象的命名字段集合。未实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 400
url: /zh/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


保存表示序列化对象的命名字段集合。未实现。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SerializationInfo : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | 放置 float 值。未实现。 |
| [AddValue](./addvalue/)(const System::String\&, short) | 放置 short 值。未实现。 |
| [AddValue](./addvalue/)(const System::String\&, bool) | 放置 boolean 值。未实现。 |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | 放置 object 值。未实现。 |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | 放置具有指定类型的 object 值。未实现。 |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | 从 [SerializationInfo](./) 存储中检索值。未实现。 |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | RTTI 信息。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
