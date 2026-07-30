---
title: "System::Net::Http::Headers::TransferCodingWithQualityHeaderValue Klasse"
linktitle: "TransferCodingWithQualityHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::TransferCodingWithQualityHeaderValue Klasse. Stellt einen Wert mit zusätzlicher Qualität des ''Accept-Encoding''-Headers dar. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2500
url: /de/cpp/system.net.http.headers/transfercodingwithqualityheadervalue/
---
## TransferCodingWithQualityHeaderValue class


Stellt einen Wert mit zusätzlicher Qualität des 'Accept-Encoding'-Headers dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TransferCodingWithQualityHeaderValue : public System::Net::Http::Headers::TransferCodingHeaderValue
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Quality](./get_quality/)() | RTTI-Informationen. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [TransferCodingWithQualityHeaderValue](./) Klasse. |
| [set_Quality](./set_quality/)(Nullable\<double\>) | Setzt den Qualitätswert des 'Accept-Encoding'-Headers. |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)() | Erstellt eine neue Instanz. |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)(String) | Erstellt eine neue Instanz. |
| [TransferCodingWithQualityHeaderValue](./transfercodingwithqualityheadervalue/)(String, double) | Erstellt eine neue Instanz. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingWithQualityHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [TransferCodingWithQualityHeaderValue](./) Klasse zu konvertieren. |
## Siehe auch

* Class [TransferCodingHeaderValue](../transfercodingheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
