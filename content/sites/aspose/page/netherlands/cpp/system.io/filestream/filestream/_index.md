---
title: "System::IO::FileStream::FileStream constructor"
linktitle: "FileStream"
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de FileStream-constructor van de System::IO::FileStream-klasse in C++."
type: docs
weight: 100
url: /nl/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## Zie ook

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


Construeert een nieuw exemplaar van de [FileStream](../)-klasse en initialiseert deze met de opgegeven parameters.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het te openen bestand. |
| mode | FileMode | Specificeert de modus waarin het bestand moet worden geopend. |

## Zie ook

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


Construeert een nieuw exemplaar van de [FileStream](../)-klasse en initialiseert deze met de opgegeven parameters.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het te openen bestand. |
| mode | FileMode | Specificeert de modus waarin het bestand moet worden geopend. |
| access | FileAccess | Het aangevraagde toegangstype. |
| share | FileShare | Het type toegang dat andere [FileStream](../)-objecten hebben tot het geopende bestand. |
| buffer_size | int32_t | Het aantal bytes dat gebufferd wordt tijdens lees- en schrijfoperaties. |
| useAsync | bool | Specificeert of asynchrone I/O of synchrone I/O moet worden gebruikt. |
## Opmerkingen



Het onderliggende besturingssysteem ondersteunt mogelijk geen asynchrone I/O.

## Zie ook

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


Construeert een nieuw exemplaar van de [FileStream](../)-klasse en initialiseert deze met de opgegeven parameters.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad van het te openen bestand. |
| mode | FileMode | Specificeert de modus waarin het bestand moet worden geopend. |
| access | FileAccess | Het aangevraagde toegangstype. |
| share | FileShare | Het type toegang dat andere [FileStream](../)-objecten hebben tot het geopende bestand. |
| buffer_size | int32_t | Het aantal bytes dat gebufferd wordt tijdens lees- en schrijfoperaties. |
| opties | FileOptions | Aanvullende opties. |

## Zie ook

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
