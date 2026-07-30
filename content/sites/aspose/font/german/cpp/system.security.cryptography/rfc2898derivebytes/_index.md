---
title: "System::Security::Cryptography::Rfc2898DeriveBytes class"
linktitle: "Rfc2898DeriveBytes"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::Rfc2898DeriveBytes Klasse. Implementiert passwortbasierte Schlüsselerzeugung, PBKDF2. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2900
url: /de/cpp/system.security.cryptography/rfc2898derivebytes/
---
## Rfc2898DeriveBytes class


Implementiert passwortbasierte Schlüsselerzeugung, PBKDF2. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Rfc2898DeriveBytes : public System::Security::Cryptography::DeriveBytes
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [GetBytes](./getbytes/)(int32_t) override | Füllt vorhandene Array-Elemente mit pseudo‑zufälligen Schlüsselbytes. |
| [Reset](./reset/)() override |  |
| [Rfc2898DeriveBytes](./rfc2898derivebytes/)(ArrayPtr\<uint8_t\>, ArrayPtr\<uint8_t\>, int32_t) | RTTI-Informationen. |
## Siehe auch

* Class [DeriveBytes](../derivebytes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
