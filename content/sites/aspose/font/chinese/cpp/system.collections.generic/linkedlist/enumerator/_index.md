---
title: "System::Collections::Generic::LinkedList::Enumerator 类"
linktitle: "枚举器"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::LinkedList::Enumerator 类。 用于在 C++ 中遍历链表的枚举器。"
type: docs
weight: 3600
url: /zh/cpp/system.collections.generic/linkedlist/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through linked list.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<LinkedList\<T\>\>\&) | 创建枚举器。 |
| [get_Current](./get_current/)() const override | 获取当前元素。 |
| [MoveNext](./movenext/)() override | 指向下一个元素的枚举器（如果存在）。 |
## 另见

* Class [Object](../../../system/object/)
* Class [IEnumerator](../../ienumerator/)
* Class [LinkedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
