---
title: "System::Net::Http::Headers::MediaTypeHeaderValue Klasse"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue Klasse. Stellt einen MIME-Typ im Wert des ''Content-Type''-Headers dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1200
url: /de/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


Stellt einen MIME-Typ im Wert des 'Content-Type'-Headers dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_CharSet](./get_charset/)() | RTTI-Informationen. |
| [get_MediaType](./get_mediatype/)() | Ermittelt einen Wert des Media-Type-Headers. |
| [get_Parameters](./get_parameters/)() | Gibt die Wertparameter des Media-Type-Headers zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [MediaTypeHeaderValue](./)-Klasse. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | Erstellt eine neue Instanz. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | Erstellt eine neue Instanz. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [MediaTypeHeaderValue](./)-Klasse. |
| [set_CharSet](./set_charset/)(String) | Setzt einen Zeichensatz. |
| [set_MediaType](./set_mediatype/)(String) | Setzt einen Wert des Media-Type-Headers. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [MediaTypeHeaderValue](./)-Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
