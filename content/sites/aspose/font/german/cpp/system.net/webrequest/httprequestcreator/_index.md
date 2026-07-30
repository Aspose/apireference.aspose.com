---
title: "System::Net::WebRequest::HttpRequestCreator Klasse"
linktitle: "HttpRequestCreator"
second_title: "Aspose.Font für C++"
description: "System::Net::WebRequest::HttpRequestCreator Klasse. Erstellt Instanzen der WebRequest-Klasse. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3900
url: /de/cpp/system.net/webrequest/httprequestcreator/
---
## HttpRequestCreator class


Erstellt Instanzen der WebRequest‑Klasse. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpRequestCreator : public System::Net::IWebRequestCreate
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<Uri\>) | Erstellt eine neue Instanz der WebRequest‑Klasse unter Verwendung der angegebenen URI. |
## Siehe auch

* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
