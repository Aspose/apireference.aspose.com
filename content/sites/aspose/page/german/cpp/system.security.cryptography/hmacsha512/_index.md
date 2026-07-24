---
title: "System::Security::Cryptography::HMACSHA512 Klasse"
linktitle: "HMACSHA512"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::HMACSHA512 Klasse. Hash-basierter Message Authentication Code, der die SHA512-Hashfunktion verwendet. Teilweise implementiert. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1900
url: /de/cpp/system.security.cryptography/hmacsha512/
---
## HMACSHA512 class


Hash-basierter Message [Authentication](../../system.security.authentication/) Code, der die [SHA512](../sha512/) Hashfunktion verwendet. Teilweise implementiert. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HMACSHA512 : public System::Security::Cryptography::HashAlgorithm
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | Berechnet [HMAC](../hmac/). |
| [HMACSHA512](./hmacsha512/)() | Konstruktor. |
| [HMACSHA512](./hmacsha512/)(const System::ArrayPtr\<uint8_t\>\&) | Konstruktor. |
## Siehe auch

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
