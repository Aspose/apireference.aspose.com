---
title: "System::Array::Copy 메서드"
linktitle: "복사"
second_title: "C++용 Aspose.Page"
description: "System::Array::Copy 메서드. 지정된 수의 요소를 소스 배열에서 대상 배열로 C++에서 복사합니다."
type: docs
weight: 4900
url: /ko/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


소스 배열에서 대상 배열로 지정된 개수만큼 요소를 복사합니다.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 소스 배열 |
| dstArray | const ArrayPtr\<DstType\>\& | 대상 배열 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


지정된 인덱스에서 시작하는 소스 배열의 지정된 개수만큼 요소를 대상 배열의 지정된 위치로 복사합니다.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| SrcType | 소스 배열의 요소 유형 |
| DstType | 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 소스 배열 |
| srcIndex | int64_t | 복사할 항목 범위의 시작을 지정하는 소스 배열의 인덱스 |
| dstArray | const ArrayPtr\<DstType\>\& | 대상 배열 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작하는 대상 배열의 인덱스 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


지정된 인덱스에서 시작하는 소스 배열의 지정된 개수만큼 요소를 대상 배열 뷰의 지정된 위치로 복사합니다.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| SrcType | 소스 배열의 요소 유형 |
| DstType | 대상 배열 뷰의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 소스 배열 |
| srcIndex | int64_t | 복사할 항목 범위의 시작을 지정하는 소스 배열의 인덱스 |
| dstArray | System::Details::ArrayView\<DstType\> | 대상 배열 뷰 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작할 대상 배열 뷰의 인덱스 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


소스 배열에서 지정된 인덱스부터 시작하여 지정된 개수만큼 요소를 스택에 있는 대상 배열의 지정된 위치로 복사합니다.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| SrcType | 소스 배열의 요소 유형 |
| DstType | 스택에 있는 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 소스 배열 |
| srcIndex | int64_t | 복사할 항목 범위의 시작을 지정하는 소스 배열의 인덱스 |
| dstArray | System::Details::StackArray\<DstType, N\>\& | 스택에 있는 대상 배열 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작할 스택에 있는 대상 배열의 인덱스 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


소스 배열에서 대상 배열 뷰로 지정된 개수만큼 요소를 복사합니다.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 소스 배열 |
| dstArray | System::Details::ArrayView\<DstType\> | 대상 배열 뷰 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


소스 배열에서 스택에 있는 대상 배열로 지정된 개수만큼 요소를 복사합니다.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 소스 배열 |
| dstArray | System::Details::StackArray\<DstType, N\>\& | 스택에 있는 대상 배열 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


소스 배열 뷰에서 지정된 인덱스부터 시작하여 지정된 개수만큼 요소를 스택에 있는 대상 배열의 지정된 위치로 복사합니다.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| SrcType | 스택에 있는 소스 배열의 요소 유형 |
| DstType | 스택에 있는 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | 소스 배열 뷰 |
| srcIndex | int64_t | 복사할 항목 범위 시작을 지정하는 소스 배열 뷰의 인덱스 |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | 스택에 있는 대상 배열 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작할 스택에 있는 대상 배열의 인덱스 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


소스 배열 뷰에서 대상 배열로 지정된 개수만큼 요소를 복사합니다.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | 소스 배열 뷰 |
| dstArray | const ArrayPtr\<DstType\>\& | 대상 배열 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


지정된 인덱스에서 시작하는 소스 배열 뷰의 지정된 개수만큼 요소를 대상 배열의 지정된 위치로 복사합니다.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| SrcType | 소스 배열 보기에서 요소의 유형 |
| DstType | 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | 소스 배열 뷰 |
| srcIndex | int64_t | 복사할 항목 범위 시작을 지정하는 소스 배열 뷰의 인덱스 |
| dstArray | const ArrayPtr\<DstType\>\& | 대상 배열 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작하는 대상 배열의 인덱스 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


지정된 인덱스에서 시작하는 소스 배열 뷰의 지정된 개수만큼 요소를 대상 배열 뷰의 지정된 위치로 복사합니다.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| SrcType | 소스 배열 보기에서 요소의 유형 |
| DstType | 대상 배열 뷰의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | 소스 배열 뷰 |
| srcIndex | int64_t | 복사할 항목 범위 시작을 지정하는 소스 배열 뷰의 인덱스 |
| dstArray | System::Details::ArrayView\<DstType\> | 대상 배열 뷰 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작할 대상 배열 뷰의 인덱스 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


소스 배열 뷰에서 대상 배열 뷰로 지정된 개수만큼 요소를 복사합니다.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | 소스 배열 뷰 |
| dstArray | System::Details::ArrayView\<DstType\> | 대상 배열 뷰 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


스택에 있는 소스 배열에서 대상 배열로 지정된 개수만큼 요소를 복사합니다.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | 스택에 있는 소스 배열 |
| dstArray | const ArrayPtr\<DstType\>\& | 대상 배열 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


스택에 있는 소스 배열에서 지정된 인덱스부터 시작하여 지정된 개수만큼 요소를 대상 배열의 지정된 위치로 복사합니다.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| SrcType | 스택에 있는 소스 배열의 요소 유형 |
| DstType | 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | 스택에 있는 소스 배열 |
| srcIndex | int64_t | 복사할 항목 범위의 시작을 지정하는 스택에 있는 소스 배열의 인덱스 |
| dstArray | const ArrayPtr\<DstType\>\& | 대상 배열 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작하는 대상 배열의 인덱스 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


스택에 있는 소스 배열에서 지정된 인덱스부터 시작하여 지정된 개수만큼 요소를 스택에 있는 대상 배열의 지정된 위치로 복사합니다.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| SrcType | 스택에 있는 소스 배열의 요소 유형 |
| DstType | 스택에 있는 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | 스택에 있는 소스 배열 |
| srcIndex | int64_t | 복사할 항목 범위의 시작을 지정하는 스택에 있는 소스 배열의 인덱스 |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | 스택에 있는 대상 배열 |
| dstIndex | int64_t | 복사된 항목을 삽입하기 시작할 스택에 있는 대상 배열의 인덱스 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


스택에 있는 소스 배열에서 스택에 있는 대상 배열로 지정된 개수만큼 요소를 복사합니다.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | 스택에 있는 소스 배열 |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | 스택에 있는 대상 배열 |
| count | int64_t | 복사할 요소의 개수 |

## 또 보기

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
