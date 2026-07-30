---
title: "System::Collections::IListImplRefType 类"
linktitle: "IListImplRefType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::IListImplRefType 类。用于在 C++ 中对引用类型的 System::Collections::Generic::List 对象实现 System::Collections::IList 接口的存根。"
type: docs
weight: 1100
url: /zh/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


在 [System::Collections::Generic::List](../../system.collections.generic/list/) 对象上实现 [System::Collections::IList](../ilist/) 接口的存根，适用于引用类型的实现。

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | 将元素添加到列表末尾。 |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | 将类型引用转换为对象值。 |
| [Clear](./clear/)() override | 删除所有元素。 |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | 检查项是否存在于列表中。 |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) 方法实现 获取集合中元素的数量。 |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) 实现 返回一个遍历集合的枚举器。 |
| [idx_get](./idx_get/)(int, int) const override | 获取指定索引处的元素。 |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | 创建新的对象实例。 |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | 获取项在容器中首次出现的索引。 |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | 在指定位置插入元素，后续元素向后移动。 |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | 从列表中移除特定项的第一次出现。 |
| [RemoveAt](./removeat/)(int) override | 移除指定位置的项。 |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | 将对象值转换为特定类型引用。 |
## 另见

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
