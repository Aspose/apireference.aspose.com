---
title: "System::IO::FileSystemInfo klasse"
linktitle: "FileSystemInfo"
second_title: "Aspose.Page voor C++"
description: "System::IO::FileSystemInfo klasse. De basisklasse voor FileInfo en DirectoryInfo. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1600
url: /nl/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


De basisklasse voor [FileInfo](../fileinfo/) en [DirectoryInfo](../directoryinfo/). Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class FileSystemInfo : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Delete](./delete/)() | Verwijdert de entiteit die wordt vertegenwoordigd door het huidige object. |
| virtual [Finalize](./finalize/)() | Doet niets. |
| [get_Attributes](./get_attributes/)() | Geeft de attributen van de entiteit die wordt vertegenwoordigd door het huidige object terug. |
| [get_CreationTime](./get_creationtime/)() | Geeft de creatietijd van de entiteit die wordt vertegenwoordigd door het huidige object terug als lokale tijd. |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | Geeft de creatietijd van de entiteit die wordt vertegenwoordigd door het huidige object terug als UTC‑tijd. |
| virtual [get_Exists](./get_exists/)() | Bepaalt of de entiteit waarnaar verwezen wordt door het pad dat wordt vertegenwoordigd door het huidige object bestaat. |
| [get_Extension](./get_extension/)() | Geeft de extensie van het bestand dat wordt vertegenwoordigd door het huidige object terug. |
| virtual [get_FullName](./get_fullname/)() | Geeft de volledige naam (inclusief pad) van de entiteit die wordt vertegenwoordigd door het huidige object terug. |
| [get_LastAccessTime](./get_lastaccesstime/)() | Geeft de laatste toegangstijd van de entiteit die wordt vertegenwoordigd door het huidige object terug als lokale tijd. |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | Geeft de laatste toegangstijd van de entiteit die wordt vertegenwoordigd door het huidige object terug als UTC‑tijd. |
| [get_LastWriteTime](./get_lastwritetime/)() | Geeft de laatste schrijftijd van de entiteit die wordt vertegenwoordigd door het huidige object terug als lokale tijd. |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | Geeft de laatste schrijftijd van de entiteit die wordt vertegenwoordigd door het huidige object terug als UTC‑tijd. |
| virtual [get_Name](./get_name/)() | Geeft een naam van de entiteit die wordt vertegenwoordigd door het huidige object terug. |
| [Refresh](./refresh/)() | Ververs de status van het huidige object. |
| [set_Attributes](./set_attributes/)(FileAttributes) | Stelt de opgegeven attributen in op de entiteit die wordt vertegenwoordigd door het huidige object. |
| [set_CreationTime](./set_creationtime/)(DateTime) | Stelt de creatietijd van de entiteit die wordt vertegenwoordigd door het huidige object in als lokale tijd. |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | Stelt de creatietijd van de entiteit die wordt vertegenwoordigd door het huidige object in als UTC‑tijd. |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | Stelt de laatste toegangstijd van de entiteit die wordt vertegenwoordigd door het huidige object in als lokale tijd. |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | Stelt de laatste toegangstijd van de entiteit die wordt vertegenwoordigd door het huidige object in als UTC‑tijd. |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | Stelt de laatste schrijftijd van de entiteit die wordt vertegenwoordigd door het huidige object in als lokale tijd. |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | Stelt de laatste schrijftijd van de entiteit die wordt vertegenwoordigd door het huidige object in als UTC-tijd. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
