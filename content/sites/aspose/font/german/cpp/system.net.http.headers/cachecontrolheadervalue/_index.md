---
title: "System::Net::Http::Headers::CacheControlHeaderValue Klasse"
linktitle: "CacheControlHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::CacheControlHeaderValue Klasse. Stellt einen Wert des ''Cache-Control''-Headers dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


Stellt einen Wert des 'Cache-Control'-Headers dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | Erstellt eine neue Instanz. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Extensions](./get_extensions/)() | Gibt die Sammlung der Cache-Extension-Token zurück. |
| [get_MaxAge](./get_maxage/)() | Gibt den maximalen Alterswert in Sekunden zurück, der die Zeit bestimmt, während der der Client eine Antwort akzeptiert. |
| [get_MaxStale](./get_maxstale/)() | Gibt den Wert zurück, der bestimmt, ob der Client abgelaufene Antworten akzeptiert. |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | Gibt den Wert in Sekunden zurück, der die Zeit bestimmt, während der der Client abgelaufene Antworten akzeptiert. |
| [get_MinFresh](./get_minfresh/)() | Gibt den Wert zurück, der die Frischelebensdauer bestimmt. |
| [get_MustRevalidate](./get_mustrevalidate/)() | Ermittelt den Wert, der bestimmt, ob der Server eine erneute Validierung eines Cache‑Eintrags erfordert, wenn er veraltet wird. |
| [get_NoCache](./get_nocache/)() | RTTI-Informationen. |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | Ermittelt die Sammlung von Feldnamen in der 'no-cache'-Direktive im 'Cache-Control'-Header. |
| [get_NoStore](./get_nostore/)() | Ermittelt den Wert, der bestimmt, ob ein Cache keinen Teil einer HTTP-Anforderung oder -Antwort speichern darf. |
| [get_NoTransform](./get_notransform/)() | Ermittelt den Wert, der bestimmt, ob ein Cache oder Proxy keinen Teil des Entity‑Bodys ändern darf. |
| [get_OnlyIfCached](./get_onlyifcached/)() | Ermittelt den Wert, der bestimmt, ob der Client nur zwischengespeicherte Einträge verwenden muss. |
| [get_Private](./get_private/)() | Ermittelt den Wert, der bestimmt, ob die HTTP-Antwortnachricht oder ein Teil davon für einen einzelnen Benutzer bestimmt ist und nicht von einem gemeinsam genutzten Cache gespeichert werden darf. |
| [get_PrivateHeaders](./get_privateheaders/)() | Ermittelt die Sammlung von Feldnamen in der 'private'-Direktive im 'Cache-Control'-Header. |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | Ermittelt den Wert, der bestimmt, ob der Server eine erneute Validierung eines Cache‑Eintrags erfordert, wenn er für die gemeinsam genutzten User-Agent-Caches veraltet wird. |
| [get_Public](./get_public/)() | Ermittelt den Wert, der bestimmt, ob eine HTTP-Antwort von irgendeinem Cache gespeichert werden kann. |
| [get_SharedMaxAge](./get_sharedmaxage/)() | Ermittelt den gemeinsamen Maximalalterwert in Sekunden, der die 'max-age'-Direktive im 'Cache-Control'-Header oder den 'Expires'-Header für einen gemeinsamen Cache überschreibt. |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der Klasse [CacheControlHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der Klasse [CacheControlHeaderValue](./). |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | Legt den Maximalalterwert in Sekunden fest, der die Zeit bestimmt, während der der Client eine Antwort akzeptiert. |
| [set_MaxStale](./set_maxstale/)(bool) | Legt den Wert fest, der bestimmt, ob der Client abgelaufene Antworten akzeptiert. |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | Legt den Wert in Sekunden fest, der die Zeit bestimmt, während der der Client abgelaufene Antworten akzeptiert. |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | Legt den Wert fest, der die Frischelebensdauer bestimmt. |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | Legt den Wert fest, der bestimmt, ob der Server eine erneute Validierung eines Cache‑Eintrags erfordert, wenn er veraltet wird. |
| [set_NoCache](./set_nocache/)(bool) | Legt den Wert fest, der bestimmt, ob der Client eine zwischengespeicherte Antwort akzeptiert. |
| [set_NoStore](./set_nostore/)(bool) | Legt den Wert fest, der bestimmt, ob ein Cache keinen Teil einer HTTP-Anforderung oder -Antwort speichern darf. |
| [set_NoTransform](./set_notransform/)(bool) | Legt den Wert fest, der bestimmt, ob ein Cache oder Proxy keinen Teil des Entity‑Bodys ändern darf. |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | Legt den Wert fest, der bestimmt, ob der Client nur zwischengespeicherte Einträge verwenden muss. |
| [set_Private](./set_private/)(bool) | Legt den Wert fest, der bestimmt, ob die HTTP-Antwortnachricht oder ein Teil davon für einen einzelnen Benutzer bestimmt ist und nicht von einem gemeinsam genutzten Cache gespeichert werden darf. |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | Legt den Wert fest, der bestimmt, ob der Server eine erneute Validierung eines Cache‑Eintrags erfordert, wenn er für die gemeinsam genutzten User-Agent-Caches veraltet wird. |
| [set_Public](./set_public/)(bool) | Legt den Wert fest, der bestimmt, ob eine HTTP-Antwort von irgendeinem Cache gespeichert werden kann. |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | Legt den gemeinsamen Maximalalterwert in Sekunden fest, der die 'max-age'-Direktive im 'Cache-Control'-Header oder den 'Expires'-Header für einen gemeinsamen Cache überschreibt. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [CacheControlHeaderValue](./)-Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
