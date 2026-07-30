---
title: "System::IO::FileStream::FileStream Konstruktor"
linktitle: "FileStream"
second_title: "Aspose.Font für C++"
description: "Wie man den FileStream‑Konstruktor der Klasse System::IO::FileStream in C++ verwendet."
type: docs
weight: 100
url: /de/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## Siehe auch

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


Erstellt eine neue Instanz der Klasse [FileStream](../) und initialisiert sie mit den angegebenen Parametern.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der zu öffnenden Datei. |
| mode | FileMode | Gibt den Modus an, in dem die Datei geöffnet werden soll. |

## Siehe auch

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


Erstellt eine neue Instanz der Klasse [FileStream](../) und initialisiert sie mit den angegebenen Parametern.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der zu öffnenden Datei. |
| mode | FileMode | Gibt den Modus an, in dem die Datei geöffnet werden soll. |
| Zugriff | FileAccess | Der angeforderte Zugriffstyp. |
| share | FileShare | Der Zugriffstyp, den andere [FileStream](../) Objekte auf die geöffnete Datei haben. |
| buffer_size | int32_t | Die Anzahl der während Lese‑ und Schreibvorgängen gepufferten Bytes. |
| useAsync | bool | Gibt an, ob asynchrones I/O oder synchrones I/O verwendet werden soll. |
## Hinweise



Das zugrunde liegende Betriebssystem unterstützt möglicherweise kein asynchrones I/O.

## Siehe auch

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


Erstellt eine neue Instanz der Klasse [FileStream](../) und initialisiert sie mit den angegebenen Parametern.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der zu öffnenden Datei. |
| mode | FileMode | Gibt den Modus an, in dem die Datei geöffnet werden soll. |
| Zugriff | FileAccess | Der angeforderte Zugriffstyp. |
| share | FileShare | Der Zugriffstyp, den andere [FileStream](../) Objekte auf die geöffnete Datei haben. |
| buffer_size | int32_t | Die Anzahl der während Lese‑ und Schreibvorgängen gepufferten Bytes. |
| Optionen | FileOptions | Zusätzliche Optionen. |

## Siehe auch

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
