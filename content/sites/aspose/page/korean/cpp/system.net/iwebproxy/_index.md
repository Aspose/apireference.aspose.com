---
title: "System::Net::IWebProxy 클래스"
linktitle: "IWebProxy"
second_title: "C++용 Aspose.Page"
description: "System::Net::IWebProxy 클래스. 이 인터페이스는 WebRequest 클래스에 대한 프록시 액세스 구현에 사용됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2700
url: /ko/cpp/system.net/iwebproxy/
---
## IWebProxy class


이 인터페이스는 [WebRequest](../webrequest/) 클래스에 대한 프록시 액세스 구현에 사용됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class IWebProxy : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | RTTI 정보. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | 프록시 URI를 반환합니다. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | 지정된 호스트에 대해 프록시를 사용하면 안 되는지를 나타내는 값을 반환합니다. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 프록시 서버에 대한 인증 자격 증명을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
