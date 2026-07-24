---
title: "System::Net::CookieContainer 클래스"
linktitle: "CookieContainer"
second_title: "C++용 Aspose.Page"
description: "System::Net::CookieContainer 클래스. CookieCollection 클래스 인스턴스를 위한 컨테이너를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 400
url: /ko/cpp/system.net/cookiecontainer/
---
## CookieContainer class


CookieCollection 클래스 인스턴스를 위한 컨테이너를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class CookieContainer : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | 컬렉션에 쿠키를 추가합니다. |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | 컬렉션에 쿠키를 추가합니다. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | 지정된 컬렉션에서 현재 컬렉션으로 쿠키를 복사합니다. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | 지정된 URI에 대한 쿠키를 추가합니다. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | 지정된 URI에 대한 지정된 컬렉션에서 쿠키를 복사하여 현재 컬렉션에 추가합니다. |
| [CookieContainer](./cookiecontainer/)() | 새 인스턴스를 생성합니다. |
| [CookieContainer](./cookiecontainer/)(int32_t) | 새 인스턴스를 생성합니다. |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | 새 인스턴스를 생성합니다. |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | 지정된 URI에 대한 지정된 HTTP 헤더에서 쿠키를 복사합니다. |
| [get_Capacity](./get_capacity/)() | 컬렉션 용량을 가져옵니다. |
| [get_Count](./get_count/)() | 컬렉션 항목의 수를 반환합니다. |
| [get_MaxCookieSize](./get_maxcookiesize/)() | 최대 쿠키 크기를 가져옵니다. |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | 도메인별 컬렉션 용량을 가져옵니다. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | 지정된 URI와 연관된 쿠키를 포함하는 HTTP 헤더를 반환합니다. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | 지정된 URI와 연관된 쿠키를 포함하는 HTTP 헤더를 반환합니다. |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | 지정된 URI와 연관된 쿠키 컬렉션을 반환합니다. |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | 지정된 URI와 연관된 쿠키 컬렉션을 반환합니다. |
| [IsLocalDomain](./islocaldomain/)(String) | 지정된 도메인이 로컬호스트인지 확인합니다. |
| [set_Capacity](./set_capacity/)(int32_t) | 컬렉션 용량을 설정합니다. |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | 최대 쿠키 크기를 설정합니다. |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | 도메인별 컬렉션 용량을 설정합니다. |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | 지정된 헤더에서 쿠키를 컬렉션으로 복사하고 지정된 URI와 연결합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | 최대 쿠키 크기입니다. |
| static [DefaultCookieLimit](./defaultcookielimit/) | RTTI 정보. |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | 도메인당 컬렉션 항목의 최대 수입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
