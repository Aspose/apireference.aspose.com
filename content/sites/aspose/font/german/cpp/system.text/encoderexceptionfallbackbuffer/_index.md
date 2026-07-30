---
title: "System::Text::EncoderExceptionFallbackBuffer Klasse"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Font für C++"
description: "System::Text::EncoderExceptionFallbackBuffer Klasse. Puffer für eine Ausnahmewürfende Kodierungs‑Fallback‑Strategie. Speichert tatsächlich nichts, wirft stattdessen eine Ausnahme. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1100
url: /de/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | Konstruktor. |
| [Fallback](./fallback/)(char_t, int) override | Behandelt Kodierungsfehler. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Behandelt Kodierungsfehler. |
| [get_Remaining](./get_remaining/)() const override | Ermittelt die Anzahl verbleibender Zeichen. |
| [GetNextChar](./getnextchar/)() override | Liefert das nächste verfügbare Zeichen. |
| [MovePrevious](./moveprevious/)() override | Bewegt zum vorherigen Zeichen. |
## Siehe auch

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
