---
title: "System::Text::ICUEncoder Klasse"
linktitle: "ICUEncoder"
second_title: "Aspose.Font für C++"
description: "System::Text::ICUEncoder Klasse. Encoder, der ICU für die Kodierung verwendet. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2100
url: /de/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Konvertiert Zeichen in Bytes. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Konvertiert Zeichen in Bytes. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Ermittelt die Anzahl der Bytes, die zum Kodieren eines Puffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Ermittelt die Anzahl der Bytes, die zum Kodieren eines Puffers benötigt werden. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Gibt die Bytes zurück, die durch das Kodieren eines Puffers entstehen. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Gibt die Bytes zurück, die durch das Kodieren eines Puffers entstehen. |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | Konstruktor. |
| virtual [Reset](./reset/)() | Setzt interne Variablen auf den Ausgangszustand. |
| [~ICUEncoder](./~icuencoder/)() | Destruktor. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Base](./base/) | [Base](./base/) Typ. |
## Siehe auch

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
