---
title: "classe System::Drawing::Imaging::PropertyItem"
linktitle: "PropertyItem"
second_title: "Aspose.Font per C++"
description: "classe System::Drawing::Imaging::PropertyItem. Rappresenta una proprietà di metadati da includere in un file immagine. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1400
url: /it/cpp/system.drawing.imaging/propertyitem/
---
## PropertyItem class


Rappresenta una proprietà di metadati da includere in un file immagine. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class PropertyItem : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Id](./get_id/)() const | Restituisce l'ID della proprietà rappresentata dall'oggetto corrente. |
| [get_Len](./get_len/)() const | Restituisce la lunghezza della proprietà rappresentata dall'oggetto corrente in byte. |
| [get_Type](./get_type/)() const | Restituisce il tipo della proprietà rappresentata dall'oggetto corrente in byte. |
| [get_Value](./get_value/)() const | Restituisce il valore della proprietà rappresentata dall'oggetto corrente in byte. |
| [PropertyItem](./propertyitem/)() | Crea una nuova istanza della classe [PropertyItem](./). |
| [set_Id](./set_id/)(int32_t) | Imposta l'ID della proprietà rappresentata dall'oggetto corrente. |
| [set_Len](./set_len/)(int32_t) | Imposta la lunghezza della proprietà rappresentata dall'oggetto corrente in byte. |
| [set_Type](./set_type/)(int16_t) | Imposta il tipo della proprietà rappresentata dall'oggetto corrente in byte. |
| [set_Value](./set_value/)(const System::ArrayPtr\<uint8_t\>\&) | Imposta il tipo della proprietà rappresentata dall'oggetto corrente in byte. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
