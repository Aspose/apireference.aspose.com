---
title: "System::Text::EncoderFallback Klasse"
linktitle: "EncoderFallback"
second_title: "Aspose.Page für C++"
description: "System::Text::EncoderFallback Klasse. Stellt eine Fallback‑API bereit, um Kodierungsfehler zu behandeln. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1200
url: /de/cpp/system.text/encoderfallback/
---
## EncoderFallback class


Stellt eine Fallback‑API bereit, um Kodierungsfehler zu behandeln. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class EncoderFallback : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Ermittelt den Puffer, der dem Fallback-Algorithmus zugeordnet ist. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Liefert die Standard‑Ausnahme‑Fallback‑Implementierung. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Liefert die maximale Anzahl von Zeichen, die vom Fallback zurückgegeben werden können. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Liefert die Standard‑Ersetzungs‑Fallback‑Implementierung. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Liefert die Standard‑sichere‑Fallback‑Implementierung. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
