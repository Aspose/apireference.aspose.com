---
title: "Classe System::Security::Permissions::SecurityPermission"
linktitle: "SecurityPermission"
second_title: "Aspose.Page per C++"
description: "Classe System::Security::Permissions::SecurityPermission. Classe che descrive l'autorizzazione di sicurezza. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


Classe che descrive l'autorizzazione di sicurezza. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class SecurityPermission : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Flags](./get_flags/)() | Informazioni RTTI. |
| [IsUnrestricted](./isunrestricted/)() | Verifica se l'autorizzazione è illimitata. |
| [SecurityPermission](./securitypermission/)(PermissionState) | Costruttore. |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | Costruttore. |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | Imposta i flag associati all'autorizzazione. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
