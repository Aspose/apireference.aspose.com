---
title: "System::Globalization::NumberFormatInfo 클래스"
linktitle: "NumberFormatInfo"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::NumberFormatInfo 클래스. 숫자를 형식화하는 방법에 대한 정보를 보유합니다. 설정자 작업은 읽기 전용이 아닌 객체에서만 사용할 수 있습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1900
url: /ko/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


숫자를 형식화하는 방법에 대한 정보를 보유합니다. 설정자 작업은 읽기 전용이 아닌 객체에서만 사용할 수 있습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 포맷 정보를 복제합니다. |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | 통화 소수점 자리 수를 가져옵니다. |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | 통화 소수 구분 기호를 가져옵니다. |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | 통화 그룹 구분 기호를 가져옵니다. |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | 그룹당 통화 소수 자릿수 수를 가져옵니다. |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | 통화 음수 패턴을 가져옵니다. |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | 통화 양수 패턴을 가져옵니다. |
| [get_CurrencySymbol](./get_currencysymbol/)() const | 통화 기호를 가져옵니다. |
| static [get_CurrentInfo](./get_currentinfo/)() | 현재 스레드 문화에 정의된 숫자 형식 정보를 가져옵니다. |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | 숫자 모양을 표시하는 방법을 지정하는 값을 가져옵니다. |
| static [get_InvariantInfo](./get_invariantinfo/)() | 불변 문화에 정의된 숫자 형식 정보를 가져옵니다. |
| [get_IsReadOnly](./get_isreadonly/)() const | 형식이 읽기 전용인지 확인합니다. |
| [get_NaNSymbol](./get_nansymbol/)() const | Not-a-Number 기호를 가져옵니다. |
| [get_NativeDigits](./get_nativedigits/)() const | 숫자 기호(0부터 9까지)를 가져옵니다. |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | 음의 무한대 기호를 가져옵니다. |
| [get_NegativeSign](./get_negativesign/)() const | 음수 부호를 가져옵니다. |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | 소수 자릿수 수를 가져옵니다. |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | 소수 구분 기호를 가져옵니다. |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | 숫자 그룹 구분 기호를 가져옵니다. |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | 그룹당 숫자 자릿수 수를 가져옵니다. |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | 숫자 음수 패턴을 가져옵니다. |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | 백분율 값의 소수 자리 수를 가져옵니다. |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | 백분율 값의 소수 구분 기호를 가져옵니다. |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | 백분율 값의 그룹 구분 기호를 가져옵니다. |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | 백분율 값 그룹당 숫자 자릿수 수를 가져옵니다. |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | 백분율 음수 패턴을 가져옵니다. |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | 백분율 양수 패턴을 가져옵니다. |
| [get_PercentSymbol](./get_percentsymbol/)() const | 백분율 기호를 가져옵니다. |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | 천분율 기호를 가져옵니다. |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | 양의 무한대 기호를 가져옵니다. |
| [get_PositiveSign](./get_positivesign/)() const | 양수 부호를 가져옵니다. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | 특정 유형의 포맷터를 가져옵니다. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | 포맷 제공자와 연결된 포맷터를 가져옵니다. |
| [NumberFormatInfo](./numberformatinfo/)() | 기본 생성자(불변 [NumberFormatInfo](./)). |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | 포맷터의 읽기 전용 버전을 가져옵니다. |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | 통화 소수 자리 수를 설정합니다. |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | 통화 소수 구분자를 설정합니다. |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | 통화 그룹 구분자를 설정합니다. |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | 그룹당 통화 소수 자리 수를 설정합니다. |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | 통화 음수 패턴을 설정합니다. |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | 통화 양수 패턴을 설정합니다. |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | 통화 기호를 설정합니다. |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | 숫자 모양을 표시하는 방법을 지정하는 값을 설정합니다. |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | NaN(숫자가 아님) 기호를 설정합니다. |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | 숫자 기호(0부터 9까지)를 설정합니다. |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | 음의 무한대 기호를 설정합니다. |
| [set_NegativeSign](./set_negativesign/)(const String\&) | 음수 부호를 설정합니다. |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | 소수 자리 수를 설정합니다. |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | 소수 구분자를 설정합니다. |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | 숫자 그룹 구분자를 설정합니다. |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | 그룹당 숫자 자리 수를 설정합니다. |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | 숫자 음수 패턴을 설정합니다. |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | 백분율 값에서 소수 자리 수를 설정합니다. |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | 백분율 값에서 소수 구분자를 설정합니다. |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | 백분율 값에서 그룹 구분자를 설정합니다. |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | 백분율 값 그룹당 자릿수 개수를 설정합니다. |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | 백분율 음수 패턴을 설정합니다. |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | 백분율 양수 패턴을 설정합니다. |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | 백분율 기호를 설정합니다. |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | 천분율 기호를 설정합니다. |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | 양의 무한대 기호를 설정합니다. |
| [set_PositiveSign](./set_positivesign/)(const String\&) | 양수 부호를 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
