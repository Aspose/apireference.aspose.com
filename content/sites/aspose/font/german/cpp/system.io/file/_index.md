---
title: "System::IO::File class"
linktitle: "Datei"
second_title: "Aspose.Font für C++"
description: "System::IO::File class. Stellt Methoden zum Manipulieren von Dateien bereit. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten unter keinen Umständen Instanzen davon in C++ erzeugen."
type: docs
weight: 1300
url: /de/cpp/system.io/file/
---
## File class


Bietet Methoden zur Manipulation von Dateien. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen.

```cpp
class File
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Fügt Zeichenketten aus der angegebenen Sammlung von Zeichenketten an die angegebene Datei mit der angegebenen Kodierung an, indem jede Zeichenkette in einer neuen Zeile geschrieben wird. Wenn die angegebene Datei nicht existiert, wird sie erstellt. Die Datei wird nach dem Schreiben aller Zeichenketten geschlossen. |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | Fügt die angegebene Zeichenkette an die angegebene Datei mit der angegebenen Kodierung an. |
| static [AppendText](./appendtext/)(const String\&) | Erstellt ein [StreamWriter](../streamwriter/)-Objekt, das Text an die angegebene Datei mit UTF‑8‑Kodierung anhängt. Wenn die angegebene Datei nicht existiert, wird sie erstellt. |
| static [Copy](./copy/)(const String\&, const String\&, bool) | Kopiert die angegebene Datei an den angegebenen Ort. Wenn die Zieldatei bereits existiert, gibt ein Parameter an, ob sie überschrieben werden soll. |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | Erstellt eine neue Datei (oder überschreibt eine vorhandene) und öffnet sie für Lese‑ und Schreibzugriff unter Verwendung der angegebenen Puffergröße und Optionen. |
| static [CreateText](./createtext/)(const String\&) | Erstellt eine neue oder öffnet eine vorhandene Datei zum Schreiben von UTF‑8‑kodiertem Text. |
| static [Decrypt](./decrypt/)(const String\&) | NICHT IMPLEMENTIERT. |
| static [Delete](./delete/)(const String\&) | Löscht die angegebene Datei oder das Verzeichnis. |
| static [Encrypt](./encrypt/)(const String\&) | NICHT IMPLEMENTIERT. |
| static [Exists](./exists/)(const String\&) | Bestimmt, ob der angegebene Pfad auf eine vorhandene Datei verweist. |
| static [GetAttributes](./getattributes/)(const String\&) | Gibt die Attribute der angegebenen Entität zurück. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Gibt die Erstellungszeit der angegebenen Entität als lokale Zeit zurück. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Gibt die Erstellungszeit der angegebenen Entität als UTC‑Zeit zurück. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Gibt die letzte Zugriffszeit der angegebenen Entität als lokale Zeit zurück. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Gibt die letzte Zugriffszeit der angegebenen Entität als UTC‑Zeit zurück. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Gibt die letzte Schreibzeit des angegebenen Elements als lokale Zeit zurück. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Gibt die letzte Schreibzeit des angegebenen Elements als UTC-Zeit zurück. |
| static [Move](./move/)(const String\&, const String\&) | Verschiebt die angegebene Datei an den neuen Speicherort. |
| static [Open](./open/)(const String\&, FileMode) | Öffnet die angegebene Datei im angegebenen Modus zum Lesen und Schreiben ohne Freigabe. |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | Öffnet die angegebene Datei im angegebenen Modus, mit dem angegebenen Zugriffstyp und Freigabeoption. |
| static [OpenRead](./openread/)(const String\&) | Öffnet die angegebene Datei nur zum Lesen im Modus 'Open' mit gemeinsamem Lesezugriff. |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | Öffnet die angegebene vorhandene Datei zum Lesen von Text mit UTF-8-Kodierung ohne Freigabe. |
| static [OpenWrite](./openwrite/)(const String\&) | Öffnet die angegebene Datei nur zum Schreiben im Modus 'OpenOrCreate' ohne Freigabe. |
| static [ReadAllBytes](./readallbytes/)(const String\&) | Liest den Inhalt der angegebenen Binärdatei in ein Byte-Array. |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | Liest den Inhalt der angegebenen Textdatei zeilenweise in ein Array von Zeichenketten unter Verwendung der angegebenen Zeichenkodierung. |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | Liest den Inhalt der angegebenen Textdatei in ein einzelnes [String](../../system/string/)‑Objekt unter Verwendung der angegebenen Zeichenkodierung. |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | Liest den Inhalt der angegebenen Textdatei zeilenweise unter Verwendung der angegebenen Zeichenkodierung und gibt eine aufzählbare Sammlung von Zeichenketten zurück, von denen jede eine einzelne Zeile des Dateiinhalts darstellt. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | Ersetzt den Inhalt einer Datei durch eine andere und erstellt ein Backup der ersetzten Datei. |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | Setzt die angegebenen Attribute für die angegebene Datei. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | NICHT IMPLEMENTIERT. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | NICHT IMPLEMENTIERT. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | NICHT IMPLEMENTIERT. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | NICHT IMPLEMENTIERT. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Setzt die letzte Schreibzeit des angegebenen Elements als lokale Zeit. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Setzt die letzte Schreibzeit des angegebenen Elements als UTC-Zeit. |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | Überschreibt die angegebene Binärdatei und schreibt die angegebenen Bytes hinein. |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Erstellt eine neue Textdatei oder überschreibt die vorhandene und schreibt alle Zeichenketten aus der angegebenen aufzählbaren Sammlung von Zeichenketten hinein, jede Zeichenkette in einer neuen Zeile, unter Verwendung der angegebenen Kodierung. |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | Erstellt eine neue Textdatei oder überschreibt die vorhandene und schreibt alle Zeichenketten aus dem angegebenen Array von Zeichenketten hinein, jede Zeichenkette in einer neuen Zeile, unter Verwendung der angegebenen Kodierung. |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | Erstellt eine neue Textdatei oder überschreibt die vorhandene und schreibt den Inhalt der angegebenen Zeichenkette hinein, unter Verwendung der angegebenen Kodierung. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | Standardwert für die Anzahl der während des Lesens von und Schreibens in eine Datei gepufferten Bytes. |
## Siehe auch

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
