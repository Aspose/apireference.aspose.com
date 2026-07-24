---
title: "System::IO::StreamWriter::StreamWriter constructor"
linktitle: "StreamWriter"
second_title: "C++용 Aspose.Page"
description: "System::IO::StreamWriter::StreamWriter 생성자. C++에서 UTF-8 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 지정된 기본 스트림에 문자를 쓰는 StreamWriter 객체의 인스턴스를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


[StreamWriter](../) 객체의 인스턴스를 생성합니다. 이 객체는 UTF-8 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 지정된 기본 스트림에 문자를 씁니다.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<Stream\>\& | 문자를 기록할 기본 스트림 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


지정된 인코딩을 사용하고 기본 크기 1024바이트의 버퍼를 이용하여 지정된 기본 스트림에 문자를 기록하는 [StreamWriter](../) 객체의 인스턴스를 생성합니다.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<Stream\>\& | 문자를 기록할 기본 스트림 |
| encoding | const EncodingPtr\& | 사용할 인코딩 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


지정된 인코딩을 사용하고 지정된 크기의 버퍼를 이용하여 지정된 기본 스트림에 문자를 기록하는 [StreamWriter](../) 객체의 인스턴스를 생성합니다. 매개변수는 [StreamWriter](../) 객체가 해제될 때 기본 스트림을 닫을지 여부를 지정합니다.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<Stream\>\& | 문자를 기록할 기본 스트림 |
| encoding | const EncodingPtr\& | 사용할 인코딩 |
| buffer_size | int | 버퍼의 최소 크기(바이트 단위) |
| leave_open | bool | 현재 [StreamWriter](../) 객체가 해제된 후 기본 스트림을 열어 둘지 여부를 지정합니다 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


UTF-8 인코딩을 사용하고 기본 크기 1024바이트의 버퍼를 이용하여 지정된 파일에 문자를 기록하는 [StreamWriter](../) 객체의 인스턴스를 생성합니다.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 문자를 기록할 파일 경로 |

## 또 보기

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


지정된 인코딩과 버퍼 크기를 사용하여 지정된 파일에 문자를 기록하는 [StreamWriter](../) 객체의 인스턴스를 생성합니다. 매개변수는 데이터를 파일에 추가할지(append) 아니면 파일을 덮어쓸지 여부를 지정합니다.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 문자를 기록할 파일 경로 |
| append | bool | 데이터를 지정된 파일에 추가할지(true) 아니면 파일을 덮어쓸지(false) 여부를 지정합니다. |
| encoding | const EncodingPtr\& | 사용할 인코딩 |
| buffer_size | int | 사용할 버퍼 크기 |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


지정된 인코딩을 사용하고 기본 크기 1024바이트의 버퍼를 이용하여 지정된 파일에 문자를 기록하는 [StreamWriter](../) 객체의 인스턴스를 생성합니다. 매개변수는 데이터를 파일에 추가할지 아니면 파일을 덮어쓸지 여부를 지정합니다.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 문자를 기록할 파일 경로 |
| append | bool | 데이터를 지정된 파일에 추가할지(true) 아니면 파일을 덮어쓸지(false) 여부를 지정합니다. |
| encoding | const EncodingPtr\& | 사용할 인코딩 |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
