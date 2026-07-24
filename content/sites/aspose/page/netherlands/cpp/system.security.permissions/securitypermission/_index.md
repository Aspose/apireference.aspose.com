---
title: "System::Security::Permissions::SecurityPermission class"
linktitle: "SecurityPermission"
second_title: "Aspose.Page voor C++"
description: "System::Security::Permissions::SecurityPermission class. Klasse die beveiligingspermissie beschrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wrap deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 100
url: /nl/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


Klasse die beveiligingspermissie beschrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wrap deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class SecurityPermission : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Flags](./get_flags/)() | RTTI-informatie. |
| [IsUnrestricted](./isunrestricted/)() | Controleert of de permissie onbeperkt is. |
| [SecurityPermission](./securitypermission/)(PermissionState) | Constructor. |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | Constructor. |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | Stelt vlaggen in die aan de permissie zijn gekoppeld. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
