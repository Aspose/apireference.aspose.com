---
title: "System::IO::MemoryStream::MemoryStream 생성자"
linktitle: "MemoryStream"
second_title: "C++용 Aspose.Page"
description: "System::IO::MemoryStream::MemoryStream 생성자. 초기 용량이 0인 MemoryStream 클래스의 새 인스턴스를 C++에서 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


초기 용량이 0인 [MemoryStream](../) 클래스의 새 인스턴스를 생성합니다.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## 또 보기

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


지정된 메모리 버퍼에 연결된 메모리 스트림을 나타내는 [MemoryStream](../) 클래스의 새 인스턴스를 생성합니다. 매개변수는 스트림이 쓰기 가능한지 여부를 지정합니다.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | 생성되는 객체가 나타내는 스트림이 기반으로 할 메모리 버퍼로 사용할 바이트 배열 |
| 쓰기 가능 | bool | 스트림이 쓰기 가능해야 하는지 지정합니다. |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


지정된 인덱스에서 시작하여 지정된 개수만큼의 요소를 포함하는 지정된 메모리 버퍼의 세그먼트에 연결된 메모리 스트림을 나타내는 [MemoryStream](../) 클래스의 새 인스턴스를 생성합니다. 매개변수는 스트림이 쓰기 가능한지와 메서드 GetBytes()를 호출할 수 있는지를 지정합니다.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | 생성되는 객체가 나타내는 스트림이 기반으로 할 메모리 버퍼로 사용할 세그먼트를 포함하는 바이트 배열 |
| index | int | 세그먼트가 시작되는 **content** 내 요소의 0부터 시작하는 인덱스 |
| count | int | 세그먼트에 포함된 **content**의 요소 수 |
| 쓰기 가능 | bool | 스트림이 쓰기 가능해야 하는지 지정합니다. |
| publiclyVisible | bool | 기본 메모리 버퍼를 메서드 GetByte() 호출자에게 제공할지 여부를 지정합니다. |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


지정된 크기의 메모리 버퍼를 기반으로 하는 스트림을 나타내는 [MemoryStream](../) 클래스의 새 인스턴스를 생성합니다.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| capacity_ | int | 생성되는 객체가 나타내는 스트림과 연결된 메모리 버퍼의 크기(바이트) |

## 또 보기

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
