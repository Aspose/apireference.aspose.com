---
title: "System::UriBuilder-Klasse"
linktitle: "UriBuilder"
second_title: "Aspose.Page für C++"
description: "System::UriBuilder-Klasse. Bietet Methoden zum Erstellen und Ändern von universellen Ressourcenidentifikatoren (URIs). Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 6800
url: /de/cpp/system/uribuilder/
---
## UriBuilder class


Stellt Methoden zum Erstellen und Ändern von universellen Ressourcenidentifikatoren (URIs) bereit. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class UriBuilder : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | Gibt das Schema der vom aktuellen Objekt erstellten URI zurück. |
| [get_Uri](./get_uri/)() const | Gibt das [Uri](../uri/)-Objekt zurück, das vom aktuellen Objekt erstellt wurde. |
| [set_Port](./set_port/)(int) | Setzt die Portnummer der URI. |
| [set_Scheme](./set_scheme/)(const String\&) | Legt das Schema der vom aktuellen Objekt erstellten URI auf den angegebenen Wert fest. |
| [ToString](./tostring/)() const override | Gibt die Zeichenkettenrepräsentation der vom aktuellen Objekt erstellten URI zurück. |
| [UriBuilder](./uribuilder/)(const String\&) | Erstellt ein [UriBuilder](./)-Objekt, das die angegebene URI darstellt. |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | Erstellt ein [UriBuilder](./)-Objekt, das die angegebene URI darstellt. |
## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
