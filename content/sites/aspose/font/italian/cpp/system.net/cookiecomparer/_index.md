---
title: "Classe System::Net::CookieComparer"
linktitle: "CookieComparer"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::CookieComparer. Utilizzata per confrontare le istanze della classe Cookie. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.net/cookiecomparer/
---
## CookieComparer class


Utilizzata per confrontare le istanze della classe [Cookie](../cookie/). Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Confronta gli oggetti specificati. |
| static [get_Instance](./get_instance/)() | Informazioni RTTI. |
## Vedi anche

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
