---
title: "System::Drawing::Text::PrivateFontCollection class"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Text::PrivateFontCollection class. Rappresenta una raccolta di famiglie di caratteri fornita dall'applicazione client. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


Rappresenta una raccolta di famiglie di caratteri fornita dall'applicazione client. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | Aggiunge il font specificato alla raccolta. |
| [AddFontFile](./addfontfile/)(const String\&) | Aggiunge un font dal file specificato alla raccolta. |
| [get_Families](./get_families/)() override | Restituisce un array di oggetti [FontFamily](../../system.drawing/fontfamily/) associati alla raccolta di caratteri rappresentata dall'oggetto corrente. |
## Vedi anche

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Font for C++](../../)
