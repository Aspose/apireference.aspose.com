---
title: "Enumeración System::Security::Permissions::SecurityPermissionFlag"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Page para C++"
description: "Enumeración System::Security::Permissions::SecurityPermissionFlag. Banderas del permiso de seguridad en C++."
type: docs
weight: 300
url: /es/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


Banderas del permiso de seguridad.

```cpp
enum class SecurityPermissionFlag
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| NoFlags | 0 | Sin acceso. |
| Afirmación | 1 | Asegúrese de que se haya concedido el permiso. |
| UnmanagedCode | 2 | Llame al código no administrado. |
| SkipVerification | 4 | Omita la verificación del código. |
| Ejecución | 8 | Ejecute código. |
| ControlThread | 16 | Realice operaciones en hilos. |
| ControlEvidence | 32 | Controle o modifique la evidencia CLR. |
| ControlPolicy | 64 | Vea y cambie la política. |
| SerializationFormatter | 128 | Serializar. |
| ControlDomainPolicy | 256 | Establezca la política de dominio. |
| ControlPrincipal | 512 | Controle el objeto principal. |
| ControlAppDomain | 1024 | Controle el dominio de la aplicación. |
| RemotingConfiguration | 2048 | Configure la comunicación remota. |
| Infraestructura | 4096 | Conéctese a la infraestructura CLR. |
| BindingRedirects | 8192 | Realice una redirección de enlace explícita. |
| AllFlags | 16383 | Sin restricciones. |

## Ver también

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
