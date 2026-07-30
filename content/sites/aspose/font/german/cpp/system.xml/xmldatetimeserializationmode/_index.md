---
title: "System::Xml::XmlDateTimeSerializationMode Enum"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDateTimeSerializationMode Enum. Gibt an, wie der Zeitwert behandelt wird, wenn zwischen Zeichenkette und DateTime in C++ konvertiert wird."
type: docs
weight: 5800
url: /de/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


Gibt an, wie der Zeitwert behandelt wird, wenn zwischen Zeichenkette und [DateTime](../../system/datetime/) konvertiert wird.

```cpp
enum class XmlDateTimeSerializationMode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Local | 0 | Als lokale Zeit behandeln. Wenn das [DateTime](../../system/datetime/)-Objekt die koordinierte Weltzeit (UTC) darstellt, wird es in die lokale Zeit umgewandelt. |
| Utc | 1 | Als UTC behandeln. Wenn das [DateTime](../../system/datetime/)-Objekt eine lokale Zeit darstellt, wird es in UTC umgewandelt. |
| Unspecified | 2 | Als lokale Zeit behandeln, wenn ein [DateTime](../../system/datetime/) in eine Zeichenkette konvertiert wird. Wenn eine Zeichenkette in ein [DateTime](../../system/datetime/) konvertiert wird, in lokale Zeit umwandeln, wenn eine Zeitzone angegeben ist. |
| RoundtripKind | 3 | Zeitzoneninformationen sollten beim Konvertieren beibehalten werden. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
