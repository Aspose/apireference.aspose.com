---
title: "System::Security::Permissions::SecurityPermission 클래스"
linktitle: "SecurityPermission"
second_title: "C++용 Aspose.Page"
description: "System::Security::Permissions::SecurityPermission 클래스. 보안 권한을 설명하는 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


보안 권한을 설명하는 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 이 포인터를 사용하십시오.

```cpp
class SecurityPermission : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Flags](./get_flags/)() | RTTI 정보. |
| [IsUnrestricted](./isunrestricted/)() | 권한이 제한 없는지 확인합니다. |
| [SecurityPermission](./securitypermission/)(PermissionState) | 생성자. |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | 생성자. |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | 권한과 연관된 플래그를 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
