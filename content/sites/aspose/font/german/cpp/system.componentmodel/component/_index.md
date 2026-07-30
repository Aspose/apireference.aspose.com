---
title: "System::ComponentModel::Component class"
linktitle: "Component"
second_title: "Aspose.Font für C++"
description: "System::ComponentModel::Component class. Dummy-Klasse, um übersetzten Code, der die Component-Klasse verwendet, kompiliert zu machen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.componentmodel/component/
---
## Component class


Dummy-Klasse, um übersetzten Code, der die [Component](./)-Klasse verwendet, kompiliert zu machen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Component](./component/)() | RTTI-Informationen. |
| [Dispose](./dispose/)(bool) | Unterstützung des Disposable‑Musters; tut nichts. |
| [get_DesignMode](./get_designmode/)() | Überprüft, ob die Komponente im Entwurfsmodus ist. |
## Siehe auch

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
