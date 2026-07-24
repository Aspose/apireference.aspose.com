---
title: "Aspose::Page::AssemblyConstants classe"
linktitle: "AssemblyConstants"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::AssemblyConstants classe. Definisce le costanti che partecipano al controllo della licenza per il componente. Queste erano definite direttamente come attributi dell'assembly, ma le ho spostate in una classe separata perché nel .NET Compact Framework non posso accedere agli attributi dell'assembly. Ora il codice di licenza, quando compilato per il .NET Compact Framework, utilizza queste costanti al posto degli attributi dell'assembly in C++."
type: docs
weight: 100
url: /it/cpp/aspose.page/assemblyconstants/
---
## AssemblyConstants class


Definisce le costanti che partecipano al controllo della licenza per il componente. In precedenza queste erano definite direttamente come attributi dell'assembly, ma le ho spostate in una classe separata perché in .NET Compact Framework non posso accedere agli attributi dell'assembly. Ora il codice di licenza, quando compilato per .NET Compact Framework, utilizza queste costanti al posto degli attributi dell'assembly.

```cpp
class AssemblyConstants : public System::Object
```

## Campi

| Campo | Descrizione |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Producer](./producer/) | Il produttore dei documenti di output. |
| static [PRODUCT](./product/) |  |
| static [Product](./product/) | Questo è usato dal codice di licenza **Aspose** per verificare che la licenza sia per il prodotto corretto. |
| static [Product2](./product2/) | Questo è usato dal codice di licenza **Aspose** per verificare che la licenza sia per il prodotto corretto. Temporaneamente la licenza **Aspose.EPS** sarà valida anche per [Aspose.Page](../). |
| static [Product3](./product3/) | Questo è usato dal codice di licenza **Aspose** per verificare che la licenza sia per il prodotto corretto. Temporaneamente la licenza Aspose.XPS sarà valida anche per [Aspose.Page](../). |
| static [ReleaseDate](./releasedate/) | Questo è usato dal codice di licenza **Aspose** per verificare la scadenza dell'abbonamento. È necessario impostare questo sulla data in cui pubblichi una versione o un hotfix. |
| static [Title](./title/) |  |
| static [VERSION](./version/) |  |
| static [Version](./version/) | La versione dell'assembly. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
