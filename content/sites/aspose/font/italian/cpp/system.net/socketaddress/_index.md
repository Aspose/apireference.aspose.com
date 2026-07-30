---
title: "System::Net::SocketAddress classe"
linktitle: "SocketAddress"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::SocketAddress. Utilizzata per memorizzare informazioni serializzate sulle istanze della classe EndPoint. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3300
url: /it/cpp/system.net/socketaddress/
---
## SocketAddress class


Utilizzata per memorizzare informazioni serializzate sulle istanze della classe [EndPoint](../endpoint/). Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class SocketAddress : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Family](./get_family/)() | Informazioni RTTI. |
| [get_Size](./get_size/)() | Restituisce la dimensione del buffer sottostante. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| [idx_get](./idx_get/)(int32_t) | Ottiene un valore del buffer sottostante all'indice specificato. |
| [idx_set](./idx_set/)(int32_t, uint8_t) | Imposta un valore del buffer sottostante all'indice specificato. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | Crea una nuova istanza. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | Crea una nuova istanza. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
