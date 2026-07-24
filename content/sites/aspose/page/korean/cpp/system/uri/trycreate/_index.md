---
title: "System::Uri::TryCreate 메서드"
linktitle: "TryCreate"
second_title: "C++용 Aspose.Page"
description: "System::Uri::TryCreate 메서드. 지정된 기본 및 상대 URI에서 Uri 객체를 C++에서 생성합니다."
type: docs
weight: 4400
url: /ko/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


지정된 기본 및 상대 URI에서 [Uri](../) 객체를 생성합니다.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | 기본 URI |
| relativeUri | const SharedPtr\<Uri\>\& | 기본 URI에 추가되는 상대 URI |
| result | SharedPtr\<Uri\>\& | 구성이 성공하면 메서드 반환 시 새로 생성된 [Uri](../) 객체를 가리키는 출력 인수 |

### ReturnValue

구성이 성공하면 true, 그렇지 않으면 false

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


기본 URI를 나타내는 지정된 [Uri](../) 객체와 상대 URI의 문자열 표현에서 [Uri](../) 객체를 생성합니다.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | 기본 URI |
| relativeUri | const String\& | 기본 URI에 추가되는 상대 URI |
| result | SharedPtr\<Uri\>\& | 구성이 성공하면 메서드 반환 시 새로 생성된 [Uri](../) 객체를 가리키는 출력 인수 |

### ReturnValue

구성이 성공하면 true, 그렇지 않으면 false

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


지정된 URI를 나타내는 [Uri](../) 객체를 생성합니다; 인수가 URI 종류를 지정합니다.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uriString | const String\& | 생성 중인 객체가 나타낼 문자열 URI |
| uriKind | UriKind | URI 종류를 지정합니다 |
| result | SharedPtr\<Uri\>\& | 구성이 성공하면 메서드 반환 시 새로 생성된 [Uri](../) 객체를 가리키는 출력 인수 |

### ReturnValue

구성이 성공하면 true, 그렇지 않으면 false

## 또 보기

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
