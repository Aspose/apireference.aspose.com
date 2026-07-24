---
title: "System::Net::Http::HttpMethod Klasse"
linktitle: "HttpMethod"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::HttpMethod class. Stellt eine HTTP-Methode dar. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 700
url: /de/cpp/system.net.http/httpmethod/
---
## HttpMethod class


Stellt eine HTTP-Methode dar. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/)-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | Bestimmt, ob das aktuelle und das angegebene Objekt gleich sind. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-[Object.Equals](../../system/object/equals/)-Semantik. |
| static [get_Delete](./get_delete/)() | Gibt die HTTP‑Methode 'DELETE' zurück. |
| static [get_Get](./get_get/)() | Gibt die HTTP‑Methode 'GET' zurück. |
| static [get_Head](./get_head/)() | Gibt die HTTP‑Methode 'HEAD' zurück. |
| [get_Method](./get_method/)() | Gibt eine Zeichenketten‑Darstellung der HTTP‑Methode zurück. |
| static [get_Options](./get_options/)() | Gibt die HTTP‑Methode 'OPTIONS' zurück. |
| static [get_Post](./get_post/)() | Gibt die HTTP‑Methode 'POST' zurück. |
| static [get_Put](./get_put/)() | Gibt die HTTP‑Methode 'PUT' zurück. |
| static [get_Trace](./get_trace/)() | Gibt die HTTP‑Methode 'TRACE' zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| [HttpMethod](./httpmethod/)(String) | Konstruiert eine neue Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
