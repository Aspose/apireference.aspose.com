---
title: "System::Globalization::RegionInfo 클래스"
linktitle: "RegionInfo"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::RegionInfo 클래스. 지역에 대한 정보를 제공합니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 2100
url: /ko/cpp/system.globalization/regioninfo/
---
## RegionInfo class


지역에 대한 정보를 제공합니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하는 데 사용하십시오.

```cpp
class RegionInfo : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | 통화의 영어 이름을 가져옵니다. |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | 통화의 현지 이름을 가져옵니다. |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | 통화 기호를 가져옵니다. |
| static [get_CurrentRegion](./get_currentregion/)() | 시스템에 설정된 지역을 가져옵니다. |
| virtual [get_DisplayName](./get_displayname/)() const | 전체 지역 이름을 가져옵니다. |
| virtual [get_EnglishName](./get_englishname/)() const | 영어 지역 이름을 가져옵니다. |
| virtual [get_GeoId](./get_geoid/)() const | 지역에 대한 고유 식별자를 가져옵니다. |
| virtual [get_IsMetric](./get_ismetric/)() const | 지역이 미터법을 사용하는지 확인합니다. |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | ISO 통화 기호를 가져옵니다. |
| virtual [get_Name](./get_name/)() const | 지역 이름을 가져옵니다. |
| virtual [get_NativeName](./get_nativename/)() const | 현지 지역 이름을 가져옵니다. |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | 3자리 ISO 지역 코드를 가져옵니다. |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | 3자리 [Windows](../../system.windows/) 지역 코드를 가져옵니다. |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | 2자리 ISO 지역 코드를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | RTTI 정보. |
| [RegionInfo](./regioninfo/)(int) | 생성자. |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
