---
title: "System::Collections::Generic::IEnumerator class"
linktitle: "IEnumerator"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::IEnumerator class. Interfaccia di enumeratore che può essere usata per iterare attraverso alcuni elementi. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2300
url: /it/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


Interfaccia dell'enumeratore che può essere usata per iterare attraverso alcuni elementi. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | Prepara l'iteratore per essere usato dalla classe VirtualizedIterator. |
| [CloneIterator](./cloneiterator/)() const override | Clona l'iteratore corrente. |
| virtual [Current](./current/)() const | Restituisce l'elemento corrente. |
| virtual [get_Current](./get_current/)() const | Restituisce l'elemento corrente. |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | Sposta l'iteratore avanti di un passo. |
| [InitializeIterator](./initializeiterator/)() override | Esegue la prima chiamata a [MoveNext()](./movenext/) e prepara l'oggetto enumeratore per essere usato da VirtualizedIterator. |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | Segna l'enumeratore posseduto dall'iteratore virtualizzato. |
| virtual [MoveNext](./movenext/)() | Sposta l'enumeratore al prossimo elemento. Se non è stato referenziato alcun elemento prima, imposta il riferimento al primo elemento disponibile. Se si raggiunge la fine del contenitore, non fa nulla. |
| virtual [Reset](./reset/)() | Reimposta l'enumeratore alla posizione precedente al primo elemento. |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ValueType](./valuetype/) | Tipo valore. |
## Osservazioni



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Crea l'istanza della classe List.
  auto collection = MakeObject<List<int>>();

  // Riempi la lista.
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // Ottieni l'enumeratore della lista.
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // Ottieni l'elemento corrente e stampalo.
    std::cout << enumerator->get_Current() << ' ';
  }

  // Reimposta l'enumeratore.
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
