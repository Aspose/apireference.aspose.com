---
title: "System::Net::Sockets::LingerOption classe"
linktitle: "LingerOption"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::LingerOption classe. Specifica se un socket rimarrà connesso dopo una chiamata ai metodi Close() o Close(). Specifica inoltre il periodo durante il quale il socket rimarrà connesso se la trasmissione dei dati continua. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


Specificare se un socket rimarrà connesso dopo una chiamata ai metodi Close() o Close(). Specificare inoltre il periodo durante il quale il socket rimarrà connesso se la trasmissione dei dati continua. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class LingerOption : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Enabled](./get_enabled/)() | Informazioni RTTI. |
| [get_LingerTime](./get_lingertime/)() | Ottiene un timeout di ritardo in secondi. |
| [LingerOption](./lingeroption/)(bool, int32_t) | Crea una nuova istanza. |
| [set_Enabled](./set_enabled/)(bool) | Imposta un valore che indica se il socket ritarderà la chiusura nel tentativo di inviare tutti i dati in sospeso. |
| [set_LingerTime](./set_lingertime/)(int32_t) | Imposta un timeout di ritardo in secondi. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
