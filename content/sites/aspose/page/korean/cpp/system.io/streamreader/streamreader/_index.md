---
title: "System::IO::StreamReader::StreamReader 생성자"
linktitle: "StreamReader"
second_title: "C++용 Aspose.Page"
description: "System::IO::StreamReader::StreamReader 생성자. C++에서 지정된 기본 스트림으로부터 UTF-8 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 문자를 읽는 StreamReader 객체의 인스턴스를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


지정된 기본 스트림으로부터 UTF-8 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 문자를 읽는 [StreamReader](../) 객체의 인스턴스를 생성합니다.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<Stream\>\& | 문자를 읽을 기본 스트림 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


지정된 기본 스트림으로부터 UTF-8 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 문자를 읽는 [StreamReader](../) 객체의 인스턴스를 생성합니다. 매개변수는 바이트 순서 표시(BOM) 감지를 활성화할지 여부를 지정합니다.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<Stream\>\& | 문자를 읽을 기본 스트림 |
| detectEncodingFromByteOrderMarks | bool | 스트림 시작 부분에서 바이트 순서 표시를 찾으려면 true, 그렇지 않으면 false |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


지정된 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 지정된 기본 스트림으로부터 문자를 읽는 [StreamReader](../) 객체의 인스턴스를 생성합니다.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<Stream\>\& | 문자를 읽을 기본 스트림 |
| encoding | const EncodingPtr\& | 사용할 인코딩 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


지정된 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 지정된 기본 스트림으로부터 문자를 읽는 [StreamReader](../) 객체의 인스턴스를 생성합니다. 매개변수는 바이트 순서 표시 감지를 활성화할지 여부를 지정합니다.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<Stream\>\& | 문자를 읽을 기본 스트림 |
| encoding | const EncodingPtr\& | 사용할 인코딩 |
| detectEncodingFromByteOrderMarks | bool | 스트림 시작 부분에서 바이트 순서 표시를 찾으려면 true, 그렇지 않으면 false |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


지정된 인코딩과 지정된 크기의 버퍼를 사용하여 지정된 기본 스트림으로부터 문자를 읽는 [StreamReader](../) 객체의 인스턴스를 생성합니다. 매개변수는 바이트 순서 표시 감지를 활성화할지 여부를 지정합니다.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<Stream\>\& | 문자를 읽을 기본 스트림 |
| encoding | const EncodingPtr\& | 사용할 인코딩 |
| detectEncodingFromByteOrderMarks | bool | 스트림 시작 부분에서 바이트 순서 표시를 찾으려면 true, 그렇지 않으면 false |
| bufferSize | int | 버퍼의 최소 크기(바이트 단위) |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


UTF-8 인코딩과 기본 크기 4096바이트 버퍼를 사용하여 지정된 파일로부터 문자를 읽는 [StreamReader](../) 객체의 인스턴스를 생성합니다.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const System::String\& | 문자를 읽을 파일 경로 |

## 또 보기

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


UTF-8 인코딩과 기본 크기 4096바이트 버퍼를 사용하여 지정된 파일로부터 문자를 읽는 [StreamReader](../) 객체의 인스턴스를 생성합니다. 매개변수는 바이트 순서 표시 감지를 활성화할지 여부를 지정합니다.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const System::String\& | 문자를 읽을 파일 경로 |
| detectEncodingFromByteOrderMarks | bool | 파일 시작 부분에서 바이트 순서 표시를 찾으려면 true, 그렇지 않으면 false |

## 또 보기

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


[StreamReader](../) 객체의 인스턴스를 생성하며, 지정된 인코딩을 사용하고 기본 크기 4096바이트인 버퍼로 지정된 파일에서 문자를 읽습니다.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const System::String\& | 문자를 읽을 파일 경로 |
| encoding | const EncodingPtr\& | 사용할 인코딩 |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


[StreamReader](../) 객체의 인스턴스를 생성하며, 지정된 인코딩을 사용하고 기본 크기 4096바이트인 버퍼로 지정된 기본 스트림에서 문자를 읽습니다. 매개변수는 바이트 순서 표시 감지를 활성화할지 여부를 지정합니다.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const System::String\& | 문자를 읽을 파일 경로 |
| encoding | const EncodingPtr\& | 사용할 인코딩 |
| detectEncodingFromByteOrderMarks | bool | 파일 시작 부분에서 바이트 순서 표시를 찾으려면 true, 그렇지 않으면 false |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


[StreamReader](../) 객체의 인스턴스를 생성하며, 지정된 인코딩을 사용하고 지정된 크기의 버퍼로 지정된 파일에서 문자를 읽습니다. 매개변수는 바이트 순서 표시 감지를 활성화할지 여부를 지정합니다.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const System::String\& | 문자를 읽을 파일 경로 |
| encoding | const EncodingPtr\& | 사용할 인코딩 |
| detectEncodingFromByteOrderMarks | bool | 파일 시작 부분에서 바이트 순서 표시를 찾으려면 true, 그렇지 않으면 false |
| bufferSize | int | 버퍼의 최소 크기(바이트 단위) |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
