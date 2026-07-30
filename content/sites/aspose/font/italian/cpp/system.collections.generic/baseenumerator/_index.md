---
title: "classe System::Collections::Generic::BaseEnumerator"
linktitle: "BaseEnumerator"
second_title: "Aspose.Font per C++"
description: "Classe System::Collections::Generic::BaseEnumerator. Definizione di enumeratore per avvolgere tipi in stile STL per utilizzo in stile C#. Non effettua asserzioni sulla struttura del contenitore eccetto l'esistenza di un iteratore sequenziale. Usa le funzioni begin() e end(). Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| Parametro | Descrizione |
| --- | --- |
| Contenitore | Tipo di contenitore in stile STL. |
| Element | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | Inizializza l'iteratore. |
| [IsValid](./isvalid/)() const | Verifica se [MoveNext()](./movenext/) è stata chiamata e la fine non è stata raggiunta. |
| [MoveNext](./movenext/)() override | Incremento in stile enumeratore. |
| [Reset](./reset/)() override | Reimposta l'enumeratore per consentire la ri-iterazione degli elementi. |

## Vedi anche

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
