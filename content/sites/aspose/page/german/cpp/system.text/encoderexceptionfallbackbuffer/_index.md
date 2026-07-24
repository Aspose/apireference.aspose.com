---
title: "System::Text::EncoderExceptionFallbackBuffer Klasse"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Page für C++"
description: "System::Text::EncoderExceptionFallbackBuffer class. Puffer für eine Ausnahmewürfende Kodierungs-Fallback-Strategie. Speichert tatsächlich nichts, wirft stattdessen eine Ausnahme. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
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
| [get_Remaining](./get_remaining/)() const override | Ermittelt die Anzahl der verbleibenden Zeichen. |
| [GetNextChar](./getnextchar/)() override | Ermittelt das nächste verfügbare Zeichen. |
| [MovePrevious](./moveprevious/)() override | Wechselt zum vorherigen Zeichen. |
## Siehe auch

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
