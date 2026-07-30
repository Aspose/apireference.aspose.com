---
title: "System::Collections::Generic::IDictionary 类"
linktitle: "IDictionary"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::IDictionary 类。用于类似字典容器的接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2100
url: /zh/cpp/system.collections.generic/idictionary/
---
## IDictionary class


字典类容器的接口。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| 参数 | 描述 |
| --- | --- |
| TKey | 密钥类型。 |
| TValue | 值类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | 向容器中添加键值对。 |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | 检查容器是否包含键。 |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | 将字典内容复制到现有数组元素中。 |
| virtual [get_Count](./get_count/)() const | 取消隐藏 get_Count 成员函数。 |
| [get_IsFixedSize](./get_isfixedsize/)() const | 检查集合大小是否固定。 |
| [get_IsSynchronized](./get_issynchronized/)() const | 检查容器是否线程安全。 |
| virtual [get_Keys](./get_keys/)() const | 访问键集合。 |
| virtual [get_Values](./get_values/)() const | 访问值集合。 |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | 如果找到则返回值；否则返回 **Value()**。 |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | 如果找到则返回值；否则返回 **defaultValue**。 |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | 如果找到则返回值；否则返回 **null**，仅对引用类型有意义。 |
| virtual [idx_get](./idx_get/)(const TKey\&) const | 获取函数。 |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | 设置函数。 |
| virtual [Remove](./remove/)(const TKey\&) | 从容器中移除键。 |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | 查找值并在找到时检索它。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | RTTI 信息。 |
| [KeyValuePairType](./keyvaluepairtype/) | 键值对类型。 |

## 另见

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
