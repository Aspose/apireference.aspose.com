---
title: "System::ComponentModel::IContainer Klasse"
linktitle: "IContainer"
second_title: "Aspose.Font für C++"
description: "System::ComponentModel::IContainer Klasse. Dummy‑Schnittstelle, damit Code, der IContainer verwendet, kompiliert werden kann. Objekte dieser Klasse sollten nur über die System::MakeObject()‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.componentmodel/icontainer/
---
## IContainer class


Dummy‑Schnittstelle, damit Code, der IContainer verwendet, kompiliert werden kann. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class IContainer : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Add](./add/)(System::SharedPtr\<IComponent\>) | RTTI-Informationen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
