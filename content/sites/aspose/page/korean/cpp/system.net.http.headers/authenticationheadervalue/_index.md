---
title: "System::Net::Http::Headers::AuthenticationHeaderValue 클래스"
linktitle: "AuthenticationHeaderValue"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::AuthenticationHeaderValue 클래스. ''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'', 및 ''Proxy-Authenticate'' 헤더의 값을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


'Authorization', 'ProxyAuthorization', 'WWW-Authenticate', 및 'Proxy-Authenticate' 헤더의 값을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | 생성자. |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | 생성자. |
| [Clone](./clone/)() override | RTTI 정보. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_Parameter](./get_parameter/)() | 인증 정보를 포함하는 자격 증명을 가져옵니다. |
| [get_Scheme](./get_scheme/)() | RTTI 정보. |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 지정된 문자열을 구문 분석하고 문자열 표현의 마지막 인덱스를 반환합니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| static [Parse](./parse/)(String) | 전달된 문자열을 [AuthenticationHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | 전달된 문자열을 [AuthenticationHeaderValue](./) 클래스의 인스턴스로 변환하려고 시도합니다. |
## 또 보기

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
