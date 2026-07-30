---
title: "Classe System::WeakReference< T >"
linktitle: "WeakReference< T >"
second_title: "Aspose.Font per C++"
description: "Classe System::WeakReference< T >. Rappresenta un riferimento debole, che fa riferimento a un oggetto consentendo comunque la sua eliminazione in C++."
type: docs
weight: 7700
url: /it/cpp/system/weakreference_t_/
---
## WeakReference< T > class


Rappresenta un riferimento debole, che fa riferimento a un oggetto consentendone comunque la cancellazione.

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di un oggetto referenziato. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | Verifica se l'oggetto referenziato non è nullo. |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | Confronta l'oggetto referenziato con un'altra istanza della classe [WeakReference](../weakreference/). |
| [operator==](./operator==/)(std::nullptr_t) const | Verifica se l'oggetto referenziato è nullo. |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | Confronta l'oggetto referenziato con un'altra istanza della classe [WeakReference](../weakreference/). |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | Imposta l'oggetto (il target) referenziato dall'oggetto [WeakReference](../weakreference/) corrente. |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | Restituisce l'oggetto (il target) referenziato dall'oggetto [WeakReference](../weakreference/) corrente. |
| [WeakReference](./weakreference/)() | Costruttore predefinito. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Costruttore da nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | Inizializza una nuova istanza della classe [WeakReference](../weakreference/), referenziando l'oggetto specificato. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | Inizializza una nuova istanza della classe [WeakReference](../weakreference/), referenziando l'oggetto specificato. |

## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
