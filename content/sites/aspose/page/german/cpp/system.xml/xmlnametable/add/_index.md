---
title: "System::Xml::XmlNameTable::Add Methode"
linktitle: "Add"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlNameTable::Add Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, atomisiert sie die angegebene Zeichenkette und fügt sie dem XmlNameTable in C++ hinzu."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, atomisiert sie die angegebene Zeichenkette und fügt sie dem [XmlNameTable](../) hinzu.

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | const ArrayPtr\<char16_t\>\& | Das Zeichenarray, das den hinzuzufügenden Namen enthält. |
| offset | int32_t | Nullbasierter Index im Array, der das erste Zeichen des Namens angibt. |
| Länge | int32_t | Die Anzahl der Zeichen im Namen. |

### ReturnValue

Die neue atomisierte Zeichenkette oder die bereits vorhandene, falls sie bereits existiert. Wenn die Länge null ist, wird [String::Empty](../../../system/string/empty/) zurückgegeben.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Add(const String\&) method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, atomisiert sie die angegebene Zeichenkette und fügt sie dem [XmlNameTable](../) hinzu.

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Array | const String\& | Der hinzuzufügende Name. |

### ReturnValue

Die neue atomisierte Zeichenkette oder die bereits vorhandene, falls sie bereits existiert.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
