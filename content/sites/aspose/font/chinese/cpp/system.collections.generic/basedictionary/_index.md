---
title: "System::Collections::Generic::BaseDictionary 类"
linktitle: "BaseDictionary"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::BaseDictionary 类。实现了各种类似字典的数据结构（例如 Dictionary、SortedDictionary）的通用代码。不应直接使用，除非在定义容器时用于继承。该类的对象只能通过 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 500
url: /zh/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


实现了各种类似字典的数据结构（例如 [Dictionary](../dictionary/)、[SortedDictionary](../sorteddictionary/)）的通用代码。不应直接使用，除非在定义容器时用于继承。该类的对象只能通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| 参数 | 描述 |
| --- | --- |
| Map | 底层映射类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | 特定于 C++。 |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | 向字典中添加键值对。 |
| [BaseDictionary](./basedictionary/)() | 创建空的数据结构。 |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | 转发构造函数，将参数传递给底层映射的构造函数。 |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | 拷贝构造函数。 |
| [BaseDictionary](./basedictionary/)(BaseType *) | 拷贝构造函数。 |
| [begin](./begin/)() const | 返回指向容器中键值元素的 KVPair 包装器的迭代器。采用 C# 风格实现——迭代器应返回具有 get_Key() 和 get_Value() 接口的 KVPair 对象。如果容器为空，返回的迭代器将等于 [end()](../ienumerable/end/)。 |
| [cbegin](./cbegin/)() const | 返回指向容器第一个元素的迭代器。采用 STL 风格实现。如果容器为空，返回的迭代器将等于 [end()](../ienumerable/end/)。 |
| [cend](./cend/)() const | 返回指向容器最后一个元素之后的元素的迭代器。采用 STL 风格实现。该元素充当占位符；尝试访问它会导致未定义行为。 |
| [Clear](./clear/)() override | 删除所有元素。 |
| [ContainsKey](./containskey/)(const key_t\&) const override | 检查字典中是否存在键。 |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | 检查字典中是否存在值。使用 operator == 来比较值。 |
| [data](./data/)() | 底层数据存储访问器。 |
| [data](./data/)() const | 底层数据存储访问器。 |
| [end](./end/)() const | 返回指向容器最后一个元素之后的键值元素的 KVPair 包装器的迭代器。采用 C# 风格实现——迭代器应返回具有 get_Key() 和 get_Value() 接口的 KVPair 对象。该元素充当占位符；尝试访问它会导致未定义行为。 |
| [get_Count](./get_count/)() const override | 获取元素计数。 |
| virtual [GetEnumerator](./getenumerator/)() | 创建枚举器实例，应由子类实现。 |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | 如果找到则返回值；否则返回 **Value()**。 |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | 如果找到则返回值；否则返回 **defaultValue**。 |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | 如果找到则返回值；否则返回 **null**。仅对引用类型有意义。 |
| [idx_get](./idx_get/)(const key_t\&) const override | 带键的获取函数。 |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | 带键的设置函数。修改或创建元素。 |
| virtual [operator[]](./operator[]/)(const key_t\&) | 访问器函数。 |
| [Remove](./remove/)(const key_t\&) override | 从字典中移除指定键。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | 查找带键的值并在找到时检索它。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | 实现的接口。 |
| [const_iterator](./const_iterator/) | 常量迭代器类型。 |
| [iterator](./iterator/) | 迭代器类型。 |
| [KeyCollection](./keycollection/) | 确保对底层存储类型使用正确的分配器。 |
| [KVPair](./kvpair/) | 键值对类型。 |
| [map_t](./map_t/) | 内部映射类型。 |
| [ValueCollection](./valuecollection/) | 值的集合。 |

## 另见

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
