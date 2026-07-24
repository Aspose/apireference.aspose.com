---
title: "System::Net::NetworkInformation::IPGlobalProperties 클래스"
linktitle: "IPGlobalProperties"
second_title: "C++용 Aspose.Page"
description: "System::Net::NetworkInformation::IPGlobalProperties 클래스. 로컬 컴퓨터의 네트워크 연결에 대한 정보를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 200
url: /ko/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


로컬 컴퓨터의 네트워크 연결에 대한 정보를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class IPGlobalProperties : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | 로컬 컴퓨터가 등록된 도메인을 반환합니다. |
| virtual [get_HostName](./get_hostname/)() | 로컬 컴퓨터의 호스트 이름을 반환합니다. |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | RTTI 정보. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Page for C++](../../)
