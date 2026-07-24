---
title: "System::Collections::Generic::LinkedList::AddAfter method"
linktitle: "AddAfter"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::LinkedList::AddAfter method. 在 C++ 中在列表的节点后添加 newNode。"
type: docs
weight: 300
url: /zh/cpp/system.collections.generic/linkedlist/addafter/
---
## LinkedList::AddAfter(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) method


在列表的 **node** 之后添加 **newNode**。

```cpp
void System::Collections::Generic::LinkedList<T>::AddAfter(const SharedPtr<LinkedListNode<T>> &node, const SharedPtr<LinkedListNode<T>> &newNode)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 节点 | const SharedPtr\<LinkedListNode\<T\>\>\& | 要插入的节点之后的节点 |
| newNode | const SharedPtr\<LinkedListNode\<T\>\>\& | 要添加的新节点 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [LinkedListNode](../../linkedlistnode/)
* Class [LinkedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## LinkedList::AddAfter(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) method


在列表的 **node** 之后添加 **element**。

```cpp
SharedPtr<LinkedListNode<T>> System::Collections::Generic::LinkedList<T>::AddAfter(const SharedPtr<LinkedListNode<T>> &node, const T &element)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 节点 | const SharedPtr\<LinkedListNode\<T\>\>\& | 要插入的节点之后的节点 |
| 元素 | const T\& | 要添加的元素 |

### ReturnValue

新节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [LinkedListNode](../../linkedlistnode/)
* Class [LinkedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
