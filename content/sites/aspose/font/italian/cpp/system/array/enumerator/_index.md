---
title: "classe System::Array::Enumerator"
linktitle: "Enumerator"
second_title: "Aspose.Font per C++"
description: "Classe System::Array::Enumerator. Implementa l'interfaccia IEnumerator che consente l'enumerazione degli elementi di un oggetto Array. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 6800
url: /it/cpp/system/array/enumerator/
---
## Enumerator class


Implementa l'interfaccia IEnumerator che consente l'enumerazione degli elementi di un oggetto [Array](../). Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | Crea un nuovo oggetto [Enumerator](./) che rappresenta l'array specificato. |
| [get_Current](./get_current/)() const override | Restituisce una copia dell'elemento corrente. |
| [MoveNext](./movenext/)() override | Verifica se l'indice dell'elemento corrente non punta all'ultimo elemento dell'array e lo avanza se non lo fa. |
| [Reset](./reset/)() override | Reimposta l'indice dell'elemento corrente. |
| virtual [~Enumerator](./~enumerator/)() | Distruttore. |
## Vedi anche

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
