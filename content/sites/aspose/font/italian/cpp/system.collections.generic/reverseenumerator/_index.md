---
title: "classe System::Collections::Generic::ReverseEnumerator"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::Generic::ReverseEnumerator. Enumeratore che itera in ordine inverso attraverso il contenitore. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3800
url: /it/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| Parametro | Descrizione |
| --- | --- |
| Contenitore | Contenitore da iterare. |
| Element | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Current](./get_current/)() const override | Ottiene l'elemento 'corrente'. |
| [IsValid](./isvalid/)() const | Verifica se [MoveNext()](./movenext/) è stata chiamata e la fine non è stata raggiunta. |
| [MoveNext](./movenext/)() override | Incremento in stile enumeratore. |
| [Reset](./reset/)() override | Reimposta l'enumeratore per consentire la ri-iterazione degli elementi. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | Inizializza l'iteratore. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | Distruttore. |

## Vedi anche

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
