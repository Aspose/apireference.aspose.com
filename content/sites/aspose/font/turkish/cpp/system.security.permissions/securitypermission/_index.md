---
title: "System::Security::Permissions::SecurityPermission sınıfı"
linktitle: "SecurityPermission"
second_title: "Aspose.Font için C++"
description: "System::Security::Permissions::SecurityPermission sınıfı. Güvenlik iznini tanımlayan sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


Bu sınıf, güvenlik iznini tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SecurityPermission : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Flags](./get_flags/)() | RTTI bilgisi. |
| [IsUnrestricted](./isunrestricted/)() | İznin sınırsız olup olmadığını denetler. |
| [SecurityPermission](./securitypermission/)(PermissionState) | Yapıcı. |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | Yapıcı. |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | İzinle ilişkili bayrakları ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Font for C++](../../)
