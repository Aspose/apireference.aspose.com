---
title: "System::IO::FileSystemInfo Klasse"
linktitle: "FileSystemInfo"
second_title: "Aspose.Font für C++"
description: "System::IO::FileSystemInfo Klasse. Die Basisklasse für FileInfo und DirectoryInfo. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1600
url: /de/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


Die Basisklasse für [FileInfo](../fileinfo/) und [DirectoryInfo](../directoryinfo/). Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class FileSystemInfo : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Delete](./delete/)() | Löscht das durch das aktuelle Objekt dargestellte Element. |
| virtual [Finalize](./finalize/)() | Tut nichts. |
| [get_Attributes](./get_attributes/)() | Gibt die Attribute des durch das aktuelle Objekt dargestellten Elements zurück. |
| [get_CreationTime](./get_creationtime/)() | Gibt die Erstellungszeit des durch das aktuelle Objekt dargestellten Elements als lokale Zeit zurück. |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | Gibt die Erstellungszeit des durch das aktuelle Objekt dargestellten Elements als UTC-Zeit zurück. |
| virtual [get_Exists](./get_exists/)() | Bestimmt, ob das durch den Pfad des aktuellen Objekts referenzierte Element existiert. |
| [get_Extension](./get_extension/)() | Gibt die Erweiterung der durch das aktuelle Objekt dargestellten Datei zurück. |
| virtual [get_FullName](./get_fullname/)() | Gibt den vollständigen Namen (einschließlich Pfad) des durch das aktuelle Objekt dargestellten Elements zurück. |
| [get_LastAccessTime](./get_lastaccesstime/)() | Gibt die letzte Zugriffszeit des durch das aktuelle Objekt dargestellten Elements als lokale Zeit zurück. |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | Gibt die letzte Zugriffszeit des durch das aktuelle Objekt dargestellten Elements als UTC-Zeit zurück. |
| [get_LastWriteTime](./get_lastwritetime/)() | Gibt die letzte Schreibzeit der Entität zurück, die vom aktuellen Objekt repräsentiert wird, als lokale Zeit. |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | Gibt die letzte Schreibzeit der Entität zurück, die vom aktuellen Objekt repräsentiert wird, als UTC-Zeit. |
| virtual [get_Name](./get_name/)() | Gibt einen Namen der Entität zurück, die vom aktuellen Objekt repräsentiert wird. |
| [Refresh](./refresh/)() | Aktualisiert den Zustand des aktuellen Objekts. |
| [set_Attributes](./set_attributes/)(FileAttributes) | Setzt die angegebenen Attribute für die vom aktuellen Objekt dargestellte Entität. |
| [set_CreationTime](./set_creationtime/)(DateTime) | Setzt die Erstellungszeit der Entität, die vom aktuellen Objekt repräsentiert wird, als lokale Zeit. |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | Setzt die Erstellungszeit der Entität, die vom aktuellen Objekt repräsentiert wird, als UTC-Zeit. |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | Setzt die letzte Zugriffszeit der Entität, die vom aktuellen Objekt repräsentiert wird, als lokale Zeit. |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | Setzt die letzte Zugriffszeit der Entität, die vom aktuellen Objekt repräsentiert wird, als UTC-Zeit. |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | Setzt die letzte Schreibzeit der Entität, die vom aktuellen Objekt repräsentiert wird, als lokale Zeit. |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | Setzt die letzte Schreibzeit der Entität, die vom aktuellen Objekt repräsentiert wird, als UTC-Zeit. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
