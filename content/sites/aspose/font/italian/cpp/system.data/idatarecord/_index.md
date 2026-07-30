---
title: "Classe System::Data::IDataRecord"
linktitle: "IDataRecord"
second_title: "Aspose.Font per C++"
description: "Classe System::Data::IDataRecord. Interfaccia per un record con colonne. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1300
url: /it/cpp/system.data/idatarecord/
---
## IDataRecord class


Interfaccia per un record con colonne. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class IDataRecord : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | Informazioni RTTI. |
| virtual [GetName](./getname/)(const int32_t) | Restituisce il nome del campo nella posizione specificata. |
| virtual [idx_get](./idx_get/)(const int32_t) | Restituisce il valore all'indice specificato. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
