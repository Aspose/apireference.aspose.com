---
title: "System::Array::BinarySearch method"
linktitle: "BinarySearch"
second_title: "C++용 Aspose.Page"
description: "System::Array::BinarySearch 메서드. 정렬된 배열에서 C++로 이진 검색을 수행합니다."
type: docs
weight: 4600
url: /ko/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


정렬된 배열에서 이진 검색을 수행합니다.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | 검색을 수행할 정렬된 배열 |
| 항목 | const T\& | 검색할 항목 |

### ReturnValue

검색된 항목이 발견되면 해당 항목의 인덱스를 반환하고, 그렇지 않으면 검색된 항목보다 큰 다음 항목의 인덱스의 비트 보수이거나, 더 큰 항목이 없을 경우 배열 요소 수의 비트 보수인 음수를 반환합니다.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


구현되지 않음.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
