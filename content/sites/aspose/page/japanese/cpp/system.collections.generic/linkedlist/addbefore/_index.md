---
title: "System::Collections::Generic::LinkedList::AddBefore メソッド"
linktitle: "AddBefore"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::LinkedList::AddBefore メソッド。C++ でリストのノードの前に newNode を追加します。"
type: docs
weight: 400
url: /ja/cpp/system.collections.generic/linkedlist/addbefore/
---
## LinkedList::AddBefore(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) method


リストの **node** の前に **newNode** を追加します。

```cpp
void System::Collections::Generic::LinkedList<T>::AddBefore(const SharedPtr<LinkedListNode<T>> &node, const SharedPtr<LinkedListNode<T>> &newNode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ノード | const SharedPtr\<LinkedListNode\<T\>\>\& | 挿入する前のノード |
| newNode | const SharedPtr\<LinkedListNode\<T\>\>\& | 追加する新しいノード |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [LinkedListNode](../../linkedlistnode/)
* Class [LinkedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## LinkedList::AddBefore(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) method


リストの **node** の前に **element** を追加します。

```cpp
SharedPtr<LinkedListNode<T>> System::Collections::Generic::LinkedList<T>::AddBefore(const SharedPtr<LinkedListNode<T>> &node, const T &element)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ノード | const SharedPtr\<LinkedListNode\<T\>\>\& | 挿入する前のノード |
| element | const T\& | 追加する要素 |

### ReturnValue

新しいノード。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [LinkedListNode](../../linkedlistnode/)
* Class [LinkedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
