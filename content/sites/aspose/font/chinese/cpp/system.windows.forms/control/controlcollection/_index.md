---
title: "System::Windows::Forms::Control::ControlCollection 类"
linktitle: "控件集合"
second_title: "Aspose.Font 适用于 C++"
description: "System::Windows::Forms::Control::ControlCollection 类。控件的集合。在 C++ 中未实现。"
type: docs
weight: 200
url: /zh/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


控件的集合。未实现。

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | 向集合中添加控件。 |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | 向集合中添加多个控件。 |
| [Clear](./clear/)() override | 删除集合中的所有控件。 |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | 检查特定控件是否存在于集合中。 |
| virtual [ContainsKey](./containskey/)(System::String) const | 检查集合中是否存在具有特定名称的控件。 |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | 构造函数。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | 将集合内容复制到现有数组元素中。 |
| [Find](./find/)(const System::String\&, bool) const | 在集合中查找指定名称的控件。可选地递归检查包含的控件的集合。 |
| [get_Count](./get_count/)() const override | 获取集合中控件的数量。 |
| [get_Owner](./get_owner/)() const | 获取集合的拥有者控件。 |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | 查找特定控件。 |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | 查找特定控件。 |
| [GetEnumerator](./getenumerator/)() override | 获取用于遍历集合的枚举器。 |
| [idx_get](./idx_get/)(int) const override | 按索引访问器。 |
| virtual [idx_get](./idx_get/)(System::String) const | 按名称访问器。 |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | 按索引访问器。 |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | 按名称访问器。 |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | 在集合中查找控件。 |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | 在集合中查找具名控件。 |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | 将控件插入集合。 |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | 从集合中移除控件。 |
| [RemoveAt](./removeat/)(int) override | 从集合中移除控件。 |
| virtual [RemoveByKey](./removebykey/)(System::String) | 从集合中移除控件。 |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | 将控件移动到新位置。 |
## 另见

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Font for C++](../../../)
