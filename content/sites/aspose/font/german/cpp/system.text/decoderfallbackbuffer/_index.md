---
title: "System::Text::DecoderFallbackBuffer Klasse"
linktitle: "DecoderFallbackBuffer"
second_title: "Aspose.Font für C++"
description: "System::Text::DecoderFallbackBuffer Klasse. Stellt einen Puffer für die Fallback-Implementierung bereit. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.text/decoderfallbackbuffer/
---
## DecoderFallbackBuffer class


Stellt einen Puffer für die Fallback-Implementierung bereit. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DecoderFallbackBuffer : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) | Implementiert das eigentliche Fallback-Verfahren. |
| virtual [get_Remaining](./get_remaining/)() const | Ermittelt die verbleibende Anzahl zu verarbeitender Zeichen. |
| virtual [GetNextChar](./getnextchar/)() | Extrahiert das nächste Zeichen im Fallback-Puffer. |
| virtual [MovePrevious](./moveprevious/)() | Verschiebt die Pufferposition einen Schritt zurück, falls möglich. |
| virtual [Reset](./reset/)() | Setzt den Puffer auf den Ausgangszustand zurück. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
