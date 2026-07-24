---
title: "System::Buffer::GetByte 메서드"
linktitle: "GetByte"
second_title: "C++용 Aspose.Page"
description: "System::Buffer::GetByte 메서드. 지정된 타입 배열을 원시 바이트 배열로 해석하고 C++에서 지정된 바이트 오프셋에 있는 바이트 값을 검색합니다."
type: docs
weight: 300
url: /ko/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에서 바이트 값을 가져옵니다.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 배열 요소의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | 대상 배열 |
| index | int | 검색할 바이트의 0 기반 오프셋 |

### ReturnValue

지정된 인덱스에 있는 바이트 값

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에서 바이트 값을 가져옵니다.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 배열 뷰의 요소 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | 대상 배열 뷰 |
| index | int | 검색할 바이트의 0 기반 오프셋 |

### ReturnValue

지정된 인덱스에 있는 바이트 값

## 또 보기

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에서 바이트 값을 가져옵니다.

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 스택 배열의 요소 유형 |
| N | 스택 배열의 크기 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | 대상 스택 배열 |
| index | int | 검색할 바이트의 0 기반 오프셋 |

### ReturnValue

지정된 인덱스에 있는 바이트 값

## 또 보기

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
