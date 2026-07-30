---
title: "System::Text::ICUDecoder Klasse"
linktitle: "ICUDecoder"
second_title: "Aspose.Font für C++"
description: "System::Text::ICUDecoder Klasse. Decoder, der ICU zum Dekodieren verwendet. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2000
url: /de/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Konvertiert Bytes in Zeichen. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Konvertiert Bytes in Zeichen. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Puffers benötigt werden. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Puffers benötigt werden. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Puffers benötigt werden. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Gibt die Zeichen zurück, die durch das Dekodieren eines Puffers entstehen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Gibt die Zeichen zurück, die durch das Dekodieren eines Puffers entstehen. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Gibt die Zeichen zurück, die durch das Dekodieren eines Puffers entstehen. |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | Konstruktor. |
| virtual [Reset](./reset/)() | Setzt interne Variablen auf den Ausgangszustand. |
| virtual [~ICUDecoder](./~icudecoder/)() | Destruktor. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Base](./base/) | [Base](./base/) Typ. |
## Siehe auch

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
