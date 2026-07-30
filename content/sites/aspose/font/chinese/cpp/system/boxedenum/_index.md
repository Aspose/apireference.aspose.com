---
title: "System::BoxedEnum 类"
linktitle: "BoxedEnum"
second_title: "Aspose.Font 适用于 C++"
description: "System::BoxedEnum 类。表示装箱的枚举值。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 700
url: /zh/cpp/system/boxedenum/
---
## BoxedEnum class


表示装箱的枚举值。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| 参数 | 描述 |
| --- | --- |
| E | 枚举值的类型 |
| UT | 枚举 **E** 的基础类型 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | 构造一个实例，以表示指定的枚举值。 |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | 将装箱的枚举常量的值转换为 64 位整数值。 |
| [IsBoxedEnum](./isboxedenum/)() override | 确定当前对象是否表示枚举类型的装箱值。 |
| [ToString](./tostring/)() const override | 将当前对象表示的装箱值转换为字符串。 |

## 另见

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
