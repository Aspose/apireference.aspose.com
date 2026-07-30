---
title: "System::Collections::BitArray class"
linktitle: "BitArray"
second_title: "Aspose.Font per C++"
description: "System::Collections::BitArray class. Array di bit che può essere indicizzato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.collections/bitarray/
---
## BitArray class


[Array](../../system/array/) of bits which can be addressed by index. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class BitArray : public virtual System::Object,
                 public System::Collections::Generic::ICollection<bool>
```

## Nested classes

* Class [Enumerator](./enumerator/)
* Class [Reference](./reference/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const bool\&) override | Aggiunge un valore alla fine del contenitore. |
| [And](./and/)(const BitArrayPtr\&) | Calcola il bitwise 'and' tra due BitSet. |
| [BitArray](./bitarray/)(const bitset\&) | Costruttore di copia. |
| [BitArray](./bitarray/)(const BitArray\&) | Costruttore di copia. |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | Costruttore di copia. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | Costruttore di copia. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | Costruttore di copia. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | Costruttore di copia. |
| [BitArray](./bitarray/)(int, bool) | Costruttore di riempimento. |
| [Clear](./clear/)() override | Elimina tutti gli elementi. |
| [Contains](./contains/)(const bool\&) const override | Verifica se un valore specifico è presente nel contenitore. Non implementato. |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | Copia i dati negli elementi esistenti dell'array. |
| [data](./data/)() | Accesso alla struttura dati sottostante. |
| [data](./data/)() const | Accesso alla struttura dati sottostante. |
| [Get](./get/)(int) const | Ottiene l'elemento [BitArray](./). |
| [get_Count](./get_count/)() const override | Ottiene la dimensione del contenitore. |
| [get_Length](./get_length/)() const | Ottiene la dimensione del contenitore. |
| [GetEnumerator](./getenumerator/)() override | Crea un oggetto enumeratore. |
| [idx_get](./idx_get/)(int) const | Funzione getter. |
| [idx_set](./idx_set/)(int, bool) | Funzione setter. |
| [Not](./not/)() | Negazione di BitSet. |
| [operator!=](./operator!=/)(const BitArray\&) const | Operatore di confronto bitwise. |
| [operator==](./operator==/)(const BitArray\&) const | Operatore di confronto bitwise. |
| [operator[]](./operator[]/)(int) | Funzione di accesso. |
| [Or](./or/)(const BitArrayPtr\&) | Calcola il bitwise 'or' tra due BitSet. |
| [Remove](./remove/)(const bool\&) override | Restituisce la prima occorrenza del valore specificato. Non implementato. |
| [Set](./set/)(int, bool) | Imposta l'elemento [BitArray](./). |
| [SetAll](./setall/)(bool) | Imposta tutti gli elementi a un valore specifico. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Implementazione formale del meccanismo di argomenti deboli dei template; non applicabile a questa classe. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
| [Xor](./xor/)(const BitArrayPtr\&) | Calcola l'operazione bitwise 'xor' tra due BitSet. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [bitset](./bitset/) | Informazioni RTTI. |
## Osservazioni



```cpp
#include <system/collections/bitarray.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void Print(const System::SmartPtr<System::Collections::Generic::IEnumerable<bool>> &bitArray)
{
  for (const auto item: bitArray)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Crea una nuova istanza della classe BitArray.
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // Stampa i valori.
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## Vedi anche

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
