---
title: "System::Net::Security::AuthenticatedStream class"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Font für C++"
description: "System::Net::Security::AuthenticatedStream class. Enthält die Methoden zum Übertragen von Anmeldeinformationen über einen Stream. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


Enthält die Methoden zum Übertragen von Anmeldeinformationen über einen Stream. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | Gibt einen Wert zurück, der angibt, ob die Authentifizierung erfolgreich durchgeführt wurde. |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | Gibt einen Wert zurück, der angibt, ob die mit diesem Stream gesendeten Daten verschlüsselt sind. |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | Gibt einen Wert zurück, der angibt, ob ein Server und ein Client authentifiziert sind. |
| virtual [get_IsServer](./get_isserver/)() const | Gibt einen Wert zurück, der angibt, ob die lokale Seite der Verbindung der Server ist. |
| virtual [get_IsSigned](./get_issigned/)() const | Gibt einen Wert zurück, der angibt, ob die mit diesem Stream gesendeten Daten signiert sind. |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | RTTI-Informationen. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Siehe auch

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
