---
title: "System::Net::Http::Headers::NameValueHeaderValue::ToString 메서드"
linktitle: "ToString"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::NameValueHeaderValue::ToString 메서드. C# Object.ToString() 메서드와 유사합니다. C++에서 사용자 정의 객체를 문자열로 변환할 수 있게 합니다."
type: docs
weight: 700
url: /ko/cpp/system.net.http.headers/namevalueheadervalue/tostring/
---
## NameValueHeaderValue::ToString() const method


C# [Object.ToString()](../../../system/object/tostring/) 메서드와 유사합니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다.

```cpp
String System::Net::Http::Headers::NameValueHeaderValue::ToString() const override
```


### ReturnValue

[String](../../../system/string/) representation as provided by final class.

## 또 보기

* Class [String](../../../system/string/)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
## NameValueHeaderValue::ToString(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) method


NameValueHeaderValue-class 인스턴스들의 컬렉션에 대한 문자열 표현을 반환합니다.

```cpp
static String System::Net::Http::Headers::NameValueHeaderValue::ToString(System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> values, char16_t separator, bool leadingSeparator)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 값들 | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | NameValueHeaderValue-class 인스턴스들의 컬렉션. |
| 구분자 | char16_t | 문자열 구분자. |
| leadingSeparator | bool | 첫 번째 컬렉션 항목 앞에 문자열 구분자를 추가해야 하는지를 나타내는 값. |

### ReturnValue

NameValueHeaderValue-class 인스턴스 컬렉션의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
## NameValueHeaderValue::ToString(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) method


NameValueHeaderValue-class 인스턴스들의 컬렉션에 대한 문자열 표현을 반환합니다.

```cpp
static void System::Net::Http::Headers::NameValueHeaderValue::ToString(System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> values, char16_t separator, bool leadingSeparator, System::SharedPtr<Text::StringBuilder> destination)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 값들 | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | NameValueHeaderValue-class 인스턴스들의 컬렉션. |
| 구분자 | char16_t | 문자열 구분자. |
| leadingSeparator | bool | 첫 번째 컬렉션 항목 앞에 문자열 구분자를 추가해야 하는지를 나타내는 값. |
| destination | System::SharedPtr\<Text::StringBuilder\> | 문자열 표현이 할당될 인스턴스. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
