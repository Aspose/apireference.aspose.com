---
title: "System::Text::EncodingDecoder Klasse"
linktitle: "EncodingDecoder"
second_title: "Aspose.Font für C++"
description: "System::Text::EncodingDecoder Klasse. Decoder, der ein Codierungsobjekt zum Dekodieren verwendet. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1700
url: /de/cpp/system.text/encodingdecoder/
---
## EncodingDecoder class


[Decoder](../decoder/) that uses encoding object for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncodingDecoder : public System::Text::Decoder
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) override | Konvertiert Bytes in Zeichen. |
| [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) override | Konvertiert Bytes in Zeichen. |
## Siehe auch

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
