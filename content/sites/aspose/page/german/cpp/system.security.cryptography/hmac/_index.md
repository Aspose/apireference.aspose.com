---
title: "System::Security::Cryptography::HMAC-Klasse"
linktitle: "HMAC"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::HMAC-Klasse. Alle Implementierungen des hashbasierten Message Authentication Code (HMAC) müssen diese abstrakte Klasse erben. Objekte dieser Klasse dürfen nur über die Funktion System::MakeObject() erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1700
url: /de/cpp/system.security.cryptography/hmac/
---
## HMAC class


Alle Implementierungen des hashbasierten Message-[Authentication](../../system.security.authentication/)-Codes ([HMAC](./)) müssen diese abstrakte Klasse erben. Objekte dieser Klasse dürfen nur über die Funktion [System::MakeObject()](../../system/makeobject/) erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HMAC : public System::Security::Cryptography::HashAlgorithm
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Create](./create/)() | NICHT IMPLEMENTIERT. |
## Siehe auch

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
