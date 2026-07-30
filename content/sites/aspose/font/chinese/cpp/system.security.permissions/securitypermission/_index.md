---
title: "System::Security::Permissions::SecurityPermission 类"
linktitle: "SecurityPermission"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Permissions::SecurityPermission 类。描述安全权限的类。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 100
url: /zh/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


描述安全权限的类。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数参数中传递。

```cpp
class SecurityPermission : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Flags](./get_flags/)() | RTTI 信息。 |
| [IsUnrestricted](./isunrestricted/)() | 检查权限是否为无限制。 |
| [SecurityPermission](./securitypermission/)(PermissionState) | 构造函数。 |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | 构造函数。 |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | 设置与权限关联的标志。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Font for C++](../../)
