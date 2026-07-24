---
title: "System::Net::NetworkCredential class"
linktitle: "NetworkCredential"
second_title: "Aspose.Page für C++"
description: "System::Net::NetworkCredential class. Stellt Anmeldeinformationen für passwortbasierte Authentifizierungsschemata bereit. Objekte dieser Klasse sollten nur über die System::MakeObject()‑Funktion zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2900
url: /de/cpp/system.net/networkcredential/
---
## NetworkCredential class


Stellt Anmeldeinformationen für passwortbasierte Authentifizierungsschemata bereit. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Domain](./get_domain/)() | Liefert die Domäne, die die Anmeldeinformationen überprüft. |
| [get_Password](./get_password/)() | Liefert das Passwort. |
| [get_UserName](./get_username/)() | RTTI-Informationen. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Gibt Anmeldeinformationen für die angegebene URI und den Authentifizierungstyp zurück. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Gibt Anmeldeinformationen für den angegebenen Hostnamen, Port und Authentifizierungstyp zurück. |
| [NetworkCredential](./networkcredential/)() | Konstruiert eine neue Instanz. |
| [NetworkCredential](./networkcredential/)(String, String) | Konstruiert eine neue Instanz. |
| [NetworkCredential](./networkcredential/)(String, String, String) | Konstruiert eine neue Instanz. |
| [set_Domain](./set_domain/)(String) | Setzt die Domäne, die die Anmeldeinformationen überprüft. |
| [set_Password](./set_password/)(String) | Setzt das Passwort. |
| [set_UserName](./set_username/)(String) | Setzt den Benutzernamen. |
## Siehe auch

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
