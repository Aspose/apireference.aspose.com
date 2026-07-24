---
title: "System::Data::IDataRecord classe"
linktitle: "IDataRecord"
second_title: "Aspose.Page per C++"
description: "System::Data::IDataRecord class. Interfaccia per registrare con colonne. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1300
url: /it/cpp/system.data/idatarecord/
---
## IDataRecord class


Interfaccia per registrare con colonne. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

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
* Library [Aspose.Page for C++](../../)
