---
title: "System::Collections::ObjectModel::KeyedCollection class"
linktitle: "KeyedCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::ObjectModel::KeyedCollection class。具有嵌入键的元素抽象集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 200
url: /zh/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


具有嵌入键的元素抽象集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| 参数 | 描述 |
| --- | --- |
| TKey | 密钥类型。 |
| TItem | 值类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const TItem\&) override | 在容器末尾添加项。 |
| [Contains](./contains/)(TKey) | 检查键是否存在于容器中。 |
| [get_Comparer](./get_comparer/)() | 获取比较器。 |
| [idx_get](./idx_get/)(TKey) | 获取特定索引处的项。 |
| [Remove](./remove/)(TKey) | 从容器中移除键。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将特定模板参数视为弱指针而非共享指针（如果适用）。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | 查找字典创建阈值，默认值。 |

## 另见

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
