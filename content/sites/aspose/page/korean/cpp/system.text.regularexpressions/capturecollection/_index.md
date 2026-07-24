---
title: "System::Text::RegularExpressions::CaptureCollection 클래스"
linktitle: "CaptureCollection"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::CaptureCollection 클래스. 단일 캡처 그룹에 의해 수행된 캡처 목록입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 200
url: /ko/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


단일 캡처 그룹에 의해 수행된 캡처 목록입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수에 인수로 전달하십시오.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | 컬렉션 수정을 비활성화합니다. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | 컬렉션에 캡처를 추가하는 서비스 메서드입니다. |
| [Clear](./clear/)() override | 컬렉션 정리를 비활성화합니다. |
| [get_Count](./get_count/)() const override | 캡처 수를 가져옵니다. |
| [get_IsReadOnly](./get_isreadonly/)() const override | 컬렉션을 읽기 전용으로 표시합니다. |
| [get_IsSynchronized](./get_issynchronized/)() const | 컬렉션을 비동기화된 것으로 표시합니다. |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) 접근자. |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) 접근자. |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) 접근자. |
| [Remove](./remove/)(const CapturePtr\&) override | 컬렉션 수정을 비활성화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 유형. |
## 또 보기

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
