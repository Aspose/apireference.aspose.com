---
title: "System::Buffer::SetByte 메서드"
linktitle: "SetByte"
second_title: "C++용 Aspose.Page"
description: "System::Buffer::SetByte 메서드. 지정된 형식 배열을 원시 바이트 배열로 해석하고 C++에서 지정된 바이트 오프셋에 지정된 바이트 값을 설정합니다."
type: docs
weight: 400
url: /ko/cpp/system/buffer/setbyte/
---
## Buffer::SetByte(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) method


지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에 지정된 바이트 값을 설정합니다.

```cpp
template<typename T> static void System::Buffer::SetByte(const SharedPtr<Array<T>> &array, int index, uint8_t value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 배열 요소의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | 대상 배열 |
| index | int | 설정할 바이트의 0 기반 오프셋 |
| value | uint8_t | 설정할 바이트 값 |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::ArrayView\<T\>\&, int, uint8_t) method


지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에 지정된 바이트 값을 설정합니다.

```cpp
template<typename T> static void System::Buffer::SetByte(const System::Details::ArrayView<T> &array, int index, uint8_t value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 배열 요소의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | 대상 배열 뷰 |
| index | int | 설정할 바이트의 0 기반 오프셋 |
| value | uint8_t | 설정할 바이트 값 |

## 또 보기

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::StackArray\<T, N\>\&, int, uint8_t) method


지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에 지정된 바이트 값을 설정합니다.

```cpp
template<typename T,std::size_t> static void System::Buffer::SetByte(const System::Details::StackArray<T, N> &array, int index, uint8_t value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 배열 요소의 유형 |
| N | 스택 배열의 크기 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | 대상 스택 배열 |
| index | int | 설정할 바이트의 0 기반 오프셋 |
| value | uint8_t | 설정할 바이트 값 |

## 또 보기

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
