---
title: "System::IO::StreamWriter::Write 메서드"
linktitle: "Write"
second_title: "C++용 Aspose.Page"
description: "System::IO::StreamWriter::Write 메서드. 지정된 문자를 C++에서 스트림에 씁니다."
type: docs
weight: 1000
url: /ko/cpp/system.io/streamwriter/write/
---
## StreamWriter::Write(char_t) method


지정된 문자를 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::Write(char_t value) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | char_t | 작성할 문자 |

## 또 보기

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&) method


지정된 배열의 모든 문자를 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<char_t\>\& | 쓰기 위한 문자를 포함하는 배열 |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


지정된 문자 배열에서 지정된 UTF-16 문자 하위 범위를 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<char_t\>\& | 쓰기 위한 문자를 포함하는 배열 |
| index | int32_t | 쓰기 서브범위가 시작되는 **buffer** 내의 0 기반 인덱스 |
| count | int32_t | 쓰기 서브범위의 문자 수; -1은 서브범위가 **buffer** 배열 끝까지임을 지정합니다 |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const char_t *) method


지정된 c-string을 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::Write(const char_t *buffer) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const char_t * | 쓰기 위한 C 문자열 |

## 또 보기

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const SharedPtr\<Object\>\&) method


지정된 객체의 문자열 표현을 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::Write(const SharedPtr<Object> &obj) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | 쓰기 위한 객체 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const String\&) method


지정된 문자열을 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::Write(const String &value) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 작성할 문자열 |

## 또 보기

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const System::SharedPtr\<T\>\&) method


지정된 객체의 문자열 표현을 스트림에 씁니다.

```cpp
template<typename T> void System::IO::StreamWriter::Write(const System::SharedPtr<T> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 객체의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | 쓰기 위한 객체 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
