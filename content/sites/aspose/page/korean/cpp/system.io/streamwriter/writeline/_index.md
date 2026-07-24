---
title: "System::IO::StreamWriter::WriteLine method"
linktitle: "WriteLine"
second_title: "C++용 Aspose.Page"
description: "System::IO::StreamWriter::WriteLine 메서드. C++에서 스트림에 줄 구분 문자들을 기록합니다."
type: docs
weight: 1100
url: /ko/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


줄 구분자 문자를 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## 또 보기

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


지정된 배열의 모든 문자를 줄 바꿈 문자와 함께 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<char_t\>\& | 쓰기 위한 문자를 포함하는 배열 |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


지정된 문자 배열에서 지정된 UTF-16 문자 하위 범위를 줄 바꿈 문자와 함께 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
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
## StreamWriter::WriteLine(const char_t *) method


지정된 C 문자열을 줄 바꿈 문자와 함께 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const char_t * | 쓰기 위한 C 문자열 |

## 또 보기

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


지정된 객체의 문자열 표현에 줄 구분자 문자를 추가하여 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
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
## StreamWriter::WriteLine(const String\&) method


지정된 문자열을 줄 바꿈 문자와 함께 스트림에 씁니다.

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 작성할 문자열 |

## 또 보기

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


지정된 객체의 문자열 표현에 줄 구분자 문자를 추가하여 스트림에 씁니다.

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
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
