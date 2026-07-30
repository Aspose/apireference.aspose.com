---
title: "System::Security::Cryptography::RandomNumberGenerator Klasse"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RandomNumberGenerator Klasse. Abstrakte Klasse, von der Zufallszahlengeneratoren erben sollen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2600
url: /de/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


Abstrakte Klasse, von der Zufallszahlengeneratoren erben sollen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Create](./create/)() | Erstellt eine Instanz der Standardimplementierung eines kryptografischen Zufallszahlengenerators, die zum Erzeugen zufälliger Daten verwendet werden kann. Nicht implementiert. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | Füllt vorhandene Array-Elemente mit zufälligen Bytes. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | Füllt vorhandenen Array‑Abschnitt mit zufälligen Bytes. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | Füllt vorhandene Array‑View-Elemente mit zufälligen Bytes. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | Füllt vorhandenen Array‑View‑Abschnitt mit zufälligen Bytes. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Füllt vorhandene Stack‑Array-Elemente mit zufälligen Bytes. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | Füllt vorhandenen Stack‑Array‑Abschnitt mit zufälligen Bytes. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | Füllt vorhandene Array-Elemente mit zufälligen Nicht‑Null‑Bytes. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | Füllt vorhandene Array‑View-Elemente mit zufälligen Nicht‑Null‑Bytes. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Füllt vorhandene Stack‑Array-Elemente mit zufälligen Nicht‑Null‑Bytes. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
