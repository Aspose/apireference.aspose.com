---
title: "System::Text::DecoderFallback Klasse"
linktitle: "DecoderFallback"
second_title: "Aspose.Page für C++"
description: "System::Text::DecoderFallback Klasse. Stellt eine Fallback-API zur Behandlung von Dekodierfehlern bereit. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.text/decoderfallback/
---
## DecoderFallback class


Stellt eine Fallback-API zur Behandlung von Dekodierfehlern bereit. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DecoderFallback : public System::Object
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
