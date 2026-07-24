---
title: "System::Net::Http::Headers::HttpHeaderValueCollection 클래스"
linktitle: "HttpHeaderValueCollection"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::HttpHeaderValueCollection 클래스. 헤더 값들의 컬렉션을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 800
url: /ko/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


헤더 값들의 컬렉션을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| 매개변수 | 설명 |
| --- | --- |
| 그 | 컬렉션에 표시된 헤더 값들의 유형. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const T\&) override | 컬렉션에 요소를 추가합니다. |
| [Clear](./clear/)() override | 컬렉션의 모든 요소를 삭제합니다. |
| [Contains](./contains/)(const T\&) const override | 컬렉션에 요소가 존재하는지 확인합니다. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | 모든 컬렉션 요소를 기존 배열 요소에 복사합니다. |
| [get_Count](./get_count/)() const override | RTTI 정보. |
| [get_IsReadOnly](./get_isreadonly/)() | 현재 컬렉션이 읽기 전용인지 여부를 나타내는 값을 가져옵니다. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | 현재 컬렉션에 \"special value\"가 포함되어 있는지 여부를 나타내는 값을 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 열거자를 가져옵니다. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | \"special value\" 없이 현재 컬렉션의 문자열 표현을 반환합니다. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | 새 인스턴스를 생성합니다. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | 새 인스턴스를 생성합니다. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | 새 인스턴스를 생성합니다. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | 새 인스턴스를 생성합니다. |
| [ParseAdd](./parseadd/)(String) | 헤더 문자열 표현을 구문 분석하고 이를 현재 컬렉션에 추가합니다. |
| [Remove](./remove/)(const T\&) override | 컬렉션에서 요소를 삭제합니다. |
| [RemoveSpecialValue](./removespecialvalue/)() | \"special value\"를 제거합니다. |
| [SetSpecialValue](./setspecialvalue/)() | \"special value\"를 설정합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n번째 템플릿 인수를 약한 포인터(공유 포인터가 아니라)로 설정합니다. 컨테이너에서 포인터를 약한 모드로 전환할 수 있습니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| [TryParseAdd](./tryparseadd/)(String) | 헤더 문자열 표현을 구문 분석하여 현재 컬렉션에 추가하려고 시도합니다. |

## 또 보기

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
