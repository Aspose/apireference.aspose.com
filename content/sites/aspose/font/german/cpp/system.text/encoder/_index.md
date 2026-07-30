---
title: "System::Text::Encoder Klasse"
linktitle: "Encoder"
second_title: "Aspose.Font für C++"
description: "System::Text::Encoder Klasse. Kapselt eine Zeichenfolge für die Kodierung in eine Byte‑Sequenz. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.text/encoder/
---
## Encoder class


Kapselt eine Zeichenfolge für die Kodierung in eine Byte‑Sequenz. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Encoder : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Konvertiert Zeichen in Bytes. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Konvertiert Zeichen in Bytes. |
| [get_Fallback](./get_fallback/)() const | Ermittelt das Fehlerbehandlungs‑Fallback. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Ermittelt den Fallback‑Puffer. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Ermittelt die Anzahl der Bytes, die zum Kodieren eines Puffers benötigt werden. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Ermittelt die Anzahl der Bytes, die zum Kodieren eines Puffers benötigt werden. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Gibt die Bytes zurück, die durch das Kodieren eines Puffers entstehen. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Gibt die Bytes zurück, die durch das Kodieren eines Puffers entstehen. |
| virtual [Reset](./reset/)() | Bereinigt den internen Zustand des Encoders. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | Setzt das Fehlerbehandlungs‑Fallback. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
