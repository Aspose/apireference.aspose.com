---
title: "System::IO::FileSystemInfo classe"
linktitle: "FileSystemInfo"
second_title: "Aspose.Font per C++"
description: "Classe System::IO::FileSystemInfo. La classe base per FileInfo e DirectoryInfo. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1600
url: /it/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


La classe base per [FileInfo](../fileinfo/) e [DirectoryInfo](../directoryinfo/). Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class FileSystemInfo : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Delete](./delete/)() | Elimina l'entità rappresentata dall'oggetto corrente. |
| virtual [Finalize](./finalize/)() | Non fa nulla. |
| [get_Attributes](./get_attributes/)() | Restituisce gli attributi dell'entità rappresentata dall'oggetto corrente. |
| [get_CreationTime](./get_creationtime/)() | Restituisce la data di creazione dell'entità rappresentata dall'oggetto corrente in ora locale. |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | Restituisce la data di creazione dell'entità rappresentata dall'oggetto corrente in ora UTC. |
| virtual [get_Exists](./get_exists/)() | Determina se l'entità a cui fa riferimento il percorso rappresentato dall'oggetto corrente esiste. |
| [get_Extension](./get_extension/)() | Restituisce l'estensione del file rappresentato dall'oggetto corrente. |
| virtual [get_FullName](./get_fullname/)() | Restituisce il nome completo (incluso il percorso) dell'entità rappresentata dall'oggetto corrente. |
| [get_LastAccessTime](./get_lastaccesstime/)() | Restituisce l'ultima ora di accesso dell'entità rappresentata dall'oggetto corrente in ora locale. |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | Restituisce l'ultima ora di accesso dell'entità rappresentata dall'oggetto corrente in ora UTC. |
| [get_LastWriteTime](./get_lastwritetime/)() | Restituisce l'ultima ora di scrittura dell'entità rappresentata dall'oggetto corrente come ora locale. |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | Restituisce l'ultima ora di scrittura dell'entità rappresentata dall'oggetto corrente come ora UTC. |
| virtual [get_Name](./get_name/)() | Restituisce un nome dell'entità rappresentata dall'oggetto corrente. |
| [Refresh](./refresh/)() | Aggiorna lo stato dell'oggetto corrente. |
| [set_Attributes](./set_attributes/)(FileAttributes) | Imposta gli attributi specificati sull'entità rappresentata dall'oggetto corrente. |
| [set_CreationTime](./set_creationtime/)(DateTime) | Imposta l'ora di creazione dell'entità rappresentata dall'oggetto corrente come ora locale. |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | Imposta l'ora di creazione dell'entità rappresentata dall'oggetto corrente come ora UTC. |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | Imposta l'ultima ora di accesso dell'entità rappresentata dall'oggetto corrente come ora locale. |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | Imposta l'ultima ora di accesso dell'entità rappresentata dall'oggetto corrente come ora UTC. |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | Imposta l'ultima ora di scrittura dell'entità rappresentata dall'oggetto corrente come ora locale. |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | Imposta l'ultima ora di scrittura dell'entità rappresentata dall'oggetto corrente come ora UTC. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
