---
title: "System::ComponentModel::Component classe"
linktitle: "Component"
second_title: "Aspose.Page per C++"
description: "Classe System::ComponentModel::Component. Classe fittizia per rendere compilabile il codice tradotto che utilizza la classe Component. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.componentmodel/component/
---
## Component class


Classe fittizia per rendere compilabile il codice tradotto che utilizza la classe [Component](./). Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Component](./component/)() | Informazioni RTTI. |
| [Dispose](./dispose/)(bool) | Supporto al pattern Disposable; non fa nulla. |
| [get_DesignMode](./get_designmode/)() | Verifica se il componente è in modalità design. |
## Vedi anche

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
