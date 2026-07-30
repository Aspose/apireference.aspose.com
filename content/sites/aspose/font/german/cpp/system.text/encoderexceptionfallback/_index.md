---
title: "System::Text::EncoderExceptionFallback Klasse"
linktitle: "EncoderExceptionFallback"
second_title: "Aspose.Font für C++"
description: "System::Text::EncoderExceptionFallback Klasse. Bietet eine Ausnahmewurf‑Fallback‑Strategie. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


Bietet eine ausnahmewurfende Rückfallstrategie. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Erstellt den Rückfallpuffer. |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | Konstruktor. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Ermittelt die maximale Anzahl von Zeichen, die die Instanz zurückgeben kann. |
## Siehe auch

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
