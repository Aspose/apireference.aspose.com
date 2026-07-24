---
title: "System::Net::IPHostEntry 클래스"
linktitle: "IPHostEntry"
second_title: "C++용 Aspose.Page"
description: "System::Net::IPHostEntry 클래스. 인터넷 호스트 주소에 대한 정보를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2600
url: /ko/cpp/system.net/iphostentry/
---
## IPHostEntry class


인터넷 호스트 주소에 대한 정보를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class IPHostEntry : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | 호스트의 IP 주소 컬렉션을 가져옵니다. |
| [get_Aliases](./get_aliases/)() | 호스트의 별칭 컬렉션을 가져옵니다. |
| [get_HostName](./get_hostname/)() const | RTTI 정보. |
| [IPHostEntry](./iphostentry/)() | 새 인스턴스를 생성합니다. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | 호스트의 IP 주소 컬렉션을 설정합니다. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | 호스트의 별칭 컬렉션을 설정합니다. |
| [set_HostName](./set_hostname/)(String) | 호스트 이름을 설정합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
