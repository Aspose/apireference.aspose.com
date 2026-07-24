---
title: "System::Security::SecureString 클래스"
linktitle: "SecureString"
second_title: "C++용 Aspose.Page"
description: "System::Security::SecureString 클래스. 보안 문자열은 기밀로 유지되어야 하는 텍스트를 나타냅니다. 이 클래스는 내부 데이터를 암호화하지 않습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.security/securestring/
---
## SecureString class


보안 문자열은 기밀로 유지되어야 하는 텍스트를 나타냅니다. 이 클래스는 내부 데이터를 암호화하지 않습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 해당 포인터를 사용하십시오.

```cpp
class SecureString : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | 문자열 끝에 문자를 추가합니다. |
| [Clear](./clear/)() | 현재 보안 문자열의 모든 문자를 삭제합니다. |
| [Copy](./copy/)() const | 이 보안 문자열의 복제본을 생성합니다. |
| [Dispose](./dispose/)() override | 현재 객체가 사용한 모든 리소스를 해제합니다. |
| [get_Length](./get_length/)() const | 이 보안 문자열의 문자 수를 가져옵니다. |
| [InsertAt](./insertat/)(int32_t, char16_t) | 지정된 인덱스에 문자를 삽입합니다. |
| [IsReadOnly](./isreadonly/)() const | 이 객체가 읽기 전용으로 표시되었는지 여부를 나타내는 플래그를 가져옵니다. |
| [MakeReadOnly](./makereadonly/)() | 이 보안 문자열을 읽기 전용으로 만듭니다. |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | 지정된 위치의 문자를 제거합니다. |
| [SecureString](./securestring/)() | RTTI 정보. |
| [SecureString](./securestring/)(const char16_t *, int32_t) | 생성자. |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | 지정된 위치의 기존 문자를 교체합니다. |
| [ToUnsecureString](./tounsecurestring/)() const | 이 보안 문자열의 내용을 비보안 [String](../../system/string/) 객체에 복사합니다. 주의해서 사용하십시오. |
| [~SecureString](./~securestring/)() | 소멸자. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
