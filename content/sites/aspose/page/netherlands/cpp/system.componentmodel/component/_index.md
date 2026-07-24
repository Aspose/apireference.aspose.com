---
title: "System::ComponentModel::Component klasse"
linktitle: "Component"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::Component klasse. Dummy‑klasse om vertaalde code die de Component‑klasse gebruikt, compileerbaar te maken. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.componentmodel/component/
---
## Component class


Dummy‑klasse om vertaalde code die de [Component](./)‑klasse gebruikt, compileerbaar te maken. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Component](./component/)() | RTTI-informatie. |
| [Dispose](./dispose/)(bool) | Ondersteuning voor disposable‑patroon; doet niets. |
| [get_DesignMode](./get_designmode/)() | Controleert of het component zich in ontwerpmode bevindt. |
## Zie ook

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
