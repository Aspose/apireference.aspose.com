---
title: "System::Nullable class"
linktitle: "Nullable"
second_title: "Aspose.Font per C++"
description: "System::Nullable class. Dichiarazione in avanti in C++."
type: docs
weight: 4600
url: /it/cpp/system/nullable/
---
## Nullable class


Dichiarazione in avanti.

```cpp
template<typename T>class Nullable
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di valore sottostante che è esteso dalla classe [Nullable](./) |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | Determina se il valore rappresentato dall'oggetto corrente è uguale al valore rappresentato dall'oggetto [Nullable](./) specificato. |
| [get_HasValue](./get_hasvalue/)() const | Determina se l'oggetto corrente rappresenta un valore. |
| [get_Value](./get_value/)() const | Restituisce una copia del valore rappresentato dall'oggetto corrente. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash per l'oggetto corrente. |
| [GetValueOrDefault](./getvalueordefault/)(T) | Restituisce il valore rappresentato dall'oggetto corrente o il valore specificato se il valore rappresentato dall'oggetto corrente è nullo. |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | Determina se l'oggetto corrente rappresenta un valore nullo. |
| [Nullable](./nullable/)() | Crea un'istanza che rappresenta un valore nullo. |
| [Nullable](./nullable/)(std::nullptr_t) | Crea un'istanza che rappresenta null. |
| [Nullable](./nullable/)(const T1\&) | Crea un'istanza della classe [Nullable](./) che rappresenta il valore specificato convertito (se necessario) al valore del tipo sottostante T. |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | Costruisce un'istanza che rappresenta un valore rappresentato dall'oggetto [Nullable](./) specificato. L'oggetto nullable specificato può rappresentare un valore di tipo diverso rispetto al tipo di base dell'istanza costruita, nel qual caso il valore rappresentato viene convertito in un valore di tipo T. |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | Funzione di supporto per verificare se questo e **other** non sono entrambi null e chiamare una lambda in tal caso. Utilizzata nelle implementazioni. |
| [operator const T &](./operatorconstt&/)() const | Restituisce un riferimento costante al valore rappresentato dall'oggetto corrente. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Determina se il valore rappresentato dall'oggetto corrente non è null. |
| [operator!=](./operator!=/)(const T1\&) const | Determina se il valore rappresentato dall'oggetto corrente non è uguale al valore specificato. |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | Determina se il valore rappresentato dall'oggetto corrente non è uguale al valore rappresentato dall'oggetto [Nullable](./) specificato. |
| [operator&=](./operator&=/)(bool) | Applica [operator&=()](./operator&=/) al valore rappresentato dall'oggetto corrente usando il valore specificato come argomento a destra. |
| [operator+](./operator+/)(std::nullptr_t) const | Restituisce un'istanza costruita di default della classe Nullable<T>. |
| [operator+](./operator+/)(const T1\&) const | Somma valori nullable e non-nullable. |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | Somma valori nullable. |
| [operator+=](./operator+=/)(std::nullptr_t) | Reimposta l'oggetto corrente in modo che rappresenti un valore null. |
| [operator+=](./operator+=/)(const T1\&) | Applica [operator+=()](./operator+=/) al valore rappresentato dall'oggetto corrente usando il valore specificato come argomento a destra. |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | Applica [operator+=()](./operator+=/) al valore rappresentato dall'oggetto corrente usando il valore rappresentato dall'oggetto [Nullable](./) specificato come argomento a destra. |
| [operator-](./operator-/)(T1) const | Sottrae valori nullable e valori puntati a null. |
| [operator-](./operator-/)(const T1\&) const | Sottrae valori nullable e non-nullable. |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | Sottrae valori nullable. |
| [operator-=](./operator-=/)(T1) | Restituisce un'istanza della classe [Nullable](./) che rappresenta un valore null. |
| [operator-=](./operator-=/)(const T1\&) | Applica [operator-=()](./operator-=/) al valore rappresentato dall'oggetto corrente usando il valore specificato come argomento a destra. |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | Applica [operator-=()](./operator-=/) al valore rappresentato dall'oggetto corrente usando il valore rappresentato dall'oggetto [Nullable](./) specificato come argomento a destra. |
| [operator<](./operator_/)(std::nullptr_t) const | Restituisce sempre false. |
| [operator<](./operator_/)(const T1\&) const | Determina se il valore rappresentato dall'oggetto corrente è minore del valore specificato applicando [operator<()](./operator_/) a questi valori. |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | Determina se il valore rappresentato dall'oggetto corrente è minore del valore rappresentato dall'oggetto [Nullable](./) specificato applicando [operator<()](./operator_/) a questi valori. |
| [operator<=](./operator_=/)(std::nullptr_t) const | Restituisce sempre false. |
| [operator<=](./operator_=/)(const T1\&) const | Determina se il valore rappresentato dall'oggetto corrente è minore o uguale al valore specificato applicando [operator<=()](./operator_=/) a questi valori. |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | Determina se il valore rappresentato dall'oggetto corrente è minore o uguale al valore rappresentato dall'oggetto [Nullable](./) specificato applicando [operator<=()](./operator_=/) a questi valori. |
| [operator=](./operator=/)(std::nullptr_t) | Assegna un null all'oggetto corrente. |
| [operator=](./operator=/)(const T1\&) | Sostituisce il valore attualmente rappresentato dall'oggetto con quello specificato. |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | Sostituisce il valore attualmente rappresentato dall'oggetto con quello specificato. |
| [operator==](./operator==/)(std::nullptr_t) const | Determina se il valore rappresentato dall'oggetto corrente è nullo. |
| [operator==](./operator==/)(const T1\&) const | Determina se il valore rappresentato dall'oggetto corrente è uguale al valore specificato. |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | Determina se il valore rappresentato dall'oggetto corrente è uguale al valore rappresentato dall'oggetto [Nullable](./) specificato. |
| [operator>](./operator_/)(std::nullptr_t) const | Restituisce sempre false. |
| [operator>](./operator_/)(const T1\&) const | Determina se il valore rappresentato dall'oggetto corrente è maggiore del valore specificato applicando [operator>()](./operator_/) a questi valori. |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | Determina se il valore rappresentato dall'oggetto corrente è maggiore del valore rappresentato dall'oggetto [Nullable](./) specificato applicando [operator>()](./operator_/) a questi valori. |
| [operator>=](./operator_=/)(std::nullptr_t) const | Restituisce sempre false. |
| [operator>=](./operator_=/)(const T1\&) const | Determina se il valore rappresentato dall'oggetto corrente è maggiore o uguale al valore rappresentato dall'oggetto specificato applicando [operator>=()](./operator_=/) a questi valori. |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | Determina se il valore rappresentato dall'oggetto corrente è maggiore o uguale al valore rappresentato dall'oggetto [Nullable](./) specificato applicando [operator>=()](./operator_=/) a questi valori. |
| [operator | =](./operator_=/)(bool) | Applica [operator | =()](./operator_=/) al valore rappresentato dall'oggetto corrente usando il valore specificato come argomento a destra. |
| [reset](./reset/)() | Imposta il valore attualmente rappresentato a null. |
| [set_Value](./set_value/)(const T\&) | Imposta un nuovo valore all'oggetto nullable. |
| [ToString](./tostring/)() const | Converte il valore rappresentato dall'oggetto corrente in stringa. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ValueType](./valuetype/) | Un alias per un tipo del valore rappresentato da questa classe. |
## Osservazioni


Rappresenta un valore del tipo specificato che può essere assegnato a null. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
