---
title: "System::Reflection::MethodBase classe"
linktitle: "MethodBase"
second_title: "Aspose.Font per C++"
description: "System::Reflection::MethodBase classe. Informazioni di base sul metodo. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system.reflection/methodbase/
---
## MethodBase class


Informazioni di base sul metodo. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Indica il tipo del membro - metodo, costruttore, evento, ecc. |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | Questo metodo consente di ottenere il nome del metodo corrente. Il traduttore sostituisce automaticamente ASPOSE_CURRENT_FUNCTION come parametro. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | Inizializza una nuova istanza della classe [MethodBase](./). |
## Vedi anche

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
