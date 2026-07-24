---
title: "System::Collections::Generic::List::Sort メソッド"
linktitle: "ソート"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::List::Sort メソッド。C++ でデフォルトの比較子を使用してリスト内の要素をソートします。"
type: docs
weight: 4400
url: /ja/cpp/system.collections.generic/list/sort/
---
## List::Sort() method


デフォルトの比較子を使用してリスト内の要素をソートします。

```cpp
void System::Collections::Generic::List<T>::Sort()
```

## 参照

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::Sort(Comparison\<T\>, bool) method


リスト内の要素をソートします。

```cpp
void System::Collections::Generic::List<T>::Sort(Comparison<T> comparison, bool)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| comparison | Comparison\<T\> | [Comparison](../../../system/comparison/) を使用します。 |

## 参照

* Class [Comparison](../../../system/comparison/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::Sort(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


リスト内の要素をソートします。

```cpp
void System::Collections::Generic::List<T>::Sort(const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 比較子 | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | 使用する比較器。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::Sort(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) method


リストスライス内の要素をソートします。

```cpp
void System::Collections::Generic::List<T>::Sort(int index, int count, SharedPtr<System::Collections::Generic::IComparer<T>> comparator)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | スライスの開始インデックス。 |
| count | int | スライスのサイズ。 |
| 比較子 | SharedPtr\<System::Collections::Generic::IComparer\<T\>\> | 使用する比較器。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IComparer](../../icomparer/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
