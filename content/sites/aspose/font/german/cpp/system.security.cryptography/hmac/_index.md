---
title: "System::Security::Cryptography::HMAC Klasse"
linktitle: "HMAC"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::HMAC Klasse. Alle Implementierungen des hashbasierten Message Authentication Code (HMAC) müssen diese abstrakte Klasse erben. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1700
url: /de/cpp/system.security.cryptography/hmac/
---
## HMAC class


Alle Implementierungen des hashbasierten Message [Authentication](../../system.security.authentication/) Code ([HMAC](./)) müssen diese abstrakte Klasse erben. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

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
* Library [Aspose.Font for C++](../../)
