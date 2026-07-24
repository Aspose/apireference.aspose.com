---
title: "System::Drawing::ColorTranslator class"
linktitle: "ColorTranslator"
second_title: "Aspose.Page per C++"
description: "System::Drawing::ColorTranslator class. Esegue traduzioni di colore. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.drawing/colortranslator/
---
## ColorTranslator class


Esegue traduzioni di colore. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class ColorTranslator
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [FromHtml](./fromhtml/)(const System::String\&) | Converte la rappresentazione di colore HTML specificata nell'oggetto [Color](../color/) equivalente. |
| static [FromWin32](./fromwin32/)(int) | Converte il colore [Windows](../../system.windows/) specificato nell'oggetto [Color](../color/) equivalente. |
| static [ToHtml](./tohtml/)(const Color\&) | Converte l'oggetto [Color](../color/) specificato nella rappresentazione stringa del colore HTML equivalente. |
## Vedi anche

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
