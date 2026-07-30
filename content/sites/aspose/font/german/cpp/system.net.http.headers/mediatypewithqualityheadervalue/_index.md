---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue Klasse"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue Klasse. Stellt einen MIME-Typ mit einem zusätzlichen Qualitätsfaktor im Wert des ''Content-Type''-Headers dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1300
url: /de/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


Stellt einen MIME-Typ mit einem zusätzlichen Qualitätsfaktor im Wert des 'Content-Type'-Headers dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Quality](./get_quality/)() | RTTI-Informationen. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | Erstellt eine neue Instanz. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | Erstellt eine neue Instanz. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | Erstellt eine neue Instanz. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der Klasse [MediaTypeWithQualityHeaderValue](./). |
| [set_Quality](./set_quality/)(Nullable\<double\>) | Setzt einen Qualitätswert. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der Klasse [MediaTypeWithQualityHeaderValue](./) zu konvertieren. |
## Siehe auch

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
