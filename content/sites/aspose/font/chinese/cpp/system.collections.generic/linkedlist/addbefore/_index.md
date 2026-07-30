---
title: "System::Collections::Generic::LinkedList::AddBefore 方法"
linktitle: "AddBefore"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::LinkedList::AddBefore 方法。在 C++ 中将 newNode 添加到列表节点之前。"
type: docs
weight: 400
url: /zh/cpp/system.collections.generic/linkedlist/addbefore/
---
## LinkedList::AddBefore(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) method


在列表的 **node** 之前添加 **newNode**。

```cpp
void System::Collections::Generic::LinkedList<T>::AddBefore(const SharedPtr<LinkedListNode<T>> &node, const SharedPtr<LinkedListNode<T>> &newNode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 节点 | const SharedPtr\<LinkedListNode\<T\>\>\& | 要在其前插入的节点 |
| newNode | const SharedPtr\<LinkedListNode\<T\>\>\& | 要添加的新节点 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [LinkedListNode](../../linkedlistnode/)
* Class [LinkedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## LinkedList::AddBefore(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) method


在列表的 **node** 之前添加 **element**。

```cpp
SharedPtr<LinkedListNode<T>> System::Collections::Generic::LinkedList<T>::AddBefore(const SharedPtr<LinkedListNode<T>> &node, const T &element)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 节点 | const SharedPtr\<LinkedListNode\<T\>\>\& | 要在其前插入的节点 |
| 元素 | const T\& | 要添加的元素 |

### ReturnValue

新节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [LinkedListNode](../../linkedlistnode/)
* Class [LinkedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
