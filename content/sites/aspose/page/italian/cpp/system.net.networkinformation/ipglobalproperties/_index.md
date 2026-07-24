---
title: "System::Net::NetworkInformation::IPGlobalProperties classe"
linktitle: "IPGlobalProperties"
second_title: "Aspose.Page per C++"
description: "System::Net::NetworkInformation::IPGlobalProperties classe. Rappresenta informazioni sulla connessione di rete del computer locale. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


Rappresenta un'informazione sulla connessione di rete del computer locale. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class IPGlobalProperties : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | Restituisce il dominio in cui il computer locale è registrato. |
| virtual [get_HostName](./get_hostname/)() | Restituisce il nome host del computer locale. |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | Informazioni RTTI. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Page for C++](../../)
