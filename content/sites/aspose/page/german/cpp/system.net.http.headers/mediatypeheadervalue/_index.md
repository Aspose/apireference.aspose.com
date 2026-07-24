---
title: "System::Net::Http::Headers::MediaTypeHeaderValue Klasse"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue Klasse. Stellt einen MIME-Typ im Wert des ''Content-Type''-Headers dar. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1200
url: /de/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


Stellt einen MIME-Typ im Wert des 'Content-Type'-Headers dar. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-[Object.Equals](../../system/object/equals/)-Semantik. |
| [get_CharSet](./get_charset/)() | RTTI-Informationen. |
| [get_MediaType](./get_mediatype/)() | Ermittelt einen Wert des Media-Type-Headers. |
| [get_Parameters](./get_parameters/)() | Gibt die Wertparameter des Media-Type-Headers zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [MediaTypeHeaderValue](./)-Klasse. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | Konstruiert eine neue Instanz. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | Konstruiert eine neue Instanz. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [MediaTypeHeaderValue](./)-Klasse. |
| [set_CharSet](./set_charset/)(String) | Setzt einen Zeichensatz. |
| [set_MediaType](./set_mediatype/)(String) | Setzt einen Wert des Media-Type-Headers. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [MediaTypeHeaderValue](./)-Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
