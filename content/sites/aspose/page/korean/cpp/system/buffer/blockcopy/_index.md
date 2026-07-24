---
title: "System::Buffer::BlockCopy 메서드"
linktitle: "BlockCopy"
second_title: "C++용 Aspose.Page"
description: "System::Buffer::BlockCopy 메서드. 지정된 두 타입 배열을 바이트 원시 배열로 해석하고 C++에서 하나에서 다른 하나로 데이터를 복사합니다."
type: docs
weight: 100
url: /ko/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| 매개변수 | 설명 |
| --- | --- |
| TSrc | 소스 배열의 요소 유형 |
| TDst | 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | 소스 배열 |
| srcOffset | int | 복사가 시작되는 소스 배열의 바이트 오프셋 |
| dst | const SharedPtr\<Array\<TDst\>\>\& | 대상 배열 |
| dstOffset | int | 데이터 삽입을 시작하는 대상 배열의 바이트 오프셋 |
| count | int | 복사할 바이트 수 |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| 매개변수 | 설명 |
| --- | --- |
| TSrc | 소스 배열의 요소 유형 |
| TDst | 대상 배열 뷰의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | 소스 배열 |
| srcOffset | int | 복사가 시작되는 소스 배열의 바이트 오프셋 |
| dst | const System::Details::ArrayView\<TDst\>\& | 대상 배열 뷰 |
| dstOffset | int | 데이터 삽입을 시작할 대상 배열 뷰 내의 바이트 오프셋 |
| count | int | 복사할 바이트 수 |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| 매개변수 | 설명 |
| --- | --- |
| TSrc | 소스 배열의 요소 유형 |
| TDst | 대상 스택 배열의 요소 유형 |
| ND | 대상 스택 배열의 크기 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | 소스 배열 |
| srcOffset | int | 복사가 시작되는 소스 배열의 바이트 오프셋 |
| dst | const System::Details::StackArray\<TDst, ND\>\& | 대상 스택 배열 |
| dstOffset | int | 데이터 삽입을 시작할 대상 스택 배열 내의 바이트 오프셋 |
| count | int | 복사할 바이트 수 |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| 매개변수 | 설명 |
| --- | --- |
| TSrc | 소스 배열 뷰의 요소 유형 |
| TDst | 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | 소스 배열 뷰 |
| srcOffset | int | 복사가 시작되는 소스 배열 뷰 내의 바이트 오프셋 |
| dst | const SharedPtr\<Array\<TDst\>\>\& | 대상 배열 |
| dstOffset | int | 데이터 삽입을 시작하는 대상 배열의 바이트 오프셋 |
| count | int | 복사할 바이트 수 |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| 매개변수 | 설명 |
| --- | --- |
| TSrc | 소스 배열 뷰의 요소 유형 |
| TDst | 대상 배열 뷰의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | 소스 배열 뷰 |
| srcOffset | int | 복사가 시작되는 소스 배열 뷰 내의 바이트 오프셋 |
| dst | const System::Details::ArrayView\<TDst\>\& | 대상 배열 뷰 |
| dstOffset | int | 데이터 삽입을 시작할 대상 배열 뷰 내의 바이트 오프셋 |
| count | int | 복사할 바이트 수 |

## 또 보기

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| 매개변수 | 설명 |
| --- | --- |
| TSrc | 소스 스택 배열의 요소 유형 |
| NS | 소스 스택 배열의 크기 |
| TDst | 대상 배열의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | 소스 스택 배열 |
| srcOffset | int | 복사가 시작되는 소스 스택 배열 내의 바이트 오프셋 |
| dst | const SharedPtr\<Array\<TDst\>\>\& | 대상 배열 |
| dstOffset | int | 데이터 삽입을 시작하는 대상 배열의 바이트 오프셋 |
| count | int | 복사할 바이트 수 |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| 매개변수 | 설명 |
| --- | --- |
| TSrc | 소스 스택 배열의 요소 유형 |
| NS | 소스 스택 배열의 크기 |
| TDst | 대상 스택 배열의 요소 유형 |
| ND | 대상 스택 배열의 크기 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | 소스 스택 배열 |
| srcOffset | int | 복사가 시작되는 소스 스택 배열 내의 바이트 오프셋 |
| dst | const System::Details::StackArray\<TDst, ND\>\& | 대상 스택 배열 |
| dstOffset | int | 데이터 삽입을 시작할 대상 스택 배열 내의 바이트 오프셋 |
| count | int | 복사할 바이트 수 |

## 또 보기

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


지정된 바이트 수를 소스 버퍼에서 대상 버퍼로 복사합니다.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| src | const uint8_t * | 소스 버퍼에 대한 포인터 |
| srcOffset | int | 복사가 시작되는 소스 버퍼 내의 바이트 오프셋 |
| dst | uint8_t * | 대상 버퍼에 대한 포인터 |
| dstOffset | int | 데이터 삽입을 시작할 대상 버퍼 내의 바이트 오프셋 |
| count | int | 복사할 바이트 수 |

## 또 보기

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
