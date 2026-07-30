---
title: "System::Net::Http::HttpMethod Klasse"
linktitle: "HttpMethod"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::HttpMethod Klasse. Stellt eine HTTP-Methode dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 700
url: /de/cpp/system.net.http/httpmethod/
---
## HttpMethod class


Stellt eine HTTP-Methode dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | Bestimmt, ob das aktuelle und das angegebene Objekt gleich sind. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| static [get_Delete](./get_delete/)() | Gibt die HTTP-Methode 'DELETE' zurück. |
| static [get_Get](./get_get/)() | Gibt die 'GET' HTTP-Methode zurück. |
| static [get_Head](./get_head/)() | Gibt die 'HEAD' HTTP-Methode zurück. |
| [get_Method](./get_method/)() | Gibt eine Zeichenkettenrepräsentation der HTTP-Methode zurück. |
| static [get_Options](./get_options/)() | Gibt die 'OPTIONS' HTTP-Methode zurück. |
| static [get_Post](./get_post/)() | Gibt die 'POST' HTTP-Methode zurück. |
| static [get_Put](./get_put/)() | Gibt die 'PUT' HTTP-Methode zurück. |
| static [get_Trace](./get_trace/)() | Gibt die 'TRACE' HTTP-Methode zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| [HttpMethod](./httpmethod/)(String) | Erstellt eine neue Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
