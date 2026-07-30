---
title: "System::Collections::Generic::KeyValuePair 类"
linktitle: "KeyValuePair"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::KeyValuePair 类。键和值的配对。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类管理此类型的对象。"
type: docs
weight: 2900
url: /zh/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


键和值的配对。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../../system/smartptr/) 类管理此类型的对象。

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Key](./get_key/)() const | 获取键。 |
| [get_Value](./get_value/)() const | 获取值。 |
| [GetHashCode](./gethashcode/)() const | 通过对键的哈希值和值的哈希值进行异或来计算键值对的哈希。 |
| [IsNull](./isnull/)() const | 始终返回 false。 |
| [KeyValuePair](./keyvaluepair/)() | 空键值对初始化器。 |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | 构造函数。 |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | 类型转换构造函数。 |
| [operator<](./operator_/)(const KeyValuePair\&) const | 针对从 [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/) 继承的类的补丁，不执行任何比较。 |
| [ToString](./tostring/)() const | 将键值对转换为字符串。 |

## 另见

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
