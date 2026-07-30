---
title: "System::Text::EncoderFallbackBuffer Klasse"
linktitle: "EncoderFallbackBuffer"
second_title: "Aspose.Font für C++"
description: "System::Text::EncoderFallbackBuffer Klasse. Stellt einen Puffer für die Fallback-Implementierung bereit. Objekte dieser Klasse sollten nur über die System::MakeObject()‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1300
url: /de/cpp/system.text/encoderfallbackbuffer/
---
## EncoderFallbackBuffer class


Stellt einen Puffer für die Fallback-Implementierung bereit. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class EncoderFallbackBuffer : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Fallback](./fallback/)(char_t, int) | Implementiert das eigentliche Fallback-Verfahren. |
| virtual [Fallback](./fallback/)(char_t, char_t, int) | Implementiert das eigentliche Fallback-Verfahren. |
| virtual [get_Remaining](./get_remaining/)() const | Ermittelt die verbleibende Anzahl zu verarbeitender Zeichen. |
| virtual [GetNextChar](./getnextchar/)() | Extrahiert das nächste Zeichen im Fallback-Puffer. |
| virtual [MovePrevious](./moveprevious/)() | Verschiebt die Pufferposition einen Schritt zurück, falls möglich. |
| virtual [Reset](./reset/)() | Setzt den Puffer auf den Ausgangszustand zurück. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
