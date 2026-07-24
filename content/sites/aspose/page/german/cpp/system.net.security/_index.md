---
title: "System::Net::Security Namensraum"
linktitle: "System::Net::Security"
second_title: "Aspose.Page für C++"
description: "Wie man den System::Net::Security Namensraum in C++ verwendet."
type: docs
weight: 4700
url: /de/cpp/system.net.security/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [AuthenticatedStream](./authenticatedstream/) | Enthält die Methoden zum Übergeben von Anmeldeinformationen über einen Stream. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [SslStream](./sslstream/) | Ein Stream, der das SSL-Protokoll verwendet, um den Server und optional den Client zu authentifizieren. |
## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [AuthenticationLevel](./authenticationlevel/) | WebRequest-spezifische Authentifizierungs-Flags. |
| [EncryptionPolicy](./encryptionpolicy/) | Enumeriert die Verschlüsselungsrichtlinien. |
| [SslPolicyErrors](./sslpolicyerrors/) | Enumeriert die Richtlinienfehler von SSL. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [LocalCertificateSelectionCallback](./localcertificateselectioncallback/) | Ein Benutzer-Delegate, der zum Auswählen des lokalen SSL-Zertifikats verwendet wird. |
| [RemoteCertificateValidationCallback](./remotecertificatevalidationcallback/) | Ein Benutzer-Delegate, der zum Verifizieren des entfernten SSL-Zertifikats verwendet wird. |
