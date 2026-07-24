---
title: "System::Security::Cryptography::AsymmetricAlgorithm Klasse"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::AsymmetricAlgorithm Klasse. Abstrakte Basisklasse für asymmetrische Verschlüsselungsalgorithmen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


Abstrakte Basisklasse für asymmetrische Verschlüsselungsalgorithmen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clear](./clear/)() | Gibt alle Ressourcen frei. |
| static [Create](./create/)() | Erstellt einen Standard‑Algorithmus. Nicht implementiert. |
| static [Create](./create/)(const String\&) | Erstellt einen Algorithmus nach Namen. Nicht implementiert. |
| [Dispose](./dispose/)() override | Gibt Ressourcen frei, die dem aktuellen Objekt gehören. |
| virtual [FromXmlString](./fromxmlstring/)(String) | Liest Algorithmusparameter aus einer XML-Zeichenkette. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | Ermittelt den zu verwendenden Schlüsselaustauschalgorithmus. |
| virtual [get_KeySize](./get_keysize/)() | RTTI-Informationen. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | Ermittelt das Array zulässiger Schlüssellängen. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | Ermittelt den zu verwendenden Signaturalgorithmus. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | Setzt die Schlüssellänge. |
| virtual [ToXmlString](./toxmlstring/)(bool) | Schreibt Algorithmusparameter in eine XML-Zeichenkette. |
## Siehe auch

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
