---
title: "System::Xml::XmlConvert::ToDateTime metodo"
linktitle: "ToDateTime"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlConvert::ToDateTime metodo. Converte la String in un equivalente DateTime in C++."
type: docs
weight: 1400
url: /it/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


Converte il [String](../../../system/string/) in un equivalente [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La stringa da convertire. |

### ReturnValue

Un equivalente [DateTime](../../../system/datetime/) della stringa.

## Vedi anche

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


Converte il [String](../../../system/string/) in un equivalente [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La stringa da convertire. |
| formats | const ArrayPtr\<String\>\& | Un array contenente le strutture di formato da applicare al [DateTime](../../../system/datetime/) convertito. I formati validi includono "yyyy-MM-ddTHH:mm:sszzzzzz" e i suoi sottoinsiemi. |

### ReturnValue

Un equivalente [DateTime](../../../system/datetime/) della stringa.

## Vedi anche

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


Converte il [String](../../../system/string/) in un equivalente [DateTime](../../../system/datetime/).

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | La stringa da convertire. |
| format | const String\& | La struttura di formato da applicare al [DateTime](../../../system/datetime/) convertito. I formati validi includono "yyyy-MM-ddTHH:mm:sszzzzzz" e i suoi sottoinsiemi. La stringa è convalidata rispetto a questo formato. |

### ReturnValue

Un equivalente [DateTime](../../../system/datetime/) della stringa.

## Vedi anche

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


Converte il [String](../../../system/string/) in un [DateTime](../../../system/datetime/) utilizzando il [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) specificato.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | const String\& | Il valore [String](../../../system/string/) da convertire. |
| dateTimeOption | XmlDateTimeSerializationMode | Uno dei valori dell'enumerazione che specificano se la data deve essere convertita in ora locale o mantenuta come Coordinated Universal Time (UTC), se è una data UTC. |

### ReturnValue

Un equivalente [DateTime](../../../system/datetime/) del [String](../../../system/string/).

## Vedi anche

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
