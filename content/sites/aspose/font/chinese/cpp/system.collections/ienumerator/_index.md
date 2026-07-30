---
title: "System::Collections::IEnumerator 类"
linktitle: "IEnumerator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::IEnumerator 类。可用于遍历某些元素的枚举器接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 600
url: /zh/cpp/system.collections/ienumerator/
---
## IEnumerator class


可用于遍历某些元素的枚举器接口。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Current](./current/)() const | 获取当前元素。 |
| virtual [get_Current](./get_current/)() const | 获取当前元素。 |
| virtual [MoveNext](./movenext/)() | 将枚举器移动到下一个元素。如果之前未引用任何元素，则将引用设置为第一个可用元素。如果已到达容器末尾，则不执行任何操作。 |
| virtual [Reset](./reset/)() | 将枚举器重置到第一个元素之前的位置。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ValueType](./valuetype/) | RTTI 信息。 |

## 另见

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
