---
title: "System::Security::Permissions::SecurityPermission Klasse"
linktitle: "SecurityPermission"
second_title: "Aspose.Font für C++"
description: "System::Security::Permissions::SecurityPermission Klasse. Klasse, die Sicherheitsberechtigungen beschreibt. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.security.permissions/securitypermission/
---
## SecurityPermission class


Klasse, die Sicherheitsberechtigungen beschreibt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SecurityPermission : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Flags](./get_flags/)() | RTTI-Informationen. |
| [IsUnrestricted](./isunrestricted/)() | Prüft, ob die Berechtigung uneingeschränkt ist. |
| [SecurityPermission](./securitypermission/)(PermissionState) | Konstruktor. |
| [SecurityPermission](./securitypermission/)(SecurityPermissionFlag) | Konstruktor. |
| [set_Flags](./set_flags/)(SecurityPermissionFlag) | Setzt Flags, die mit der Berechtigung verbunden sind. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Permissions](../)
* Library [Aspose.Font for C++](../../)
