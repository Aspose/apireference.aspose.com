---
title: "System::Security::Cryptography::AsymmetricAlgorithm Klasse"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::AsymmetricAlgorithm Klasse. Abstrakte Basisklasse für asymmetrische Verschlüsselungsalgorithmen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


Abstrakte Basisklasse für asymmetrische Verschlüsselungsalgorithmen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clear](./clear/)() | Gibt alle Ressourcen frei. |
| static [Create](./create/)() | Erstellt einen Standardalgorithmus. Nicht implementiert. |
| static [Create](./create/)(const String\&) | Erstellt einen Algorithmus anhand des Namens. Nicht implementiert. |
| [Dispose](./dispose/)() override | Gibt Ressourcen frei, die dem aktuellen Objekt gehören. |
| virtual [FromXmlString](./fromxmlstring/)(String) | Liest Algorithmusparameter aus einer XML-Zeichenkette. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | Ruft den zu verwendenden Schlüsselaustauschalgorithmus ab. |
| virtual [get_KeySize](./get_keysize/)() | RTTI-Informationen. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | Ruft ein Array der zulässigen Schlüssellängen ab. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | Ruft den zu verwendenden Signaturalgorithmus ab. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | Setzt die Schlüssellänge. |
| virtual [ToXmlString](./toxmlstring/)(bool) | Schreibt Algorithmusparameter in eine XML-Zeichenkette. |
## Siehe auch

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
