---
title: "System::IO::FileStream::FileStream constructeur"
linktitle: "FileStream"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser le constructeur FileStream de la classe System::IO::FileStream en C++."
type: docs
weight: 100
url: /fr/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## Voir aussi

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


Construit une nouvelle instance de la classe [FileStream](../) et l'initialise avec les paramètres spécifiés.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier à ouvrir. |
| mode | FileMode | Spécifie le mode dans lequel ouvrir le fichier. |

## Voir aussi

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


Construit une nouvelle instance de la classe [FileStream](../) et l'initialise avec les paramètres spécifiés.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier à ouvrir. |
| mode | FileMode | Spécifie le mode dans lequel ouvrir le fichier. |
| accès | FileAccess | Le type d'accès demandé. |
| share | FileShare | Le type d'accès que les autres objets [FileStream](../) ont sur le fichier ouvert. |
| buffer_size | int32_t | Le nombre d'octets tamponnés pendant les opérations de lecture et d'écriture. |
| useAsync | bool | Spécifie s'il faut utiliser les E/S asynchrones ou les E/S synchrones. |
## Remarques



Le système d'exploitation sous-jacent pourrait ne pas prendre en charge les E/S asynchrones.

## Voir aussi

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


Construit une nouvelle instance de la classe [FileStream](../) et l'initialise avec les paramètres spécifiés.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier à ouvrir. |
| mode | FileMode | Spécifie le mode dans lequel ouvrir le fichier. |
| accès | FileAccess | Le type d'accès demandé. |
| share | FileShare | Le type d'accès que les autres objets [FileStream](../) ont sur le fichier ouvert. |
| buffer_size | int32_t | Le nombre d'octets tamponnés pendant les opérations de lecture et d'écriture. |
| options | FileOptions | Options supplémentaires. |

## Voir aussi

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
