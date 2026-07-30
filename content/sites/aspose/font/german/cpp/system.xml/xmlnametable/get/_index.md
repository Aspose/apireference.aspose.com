---
title: "System::Xml::XmlNameTable::Get-Methode"
linktitle: "Holen"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNameTable::Get-Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, liefert sie den atomisierten String, der dieselben Zeichen wie der angegebene Zeichenbereich im übergebenen Array enthält, in C++."
type: docs
weight: 200
url: /de/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Wenn in einer abgeleiteten Klasse überschrieben, gibt die atomisierte Zeichenkette zurück, die dieselben Zeichen wie der angegebene Zeichenbereich im übergebenen Array enthält.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | const ArrayPtr\<char16_t\>\& | Das Zeichenarray, das den zu suchenden Namen enthält. |
| Offset | int32_t | Der nullbasierte Index im Array, der das erste Zeichen des Namens angibt. |
| Länge | int32_t | Die Anzahl der Zeichen im Namen. |

### ReturnValue

Der atomisierte String oder **nullptr**, falls der String noch nicht atomisiert wurde. Wenn **length** null ist, wird [String::Empty](../../../system/string/empty/) zurückgegeben.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNameTable::Get(const String\&) method


Wenn in einer abgeleiteten Klasse überschrieben, gibt die atomisierte Zeichenkette zurück, die denselben Wert wie die angegebene Zeichenkette hat.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | const String\& | Der zu suchende Name. |

### ReturnValue

Der atomisierte String oder **nullptr**, falls der String noch nicht atomisiert wurde.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
