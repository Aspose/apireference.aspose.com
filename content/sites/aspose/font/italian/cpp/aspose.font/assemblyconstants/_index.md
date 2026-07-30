---
title: "Classe Aspose::Font::AssemblyConstants"
linktitle: "AssemblyConstants"
second_title: "Aspose.Font per C++"
description: "Classe Aspose::Font::AssemblyConstants. Definisce le costanti che partecipano al controllo della licenza per il componente. Queste erano definite direttamente come attributi di assembly, ma le ho spostate in una classe separata perché nel .NET Compact Framework non posso accedere agli attributi di assembly. Ora il codice di licenza, quando compilato per il .NET Compact Framework, utilizza queste costanti al posto degli attributi di assembly in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font/assemblyconstants/
---
## AssemblyConstants class


Definisce le costanti che partecipano al controllo della licenza per il componente. In precedenza queste erano definite direttamente come attributi dell'assembly, ma le ho spostate in una classe separata perché nel .NET Compact Framework non è possibile accedere agli attributi dell'assembly. Ora il codice di licenza, quando compilato per il .NET Compact Framework, utilizza queste costanti al posto degli attributi dell'assembly.

```cpp
class AssemblyConstants
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AssemblyConstants](./assemblyconstants/)() |  |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Product](./product/) | Questo è usato dal codice di licenza **Aspose** per verificare che la licenza sia per il prodotto corretto. |
| static [ReleaseDate](./releasedate/) | Questo è usato dal codice di licenza **Aspose** per verificare la scadenza dell'abbonamento. È necessario impostare questo sulla data in cui pubblichi una versione o una correzione. |
| static [Title](./title/) |  |
| static [Version](./version/) | La versione dell'assembly. |
## Vedi anche

* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
