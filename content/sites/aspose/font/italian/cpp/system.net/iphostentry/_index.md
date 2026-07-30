---
title: "System::Net::IPHostEntry classe"
linktitle: "IPHostEntry"
second_title: "Aspose.Font per C++"
description: "System::Net::IPHostEntry class. Rappresenta le informazioni su un indirizzo host internet. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2600
url: /it/cpp/system.net/iphostentry/
---
## IPHostEntry class


Rappresenta le informazioni su un indirizzo host internet. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class IPHostEntry : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | Ottiene la raccolta di indirizzi IP dell'host. |
| [get_Aliases](./get_aliases/)() | Ottiene la raccolta di alias dell'host. |
| [get_HostName](./get_hostname/)() const | Informazioni RTTI. |
| [IPHostEntry](./iphostentry/)() | Crea una nuova istanza. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | Imposta una raccolta di indirizzi IP dell'host. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | Imposta una raccolta di alias dell'host. |
| [set_HostName](./set_hostname/)(String) | Imposta il nome host. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
