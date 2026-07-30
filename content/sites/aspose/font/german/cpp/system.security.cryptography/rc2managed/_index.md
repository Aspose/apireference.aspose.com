---
title: "System::Security::Cryptography::RC2Managed Klasse"
linktitle: "RC2Managed"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RC2Managed Klasse. Verwalteter RC2-Algorithmus. Nur die Cipher-Modi ECB, CFB und CBC werden unterstützt. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2800
url: /de/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


Verwalteter [RC2](../rc2/)-Algorithmus. Nur die Cipher‑Modi ECB, CFB und CBC werden unterstützt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Erstellt ein Entschlüsseler-Objekt mit expliziten Parametern. |
| virtual [CreateDecryptor](./createdecryptor/)() | Erstellt ein Entschlüsseler-Objekt mit Parametern, die vom Algorithmus-Objekt definiert werden. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Erstellt ein Verschlüsselungs-Objekt mit expliziten Parametern. |
| virtual [CreateEncryptor](./createencryptor/)() | Erstellt ein Verschlüsselungs-Objekt mit Parametern, die vom Algorithmus-Objekt definiert werden. |
| [GenerateIV](./generateiv/)() override | Erstellt einen zufälligen Initialwert und speichert ihn in den internen Daten des Algorithmus. |
| [GenerateKey](./generatekey/)() override | Erstellt einen zufälligen Schlüssel und speichert ihn in den internen Daten des Algorithmus. |
## Siehe auch

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
