---
title: "System::Text::EncoderReplacementFallbackBuffer Klasse"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "Aspose.Page für C++"
description: "System::Text::EncoderReplacementFallbackBuffer Klasse. Puffer zum Ersetzen der Fallback-Strategie für die Codierung. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1500
url: /de/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | Konstruktor. |
| [Fallback](./fallback/)(char_t, int) override | Behandelt Kodierungsfehler. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Behandelt Kodierungsfehler. |
| [get_Remaining](./get_remaining/)() const override | Ermittelt die Anzahl der verbleibenden Zeichen im Puffer. |
| [GetNextChar](./getnextchar/)() override | Ermittelt das nächste verfügbare Zeichen. |
| [MovePrevious](./moveprevious/)() override | Wechselt zum vorherigen Zeichen. |
| [Reset](./reset/)() override | Setzt den Puffer auf den Ausgangszustand zurück (vor dem Aufruf von [Fallback()](./fallback/)). |
## Siehe auch

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
