---
title: "System::Net::NetworkCredential Klasse"
linktitle: "NetworkCredential"
second_title: "Aspose.Font für C++"
description: "System::Net::NetworkCredential Klasse. Stellt Anmeldeinformationen für passwortbasierte Authentifizierungsschemata bereit. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2900
url: /de/cpp/system.net/networkcredential/
---
## NetworkCredential class


Stellt Anmeldeinformationen für passwortbasierte Authentifizierungsschemata bereit. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn an Funktionen als Argument zu übergeben.

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Domain](./get_domain/)() | Ruft die Domäne ab, die die Anmeldeinformationen überprüft. |
| [get_Password](./get_password/)() | Ruft das Passwort ab. |
| [get_UserName](./get_username/)() | RTTI-Informationen. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Gibt Anmeldeinformationen für die angegebene URI und den Authentifizierungstyp zurück. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Gibt Anmeldeinformationen für den angegebenen Hostnamen, Port und Authentifizierungstyp zurück. |
| [NetworkCredential](./networkcredential/)() | Erstellt eine neue Instanz. |
| [NetworkCredential](./networkcredential/)(String, String) | Erstellt eine neue Instanz. |
| [NetworkCredential](./networkcredential/)(String, String, String) | Erstellt eine neue Instanz. |
| [set_Domain](./set_domain/)(String) | Setzt die Domäne, die die Anmeldeinformationen überprüft. |
| [set_Password](./set_password/)(String) | Setzt das Passwort. |
| [set_UserName](./set_username/)(String) | Legt den Benutzernamen fest. |
## Siehe auch

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
