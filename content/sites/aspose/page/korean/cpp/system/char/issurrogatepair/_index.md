---
title: "System::Char::IsSurrogatePair 메서드"
linktitle: "IsSurrogatePair"
second_title: "C++용 Aspose.Page"
description: "System::Char::IsSurrogatePair 메서드. 두 지정된 문자가 C++에서 UTF-16 서러게이트 쌍을 이루는지 여부를 판단합니다."
type: docs
weight: 1700
url: /ko/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


두 지정된 문자가 UTF-16 서러게이트 쌍을 이루는지 여부를 결정합니다.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| highSurrogate | char_t | high surrogate인지 테스트되는 문자 |
| lowSurrogate | char_t | low surrogate인지 테스트되는 문자 |

### ReturnValue

지정된 문자가 서러게이트 쌍을 이루면 true, 그렇지 않으면 false

## 또 보기

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


지정된 문자 버퍼에서 연속된 두 문자가 서러게이트 쌍인지 여부를 결정합니다.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 문자열 |
| index | int | 테스트할 문자 시퀀스가 시작되는 지정된 버퍼 내의 0부터 시작하는 인덱스 |

### ReturnValue

지정된 문자가 서러게이트 쌍인 경우 true, 그렇지 않으면 - false

## 또 보기

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
