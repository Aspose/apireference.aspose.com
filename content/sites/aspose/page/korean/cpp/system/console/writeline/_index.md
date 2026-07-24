---
title: "System::Console::WriteLine 메서드"
linktitle: "WriteLine"
second_title: "C++용 Aspose.Page"
description: "System::Console::WriteLine 메서드. 현재 줄 구분자를 C++의 표준 출력 스트림에 출력합니다."
type: docs
weight: 1100
url: /ko/cpp/system/console/writeline/
---
## Console::WriteLine() method


현재 줄 구분자를 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine()
```

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(bool) method


bool 값의 문자열 표현을 현재 줄 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(bool value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | bool | 출력할 값 |

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(char_t) method


지정된 문자 값을 현재 줄 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(char_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | char_t | 출력할 값 |

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const ArrayPtr\<char_t\>\&) method


지정된 문자 배열의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(const ArrayPtr<char_t> &buffer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<char_t\>\& | 출력할 배열 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const ArrayPtr\<char_t\>\&, int, int) method


지정된 문자 배열의 지정된 범위에 대한 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(const ArrayPtr<char_t> &buffer, int index, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<char_t\>\& | 문자 배열 |
| index | int | 출력 범위가 시작되는 배열의 인덱스 |
| count | int | 출력 범위의 요소 수 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const char *) method




```cpp
static void System::Console::WriteLine(const char *)=delete
```

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const char_t *) method


지정된 C 문자열을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(const char_t *value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const char_t * | 출력할 C 문자열 |

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const Decimal\&) method


[Decimal](../../decimal/) 값의 문자열 표현을 현재 줄 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(const Decimal &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Decimal\& | 출력할 값 |

## 또 보기

* Class [Decimal](../../decimal/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const Exception\&) method


지정된 [Exception](../../exception/) 객체의 문자열 표현을 현재 줄 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(const Exception &e)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| e | const Exception\& | 출력할 값 |

## 또 보기

* Typedef [Exception](../../exception/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const SharedPtr\<T\>\&) method


지정된 객체의 문자열 표현을 현재 줄 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
template<class T> static void System::Console::WriteLine(const SharedPtr<T> &object)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 출력할 객체의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | 출력할 [Object](../../object/) |

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const String\&, Args\&&...) method


지정된 형식에 따라 포맷된 지정된 인수들의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
template<class...> static void System::Console::WriteLine(const String &format, Args &&... args)
```


| 매개변수 | 설명 |
| --- | --- |
| 그 | 출력할 값들의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 형식 | const String\& | 문자열 형식 |
| args | Args\&&... | 출력할 값들 |

## 또 보기

* Class [String](../../string/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const String\&) method


지정된 문자열 객체를 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(const String &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 출력할 문자열 객체 |

## 또 보기

* Class [String](../../string/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const TypeInfo\&) method


[TypeInfo](../../typeinfo/) 값의 문자열 표현을 현재 줄 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(const TypeInfo &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const TypeInfo\& | 출력할 값 |

## 또 보기

* Class [TypeInfo](../../typeinfo/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(double) method


배정밀도 부동 소수점 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(double value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | double | 출력할 값 |

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(float) method


단정밀도 부동 소수점 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(float value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | float | 출력할 값 |

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(int32_t) method


32비트 정수 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(int32_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int32_t | 출력할 값 |

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(int64_t) method


64비트 정수 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(int64_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int64_t | 출력할 값 |

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(uint32_t) method


부호 없는 32비트 정수 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(uint32_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint32_t | 출력할 값 |

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(uint64_t) method


부호 없는 64비트 정수 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다.

```cpp
static void System::Console::WriteLine(uint64_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint64_t | 출력할 값 |

## 또 보기

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
