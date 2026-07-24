---
title: "System::BitConverter::ToString 메서드"
linktitle: "ToString"
second_title: "C++용 Aspose.Page"
description: "System::BitConverter::ToString 메서드. 지정된 바이트 배열의 모든 값을 16진수 문자열 표현으로 변환합니다. 16진수 표기에서 사용할 문자 대소문자와 인접한 바이트 쌍 사이에 삽입되는 구분자는 C++에서 해당 인수를 통해 지정됩니다."
type: docs
weight: 1200
url: /ko/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


지정된 바이트 배열의 모든 값을 16진수 문자열 표현으로 변환합니다. 16진수 표기에서 사용할 문자 대소문자와 인접한 바이트 쌍 사이에 삽입되는 구분자는 해당 인수들을 통해 지정됩니다.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | 변환할 바이트를 포함하는 [Array](../../array/) |
| 대문자 | bool | 결과 16진수 표현에서 사용할 문자 대소문자를 지정합니다 |
| 구분자 | const String\& | 결과 문자열에서 인접한 바이트 쌍 사이에 삽입되는 구분자로 사용되는 문자열 |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## 또 보기

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


지정된 인덱스에서 시작하여 지정된 바이트 배열의 값을 16진수 문자열 표현으로 변환합니다.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | 변환할 바이트를 포함하는 [Array](../../array/) |
| startIndex | int | 변환을 시작할 지정된 배열의 인덱스 |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## 또 보기

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


지정된 바이트 배열의 값 범위를 16진수 문자열 표현으로 변환합니다.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | 변환할 바이트를 포함하는 [Array](../../array/) |
| startIndex | int | 변환할 바이트 배열 요소 범위가 시작되는 지정된 배열의 인덱스 |
| 길이 | int | 변환할 바이트 배열 요소 범위의 길이 |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## 또 보기

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
