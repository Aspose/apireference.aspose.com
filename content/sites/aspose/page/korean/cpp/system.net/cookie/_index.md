---
title: "System::Net::Cookie 클래스"
linktitle: "쿠키"
second_title: "C++용 Aspose.Page"
description: "System::Net::Cookie 클래스. HTTP 쿠키를 나타냅니다. 이 클래스의 객체는 `System::MakeObject()` 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 `operator new`를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 `System::SmartPtr` 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.net/cookie/
---
## Cookie class


HTTP 쿠키를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 `operator new`를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class Cookie : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 현재 인스턴스의 복사본을 생성합니다. |
| [Cookie](./cookie/)() | 새 인스턴스를 생성합니다. |
| [Cookie](./cookie/)(String, String) | 새 인스턴스를 생성합니다. |
| [Cookie](./cookie/)(String, String, String) | 새 인스턴스를 생성합니다. |
| [Cookie](./cookie/)(String, String, String, String) | 새 인스턴스를 생성합니다. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_Comment](./get_comment/)() const | 'Comment' 속성의 값을 가져옵니다. |
| [get_CommentUri](./get_commenturi/)() const | 'CommentURL' 속성의 값을 가져옵니다. |
| [get_Discard](./get_discard/)() const | 'Discard' 속성의 값을 가져옵니다. |
| [get_Domain](./get_domain/)() const | 'Domain' 속성의 값을 가져옵니다. |
| [get_DomainImplicit](./get_domainimplicit/)() | 도메인이 암시적인지 여부를 나타내는 값을 가져옵니다. |
| [get_DomainKey](./get_domainkey/)() const | 도메인 키를 반환합니다. |
| [get_Expired](./get_expired/)() | 쿠키가 만료되었는지 여부를 나타내는 값을 가져옵니다. |
| [get_Expires](./get_expires/)() | 'Expires' 속성의 값을 가져옵니다. |
| [get_HttpOnly](./get_httponly/)() const | 'HttpOnly' 속성의 값을 가져옵니다. |
| [get_Name](./get_name/)() const | 쿠키의 이름을 가져옵니다. |
| [get_Path](./get_path/)() const | 'Path' 속성의 값을 가져옵니다. |
| [get_Plain](./get_plain/)() const | 쿠키 사양이 'Plain'인지 여부를 나타내는 값을 반환합니다. |
| [get_Port](./get_port/)() const | 'Port' 속성의 값을 가져옵니다. |
| [get_PortList](./get_portlist/)() const | 'Port' 속성 값들의 컬렉션을 반환합니다. |
| [get_Secure](./get_secure/)() const | 'Secure' 속성의 값을 가져옵니다. |
| [get_TimeStamp](./get_timestamp/)() const | 쿠키가 생성된 시간을 반환합니다. |
| [get_Value](./get_value/)() const | 쿠키의 값을 가져옵니다. |
| [get_Variant](./get_variant/)() const | 쿠키의 사양을 가져옵니다. |
| [get_Version](./get_version/)() const | '[Version](../../system/version/)' 속성의 값을 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| [InternalSetName](./internalsetname/)(String) | 이 메서드는 다른 메서드에 의해 메서드 이름을 설정하기 위해 호출됩니다. |
| [set_Comment](./set_comment/)(String) | 'Comment' 속성의 값을 설정합니다. |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | 'CommentURL' 속성의 값을 설정합니다. |
| [set_Discard](./set_discard/)(bool) | 'Discard' 속성의 값을 설정합니다. |
| [set_Domain](./set_domain/)(String) | 'Domain' 속성의 값을 설정합니다. |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | 도메인이 암시적인지 여부를 나타내는 값을 설정합니다. |
| [set_Expired](./set_expired/)(bool) | 쿠키가 만료되었는지 여부를 나타내는 값을 설정합니다. |
| [set_Expires](./set_expires/)(DateTime) | 'Expires' 속성의 값을 설정합니다. |
| [set_HttpOnly](./set_httponly/)(bool) | 'HttpOnly' 속성의 값을 설정합니다. |
| [set_Name](./set_name/)(String) | 쿠키의 이름을 설정합니다. |
| [set_Path](./set_path/)(String) | 'Path' 속성의 값을 설정합니다. |
| [set_Port](./set_port/)(String) | 'Port' 속성의 값을 설정합니다. |
| [set_Secure](./set_secure/)(bool) | 'Secure' 속성의 값을 설정합니다. |
| [set_Value](./set_value/)(String) | 쿠키의 값을 설정합니다. |
| [set_Variant](./set_variant/)(CookieVariant) | 쿠키의 사양을 설정합니다. |
| [set_Version](./set_version/)(int32_t) | '[Version](../../system/version/)' 속성의 값을 설정합니다. |
| [ToServerString](./toserverstring/)() | 현재 인스턴스를 문자열 표현으로 직렬화합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | 기본 속성의 값을 확인하고 설정합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | 'Comment' 속성의 이름입니다. |
| static [CommentUrlAttributeName](./commenturlattributename/) | 'CommentURL' 속성의 이름입니다. |
| static [DiscardAttributeName](./discardattributename/) | 'Discard' 속성의 이름입니다. |
| static [DomainAttributeName](./domainattributename/) | 'Domain' 속성의 이름입니다. |
| static [EqualsLiteral](./equalsliteral/) | 속성의 이름과 값을 구분하는 데 사용되는 구분자. |
| static [ExpiresAttributeName](./expiresattributename/) | 'Expires' 속성의 이름. |
| static [HttpOnlyAttributeName](./httponlyattributename/) | 'HttpOnly' 속성의 이름. |
| static [MaxAgeAttributeName](./maxageattributename/) | 'Max-Age' 속성의 이름. |
| static [MaxSupportedVersion](./maxsupportedversion/) | RTTI 정보. |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | 지원되는 최대 버전의 문자열 표현. |
| static [PathAttributeName](./pathattributename/) | 'Path' 속성의 이름. |
| static [PortAttributeName](./portattributename/) | 'Port' 속성의 이름. |
| static [PortSplitDelimiters](./portsplitdelimiters/) | 'Port' 속성 값에 대한 구분자를 포함하는 배열. |
| static [QuotesLiteral](./quotesliteral/) | 속성 부분을 감싸는 데 사용되는 기호. |
| static [ReservedToName](./reservedtoname/) | 쿠키 이름에 예약된 값. |
| static [ReservedToValue](./reservedtovalue/) | 쿠키 값에 예약된 값. |
| static [SecureAttributeName](./secureattributename/) | 'Secure' 속성의 이름. |
| static [SeparatorLiteral](./separatorliteral/) | 속성 구분자. |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | 특수 속성 이름들의 접두사. |
| static [VersionAttributeName](./versionattributename/) | '[Version](../../system/version/)' 속성의 이름. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
