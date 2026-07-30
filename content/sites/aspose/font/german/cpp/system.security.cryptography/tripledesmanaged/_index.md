---
title: "System::Security::Cryptography::TripleDESManaged Klasse"
linktitle: "TripleDESManaged"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::TripleDESManaged Klasse. Verwaltete TripleDES-Implementierung. Unterstützt nur ECB- und CFB-Modi mit keiner Auffüllung und CBC-Modus mit keiner, Nullen und PKCS7-Auffüllungen. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 5200
url: /de/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Verwaltete [TripleDES](../tripledes/) Implementierung. Unterstützt nur ECB- und CFB-Modi mit keiner Auffüllung und CBC-Modus mit keiner, Nullen und PKCS7-Auffüllungen. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
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

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
