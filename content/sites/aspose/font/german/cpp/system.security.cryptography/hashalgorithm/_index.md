---
title: "System::Security::Cryptography::HashAlgorithm Klasse"
linktitle: "HashAlgorithm"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::HashAlgorithm Klasse. Basisklasse für Hash‑Algorithmen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1600
url: /de/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


Basisklasse für Hash‑Algorithmen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | Hasht den Puffer. |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | Hasht einen Pufferabschnitt. |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | Liest den Stream bis zum Ende und berechnet den Hash für die gelesenen Daten. |
| static [Create](./create/)(const String\&) | Erstellt einen Hash‑Algorithmus basierend auf dem Namen. |
| virtual [get_Hash](./get_hash/)() | Gibt den Wert des berechneten Hash‑Codes zurück. |
| virtual [get_HashSize](./get_hashsize/)() | Gibt die Größe des berechneten Hash‑Werts in Bytes zurück. |
| [get_InputBlockSize](./get_inputblocksize/)() override | Eingabeblockgröße. |
| [get_OutputBlockSize](./get_outputblocksize/)() override | Ausgabeblockgröße. |
| virtual [Initialize](./initialize/)() | Setzt den Hasher in den Ausgangszustand zurück. |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Verarbeitet einen Datenblock und kopiert die Daten in das Ausgabearray. |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | Verarbeitet den letzten Datenblock und berechnet den Hash. |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | Destruktor. |
## Siehe auch

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
