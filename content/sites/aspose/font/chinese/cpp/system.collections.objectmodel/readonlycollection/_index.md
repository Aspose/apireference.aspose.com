---
title: "System::Collections::ObjectModel::ReadOnlyCollection 类"
linktitle: "只读集合"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::ObjectModel::ReadOnlyCollection 类。将特定容器包装以只读模式访问。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 300
url: /zh/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


将特定容器包装以只读模式访问。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | 检查容器是否包含特定项目。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | 将容器元素复制到现有数组元素中。 |
| [get_Count](./get_count/)() const override | 获取容器元素的计数。 |
| [get_IsReadOnly](./get_isreadonly/)() const override | 检查集合是否为只读。 |
| [GetEnumerator](./getenumerator/)() override | 获取集合的枚举器。 |
| [idx_get](./idx_get/)(int) const override | 获取特定位置的项。 |
| [IndexOf](./indexof/)(const T\&) const override | 在集合中查找特定项。 |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | 将只读集合包装在特定集合周围。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 不执行任何操作，因为只读集合仅包装数据且不存储任何内容。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | 实现的接口。 |
| [IEnumeratorPtr](./ienumeratorptr/) | 相同元素的容器。 |
| [ValueType](./valuetype/) | 值类型。 |

## 另见

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
