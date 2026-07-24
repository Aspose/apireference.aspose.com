---
title: "System::Globalization::CultureInfo 클래스"
linktitle: "CultureInfo"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::CultureInfo 클래스. 문화별 값 및 알고리즘의 컬렉션입니다. Setter 연산은 읽기 전용이 아닌 객체에서만 사용할 수 있습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 500
url: /ko/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


문화별 값 및 알고리즘의 컬렉션입니다. Setter 연산은 읽기 전용이 아닌 객체에서만 사용할 수 있습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 이 포인터를 사용하여 함수에 인수로 전달하십시오.

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | 캐시된 문화 정보를 새로 고칩니다. |
| [Clone](./clone/)() override | 문화 정보를 복제합니다. |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | 이름으로 문화를 생성합니다. |
| explicit [CultureInfo](./cultureinfo/)(int) | RTTI 정보. |
| [CultureInfo](./cultureinfo/)(int, bool) | 생성자. |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | 생성자. |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | 생성자. |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | 항상 ArgumentNullException을 발생시킵니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 객체를 비교합니다. |
| virtual [get_Calendar](./get_calendar/)() const | 문화에서 사용하는 달력을 가져옵니다. |
| virtual [get_CompareInfo](./get_compareinfo/)() const | 문화 규칙을 따르는 문자열 비교자를 가져옵니다. |
| [get_CultureTypes](./get_culturetypes/)() const | 현재 문화를 설명하는 문화 유형들의 비트 연산 결합을 가져옵니다. |
| static [get_CurrentCulture](./get_currentculture/)() | 현재 스레드에 설정된 문화를 가져옵니다. |
| static [get_CurrentUICulture](./get_currentuiculture/)() | 현재 스레드의 UI 문화를 가져옵니다. |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | 날짜 형식 정보를 가져옵니다. |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | 현재 애플리케이션 도메인에서 기본 문화를 가져옵니다. |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | 현재 애플리케이션 도메인에서 기본 UI 문화를 가져옵니다. |
| virtual [get_DisplayName](./get_displayname/)() const | 문화 표시 이름을 가져옵니다. |
| virtual [get_EnglishName](./get_englishname/)() const | 문화의 영어 이름을 가져옵니다. |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | 언어에 대한 RFC 4646 이름을 가져옵니다. |
| static [get_InstalledUICulture](./get_installeduiculture/)() | 운영 체제에 설치된 문화를 가져옵니다. |
| static [get_InvariantCulture](./get_invariantculture/)() | 불변 문화를 가져옵니다. |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | 문화가 중립인지 확인합니다. |
| [get_IsReadOnly](./get_isreadonly/)() const | 문화 객체가 읽기 전용인지 확인합니다. |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | 활성 입력 로케일 식별자를 가져옵니다. |
| virtual [get_LCID](./get_lcid/)() const | 문화 식별자를 가져옵니다. |
| virtual [get_Name](./get_name/)() const | 문화 이름을 가져옵니다. |
| virtual [get_NativeName](./get_nativename/)() const | 문화 고유 이름을 가져옵니다. |
| virtual [get_NumberFormat](./get_numberformat/)() const | 숫자 형식 정보를 가져옵니다. |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | 문화와 함께 사용할 수 있는 달력 목록입니다. |
| virtual [get_Parent](./get_parent/)() const | 부모 문화를 가져옵니다. |
| virtual [get_TextInfo](./get_textinfo/)() const | 문화에서 사용하는 텍스트 매개변수를 가져옵니다. |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | 세 글자 ISO 639-2 언어 코드를 가져옵니다. |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | [Windows](../../system.windows/) API에서 정의된 언어의 세 글자 코드를 가져옵니다. |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | 문화와 연결된 두 글자 ISO 언어 이름을 가져옵니다. |
| [get_UseUserOverride](./get_useuseroverride/)() const | [CultureInfo](./)이 사용자 선택 문화 설정을 사용하는지 여부를 나타내는 플래그를 가져옵니다. |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | 콘솔 애플리케이션에 적합한 대체 문화를 가져옵니다. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | 이름으로 문화를 가져옵니다. CreateSpecificCulture와 동일합니다. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | 이름으로 문화를 가져옵니다. |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | ID로 문화를 가져옵니다. |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | 사용 중단됨. 지정된 RFC 4646 언어 태그로 읽기 전용 [CultureInfo](./) 객체를 가져옵니다. |
| static [GetCultures](./getcultures/)(CultureTypes) | 지정된 유형에 해당하는 문화를 가져옵니다. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | 특정 유형에 대한 형식 객체를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | 객체 해시 코드를 반환합니다. |
| [IsInherited](./isinherited/)() const | 상속 여부 플래그를 가져옵니다. 내부 전용. |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | 문화 매개변수를 비교합니다. |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | 문화의 읽기 전용 버전을 가져옵니다. |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | 현재 스레드의 문화를 설정합니다. |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | 현재 스레드의 UI 문화를 설정합니다. |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | 날짜 형식 정보를 설정합니다. |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | 현재 애플리케이션 도메인에서 기본 문화권을 설정합니다. |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | 현재 애플리케이션 도메인에서 기본 UI 문화권을 설정합니다. |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | 숫자 형식 정보를 가져옵니다. |
| [ToString](./tostring/)() const override | 문화권을 문자열로 변환합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
