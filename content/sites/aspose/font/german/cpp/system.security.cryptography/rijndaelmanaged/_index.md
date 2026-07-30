---
title: "System::Security::Cryptography::RijndaelManaged Klasse"
linktitle: "RijndaelManaged"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RijndaelManaged Klasse. Verwalteter Rijndael-Algorithmus. Unterstützt nur ECB- und CFB-Modi mit keiner Auffüllung (None) und CBC-Modus mit keiner und Null‑Auffüllung (Zeros). Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3100
url: /de/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


Verwalteter [Rijndael](../rijndael/) Algorithmus. Unterstützt nur ECB- und CFB-Modi mit keiner Auffüllung (None) und CBC-Modus mit keiner und Null‑Auffüllung (Zeros). Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
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

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
