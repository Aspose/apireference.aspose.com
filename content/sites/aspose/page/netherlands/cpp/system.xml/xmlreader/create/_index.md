---
title: "System::Xml::XmlReader::Create methode"
linktitle: "Create"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::Create methode. Maakt een nieuwe XmlReader‑instantie aan met de opgegeven stream en standaardinstellingen in C++."
type: docs
weight: 7700
url: /nl/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


Maakt een nieuwe [XmlReader](../)‑instantie aan met de opgegeven stream en standaardinstellingen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | De stream die de XML‑gegevens bevat. De [XmlReader](../) scant de eerste bytes van de stream op zoek naar een byte‑order‑markering of ander teken van codering. Wanneer de codering is vastgesteld, wordt deze gebruikt om de stream verder te lezen, en de verwerking blijft de invoer parseren als een stroom van (Unicode)‑tekens. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Maakt een nieuwe [XmlReader](../)‑instantie aan met de opgegeven stream en instellingen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | De stream die de XML‑gegevens bevat. De [XmlReader](../) scant de eerste bytes van de stream op zoek naar een byte‑order‑markering of ander teken van codering. Wanneer de codering is vastgesteld, wordt deze gebruikt om de stream verder te lezen, en de verwerking blijft de invoer parseren als een stroom van (Unicode)‑tekens. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | De instellingen voor de nieuwe [XmlReader](../)‑instantie. Deze waarde kan **nullptr** zijn. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Maakt een nieuwe [XmlReader](../)‑instantie aan met de opgegeven stream, instellingen en contextinformatie voor het parseren.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | De stream die de XML‑gegevens bevat. De [XmlReader](../) scant de eerste bytes van de stream op zoek naar een byte‑order‑markering of ander teken van codering. Wanneer de codering is vastgesteld, wordt deze gebruikt om de stream verder te lezen, en de verwerking blijft de invoer parseren als een stroom van (Unicode)‑tekens. |
| settings | SharedPtr\<XmlReaderSettings\> | De instellingen voor de nieuwe [XmlReader](../)‑instantie. Deze waarde kan **nullptr** zijn. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | De contextinformatie die nodig is om het XML‑fragment te parseren. De contextinformatie kan de te gebruiken [XmlNameTable](../../xmlnametable/), codering, namespace‑scope, de huidige **xml:lang**‑ en **xml:space**‑scope, basis‑URI en documenttype‑definitie omvatten. Deze waarde kan **nullptr** zijn. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Maakt een nieuwe [XmlReader](../)‑instantie aan met de opgegeven stream, basis‑URI en instellingen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | De stream die de XML‑gegevens bevat. De [XmlReader](../) scant de eerste bytes van de stream op zoek naar een byte‑order‑markering of ander teken van codering. Wanneer de codering is vastgesteld, wordt deze gebruikt om de stream verder te lezen, en de verwerking blijft de invoer parseren als een stroom van (Unicode)‑tekens. |
| settings | SharedPtr\<XmlReaderSettings\> | De instellingen voor de nieuwe [XmlReader](../)‑instantie. Deze waarde kan **nullptr** zijn. |
| baseUri | const String\& | De basis‑URI voor de entiteit of het document dat wordt gelezen. Deze waarde kan **nullptr** zijn. **[Security](../../../system.security/) Opmerking** De basis‑URI wordt gebruikt om de relatieve URI van het XML‑document op te lossen. Gebruik geen basis‑URI van een niet‑vertrouwde bron. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


Maakt een nieuw [XmlReader](../) exemplaar aan met behulp van de opgegeven tekstlezer.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<IO::TextReader\>\& | De tekstlezer waaruit de XML‑gegevens worden gelezen. Een tekstlezer retourneert een stroom van Unicode‑tekens, zodat de in de XML‑declaratie opgegeven codering niet door de XML‑lezer wordt gebruikt om de gegevensstroom te decoderen. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Maakt een nieuw [XmlReader](../) exemplaar aan met behulp van de opgegeven tekstlezer en instellingen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<IO::TextReader\>\& | De tekstlezer waaruit de XML‑gegevens worden gelezen. Een tekstlezer retourneert een stroom van Unicode‑tekens, zodat de in de XML‑declaratie opgegeven codering niet door de XML‑lezer wordt gebruikt om de gegevensstroom te decoderen. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | De instellingen voor de nieuwe [XmlReader](../). Deze waarde kan **nullptr** zijn. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Maakt een nieuw [XmlReader](../) exemplaar aan met behulp van de opgegeven tekstlezer, instellingen en contextinformatie voor het parseren.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | const SharedPtr\<IO::TextReader\>\& | De tekstlezer waaruit de XML‑gegevens worden gelezen. Een tekstlezer retourneert een stroom van Unicode‑tekens, zodat de in de XML‑declaratie opgegeven codering niet door de XML‑lezer wordt gebruikt om de gegevensstroom te decoderen. |
| settings | SharedPtr\<XmlReaderSettings\> | De instellingen voor de nieuwe [XmlReader](../)‑instantie. Deze waarde kan **nullptr** zijn. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | De contextinformatie die nodig is om het XML‑fragment te parseren. De contextinformatie kan de te gebruiken [XmlNameTable](../../xmlnametable/), codering, namespace‑scope, de huidige **xml:lang**‑ en **xml:space**‑scope, basis‑URI en documenttype‑definitie omvatten. Deze waarde kan **nullptr** zijn. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Maakt een nieuw [XmlReader](../) exemplaar aan met behulp van de opgegeven tekstlezer, instellingen en basis‑URI.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | De tekstlezer waaruit de XML‑gegevens worden gelezen. Een tekstlezer retourneert een stroom van Unicode‑tekens, zodat de in de XML‑declaratie opgegeven codering niet door de [XmlReader](../) wordt gebruikt om de gegevensstroom te decoderen. |
| settings | SharedPtr\<XmlReaderSettings\> | De instellingen voor de nieuwe [XmlReader](../)‑instantie. Deze waarde kan **nullptr** zijn. |
| baseUri | const String\& | De basis‑URI voor de entiteit of het document dat wordt gelezen. Deze waarde kan **nullptr** zijn. **[Security](../../../system.security/) Opmerking** De basis‑URI wordt gebruikt om de relatieve URI van het XML‑document op te lossen. Gebruik geen basis‑URI van een niet‑vertrouwde bron. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


Maakt een nieuw [XmlReader](../) exemplaar aan met behulp van de opgegeven XML-lezer en instellingen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lezer | const SharedPtr\<XmlReader\>\& | Het object dat u wilt gebruiken als de onderliggende XML-lezer. |
| settings | SharedPtr\<XmlReaderSettings\> | De instellingen voor het nieuwe [XmlReader](../) exemplaar. Het conformiteitsniveau van het [XmlReaderSettings](../../xmlreadersettings/) object moet ofwel overeenkomen met het conformiteitsniveau van de onderliggende lezer, of ingesteld zijn op [ConformanceLevel::Auto](../../conformancelevel/). |

### ReturnValue

Een object dat rond het opgegeven [XmlReader](../) object is gewikkeld.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&) method


Maakt een nieuw [XmlReader](../) exemplaar aan met opgegeven URI.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputUri | const String\& | De URI voor het bestand dat de XML‑gegevens bevat. De klasse [XmlUrlResolver](../../xmlurlresolver/) wordt gebruikt om het pad om te zetten naar een canonieke gegevensrepresentatie. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


Maakt een nieuw [XmlReader](../) exemplaar aan met behulp van de opgegeven URI en instellingen.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputUri | const String\& | De URI voor het bestand dat de XML‑gegevens bevat. Het [XmlResolver](../../xmlresolver/) object op het [XmlReaderSettings](../../xmlreadersettings/) object wordt gebruikt om het pad om te zetten naar een canonieke gegevensrepresentatie. Als de waarde van XmlReaderSettings::get_XmlResolver **nullptr** is, wordt een nieuw [XmlUrlResolver](../../xmlurlresolver/) object gebruikt. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | De instellingen voor de nieuwe [XmlReader](../)‑instantie. Deze waarde kan **nullptr** zijn. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Maakt een nieuw [XmlReader](../) exemplaar aan met behulp van de opgegeven URI, instellingen en contextinformatie voor het parseren.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| inputUri | const String\& | De URI voor het bestand dat de XML‑gegevens bevat. Het [XmlResolver](../../xmlresolver/) object op het [XmlReaderSettings](../../xmlreadersettings/) object wordt gebruikt om het pad om te zetten naar een canonieke gegevensrepresentatie. Als de waarde van XmlReaderSettings::get_XmlResolver **nullptr** is, wordt een nieuw [XmlUrlResolver](../../xmlurlresolver/) object gebruikt. |
| settings | SharedPtr\<XmlReaderSettings\> | De instellingen voor de nieuwe [XmlReader](../)‑instantie. Deze waarde kan **nullptr** zijn. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | De contextinformatie die nodig is om het XML‑fragment te parseren. De contextinformatie kan de te gebruiken [XmlNameTable](../../xmlnametable/), codering, namespace‑scope, de huidige **xml:lang**‑ en **xml:space**‑scope, basis‑URI en documenttype‑definitie omvatten. Deze waarde kan **nullptr** zijn. |

### ReturnValue

Een object dat wordt gebruikt om de XML‑gegevens in de stream te lezen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
