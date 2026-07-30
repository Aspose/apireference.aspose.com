---
title: "System::DateTimeOffset::ParseExact Methode"
linktitle: "ParseExact"
second_title: "Aspose.Font für C++"
description: "System::DateTimeOffset::ParseExact Methode. Konvertiert die angegebene Zeichenfolge in ein DateTimeOffset-Objekt unter Verwendung der angegebenen Formate, des Formatproviders und des Formatstils in C++."
type: docs
weight: 5600
url: /de/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Konvertiert die angegebene Zeichenfolge in ein [DateTimeOffset](../)-Objekt unter Verwendung der angegebenen Formate, des Formatproviders und des Formatstils.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const String\& | [String](../../string/) zum Konvertieren. |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) von Formatzeichenfolgen. |
| Anbieter | const SharedPtr\<IFormatProvider\>\& | Formatprovider. |
| Stile | Globalization::DateTimeStyles | Datums- und Zeitformatierungsstile. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Siehe auch

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Konvertiert die angegebene Zeichenfolge in ein [DateTimeOffset](../)-Objekt unter Verwendung des angegebenen Formats, des Formatproviders und des Formatstils.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const String\& | [String](../../string/) zum Konvertieren. |
| Format | const String\& | Formatzeichenfolge. |
| Anbieter | const SharedPtr\<IFormatProvider\>\& | Formatprovider. |
| Stile | Globalization::DateTimeStyles | Datums- und Zeitformatierungsstile. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Siehe auch

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
