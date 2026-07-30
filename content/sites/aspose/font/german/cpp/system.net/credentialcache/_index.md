---
title: "System::Net::CredentialCache Klasse"
linktitle: "CredentialCache"
second_title: "Aspose.Font für C++"
description: "System::Net::CredentialCache Klasse. Stellt den Anmeldedaten-Speicher bereit. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.net/credentialcache/
---
## CredentialCache class


Stellt den Anmeldedaten-Speicher bereit. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | Fügt die angegebenen Netzwerk-Anmeldedaten dem Cache hinzu. |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | Fügt die angegebenen Netzwerk-Anmeldedaten dem Cache hinzu. |
| [CredentialCache](./credentialcache/)() | Erstellt eine neue Instanz. |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | RTTI-Informationen. |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | Gibt die Netzwerk-Anmeldedaten des aktuellen Benutzers oder der Anwendung zurück. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Gibt Anmeldedaten für das angegebene URI-Präfix und den Authentifizierungstyp zurück. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Gibt Anmeldeinformationen für den angegebenen Hostnamen, Port und Authentifizierungstyp zurück. |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | Entfernt Netzwerk-Anmeldedaten für das angegebene URI-Präfix und den Authentifizierungstyp. |
| [Remove](./remove/)(String, int32_t, String) | Entfernt Netzwerk-Anmeldedaten für den angegebenen Hostnamen, Port und Authentifizierungstyp. |
## Siehe auch

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
