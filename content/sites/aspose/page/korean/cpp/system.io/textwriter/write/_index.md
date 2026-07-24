---
title: "System::IO::TextWriter::Write method"
linktitle: "Write"
second_title: "C++용 Aspose.Page"
description: "System::IO::TextWriter::Write 메서드. C++에서 지정된 부울 값의 문자열 표현을 스트림에 씁니다."
type: docs
weight: 900
url: /ko/cpp/system.io/textwriter/write/
---
## TextWriter::Write(bool) method


지정된 부울 값의 문자열 표현을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(bool value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | bool | 쓰기 위한 값 |

## 또 보기

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(char_t) method


지정된 문자를 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(char_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | char_t | 쓰기 위한 값 |

## 또 보기

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const ArrayPtr\<char_t\>\&) method


지정된 배열의 모든 문자를 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(const ArrayPtr<char_t> &buffer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<char_t\>\& | 쓰기 위한 문자를 포함하는 배열 |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


지정된 문자 배열에서 지정된 UTF-16 문자 하위 범위를 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<char_t\>\& | 쓰기 위한 문자를 포함하는 배열 |
| index | int32_t | 쓰기 서브범위가 시작되는 **buffer** 내의 0 기반 인덱스 |
| count | int32_t | 쓰기 서브범위의 문자 수; -1은 서브범위가 **buffer** 배열 끝까지임을 지정합니다 |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const char_t *) method


지정된 c-string을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(const char_t *value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const char_t * | 쓰기 위한 C 문자열 |

## 또 보기

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const SharedPtr\<Object\>\&) method


지정된 객체의 문자열 표현을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(const SharedPtr<Object> &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const SharedPtr\<Object\>\& | 쓰기 위한 객체 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const String\&, const TArgs\&...) method


지정된 형식에 따라 포맷된 지정된 값을 스트림에 씁니다.

```cpp
template<class...> void System::IO::TextWriter::Write(const String &format, const TArgs &... args)
```


| 매개변수 | 설명 |
| --- | --- |
| TArgs | 작성할 값 유형들의 목록 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 형식 | const String\& | 문자열 형식 |
| args | const TArgs\&... | 작성할 값들 |

## 또 보기

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const String\&) method


지정된 문자열을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(const String &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 작성할 문자열 |

## 또 보기

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const TypeInfo\&) method


지정된 [TypeInfo](../../../system/typeinfo/) 객체의 문자열 표현을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(const TypeInfo &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const TypeInfo\& | 쓰기 위한 객체 |

## 또 보기

* Class [TypeInfo](../../../system/typeinfo/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(Decimal) method


지정된 [Decimal](../../../system/decimal/) 객체의 문자열 표현을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(Decimal value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | Decimal | 쓰기 위한 객체 |

## 또 보기

* Class [Decimal](../../../system/decimal/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(double) method


지정된 배정밀도 부동소수점 값의 문자열 표현을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(double value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | double | 쓰기 위한 값 |

## 또 보기

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(float) method


지정된 단정밀도 부동소수점 값의 문자열 표현을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(float value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | float | 쓰기 위한 값 |

## 또 보기

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(int) method


지정된 32비트 정수 값의 문자열 표현을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(int value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int | 쓰기 위한 값 |

## 또 보기

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(int64_t) method


지정된 64비트 정수 값의 문자열 표현을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(int64_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int64_t | 쓰기 위한 값 |

## 또 보기

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(uint32_t) method


지정된 부호 없는 32비트 정수 값의 문자열 표현을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(uint32_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint32_t | 쓰기 위한 값 |

## 또 보기

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(uint64_t) method


지정된 부호 없는 64비트 정수 값의 문자열 표현을 스트림에 씁니다.

```cpp
virtual void System::IO::TextWriter::Write(uint64_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint64_t | 쓰기 위한 값 |

## 또 보기

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
