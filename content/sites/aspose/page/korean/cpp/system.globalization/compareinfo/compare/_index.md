---
title: "System::Globalization::CompareInfo::Compare 메서드"
linktitle: "Compare"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::CompareInfo::Compare 메서드. 문자열을 비교합니다. C++에서는 Ordinal 및 OrdinalIgnoreCase 모드만 지원됩니다."
type: docs
weight: 200
url: /ko/cpp/system.globalization/compareinfo/compare/
---
## CompareInfo::Compare(const String\&, const String\&, CompareOptions) const method


문자열을 비교합니다. Ordinal 및 OrdinalIgnoreCase 모드만 지원됩니다.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &a, const String &b, CompareOptions options) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | const String\& | 좌변 문자열. |
| b | const String\& | 우변 문자열. |
| options | CompareOptions | [String](../../../system/string/) 비교 유형. |

### ReturnValue

좌변 문자열이 우변 문자열보다 앞서면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, const String\&) const method


문자열을 비교합니다. 구현되지 않음.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, const String &string2) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| string1 | const String\& | 좌변 문자열. |
| string2 | const String\& | 우변 문자열. |

### ReturnValue

좌변 문자열이 우변 문자열보다 앞서면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int) const method


한 문자열의 끝 부분과 두 번째 문자열의 끝 부분을 비교합니다. 구현되지 않음.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| string1 | const String\& | 첫 번째 문자열. |
| offset1 | int | 문자들의 시작 인덱스 **string1**. |
| string2 | const String\& | 두 번째 문자열. |
| offset2 | int | 문자들의 시작 인덱스 **string2**. |

### ReturnValue

첫 번째 문자열 구간이 두 번째 문자열 구간보다 앞에 있으면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int, CompareOptions) const method


문자열 비교 메서드를 사용하여 한 문자열의 끝 부분과 두 번째 문자열의 끝 부분을 비교합니다. 구현되지 않음.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2, CompareOptions options) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| string1 | const String\& | 첫 번째 문자열. |
| offset1 | int | 문자들의 시작 인덱스 **string1**. |
| string2 | const String\& | 두 번째 문자열. |
| offset2 | int | 문자들의 시작 인덱스 **string2**. |
| options | CompareOptions | [String](../../../system/string/) 비교 옵션. |

### ReturnValue

첫 번째 문자열 구간이 두 번째 문자열 구간보다 앞에 있으면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int) const method


한 문자열의 일부와 두 번째 문자열의 일부를 비교합니다. 구현되지 않음.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| string1 | const String\& | 첫 번째 문자열. |
| offset1 | int | 문자들의 시작 인덱스 **string1**. |
| length1 | int | 비교할 **string1**의 문자 수. |
| string2 | const String\& | 두 번째 문자열. |
| offset2 | int | 문자들의 시작 인덱스 **string2**. |
| length2 | int | 비교할 **string2**의 문자 수. |

### ReturnValue

첫 번째 문자열 구간이 두 번째 문자열 구간보다 앞에 있으면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int, CompareOptions) const method


문자열 비교 메서드를 사용하여 한 문자열의 일부와 두 번째 문자열의 일부를 비교합니다. 구현되지 않음.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2, CompareOptions options) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| string1 | const String\& | 첫 번째 문자열. |
| offset1 | int | 문자들의 시작 인덱스 **string1**. |
| length1 | int | 비교할 **string1**의 문자 수. |
| string2 | const String\& | 두 번째 문자열. |
| offset2 | int | 문자들의 시작 인덱스 **string2**. |
| length2 | int | 비교할 **string2**의 문자 수. |
| options | CompareOptions | [String](../../../system/string/) 비교 옵션. |

### ReturnValue

첫 번째 문자열 구간이 두 번째 문자열 구간보다 앞에 있으면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Page for C++](../../../)
