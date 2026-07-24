---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class"
linktitle: "IXpsTextConversionOptions"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class. Definisce le opzioni per la conversione di XPS in altri formati in C++."
type: docs
weight: 300
url: /it/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


Definisce le opzioni per la conversione di [XPS](../../aspose.page.xps/) in altri formati.

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | In [XPS](../../aspose.page.xps/), alcuni elementi di testo possono contenere riferimenti a forme di glifi alternative che non corrispondono a nessun codice carattere nel font. Se questo flag è impostato su true, il testo di tali elementi [XPS](../../aspose.page.xps/) viene convertito in forme grafiche. Poi il testo stesso appare trasparente sopra. Questo rende il testo di tali elementi selezionabile. Tuttavia l'effetto collaterale è che il file di output può essere molto più grande dell'originale. Se questo flag è impostato su false, i caratteri che dovrebbero essere visualizzati come forme alternative vengono sostituiti con altri caratteri che vengono mappati alle forme di glifi alternative. Pertanto il testo, sebbene ancora selezionabile, sarà modificato e probabilmente illeggibile. |
| virtual [set_PreserveText](./set_preservetext/)(bool) | In [XPS](../../aspose.page.xps/), alcuni elementi di testo possono contenere riferimenti a forme di glifi alternative che non corrispondono a nessun codice carattere nel font. Se questo flag è impostato su true, il testo di tali elementi [XPS](../../aspose.page.xps/) viene convertito in forme grafiche. Poi il testo stesso appare trasparente sopra. Questo rende il testo di tali elementi selezionabile. Tuttavia l'effetto collaterale è che il file di output può essere molto più grande dell'originale. Se questo flag è impostato su false, i caratteri che dovrebbero essere visualizzati come forme alternative vengono sostituiti con altri caratteri che vengono mappati alle forme di glifi alternative. Pertanto il testo, sebbene ancora selezionabile, sarà modificato e probabilmente illeggibile. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
