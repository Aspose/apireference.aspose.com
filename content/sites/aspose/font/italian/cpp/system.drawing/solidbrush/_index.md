---
title: "classe System::Drawing::SolidBrush"
linktitle: "SolidBrush"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::SolidBrush. Rappresenta un pennello a colore unico. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2400
url: /it/cpp/system.drawing/solidbrush/
---
## SolidBrush class


Rappresenta un pennello a colore unico. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class SolidBrush : public System::Drawing::Brush
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Crea una copia dell'oggetto corrente. |
| [get_Color](./get_color/)() const | Restituisce il colore di questo pennello. |
| [set_Color](./set_color/)(Color) | Imposta il colore di questo pennello. |
| [SolidBrush](./solidbrush/)(const Color\&) | Crea un nuovo oggetto [SolidBrush](./) e lo inizializza con il colore specificato. |
## Vedi anche

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
