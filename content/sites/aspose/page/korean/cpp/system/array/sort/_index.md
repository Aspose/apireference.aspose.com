---
title: "System::Array::Sort 메서드"
linktitle: "정렬"
second_title: "C++용 Aspose.Page"
description: "**keys** 배열과 해당 **items** 배열 두 개를 **keys** 배열의 값에 따라 정렬하며, 요소들은 C++의 operator< 로 비교됩니다."
type: docs
weight: 5800
url: /ko/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


키를 포함하는 배열 하나와 해당하는 항목을 포함하는 다른 배열 두 개를, 키 배열의 값에 따라 정렬합니다. 이때 요소는 operator<를 사용하여 비교됩니다.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| 매개변수 | 설명 |
| --- | --- |
| TKey | **keys** 배열의 요소 타입 |
| TValue | **items** 배열의 요소 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | 키 값을 포함하는 [Array](../) |
| items | const ArrayPtr\<TValue\>\& | **keys** 배열의 키 값에 매핑된 항목을 포함하는 [Array](../) |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


키를 포함하는 배열 하나와 해당하는 항목을 포함하는 다른 배열 두 개를, 키 배열의 값에 따라 정렬합니다. 이때 요소는 기본 비교자를 사용하여 비교됩니다.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| 매개변수 | 설명 |
| --- | --- |
| TKey | **keys** 배열의 요소 타입 |
| TValue | **items** 배열의 요소 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | 키 값을 포함하는 [Array](../) |
| items | const ArrayPtr\<TValue\>\& | **keys** 배열의 키 값에 매핑된 항목을 포함하는 [Array](../) |
| index | int | 정렬 범위 시작을 지정하는 인덱스 |
| 길이 | int | 정렬 범위 내 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


기본 비교자를 사용하여 지정된 배열의 요소를 정렬합니다.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 대상 배열 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


지정된 비교자를 사용하여 지정된 배열의 요소를 정렬합니다.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 대상 배열 |
| 비교자 | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | 배열 요소를 비교하는 데 사용되는 IComparer<T> 객체 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


구현되지 않음.

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


기본 비교자를 사용하여 지정된 배열의 요소 범위를 정렬합니다.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | 대상 배열 |
| startIndex | int | 정렬할 요소 범위 시작을 지정하는 인덱스 |
| count | int | 정렬할 요소 범위의 크기 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
