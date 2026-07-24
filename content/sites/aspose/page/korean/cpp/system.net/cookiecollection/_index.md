---
title: "System::Net::CookieCollection 클래스"
linktitle: "CookieCollection"
second_title: "C++용 Aspose.Page"
description: "System::Net::CookieCollection 클래스. 정렬된 쿠키 목록을 나타냅니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 200
url: /ko/cpp/system.net/cookiecollection/
---
## CookieCollection class


정렬된 쿠키 목록을 나타냅니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| 열거형 | 설명 |
| --- | --- |
| [Stamp](./stamp/) | RTTI 정보. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | 컬렉션에 쿠키를 추가합니다. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | 지정된 컬렉션의 쿠키를 현재 컬렉션에 추가합니다. |
| [Clear](./clear/)() override | 컬렉션에서 모든 쿠키를 제거합니다. |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | 컬렉션에 지정된 쿠키가 포함되어 있는지 확인합니다. |
| [CookieCollection](./cookiecollection/)() | 새 인스턴스를 생성합니다. |
| [get_Count](./get_count/)() const override | 컬렉션의 요소 개수를 가져옵니다. |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | 컬렉션에 버전이 [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/)와 동일하지 않은 쿠키가 포함되어 있는지 여부를 나타내는 값을 반환합니다. |
| [GetEnumerator](./getenumerator/)() override | 열거자를 가져옵니다. |
| [idx_get](./idx_get/)(int32_t) | 지정된 인덱스에 있는 쿠키 컬렉션에서 쿠키를 반환합니다. |
| [idx_get](./idx_get/)(String) | 지정된 이름으로 쿠키 컬렉션에서 쿠키를 반환합니다. |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | 지정된 쿠키의 인덱스를 반환합니다. |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | 지정된 쿠키를 컬렉션에 추가합니다. |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | 지정된 쿠키를 컬렉션에서 제거합니다. |
| [RemoveAt](./removeat/)(int32_t) | 지정된 인덱스에 있는 쿠키를 제거합니다. |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | 지정된 시나리오에 따라 타임스탬프를 업데이트하고 새로운 값을 반환합니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## 또 보기

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
