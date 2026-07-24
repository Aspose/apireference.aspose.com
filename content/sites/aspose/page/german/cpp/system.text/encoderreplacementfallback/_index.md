---
title: "System::Text::EncoderReplacementFallback Klasse"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Page für C++"
description: "System::Text::EncoderReplacementFallback Klasse. Bietet eine Fallback-Strategie, bei der ein fehlerhaftes Symbol durch ein Platzhalter ersetzt wird. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1400
url: /de/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


Bietet eine Fallback-Strategie, bei der fehlerhafte Symbole durch einen Platzhalter ersetzt werden. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Erstellt einen Fallback-Puffer. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | Konstruktor, der den Standard-\"?\"-Ersetzungsstring verwendet. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | Konstruktor. |
| [get_DefaultString](./get_defaultstring/)() const | Liefert den Ersetzungsstring. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Ermittelt die maximale Anzahl von Zeichen, die die Instanz zurückgeben kann. |
## Siehe auch

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
