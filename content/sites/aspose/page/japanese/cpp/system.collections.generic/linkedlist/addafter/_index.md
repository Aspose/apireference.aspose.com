---
title: "System::Collections::Generic::LinkedList::AddAfter メソッド"
linktitle: "AddAfter"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::LinkedList::AddAfter メソッド。リストのノードの後に newNode を追加します（C++）。"
type: docs
weight: 300
url: /ja/cpp/system.collections.generic/linkedlist/addafter/
---
## LinkedList::AddAfter(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) method


リストの **node** の後に **newNode** を追加します。

```cpp
void System::Collections::Generic::LinkedList<T>::AddAfter(const SharedPtr<LinkedListNode<T>> &node, const SharedPtr<LinkedListNode<T>> &newNode)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ノード | const SharedPtr\<LinkedListNode\<T\>\>\& | 挿入するノードの後 |
| newNode | const SharedPtr\<LinkedListNode\<T\>\>\& | 追加する新しいノード |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [LinkedListNode](../../linkedlistnode/)
* Class [LinkedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## LinkedList::AddAfter(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) method


リストの **node** の後に **element** を追加します。

```cpp
SharedPtr<LinkedListNode<T>> System::Collections::Generic::LinkedList<T>::AddAfter(const SharedPtr<LinkedListNode<T>> &node, const T &element)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ノード | const SharedPtr\<LinkedListNode\<T\>\>\& | 挿入するノードの後 |
| element | const T\& | 追加する要素 |

### ReturnValue

新しいノード。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [LinkedListNode](../../linkedlistnode/)
* Class [LinkedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
