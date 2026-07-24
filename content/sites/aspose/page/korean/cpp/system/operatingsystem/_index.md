---
title: "System::OperatingSystem 클래스"
linktitle: "OperatingSystem"
second_title: "C++용 Aspose.Page"
description: "System::OperatingSystem 클래스. 특정 운영 체제를 나타내며 해당 정보를 제공합니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 5100
url: /ko/cpp/system/operatingsystem/
---
## OperatingSystem class


특정 운영 체제를 나타내며 해당 정보를 제공합니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class OperatingSystem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Platform](./get_platform/)() const | 현재 객체가 나타내는 운영 체제의 플랫폼 식별자를 반환합니다. |
| [get_ServicePack](./get_servicepack/)() const | 현재 객체가 나타내는 운영 체제의 서비스 팩 이름을 반환합니다. |
| [get_Version](./get_version/)() const | 현재 객체가 나타내는 운영 체제 버전을 나타내는 [Version](../version/) 객체에 대한 상수 참조를 반환합니다. |
| [get_VersionString](./get_versionstring/)() const | 현재 객체가 나타내는 운영 체제 버전의 문자열 표현을 반환합니다. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&) | 특정 플랫폼 ID와 버전으로 지정된 운영 체제를 나타내는 인스턴스를 생성합니다. |
| [OperatingSystem](./operatingsystem/)(PlatformID, const Version\&, const String\&) | 특정 플랫폼 ID, 버전 및 서비스 팩으로 지정된 운영 체제를 나타내는 인스턴스를 생성합니다. |
| [ToString](./tostring/)() const | 현재 객체가 나타내는 운영 체제 버전의 문자열 표현을 반환합니다. |
## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
