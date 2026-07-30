---
title: "Classe System::Drawing::Icon"
linktitle: "Icon"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::Icon. Rappresenta un'icona Windows. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.drawing/icon/
---
## Icon class


Rappresenta un'icona [Windows](../../system.windows/). Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Icon : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Height](./get_height/)() const | Restituisce l'altezza dell'icona. |
| [get_Width](./get_width/)() const | Restituisce la larghezza dell'icona. |
| [Icon](./icon/)(const String\&) | Crea una nuova istanza della classe [Icon](./) che rappresenta un'icona dal file specificato. |
| [ToBitmap](./tobitmap/)() | Converte l'oggetto corrente in un oggetto [Bitmap](../bitmap/). |
| virtual [~Icon](./~icon/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
