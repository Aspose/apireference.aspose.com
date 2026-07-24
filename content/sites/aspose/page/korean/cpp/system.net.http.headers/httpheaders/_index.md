---
title: "System::Net::Http::Headers::HttpHeaders 클래스"
linktitle: "HttpHeaders"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::HttpHeaders 클래스. HTTP 헤더의 컬렉션입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 700
url: /ko/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


HTTP 헤더의 컬렉션입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | 새로운 이름-값 쌍을 검증하고 현재 컬렉션에 추가합니다. |
| [Add](./add/)(String, String) | 새 이름-값 쌍을 검증하고 현재 컬렉션에 추가합니다. |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | 지정된 HttpHeaders 클래스 인스턴스를 현재 인스턴스와 연결합니다. |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | 지정된 이름으로 헤더를 가져와 파싱된 값을 헤더에 추가합니다. |
| [Clear](./clear/)() | 컬렉션에서 모든 항목을 제거합니다. |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | 헤더에 지정된 값이 포함되어 있는지 확인합니다. |
| [GetEnumerator](./getenumerator/)() override | 열거자를 가져옵니다. |
| [GetHeaderString](./getheaderstring/)(String) | 지정된 헤더 이름에 대한 값들의 문자열 표현을 반환합니다. |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | 지정된 헤더 이름에 대한 값들의 문자열 표현을 반환합니다. |
| [GetHeaderStrings](./getheaderstrings/)() | 헤더 값들의 문자열 표현을 포함하는 컬렉션을 반환합니다. |
| [GetParsedValues](./getparsedvalues/)(String) | 지정된 헤더 이름에 대한 파싱된 값을 반환합니다. |
| [GetValues](./getvalues/)(String) | 지정된 이름에 해당하는 값을 반환합니다. |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | 파싱된 값을 목록으로 변환합니다. |
| [Remove](./remove/)(String) | 지정된 이름으로 항목을 제거하려 시도합니다. |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | 지정된 이름으로 헤더를 가져와 헤더에서 파싱된 값을 제거합니다. |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | 지정된 이름으로 헤더를 가져와 해당 값을 설정하거나 제거합니다. 'value' 매개변수가 nullptr이면 헤더 값이 제거되고, 그렇지 않으면 파싱된 값이 설정됩니다. |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | 지정된 이름으로 헤더를 가져와 파싱된 값을 헤더에 설정합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | 새 이름-값 쌍을 현재 컬렉션에 추가하려 시도합니다. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | 이름-값 쌍 컬렉션을 현재 컬렉션에 추가합니다. |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | 지정된 이름에 해당하는 값을 가져오려 시도합니다. |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | 지정된 값을 파싱하여 헤더 값에 추가하려 시도합니다. |
## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
