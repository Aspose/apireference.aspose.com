---
title: "System::Web::Services::WebServiceBindingAttribute Klasse"
linktitle: "WebServiceBindingAttribute"
second_title: "Aspose.Page für C++"
description: "System::Web::Services::WebServiceBindingAttribute Klasse. Wird verwendet, um eine Bindung zu deklarieren, die eine oder mehrere Methoden des XML-Webdienstes definiert. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


Verwendet, um eine Bindung zu deklarieren, die eine oder mehrere Methoden des XML [Web](../../system.web/) Dienstes definiert. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | Liefert die WSI-Spezifikation. |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | Liefert einen Wert, der angibt, ob die Bindung Konformitätsansprüche ausgibt. |
| [get_Location](./get_location/)() | RTTI-Informationen. |
| [get_Name](./get_name/)() | Liefert den Namen der Bindung. |
| [get_Namespace](./get_namespace/)() | Liefert den Namespace, der mit der Bindung verknüpft ist. |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | Setzt die WSI-Spezifikation. |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | Setzt einen Wert, der angibt, ob die Bindung Konformitätsansprüche ausgibt. |
| [set_Location](./set_location/)(String) | Setzt den Ort, an dem die Bindung definiert ist. |
| [set_Name](./set_name/)(String) | Setzt den Namen der Bindung. |
| [set_Namespace](./set_namespace/)(String) | Setzt den Namespace, der mit der Bindung verknüpft ist. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | Konstruiert eine neue Instanz. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | Konstruiert eine neue Instanz. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | Konstruiert eine neue Instanz. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | Konstruiert eine neue Instanz. |
## Siehe auch

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Page for C++](../../)
