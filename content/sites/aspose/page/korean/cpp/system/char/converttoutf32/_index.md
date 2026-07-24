---
title: "System::Char::ConvertToUtf32 메서드"
linktitle: "ConvertToUtf32"
second_title: "C++용 Aspose.Page"
description: "System::Char::ConvertToUtf32 메서드. 지정된 UTF-16 서러게이트 쌍을 C++에서 UTF-32 코드 단위로 변환합니다."
type: docs
weight: 200
url: /ko/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


지정된 UTF-16 서러게이트 쌍을 UTF-32 코드 단위로 변환합니다.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| highSurrogate | char_t | 변환할 UTF-16 서러게이트 쌍의 상위 서러게이트 |
| lowSurrogate | char_t | 변환할 UTF-16 서러게이트 쌍의 하위 서러게이트 |

### ReturnValue

변환 결과로 얻은 UTF-32 코드 단위

## 또 보기

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


지정된 문자열 위치에 있는 UTF-16 인코딩 문자 또는 서러게이트 쌍의 값을 UTF-32 코드 유닛으로 변환합니다.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 문자 또는 서러게이트 쌍을 포함하는 문자열 |
| index | int | 지정된 문자열에서 문자 또는 서러게이트 쌍의 인덱스 위치 |

### ReturnValue

변환 결과로 얻은 UTF-32 코드 단위

## 또 보기

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
