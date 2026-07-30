---
title: "System::Globalization::TextElementEnumerator classe"
linktitle: "TextElementEnumerator"
second_title: "Aspose.Font per C++"
description: "Classe System::Globalization::TextElementEnumerator. Enumeratore per iterare attraverso gli elementi della stringa (caratteri). Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2700
url: /it/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


Enumeratore per iterare attraverso gli elementi della stringa (caratteri). Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class TextElementEnumerator : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Current](./get_current/)() const | Restituisce l'elemento di testo corrente. |
| [get_ElementIndex](./get_elementindex/)() const | Restituisce l'indice dell'elemento di testo corrente. |
| [GetTextElement](./gettextelement/)() const | Restituisce l'elemento corrente. |
| [MoveNext](./movenext/)() | Passa all'elemento successivo. |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | Imposta l'enumeratore alla posizione iniziale. |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
