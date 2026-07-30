---
title: "System::IO::DirectoryInfo Klasse"
linktitle: "DirectoryInfo"
second_title: "Aspose.Font für C++"
description: "System::IO::DirectoryInfo Klasse. Stellt einen Dateisystempfad, ein Verzeichnis, das durch diesen Pfad referenziert wird, dar und bietet Instanzmethoden zur Manipulation von Verzeichnissen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1200
url: /de/cpp/system.io/directoryinfo/
---
## DirectoryInfo class


Stellt einen Dateisystempfad, ein Verzeichnis, das durch diesen Pfad referenziert wird, dar und bietet Instanzmethoden zur Manipulation von Verzeichnissen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DirectoryInfo : public System::IO::FileSystemInfo
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Create](./create/)() | Erstellt ein Verzeichnis am Pfad, der vom aktuellen Objekt repräsentiert wird. |
| [CreateSubdirectory](./createsubdirectory/)(const String\&) | Erstellt Unterverzeichnisse am angegebenen Pfad. |
| [Delete](./delete/)() override | Entfernt das Verzeichnis, auf das der vom aktuellen Objekt repräsentierte Pfad verweist, wenn das Verzeichnis leer ist. |
| [Delete](./delete/)(bool) | Entfernt das Verzeichnis, auf das der vom aktuellen Objekt repräsentierte Pfad verweist. Ein Parameter gibt an, ob der Inhalt des Verzeichnisses rekursiv entfernt werden soll, wenn das Verzeichnis nicht leer ist. |
| [DirectoryInfo](./directoryinfo/)(const String\&) | Konstruiert eine Instanz der [DirectoryInfo](./) Klasse am angegebenen Pfad. |
| [EnumerateDirectories](./enumeratedirectories/)() | Gibt eine aufzählbare Sammlung zurück, die alle im vom aktuellen Objekt repräsentierten Verzeichnis befindlichen Verzeichnisse enthält. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&) | Durchsucht das vom aktuellen Objekt repräsentierte Verzeichnis nach Verzeichnissen, die die angegebenen Suchkriterien erfüllen. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&, SearchOption) | Durchsucht entweder das vom aktuellen Objekt repräsentierte Verzeichnis oder den gesamten Verzeichnisbaum, der in diesem Verzeichnis verwurzelt ist, nach Verzeichnissen, die die angegebenen Suchkriterien erfüllen. |
| [EnumerateFiles](./enumeratefiles/)() | Gibt eine aufzählbare Sammlung zurück, die alle im vom aktuellen Objekt repräsentierten Verzeichnis befindlichen Dateien enthält. |
| [EnumerateFiles](./enumeratefiles/)(const String\&) | Durchsucht das vom aktuellen Objekt repräsentierte Verzeichnis nach Dateien, die die angegebenen Suchkriterien erfüllen. |
| [EnumerateFiles](./enumeratefiles/)(const String\&, SearchOption) | Durchsucht entweder das vom aktuellen Objekt repräsentierte Verzeichnis oder den gesamten Verzeichnisbaum, der in diesem Verzeichnis verwurzelt ist, nach Dateien, die die angegebenen Suchkriterien erfüllen. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)() | Gibt eine aufzählbare Sammlung zurück, die alle im vom aktuellen Objekt repräsentierten Verzeichnis befindlichen Dateien und Verzeichnisse enthält. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&) | Durchsucht die Dateien und Verzeichnisse, die die angegebenen Suchkriterien im vom aktuellen Objekt repräsentierten Verzeichnis erfüllen. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&, SearchOption) | Durchsucht die Dateien und Verzeichnisse, die die angegebenen Suchkriterien entweder im vom aktuellen Objekt repräsentierten Verzeichnis oder im gesamten Verzeichnisbaum, der im vom aktuellen Objekt repräsentierten Verzeichnis verwurzelt ist, erfüllen. |
| [get_Exists](./get_exists/)() override | Ermittelt, ob der vom aktuellen Objekt dargestellte Pfad auf ein vorhandenes Verzeichnis verweist. |
| [get_Name](./get_name/)() override | Gibt den Namen der Entität zurück, auf die der vom aktuellen Objekt dargestellte Pfad verweist. |
| [get_Parent](./get_parent/)() | Gibt einen Shared-Pointer auf das [DirectoryInfo](./)-Objekt zurück, das einen Pfad darstellt, der auf das übergeordnete Verzeichnis des vom aktuellen Objekt repräsentierten Verzeichnisses verweist. |
| [get_Root](./get_root/)() | Gibt einen Shared-Pointer auf das [DirectoryInfo](./)-Objekt zurück, das einen Pfad darstellt, der auf das Stammverzeichnis des vom aktuellen Objekt repräsentierten Verzeichnisses verweist. |
| [GetDirectories](./getdirectories/)() | Gibt ein Array zurück, das Shared-Pointer auf [DirectoryInfo](./)-Objekte enthält, die alle im vom aktuellen Objekt repräsentierten Verzeichnis befindlichen Unterverzeichnisse darstellen. |
| [GetDirectories](./getdirectories/)(const String\&) | Durchsucht das vom aktuellen Objekt repräsentierte Verzeichnis nach Verzeichnissen, die die angegebenen Suchkriterien erfüllen. |
| [GetDirectories](./getdirectories/)(const String\&, SearchOption) | Durchsucht entweder das vom aktuellen Objekt repräsentierte Verzeichnis oder den gesamten Verzeichnisbaum, der in diesem Verzeichnis verwurzelt ist, nach Verzeichnissen, die die angegebenen Suchkriterien erfüllen. |
| [GetFiles](./getfiles/)() | Gibt ein Array zurück, das Shared-Pointer auf [FileInfo](../fileinfo/)-Objekte enthält, die alle im vom aktuellen Objekt repräsentierten Verzeichnis befindlichen Verzeichnisse darstellen. |
| [GetFiles](./getfiles/)(const String\&) | Durchsucht das vom aktuellen Objekt repräsentierte Verzeichnis nach Dateien, die die angegebenen Suchkriterien erfüllen. |
| [GetFiles](./getfiles/)(const String\&, SearchOption) | Durchsucht entweder das vom aktuellen Objekt repräsentierte Verzeichnis oder den gesamten Verzeichnisbaum, der in diesem Verzeichnis verwurzelt ist, nach Dateien, die die angegebenen Suchkriterien erfüllen. |
| [GetFileSystemInfos](./getfilesysteminfos/)() | Gibt ein Array zurück, das Shared-Pointer auf [FileSystemInfo](../filesysteminfo/)-Objekte enthält, die alle im vom aktuellen Objekt repräsentierten Verzeichnis befindlichen Dateien und Verzeichnisse darstellen. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&) | Durchsucht die Dateien und Verzeichnisse, die die angegebenen Suchkriterien im vom aktuellen Objekt repräsentierten Verzeichnis erfüllen. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&, SearchOption) | Durchsucht die Dateien und Verzeichnisse, die die angegebenen Suchkriterien entweder im vom aktuellen Objekt repräsentierten Verzeichnis oder im gesamten Verzeichnisbaum, der im vom aktuellen Objekt repräsentierten Verzeichnis verwurzelt ist, erfüllen. |
| [MoveTo](./moveto/)(const String\&) | Verschiebt das vom aktuellen Objekt repräsentierte Verzeichnis und dessen gesamten Inhalt an den angegebenen Speicherort. |
| [ToString](./tostring/)() const override | Gibt eine Zeichenkette zurück, die den vom aktuellen Objekt dargestellten Pfad enthält. |
## Siehe auch

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
