---
title: "System::Collections::Generic::IEnumerable 类"
linktitle: "IEnumerable"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::IEnumerable 类。提供对包含元素进行枚举的对象的接口（C++）。"
type: docs
weight: 2200
url: /zh/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


提供包含元素枚举器的对象接口。

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [begin](./begin/)() | 获取指向集合中第一个元素（如果存在）的迭代器。由于 [GetEnumerator()](./getenumerator/) 返回 T 的拷贝对象，不能使用此迭代器更改被引用的对象。 |
| [begin](./begin/)() const | 获取指向集合的 const 限定实例中第一个元素（如果存在）的迭代器。 |
| [cbegin](./cbegin/)() const | 获取指向集合中第一个 const 限定元素（如果存在）的迭代器。 |
| [cend](./cend/)() const | 获取指向集合中最后一个 const 限定元素之后的位置的迭代器（如果存在）。 |
| [end](./end/)() | 获取指向集合中最后一个元素之后的位置的迭代器（如果存在）。由于 [GetEnumerator()](./getenumerator/) 返回 T 的拷贝对象，不能使用此迭代器更改被引用的对象。 |
| [end](./end/)() const | 获取指向集合的 const 限定实例中最后一个元素之后的位置的迭代器（如果存在）。 |
| virtual [GetEnumerator](./getenumerator/)() | 获取枚举器。 |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | 对序列应用累加函数。 |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | 确定序列的所有元素是否满足条件。 |
| [LINQ_Any](./linq_any/)() | 确定序列是否包含任何元素。 |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | 确定序列中是否存在任何元素或满足条件的元素。 |
| [LINQ_Cast](./linq_cast/)() | 将元素转换为指定类型。 |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | 连接两个序列。 |
| [LINQ_Contains](./linq_contains/)(T) | 确定序列是否包含指定值。 |
| [LINQ_Count](./linq_count/)() | 返回序列中元素的数量（通过直接计数计算）。 |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | 返回满足指定条件的序列中元素的数量。 |
| [LINQ_ElementAt](./linq_elementat/)(int) | 返回序列中指定索引处的元素。 |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | 返回序列中指定索引处的元素。 |
| [LINQ_First](./linq_first/)() | 返回序列的第一个元素。 |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | 返回满足指定条件的序列的第一个元素。 |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | 返回序列的第一个元素，如果序列为空则返回默认值。 |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | 返回满足条件的序列的第一个元素，如果未找到此类元素则返回默认值。 |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | 对序列的元素进行分组。 |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>, System::Func\<T, Element\>) | 对序列的元素进行分组。 |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>, System::Func\<Source, Element\>) |  |
| [LINQ_Last](./linq_last/)() | 返回序列的最后一个元素。 |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | 返回序列的最后一个元素，如果序列为空则返回默认值。 |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | 对通用序列的每个元素调用转换函数，并返回最大结果值。 |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | 对通用序列的每个元素调用转换函数，并返回最小结果值。 |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | 根据指定类型过滤序列的元素。 |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | 根据 keySelector 选择的键值，以升序对序列的元素进行排序。 |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | 根据 keySelector 选择的键值，以降序对序列的元素进行排序。 |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | 颠倒序列中元素的顺序。 |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | 转换序列的元素。 |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | 通过结合元素的索引，将序列的每个元素转换为新形式。 |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | 投影序列的每个元素并将生成的序列合并为一个序列。 |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | 返回序列开头指定数量的连续元素。 |
| [LINQ_ToArray](./linq_toarray/)() | 从序列创建数组。 |
| [LINQ_ToList](./linq_tolist/)() | 从序列创建一个 [List<T>](../list/)。 |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | 根据指定的谓词过滤序列。 |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | 获取当前容器的 begin const 迭代器的实现。 |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | 获取当前容器的 begin 迭代器的实现。 |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | 获取当前容器的 end const 迭代器的实现。 |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [const_iterator](./const_iterator/) | 常量迭代器类型。 |
| [IEnumeratorType](./ienumeratortype/) | RTTI 信息。 |
| [iterator](./iterator/) | 迭代器类型。 |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | 内部迭代器基类型。 |
| [virtualized_iterator_element](./virtualized_iterator_element/) | 内部迭代器元素类型。 |

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
