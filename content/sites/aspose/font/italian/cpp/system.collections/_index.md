---
title: "Spazio dei nomi System::Collections"
linktitle: "System::Collections"
second_title: "Aspose.Font per C++"
description: "Come utilizzare lo spazio dei nomi System::Collections in C++."
type: docs
weight: 2600
url: /it/cpp/system.collections/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [BitArray](./bitarray/) | [Array](../system/array/) di bit che possono essere indicizzati. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento. |
| [BitArrayPtr](./bitarrayptr/) | Puntatore a [BitArray](./bitarray/). Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento const. |
| [CollectionBase](./collectionbase/) | Fornisce una classe base astratta per una collezione tipizzata fortemente. |
| [ICollection](./icollection/) | Definisce l'interfaccia di collezione non generica. |
| [IEnumerable](./ienumerable/) | [IEnumerable](./ienumerable/) è l'interfaccia base per tutte le collezioni non generiche che possono essere enumerate. |
| [IEnumerator](./ienumerator/) | Interfaccia dell'enumeratore che può essere usata per iterare attraverso alcuni elementi. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/) | Wrapper che crea un'implementazione non generica di [IEnumerator](./ienumerator/) sopra l'Iterator generico [IEnumeratorImplRefType](./ienumeratorimplreftype/) - wrapper per i tipi di riferimento. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/) | Wrapper che crea un'implementazione non generica di [IEnumerator](./ienumerator/) sopra l'Iterator generico [IEnumeratorImplRefType](./ienumeratorimplreftype/) - wrapper per i tipi valore. |
| [IEqualityComparer](./iequalitycomparer/) |  |
| [IList](./ilist/) | [IList](./ilist/) Rappresenta una collezione non generica di oggetti che possono essere accessibili individualmente per indice. |
| [IListImplRefType](./ilistimplreftype/) | Stub che implementa l'interfaccia [System::Collections::IList](./ilist/) su un oggetto [System::Collections::Generic::List](../system.collections.generic/list/) Implementazione per tipi di riferimento. |
| [IListImplValueType](./ilistimplvaluetype/) | Stub che implementa l'interfaccia [System::Collections::IList](./ilist/) su un oggetto [System::Collections::Generic::List](../system.collections.generic/list/) Implementazione per tipi valore. |
| [IListWrapper](./ilistwrapper/) | Interfaccia per supportare il casting da collezione generica a non generica. |
| [Invalidatable](./invalidatable/) | Classe che consente di tracciare lo stato dei suoi discendenti tramite oggetti [InvalidatableTracker](./invalidatabletracker/). |
| [InvalidatableTracker](./invalidatabletracker/) | Classe che implementa i tracker degli oggetti [Invalidatable](./invalidatable/). |
