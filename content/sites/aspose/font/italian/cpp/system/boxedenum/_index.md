---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "Aspose.Font per C++"
description: "System::BoxedEnum class. Rappresenta un valore di enumerazione boxed. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system/boxedenum/
---
## BoxedEnum class


Rappresenta un valore di enumerazione boxed. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| Parametro | Descrizione |
| --- | --- |
| E | Tipo del valore dell'enumerazione |
| UT | Il tipo sottostante dell'enumerazione **E** |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | Crea un'istanza che rappresenta il valore di enumerazione specificato. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Converte il valore della costante di enumerazione incapsulata in un valore intero a 64 bit. |
| [IsBoxedEnum](./isboxedenum/)() override | Determina se l'oggetto corrente rappresenta un valore incapsulato di tipo enum. |
| [ToString](./tostring/)() const override | Converte il valore incapsulato rappresentato dall'oggetto corrente in una stringa. |

## Vedi anche

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
