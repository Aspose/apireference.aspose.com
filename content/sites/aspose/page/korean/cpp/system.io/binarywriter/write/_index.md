---
title: "System::IO::BinaryWriter::Write 메서드"
linktitle: "Write"
second_title: "C++용 Aspose.Page"
description: "System::IO::BinaryWriter::Write 메서드. 값이 ''true''이면 0, ''false''이면 1인 단일 바이트를 출력 스트림에 씁니다 (C++)."
type: docs
weight: 800
url: /ko/cpp/system.io/binarywriter/write/
---
## BinaryWriter::Write(bool) method


**value**가 'true'이면 값이 0인 단일 바이트를, **value**가 'false'이면 값이 1인 단일 바이트를 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(bool value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | bool | 출력 스트림에 기록할 바이트 값을 지정하는 부울 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(char16_t) method


지정된 16비트 와이드 문자 값을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(char16_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | char16_t | 쓰기 위한 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<char_t\>\&, int, int) method


지정된 문자 배열에서 지정된 UTF-16 문자 하위 범위를 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<char_t> &buffer, int index=0, int count=-1)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<char_t\>\& | 쓰기 위한 문자를 포함하는 배열 |
| index | int | 쓰기 서브범위가 시작되는 **buffer** 내의 0 기반 인덱스 |
| count | int | 쓰기 서브범위의 문자 수; -1은 서브범위가 **buffer** 배열 끝까지임을 지정합니다 |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const ArrayPtr\<uint8_t\>\&, int, int) method


지정된 바이트 배열에서 지정된 바이트 하위 범위를 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(const ArrayPtr<uint8_t> &buffer, int index=0, int count=-1)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 쓰기를 위한 바이트를 포함하는 배열 |
| index | int | 쓰기 서브범위가 시작되는 **buffer** 내의 0 기반 인덱스 |
| count | int | 작성할 하위 범위의 요소 수; -1은 하위 범위가 **buffer** 배열이 끝나는 지점에서 끝남을 지정합니다. |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const char_t *) method


현재 인코딩에서 길이 접두사가 있는 문자열을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(const char_t *value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const char_t * | 쓰기 위한 C 문자열 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const Decimal\&) method


지정된 [Decimal](../../../system/decimal/) 값의 바이트 표현을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(const Decimal &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Decimal\& | 쓰기 위한 값 |

## 또 보기

* Class [Decimal](../../../system/decimal/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(const String\&) method


현재 인코딩에서 길이 접두사가 있는 문자열을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(const String &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 작성할 문자열 |

## 또 보기

* Class [String](../../../system/string/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(double) method


지정된 배정밀도 부동 소수점 값을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(double value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | double | 쓰기 위한 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(float) method


지정된 단정밀도 부동 소수점 값을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(float value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | float | 쓰기 위한 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int) method


지정된 32비트 정수 값을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(int value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int | 쓰기 위한 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int16_t) method


지정된 16비트 정수 값을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(int16_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int16_t | 쓰기 위한 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(int64_t) method


지정된 64비트 정수 값을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(int64_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int64_t | 쓰기 위한 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint16_t) method


지정된 부호 없는 16비트 정수 값을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(uint16_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint16_t | 쓰기 위한 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint32_t) method


지정된 부호 없는 32비트 정수 값을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(uint32_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint32_t | 쓰기 위한 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint64_t) method


지정된 부호 없는 64비트 정수 값을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(uint64_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint64_t | 쓰기 위한 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryWriter::Write(uint8_t) method


지정된 부호 없는 8비트 정수 값을 출력 스트림에 씁니다.

```cpp
virtual void System::IO::BinaryWriter::Write(uint8_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint8_t | 쓰기 위한 값 |

## 또 보기

* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
