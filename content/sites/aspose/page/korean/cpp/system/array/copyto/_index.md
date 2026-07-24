---
title: "System::Array::CopyTo 메서드"
linktitle: "CopyTo"
second_title: "C++용 Aspose.Page"
description: "System::Array::CopyTo 메서드. 현재 배열의 모든 요소를 지정된 대상 배열로 복사합니다. 요소는 C++에서 arrayIndex 인수로 지정된 인덱스부터 대상 배열에 삽입됩니다."
type: docs
weight: 900
url: /ko/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


현재 배열의 모든 요소를 지정된 대상 배열로 복사합니다. 요소는 arrayIndex 인수로 지정된 인덱스부터 대상 배열에 삽입됩니다.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | 대상 배열 |
| arrayIndex | int | 복사된 항목을 삽입하기 시작하는 대상 배열의 인덱스 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


현재 배열의 모든 요소를 지정된 대상 배열에 복사합니다. 요소는 dstIndex 인수로 지정된 인덱스부터 대상 배열에 삽입됩니다.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| 매개변수 | 설명 |
| --- | --- |
| DstType | 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | 대상 배열 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작하는 대상 배열의 인덱스 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


현재 배열에서 지정된 위치부터 지정된 개수만큼의 요소를 지정된 대상 배열에 복사합니다. 요소는 dstIndex 인수로 지정된 인덱스부터 대상 배열에 삽입됩니다.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| 매개변수 | 설명 |
| --- | --- |
| DstType | 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | 대상 배열 |
| srcIndex | int64_t | 복사를 시작할 소스 배열의 인덱스 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작하는 대상 배열의 인덱스 |
| count | int64_t | 복사할 요소 수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


현재 배열의 모든 요소를 지정된 대상 배열 뷰에 복사합니다. 요소는 dstIndex 인수로 지정된 인덱스부터 대상 배열 뷰에 삽입됩니다.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| 매개변수 | 설명 |
| --- | --- |
| DstType | 대상 배열 뷰의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | 대상 배열 뷰 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작할 대상 배열 뷰의 인덱스 |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


현재 배열에서 지정된 위치부터 지정된 개수만큼의 요소를 지정된 대상 배열 뷰에 복사합니다. 요소는 dstIndex 인수로 지정된 인덱스부터 대상 배열 뷰에 삽입됩니다.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| 매개변수 | 설명 |
| --- | --- |
| DstType | 대상 배열 뷰의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | 대상 배열 뷰 |
| srcIndex | int64_t | 복사를 시작할 소스 배열의 인덱스 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작할 대상 배열 뷰의 인덱스 |
| count | int64_t | 복사할 요소 수 |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
