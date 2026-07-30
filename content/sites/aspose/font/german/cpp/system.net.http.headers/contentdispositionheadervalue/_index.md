---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue Klasse"
linktitle: "ContentDispositionHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue Klasse. Stellt einen Wert des ''Content-Disposition''-Headers dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


Stellt einen Wert des 'Content-Disposition'-Headers dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | Erstellt eine neue Instanz. |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | Erstellt eine neue Instanz. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_CreationDate](./get_creationdate/)() | Ermittelt das Erstellungsdatum der Datei. |
| [get_DispositionType](./get_dispositiontype/)() | RTTI-Informationen. |
| [get_FileName](./get_filename/)() | Ermittelt einen Wert, der bestimmt, wie ein Dateiname für die Speicherung der Nachrichten-Payload konstruiert wird. Er wird verwendet, wenn die Entität getrennt und in einer separaten Datei gespeichert wird. |
| [get_FileNameStar](./get_filenamestar/)() | Ruft einen Wert ab, der bestimmt, wie Dateinamen für die Speicherung der Nachrichten-Payload konstruiert werden. Er wird verwendet, wenn die Entitäten getrennt und in separaten Dateien gespeichert werden. |
| [get_ModificationDate](./get_modificationdate/)() | Ruft das Änderungsdatum der Datei ab. |
| [get_Name](./get_name/)() | Ruft einen Namen für einen Teil des Inhaltskörpers ab. |
| [get_Parameters](./get_parameters/)() | Gibt eine Parametersammlung des 'Content-Disposition'-Headers zurück. |
| [get_ReadDate](./get_readdate/)() | Ruft das Datum ab, an dem die Datei zuletzt gelesen wurde. |
| [get_Size](./get_size/)() | Ruft eine ungefähre Dateigröße ab. |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [ContentDispositionHeaderValue](./)-Klasse. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [ContentDispositionHeaderValue](./)-Klasse. |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | Setzt das Erstellungsdatum der Datei. |
| [set_DispositionType](./set_dispositiontype/)(String) | Setzt einen Dispositionstyp. |
| [set_FileName](./set_filename/)(String) | Setzt einen Wert, der bestimmt, wie ein Dateiname für die Speicherung der Nachrichten-Payload konstruiert wird. Er wird verwendet, wenn die Entität getrennt und in einer separaten Datei gespeichert wird. |
| [set_FileNameStar](./set_filenamestar/)(String) | Setzt einen Wert, der bestimmt, wie Dateinamen für die Speicherung der Nachrichten-Payload konstruiert werden. Er wird verwendet, wenn die Entitäten getrennt und in separaten Dateien gespeichert werden. |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | Setzt das Änderungsdatum der Datei. |
| [set_Name](./set_name/)(String) | Setzt einen Namen für einen Teil des Inhaltskörpers. |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | Setzt das Datum, an dem die Datei zuletzt gelesen wurde. |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | Setzt eine ungefähre Dateigröße. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [ContentDispositionHeaderValue](./)-Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
