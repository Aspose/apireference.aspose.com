---
title: "System::Net::Http::Headers::HttpHeaders Klasse"
linktitle: "HttpHeaders"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::HttpHeaders Klasse. Die Sammlung der HTTP-Header. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 700
url: /de/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


Die Sammlung der HTTP-Header. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Validiert ein neues Name‑Wert‑Paar und fügt es der aktuellen Sammlung hinzu. |
| [Add](./add/)(String, String) | Validiert ein neues Name‑Wert‑Paar und fügt es der aktuellen Sammlung hinzu. |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | Verkettet die angegebene HttpHeaders-Klasseninstanz mit der aktuellen. |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | Ruft einen Header mit dem angegebenen Namen ab und fügt dem Header einen geparsten Wert hinzu. |
| [Clear](./clear/)() | Entfernt alle Elemente aus der Sammlung. |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | Prüft, ob der Header den angegebenen Wert enthält. |
| [GetEnumerator](./getenumerator/)() override | Gibt Enumerator zurück. |
| [GetHeaderString](./getheaderstring/)(String) | Gibt eine Zeichenkettenrepräsentation der Werte für den angegebenen Headernamen zurück. |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | Gibt eine Zeichenkettenrepräsentation der Werte für den angegebenen Headernamen zurück. |
| [GetHeaderStrings](./getheaderstrings/)() | Gibt eine Sammlung zurück, die Zeichenkettenrepräsentationen der Headerwerte enthält. |
| [GetParsedValues](./getparsedvalues/)(String) | Gibt geparste Werte für den angegebenen Headernamen zurück. |
| [GetValues](./getvalues/)(String) | Gibt die entsprechenden Werte für den angegebenen Namen zurück. |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | Konvertiert geparste Werte in eine Liste. |
| [Remove](./remove/)(String) | Versucht, ein Element mit dem angegebenen Namen zu entfernen. |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | Ruft einen Header mit dem angegebenen Namen ab und entfernt einen geparsten Wert aus dem Header. |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | Ruft einen Header mit dem angegebenen Namen ab und setzt oder entfernt dessen Wert. Der Headerwert wird entfernt, wenn der Parameter 'value' nullptr ist, andernfalls wird ein geparster Wert gesetzt. |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | Ruft einen Header mit dem angegebenen Namen ab und setzt einen geparsten Wert für den Header. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | Versucht, ein neues Namens‑Wert‑Paar zur aktuellen Sammlung hinzuzufügen. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Fügt eine Sammlung von Namens‑Wert‑Paaren zur aktuellen Sammlung hinzu. |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | Versucht, die entsprechenden Werte für den angegebenen Namen zu erhalten. |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | Versucht, den angegebenen Wert zu parsen und zu den Headerwerten hinzuzufügen. |
## Siehe auch

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
