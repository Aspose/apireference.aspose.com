---
title: "Clase System::Security::Permissions::SecurityPermission"
linktitle: "SecurityPermission"
second_title: "Aspose.Page para C++"
description: "Clase System::Security::Permissions::SecurityPermission. Clase que describe el permiso de seguridad. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 100
url: /es/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


Clase que describe el permiso de seguridad. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class SecurityPermission : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Flags](./get_flags/)() | Información RTTI. |
| [IsUnrestricted](./isunrestricted/)() | Comprueba si el permiso es sin restricciones. |
| [SecurityPermission](./securitypermission/)(PermissionState) | Constructor. |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | Constructor. |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | Establece las banderas asociadas al permiso. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
