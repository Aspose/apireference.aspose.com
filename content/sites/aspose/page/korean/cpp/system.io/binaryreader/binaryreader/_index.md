---
title: "System::IO::BinaryReader::BinaryReader constructor"
linktitle: "BinaryReader"
second_title: "C++용 Aspose.Page"
description: "System::IO::BinaryReader::BinaryReader 생성자. C++에서 UTF-8 인코딩을 사용하여 지정된 스트림에서 데이터를 읽는 BinaryReader 클래스의 인스턴스를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.io/binaryreader/binaryreader/
---
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&) constructor


UTF-8 인코딩을 사용하여 지정된 스트림에서 데이터를 읽는 [BinaryReader](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<Stream\>\& | 입력 스트림 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


지정된 인코딩을 사용하여 지정된 스트림에서 데이터를 읽는 [BinaryReader](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input, const SharedPtr<Text::Encoding> &encoding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<Stream\>\& | 입력 스트림 |
| encoding | const SharedPtr\<Text::Encoding\>\& | 사용할 인코딩 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::BinaryReader(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) constructor


지정된 인코딩을 사용하여 지정된 스트림에서 데이터를 읽는 [BinaryReader](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::IO::BinaryReader::BinaryReader(const SharedPtr<Stream> &input, const SharedPtr<Text::Encoding> &encoding, bool leaveOpen)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const SharedPtr\<Stream\>\& | 입력 스트림 |
| encoding | const SharedPtr\<Text::Encoding\>\& | 사용할 인코딩 |
| leaveOpen | bool | 현재 객체가 해제된 후 스트림 **input**을 열어 둬야 하는지 여부를 지정합니다 (true) 또는 그렇지 않은지 (false) |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
