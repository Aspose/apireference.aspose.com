---
title: "System::Text::DecoderReplacementFallback Klasse"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Font für C++"
description: "System::Text::DecoderReplacementFallback Klasse. Bietet eine Rückfallstrategie, bei der fehlerhafte Symbole durch einen Platzhalter ersetzt werden. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 700
url: /de/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


Bietet eine Rückfallstrategie, bei der fehlerhafte Symbole durch einen Platzhalter ersetzt werden. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Erstellt den Rückfallpuffer. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | Konstruktor, der den Standard-\"?\"-Ersetzungsstring verwendet. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | Konstruktor. |
| [get_DefaultString](./get_defaultstring/)() const | Liefert den Ersetzungsstring. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Ermittelt die maximale Anzahl von Zeichen, die die Instanz zurückgeben kann. |
## Siehe auch

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
