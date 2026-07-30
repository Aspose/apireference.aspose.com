---
title: "System::Text::Decoder Klasse"
linktitle: "Decoder"
second_title: "Aspose.Font für C++"
description: "System::Text::Decoder Klasse. Kapselt das Dekodieren einer Byte‑Sequenz in eine Zeichen‑Sequenz. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.text/decoder/
---
## Decoder class


Kapselt das Dekodieren einer Byte‑Sequenz in eine Zeichen‑Sequenz. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Decoder : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Konvertiert Bytes in Zeichen. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Konvertiert Bytes in Zeichen. |
| [get_Fallback](./get_fallback/)() const | Ermittelt das Fehlerbehandlungs‑Fallback. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Ermittelt den Fallback‑Puffer. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Puffers benötigt werden. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Puffers benötigt werden. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Puffers benötigt werden. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Gibt die Zeichen zurück, die durch das Dekodieren eines Puffers entstehen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Gibt die Zeichen zurück, die durch das Dekodieren eines Puffers entstehen. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Gibt die Zeichen zurück, die durch das Dekodieren eines Puffers entstehen. |
| virtual [Reset](./reset/)() | Bereinigt den internen Zustand des Decoders. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | Setzt das Fehlerbehandlungs‑Fallback. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
