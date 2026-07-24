---
title: "System::Collections::IListImplValueType 类"
linktitle: "IListImplValueType"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::IListImplValueType 类。存根实现了 System::Collections::IList 接口在 System::Collections::Generic::List 对象上，针对 C++ 中的值类型的实现。"
type: docs
weight: 1200
url: /zh/cpp/system.collections/ilistimplvaluetype/
---
## IListImplValueType class


存根实现了 [System::Collections::IList](../ilist/) 接口在 [System::Collections::Generic::List](../../system.collections.generic/list/) 对象上，针对值类型的实现。

```cpp
template<typename T>class IListImplValueType : public virtual System::Collections::IList
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | 向列表末尾添加元素。 |
| [Clear](./clear/)() override | 删除所有元素。 |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | 检查列表中是否存在该项。 |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) 方法实现 获取集合中元素的数量。 |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) 实现 返回一个遍历集合的枚举器。 |
| [idx_get](./idx_get/)(int, int) const override | 获取指定索引处的元素。 |
| [IListImplValueType](./ilistimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IList\<T\>\>) | 创建新的对象实例。 |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | 获取项在容器中首次出现的索引。 |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | 在指定位置插入元素，后面的元素向后移动。 |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | 从列表中移除特定项的第一次出现。 |
| [RemoveAt](./removeat/)(int) override | 移除指定位置的项。 |
## 另见

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
