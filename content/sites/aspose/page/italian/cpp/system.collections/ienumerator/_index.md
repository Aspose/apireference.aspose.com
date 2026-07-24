---
title: "System::Collections::IEnumerator classe"
linktitle: "IEnumerator"
second_title: "Aspose.Page per C++"
description: "System::Collections::IEnumerator classe. Interfaccia dell'enumeratore che può essere usata per iterare attraverso alcuni elementi. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.collections/ienumerator/
---
## IEnumerator class


Interfaccia dell'enumeratore che può essere usata per iterare attraverso alcuni elementi. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Current](./current/)() const | Restituisce l'elemento corrente. |
| virtual [get_Current](./get_current/)() const | Restituisce l'elemento corrente. |
| virtual [MoveNext](./movenext/)() | Sposta l'enumeratore al prossimo elemento. Se non è stato referenziato alcun elemento prima, imposta il riferimento al primo elemento disponibile. Se è stato raggiunto la fine del contenitore, non fa nulla. |
| virtual [Reset](./reset/)() | Reimposta l'enumeratore alla posizione precedente al primo elemento. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ValueType](./valuetype/) | Informazioni RTTI. |

## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
