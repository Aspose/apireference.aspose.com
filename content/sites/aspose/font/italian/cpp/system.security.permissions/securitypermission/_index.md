---
title: "System::Security::Permissions::SecurityPermission class"
linktitle: "SecurityPermission"
second_title: "Aspose.Font per C++"
description: "System::Security::Permissions::SecurityPermission class. Classe che descrive il permesso di sicurezza. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


Classe che descrive il permesso di sicurezza. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class SecurityPermission : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Flags](./get_flags/)() | Informazioni RTTI. |
| [IsUnrestricted](./isunrestricted/)() | Verifica se il permesso è senza restrizioni. |
| [SecurityPermission](./securitypermission/)(PermissionState) | Costruttore. |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | Costruttore. |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | Imposta i flag associati al permesso. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Font for C++](../../)
