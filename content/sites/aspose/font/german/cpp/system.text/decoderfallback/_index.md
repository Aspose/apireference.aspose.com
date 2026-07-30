---
title: "System::Text::DecoderFallback Klasse"
linktitle: "DecoderFallback"
second_title: "Aspose.Font für C++"
description: "System::Text::DecoderFallback Klasse. Stellt eine Fallback-API zur Behandlung von Dekodierungsfehlern bereit. Objekte dieser Klasse sollten nur über die System::MakeObject()‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.text/decoderfallback/
---
## DecoderFallback class


Stellt eine Fallback-API zur Behandlung von Dekodierungsfehlern bereit. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DecoderFallback : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Ruft den mit dem Fallback-Algorithmus verbundenen Puffer ab. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Ruft die standardmäßige Ausnahme-Fallback-Implementierung ab. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Ruft die maximale Anzahl von Zeichen ab, die vom Fallback zurückgegeben werden können. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Ruft die standardmäßige Ersetzungs-Fallback-Implementierung ab. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Ruft die standardmäßige sichere Standard-Fallback-Implementierung ab. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
