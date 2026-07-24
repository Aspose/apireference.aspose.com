---
title: "System::Net::EndPoint classe"
linktitle: "EndPoint"
second_title: "Aspose.Page per C++"
description: "System::Net::EndPoint classe. La classe astratta contiene un indirizzo di rete. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.net/endpoint/
---
## EndPoint class


La classe astratta contiene un indirizzo di rete. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class EndPoint : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | Crea una nuova istanza della classe [EndPoint](./) utilizzando l'indirizzo socket specificato. |
| virtual [get_AddressFamily](./get_addressfamily/)() | Informazioni RTTI. |
| virtual [GetImpl](./getimpl/)() const | Restituisce un puntatore all'implementazione. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ImplPtr](./implptr/) | Un puntatore all'implementazione. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
