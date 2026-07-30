---
title: "System::Collections::Generic::IKVCollection 类"
linktitle: "IKVCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::IKVCollection 类。包含字典式容器的键或值的容器接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 2500
url: /zh/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


包含字典式容器的键或值的容器接口。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| 参数 | 描述 |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) 类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const T\&) override | 向容器添加项。 |
| [Clear](./clear/)() override | 删除容器中的所有元素。 |
| [Contains](./contains/)(const T\&) const override | 检查容器中是否存在该项。 |
| virtual [get_Count](./get_count/)() const | 获取容器中元素的数量。 |
| [get_IsReadOnly](./get_isreadonly/)() const override | 检查容器是否只读。 |
| virtual [GetEnumerator](./getenumerator/)() | RTTI 信息。 |
| virtual [idx_get](./idx_get/)(int) const | 获取函数。 |
| [idx_set](./idx_set/)(int, T) override | 设置函数。 |
| [IndexOf](./indexof/)(const T\&) const override | 获取容器中项的索引。 |
| [Insert](./insert/)(int, const T\&) override | 在指定位置插入项。 |
| [Remove](./remove/)(const T\&) override | 从容器中移除项。 |
| [RemoveAt](./removeat/)(int) override | 移除指定位置的项。 |

## 另见

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
