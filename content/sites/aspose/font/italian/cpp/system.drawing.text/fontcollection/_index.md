---
title: "System::Drawing::Text::FontCollection class"
linktitle: "FontCollection"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Text::FontCollection class. Una classe base per le raccolte di caratteri installati e privati. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.drawing.text/fontcollection/
---
## FontCollection class


Una classe base per le raccolte di caratteri installati e privati. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class FontCollection : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dispose](./dispose/)() override | Rilascia le risorse del sistema operativo acquisite dall'oggetto corrente. |
| virtual [get_Families](./get_families/)() | Restituisce un array di oggetti [FontFamily](../../system.drawing/fontfamily/) associati alla raccolta di caratteri rappresentata dall'oggetto corrente. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Font for C++](../../)
