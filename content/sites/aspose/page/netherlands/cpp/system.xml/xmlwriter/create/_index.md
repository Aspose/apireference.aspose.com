---
title: "System::Xml::XmlWriter::Create methode"
linktitle: "Create"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlWriter::Create methode. Maakt een nieuw XmlWriter‑object aan met behulp van de opgegeven stream in C++."
type: docs
weight: 3700
url: /nl/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


Maakt een nieuw [XmlWriter](../) exemplaar aan met behulp van de opgegeven stream.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | De stream waarnaar u wilt schrijven. De [XmlWriter](../) schrijft XML 1.0-tekstsyntaxis en voegt deze toe aan de opgegeven stream. |

### ReturnValue

Een [XmlWriter](../) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


Maakt een nieuw [XmlWriter](../) exemplaar aan met behulp van de stream en het [XmlWriterSettings](../../xmlwritersettings/) object.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | De stream waarnaar u wilt schrijven. De [XmlWriter](../) schrijft XML 1.0-tekstsyntaxis en voegt deze toe aan de opgegeven stream. |
| settings | SharedPtr\<XmlWriterSettings\> | Het [XmlWriterSettings](../../xmlwritersettings/) object dat wordt gebruikt om het nieuwe [XmlWriter](../) exemplaar te configureren. Als dit **nullptr** is, wordt een [XmlWriterSettings](../../xmlwritersettings/) met standaardinstellingen gebruikt. Als de [XmlWriter](../) wordt gebruikt met de XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) methode, moet u de XslCompiledTransform::get_OutputSettings waarde gebruiken om een [XmlWriterSettings](../../xmlwritersettings/) object met de juiste instellingen te verkrijgen. Dit zorgt ervoor dat het gemaakte [XmlWriter](../) object de juiste uitvoerinstellingen heeft. |

### ReturnValue

Een [XmlWriter](../) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


Maakt een nieuw [XmlWriter](../) exemplaar aan met behulp van de opgegeven TextWriter.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | De TextWriter waarnaar u wilt schrijven. De [XmlWriter](../) schrijft XML 1.0-tekstsyntaxis en voegt deze toe aan de opgegeven TextWriter. |

### ReturnValue

Een [XmlWriter](../) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Maakt een nieuw [XmlWriter](../) exemplaar aan met behulp van de TextWriter en de [XmlWriterSettings](../../xmlwritersettings/) objecten.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | De TextWriter waarnaar u wilt schrijven. De [XmlWriter](../) schrijft XML 1.0-tekstsyntaxis en voegt deze toe aan de opgegeven TextWriter. |
| settings | SharedPtr\<XmlWriterSettings\> | Het [XmlWriterSettings](../../xmlwritersettings/) object dat wordt gebruikt om het nieuwe [XmlWriter](../) exemplaar te configureren. Als dit **nullptr** is, wordt een [XmlWriterSettings](../../xmlwritersettings/) met standaardinstellingen gebruikt. Als de [XmlWriter](../) wordt gebruikt met de XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) methode, moet u de XslCompiledTransform::get_OutputSettings waarde gebruiken om een [XmlWriterSettings](../../xmlwritersettings/) object met de juiste instellingen te verkrijgen. Dit zorgt ervoor dat het gemaakte [XmlWriter](../) object de juiste uitvoerinstellingen heeft. |

### ReturnValue

Een [XmlWriter](../) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


Maakt een nieuw [XmlWriter](../) exemplaar aan met behulp van de opgegeven [Text::StringBuilder](../../../system.text/stringbuilder/).

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | De [Text::StringBuilder](../../../system.text/stringbuilder/) waarnaar geschreven moet worden. Inhoud die door de [XmlWriter](../) wordt geschreven, wordt toegevoegd aan de [Text::StringBuilder](../../../system.text/stringbuilder/). |

### ReturnValue

Een [XmlWriter](../) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


Maakt een nieuw [XmlWriter](../) exemplaar aan met behulp van de [Text::StringBuilder](../../../system.text/stringbuilder/) en de [XmlWriterSettings](../../xmlwritersettings/) objecten.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | De [Text::StringBuilder](../../../system.text/stringbuilder/) waarnaar geschreven moet worden. Inhoud die door de [XmlWriter](../) wordt geschreven, wordt toegevoegd aan de [Text::StringBuilder](../../../system.text/stringbuilder/). |
| settings | SharedPtr\<XmlWriterSettings\> | Het [XmlWriterSettings](../../xmlwritersettings/) object dat wordt gebruikt om het nieuwe [XmlWriter](../) exemplaar te configureren. Als dit **nullptr** is, wordt een [XmlWriterSettings](../../xmlwritersettings/) met standaardinstellingen gebruikt. Als de [XmlWriter](../) wordt gebruikt met de XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) methode, moet u de XslCompiledTransform::get_OutputSettings waarde gebruiken om een [XmlWriterSettings](../../xmlwritersettings/) object met de juiste instellingen te verkrijgen. Dit zorgt ervoor dat het gemaakte [XmlWriter](../) object de juiste uitvoerinstellingen heeft. |

### ReturnValue

Een [XmlWriter](../) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


Maakt een nieuw [XmlWriter](../) exemplaar aan met behulp van het opgegeven [XmlWriter](../) object.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | Het [XmlWriter](../) object dat u wilt gebruiken als de onderliggende writer. |

### ReturnValue

Een [XmlWriter](../) object dat is ingepakt rond het opgegeven [XmlWriter](../) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


Maakt een nieuw [XmlWriter](../) exemplaar aan met behulp van de opgegeven [XmlWriter](../) en [XmlWriterSettings](../../xmlwritersettings/) objecten.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | Het [XmlWriter](../) object dat u wilt gebruiken als de onderliggende writer. |
| settings | SharedPtr\<XmlWriterSettings\> | Het [XmlWriterSettings](../../xmlwritersettings/) object dat wordt gebruikt om het nieuwe [XmlWriter](../) exemplaar te configureren. Als dit **nullptr** is, wordt een [XmlWriterSettings](../../xmlwritersettings/) met standaardinstellingen gebruikt. Als de [XmlWriter](../) wordt gebruikt met de XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) methode, moet u de XslCompiledTransform::get_OutputSettings waarde gebruiken om een [XmlWriterSettings](../../xmlwritersettings/) object met de juiste instellingen te verkrijgen. Dit zorgt ervoor dat het gemaakte [XmlWriter](../) object de juiste uitvoerinstellingen heeft. |

### ReturnValue

Een [XmlWriter](../) object dat is ingepakt rond het opgegeven [XmlWriter](../) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&) method


Maakt een nieuw [XmlWriter](../) exemplaar aan met behulp van de opgegeven bestandsnaam.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outputFileName | const String\& | Het bestand waarnaar u wilt schrijven. De [XmlWriter](../) maakt een bestand aan op het opgegeven pad en schrijft ernaar in XML 1.0-tekstsyntaxis. De **outputFileName** moet een bestandssysteempad zijn. |

### ReturnValue

Een [XmlWriter](../) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


Maakt een nieuw [XmlWriter](../) exemplaar aan met behulp van de bestandsnaam en het [XmlWriterSettings](../../xmlwritersettings/) object.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outputFileName | const String\& | Het bestand waarnaar u wilt schrijven. De [XmlWriter](../) maakt een bestand aan op het opgegeven pad en schrijft ernaar in XML 1.0-tekstsyntaxis. De **outputFileName** moet een bestandssysteempad zijn. |
| settings | SharedPtr\<XmlWriterSettings\> | Het [XmlWriterSettings](../../xmlwritersettings/) object dat wordt gebruikt om het nieuwe [XmlWriter](../) exemplaar te configureren. Als dit **nullptr** is, wordt een [XmlWriterSettings](../../xmlwritersettings/) met standaardinstellingen gebruikt. Als de [XmlWriter](../) wordt gebruikt met de XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) methode, moet u de XslCompiledTransform::get_OutputSettings waarde gebruiken om een [XmlWriterSettings](../../xmlwritersettings/) object met de juiste instellingen te verkrijgen. Dit zorgt ervoor dat het gemaakte [XmlWriter](../) object de juiste uitvoerinstellingen heeft. |

### ReturnValue

Een [XmlWriter](../) object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
