---
title: "System::Security::Cryptography::ICryptoTransform Klasse"
linktitle: "ICryptoTransform"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::ICryptoTransform Klasse. Basisklasse für kryptografische Transformatoren. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2000
url: /de/cpp/system.security.cryptography/icryptotransform/
---
## ICryptoTransform class


Basisklasse für kryptografische Transformatoren. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ICryptoTransform : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Eingabeblockgröße. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Ausgabeblockgröße. |
| virtual [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) | RTTI-Informationen. |
| virtual [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) | Verarbeitet den letzten Datenblock und berechnet den Ausgabewert. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
