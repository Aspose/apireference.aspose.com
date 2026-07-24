---
title: "Aspose::Page::XPS::ApsLoadOptions classe"
linktitle: "ApsLoadOptions"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::ApsLoadOptions classe. Opzioni di caricamento del documento APS in C++."
type: docs
weight: 100
url: /it/cpp/aspose.page.xps/apsloadoptions/
---
## ApsLoadOptions class


Opzioni di caricamento del documento APS.

```cpp
class ApsLoadOptions : public Aspose::Page::XPS::LoadOptions
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ApsLoadOptions](./apsloadoptions/)() | Crea una nuova istanza delle opzioni. |
| [get_TransparencyThreshold](./get_transparencythreshold/)() const | Un valore intero da 0 a 255 al di sotto del quale il pixel dell'immagine che contiene valori alfa sarà considerato completamente trasparente. PostScript non supporta la trasparenza, ma può applicare una maschera esplicita sopra l'immagine a colori dove alcuni pixel saranno completamente opachi e altri completamente trasparenti. La soglia di trasparenza è usata per trovare la migliore corrispondenza tra l'originale e il risultato PostScript. Il valore predefinito è 255. |
| [set_TransparencyThreshold](./set_transparencythreshold/)(int32_t) | Un valore intero da 0 a 255 al di sotto del quale il pixel dell'immagine che contiene valori alfa sarà considerato completamente trasparente. PostScript non supporta la trasparenza, ma può applicare una maschera esplicita sopra l'immagine a colori dove alcuni pixel saranno completamente opachi e altri completamente trasparenti. La soglia di trasparenza è usata per trovare la migliore corrispondenza tra l'originale e il risultato PostScript. Il valore predefinito è 255. |
## Vedi anche

* Class [LoadOptions](../loadoptions/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
