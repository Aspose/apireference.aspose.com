---
title: "System::Uri 클래스"
linktitle: "Uri"
second_title: "C++용 Aspose.Page"
description: "System::Uri 클래스. 통합 자원 식별자. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 6700
url: /ko/cpp/system/uri/
---
## Uri class


통합 자원 식별자. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 해당 포인터를 사용하십시오.

```cpp
class Uri : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | 지정된 호스트 이름의 유형을 결정합니다. |
| static [CheckSchemeName](./checkschemename/)(const String\&) | 지정된 스킴이 유효한지 확인합니다. |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | 지정된 비교 규칙을 사용하여 지정된 [Uri](./) 객체를 비교합니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 현재 객체와 지정된 객체가 나타내는 URI가 같은지 판단합니다. |
| static [EscapeDataString](./escapedatastring/)(const String\&) | 문자열을 이스케이프된 형태로 변환합니다. |
| static [EscapeUriString](./escapeuristring/)(const String\&) | URI 문자열을 이스케이프된 형태로 변환합니다. |
| static [FromHex](./fromhex/)(char16_t) | 16진수 자리의 십진수 값을 가져옵니다. |
| [get_AbsolutePath](./get_absolutepath/)() const | URI의 절대 경로를 반환합니다. |
| [get_AbsoluteUri](./get_absoluteuri/)() const | 절대 URI를 반환합니다. |
| [get_Authority](./get_authority/)() const | 서버의 호스트 이름과 포트 번호를 반환합니다. |
| [get_DnsSafeHost](./get_dnssafehost/)() const | 이스케이프되지 않은 호스트 이름을 반환합니다. |
| [get_Fragment](./get_fragment/)() const | 이스케이프된 URI 조각을 반환합니다. |
| [get_Host](./get_host/)() const | 호스트 이름을 반환합니다. |
| [get_HostNameType](./get_hostnametype/)() const | 호스트 이름 유형을 반환합니다. |
| [get_IdnHost](./get_idnhost/)() const | 호스트의 국제 도메인 이름을 반환합니다. |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | 현재 객체가 나타내는 URI가 절대 경로인지 여부를 판단합니다. |
| [get_IsDefaultPort](./get_isdefaultport/)() const | 현재 객체가 나타내는 URI가 해당 스킴의 기본 포트를 가지고 있는지 여부를 판단합니다. |
| [get_IsFile](./get_isfile/)() const | 현재 객체가 나타내는 URI가 파일인지 여부를 판단합니다. |
| [get_IsLoopback](./get_isloopback/)() const | 현재 객체가 나타내는 URI가 로컬 호스트를 참조하는지 여부를 판단합니다. |
| [get_IsUnc](./get_isunc/)() const | 현재 객체가 나타내는 URI가 UNC 경로인지 여부를 판단합니다. |
| [get_LocalPath](./get_localpath/)() const | 현재 객체가 나타내는 URI가 참조하는 파일 이름의 운영 체제 표현을 반환합니다. |
| [get_OriginalString](./get_originalstring/)() const | 현재 객체가 생성될 때 생성자에 전달된 URI 문자열을 반환합니다. |
| [get_PathAndQuery](./get_pathandquery/)() const | 현재 객체가 나타내는 URI의 절대 경로와 쿼리 구성 요소를 물음표(?)로 구분하여 반환합니다. |
| [get_Port](./get_port/)() const | 현재 객체가 나타내는 URI의 포트 번호를 반환합니다. |
| [get_Query](./get_query/)() const | 현재 객체가 나타내는 URI에 포함된 쿼리 정보를 반환합니다. |
| [get_Scheme](./get_scheme/)() const | 현재 객체가 나타내는 URI의 스킴을 반환합니다. |
| [get_Segments](./get_segments/)() const | 현재 객체가 나타내는 URI의 경로 세그먼트를 포함하는 문자열 배열을 반환합니다. |
| [get_UserEscaped](./get_userescaped/)() const | 현재 객체의 생성자에 전달된 URI 문자열이 완전히 이스케이프되었는지 여부를 판단합니다. |
| [get_UserInfo](./get_userinfo/)() const | 현재 객체가 나타내는 URI와 연결된 사용자 이름, 비밀번호 및 기타 사용자 정보를 반환합니다. |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | 지정된 이스케이프 방식을 사용하여 현재 객체가 나타내는 URI의 지정된 구성 요소를 반환합니다. |
| [GetHashCode](./gethashcode/)() const override | URI의 해시 코드를 가져옵니다. |
| [GetLeftPart](./getleftpart/)(UriPartial) | 현재 객체가 나타내는 URI의 지정된 부분을 반환합니다. |
| static [HexEscape](./hexescape/)(char16_t) | 지정된 문자의 16진수 등가값을 반환합니다. |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | 지정된 문자의 16진수 표현을 문자로 변환합니다. |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | 현재 [Uri](./) 객체가 나타내는 URI가 지정된 [Uri](./) 객체가 나타내는 URI의 기반인지 여부를 판단합니다. |
| static [IsHexDigit](./ishexdigit/)(char16_t) | 지정된 문자가 유효한 16진수 숫자인지 여부를 판단합니다. |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | 지정된 문자열의 지정된 위치에 있는 문자가 16진수로 인코딩되어 있는지 여부를 판단합니다. |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | 이 [Uri](./)를 구성하는 데 사용된 문자열이 올바르게 형성되었는지 여부를 나타내며 추가로 이스케이프할 필요가 없습니다. |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | 지정된 문자열이 올바른 형식의 URI인지 확인합니다. |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | 두 개의 [Uri](./) 인스턴스 간의 차이를 결정합니다. |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | 현재 객체와 지정된 [Uri](./) 객체가 나타내는 URI 간의 차이를 결정합니다. |
| [ToString](./tostring/)() const override | 현재 객체가 나타내는 URI의 문자열 표현을 반환합니다. |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | 지정된 URI를 나타내는 [Uri](./) 객체를 생성합니다; 인수는 URI 종류를 지정합니다. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | 지정된 기본 URI를 나타내는 [Uri](./) 객체와 상대 URI의 문자열 표현을 사용하여 [Uri](./) abject를 생성합니다. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | 지정된 기본 URI와 상대 URI를 사용하여 [Uri](./) abject를 생성합니다. |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | 지정된 이스케이프된 문자열의 이스케이프를 해제합니다. |
| [Uri](./uri/)(const String\&) | 지정된 URI를 나타내는 [Uri](./) 객체를 생성합니다. |
| [Uri](./uri/)(const String\&, bool) | 지정된 URI를 나타내는 [Uri](./) 객체를 생성합니다; 인수는 URI를 이스케이프할지 여부를 지정합니다. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | 기본 URI를 나타내는 지정된 [Uri](./) 객체와 상대 URI의 문자열 표현을 사용하여 [Uri](./) abject를 생성합니다; 인수는 URI를 이스케이프할지 여부를 지정합니다. |
| [Uri](./uri/)(const String\&, UriKind) | 지정된 URI를 나타내는 [Uri](./) 객체를 생성합니다; 인수는 URI 종류를 지정합니다. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | 지정된 기본 URI와 상대 URI를 사용하여 [Uri](./) abject를 생성합니다. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | 지정된 기본 URI와 상대 URI를 사용하여 [Uri](./) abject를 생성합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | [Uri](./)의 주소 부분과 통신 프로토콜 스킴을 구분하는 문자를 지정합니다. |
| static [UriSchemeFile](./urischemefile/) | [Uri](./)이 파일을 가리키는 포인터임을 지정합니다. |
| static [UriSchemeFtp](./urischemeftp/) | [Uri](./)이 파일 전송 프로토콜을 통해 액세스됨을 지정합니다. |
| static [UriSchemeGopher](./urischemegopher/) | [Uri](./)이 Gopher 프로토콜을 통해 액세스됨을 지정합니다. |
| static [UriSchemeHttp](./urischemehttp/) | [Uri](./)이 하이퍼텍스트 전송 프로토콜을 통해 액세스됨을 지정합니다. |
| static [UriSchemeHttps](./urischemehttps/) | [Uri](./)이 보안 하이퍼텍스트 전송 프로토콜을 통해 액세스됨을 지정합니다. |
| static [UriSchemeMailto](./urischememailto/) | [Uri](./)이 이메일 주소이며 단순 메일 전송 프로토콜을 통해 액세스됨을 지정합니다. |
| static [UriSchemeNetPipe](./urischemenetpipe/) | [Uri](./)이 [Windows](../../system.windows/) 통신 기반에서 사용하는 NetPipe 스킴을 통해 액세스됨을 지정합니다. |
| static [UriSchemeNetTcp](./urischemenettcp/) | [Uri](./)이 [Windows](../../system.windows/) 통신 기반에서 사용하는 NetTcp 스킴을 통해 액세스됨을 지정합니다. |
| static [UriSchemeNews](./urischemenews/) | [Uri](./)이 인터넷 뉴스 그룹이며 네트워크 뉴스 전송 프로토콜을 통해 액세스됨을 지정합니다. |
| static [UriSchemeNntp](./urischemenntp/) | [Uri](./)이 인터넷 뉴스 그룹이며 네트워크 뉴스 전송 프로토콜을 통해 액세스됨을 지정합니다. |
## 비고



```cpp
#include "system/smart_ptr.h"
#include "system/uri.h"
#include <iostream>

int main()
{
  const auto uri = System::MakeObject<System::Uri>(u"https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/");

std::cout <<
  "AbsolutePath: " << uri->get_AbsolutePath() << std::endl <<
  "AbsoluteUri: " << uri->get_AbsoluteUri() << std::endl <<
  "Authority: " << uri->get_Authority() << std::endl <<
  "DnsSafeHost: " << uri->get_DnsSafeHost() << std::endl <<
  "Fragment: " << uri->get_Fragment() << std::endl <<
  "Host: " << uri->get_Host() << std::endl <<
  "IdnHost: " << uri->get_IdnHost() << std::endl <<
  "LocalPath: " << uri->get_LocalPath() << std::endl <<
  "OriginalString: " << uri->get_OriginalString() << std::endl <<
  "PathAndQuery: " << uri->get_PathAndQuery() << std::endl <<
  "Port: " << uri->get_Port() << std::endl <<
  "Query: " << uri->get_Query() << std::endl <<
  "Scheme: " << uri->get_Scheme() << std::endl;

  return 0;
}
/*
This code example produces the following output:
AbsolutePath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
AbsoluteUri: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Authority: docs.codeporting.com
DnsSafeHost: docs.codeporting.com
Fragment:
Host: docs.codeporting.com
IdnHost: docs.codeporting.com
LocalPath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
OriginalString: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
PathAndQuery: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Port: 443
Query:
Scheme: https
*/
```

## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
